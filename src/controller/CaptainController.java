package controller;

import data.Data;
import model.Team;

import java.util.Scanner;

public class CaptainController extends ParticipantController {

    Scanner input = new Scanner (System.in);

    private Data db;

    public CaptainController (Data db) {
        super (db);
        this.db = db;
    }


    public void printCaptionMenu () {
        System.out.println("   HOLDKAPTAJN BRUGERMENU  ");
        System.out.println("");
        System.out.println("1) Redigér deltageroplysniner");
        System.out.println("2) Redigér holdoplysniner");
        System.out.println("3) Vis aktivitetsstatus");
        System.out.println("4) Vis oplysninger");
        System.out.println("5) Vis en oversigt over virksomheds hold og dets holdkaptajner");
        System.out.println("6) Vis en statistik over fordelingen af hold og hvilke virksomheder de repræsenterer");
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
            case 11:
                logOff();
                break;
            default:


        }

    }


    public void editTeamInformation() {

        System.out.println("Redigér holdoplysninger - vælg virksomhed");
        System.out.println("");

        int indexOfTeamToChange;
        double newDistance;
        String newCaptain;
        Team teamToChange;
        printTeams();

        indexOfTeamToChange = input.nextInt();

        teamToChange = db.getTeams().get(indexOfTeamToChange - 1);

        System.out.println("Vælg et af nedstående punkter");
        System.out.println("1)  Redigér holdkaptajn:");
        System.out.println("2)  Redigér distance:");

        int valg = input.nextInt();

        switch (valg) {
            case 1:
                System.out.println("");
                break;
            case 2:
                System.out.println("");
                break;
        }

        if (valg == 1) {
            System.out.println("Indtast holdkaptajn");
            newCaptain = input.nextLine();
            teamToChange.setCaptain(newCaptain);
        } else if (valg == 2) {
            System.out.println("Indtast distance:");
            newDistance = input.nextInt();
            teamToChange.setDistance(teamToChange.getDistance() + newDistance);
        } else {
            System.out.println("Ugyldigt");
        }

        // System.out.println("Redigér1:" + teamToChange.getnewDistance + newDistance());

        printTeams();

    }

    private void printTeams() {
        System.out.printf("%-5s %-10s %-15s %-10s\n", "NR", "FIRMA", "HOLDKAPTAJN", "DISTANCE");
        System.out.println("");
        for (Team team : db.getTeams()) {
            System.out.printf("%-5d %-10s %-15s %-10s\n", db.getTeams().indexOf(team)+1, team.getFirm(), team.getCaptain(), team.getDistance());
        }
    }


}
