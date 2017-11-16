package controller;

import data.Data;
import model.Main;
import model.Team;
import model.User;

import java.util.Scanner;

import static controller.MainController.*;


public class AdminController extends CaptainController{

Scanner input = new Scanner(System.in);

private Data db;

public AdminController (Data db){
    super(db);
    this.db = db;


}

public void printAdministratorMenu() {
    System.out.println("   ADMINISTRATOR BRUGERMENU:  ");
    System.out.println("");
    System.out.println("1) Redigér deltageroplysniner");
    System.out.println("2) Redigér holdoplysniner");
    System.out.println("3) Vis aktivitetsstatus");
    System.out.println("4) Vis oplysninger");
    System.out.println("5) Vis en oversigt over virksomheds hold og dets holdkaptajner");
    System.out.println("6) Vis en statistik over fordelingen af hold og hvilke virksomheder de repræsenterer");
    System.out.println("7) slet deltager");
    System.out.println("8) slet hold ");
    System.out.println("9) Godkend Hold");
    System.out.println("");
    System.out.println("0) LOG UD");

        int choice = input.nextInt();
        switch (choice) {
            case 1:
                editParticipantInformation();
                break;
            case 2:
                editTeamInformation();
                break;
            case 3:
                showActivity();
                break;
            case 4:
                showInformation();
                break;
            case 5:
                showOverveiwForFirmsAndCaptains();
                break;
            case 6:
                showStatistics();
                break;
            case 7:
                deleteParticipant();
                break;
            case 8:
                deleteTeam();
                break;
            case 9:
                confirmTeam();
                break;
            case 0:
                logOff();
                System.out.println("Du har valgt at logge ud");
                break;
            default:
                break;

        }


    }
    private void confirmTeam() {


    }

    private void deleteTeam() {
        printTeams();
        int indexOfTeamsToDelete;
        Team teamToDelete;

        System.out.println("Vælg hold");
        indexOfTeamsToDelete = input.nextInt();
        teamToDelete = this.db.getTeams().remove(indexOfTeamsToDelete);

        System.out.println("Holdet er nu slettet");

        printTeams();

    }

    private void printTeams() {
        System.out.printf("%-5s %-20s %-15s %-15s\n", "ID", "HOLDKAPTAJN", "DISTANCE", "VIRKSOMHED");
        for (Team team : db.getTeams()) {
            int teamIndex = db.getTeams().indexOf(team);
            System.out.printf("%-5s %-20s %-15s %-15s\n", teamIndex, team.getCaptain(), team.getDistance(), team.getFirm() );
        }
    }

    private void deleteParticipant() {
        printUsers();
        int indexOfUsersToDelete;
        User userToDelete;

        System.out.println("Vælg deltager");
        indexOfUsersToDelete = input.nextInt();
        this.db.getUsers().remove(indexOfUsersToDelete);

        System.out.println("Deltageren er nu slettet");

        printUsers();

    }

    private void printUsers() {
        System.out.printf("%-5s %-20s %-15s %-15s %-15s %-15s\n", "USERNAME", "PASSWORD", "TYPE", "CYKELISTTYPE", "ALDER", "EMAIL", "ID", "NAVN", "AKTIVITETSSTATUS");
        for (User user : db.getUsers()) {
            int userIndex = db.getUsers().indexOf(user);
            System.out.printf("%-5s %-20s %-15s %-15s %-15s %-15s\n", userIndex, user.getUserName(), user.getPassWord(), user.getType(), user.getCykelistType(), user.getAlder(), user.getEmail(), user.getId(), user.getNavn(), user.getAktivitetsStatus());
        }
    }



    public void createUser() {

    }



}
