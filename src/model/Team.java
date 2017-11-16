package model;

import java.util.ArrayList;

public class Team {

    private String firm;
    private String captain;
    private double distance;
    private int nyOplsyning;
    private String aktivitetsStatus;
    private ArrayList<User> users;

    public Team(){

    }

    public Team (String firm, String captain, double distance) {

        this.firm = firm;
        this.captain = captain;
        this.distance = distance;
        this.users = new ArrayList<>();
        this.aktivitetsStatus = aktivitetsStatus;
    }

    public void addUser(User user) { users.add(user); }

    public String getFirm() { return firm; }

    public void setFirm(String firm) { this.firm = firm; }

    public String getCaptain() { return captain; }

    public void setCaptain(String captain) { this.captain = captain; }

    public double getDistance() { return distance; }

    public void setDistance(double distance) { this.distance = distance; }

    public ArrayList<User> getUsers() { return users; }

    public void setUsers(ArrayList<User> users) { this.users = users; }

    public int getnyOplsyning(){ return nyOplsyning; }

    public void setnyOplysning (int nyoplysning) { this.nyOplsyning = nyOplsyning; }

    public String getAktivitetsStatus() { return aktivitetsStatus; }

    public void setAktivitetsStatus(String aktivitetsStatus) { this.aktivitetsStatus = aktivitetsStatus; }
}
