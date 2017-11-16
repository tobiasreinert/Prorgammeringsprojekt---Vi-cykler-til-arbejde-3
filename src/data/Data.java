package data;

import model.Team;
import model.User;

import java.util.ArrayList;

public class Data {

    private ArrayList<Team> teams;
    private ArrayList<User> users;

    public Data() {
        this.teams = new ArrayList<>();
        this.users = new ArrayList<>();

        generateData();
    }

    public void generateData(){

        Team team = new Team("Mærsk","Frederik",100);
        Team team1 = new Team("Nordea", "Tobias", 500);
        Team team2 = new Team("Ørsted", "Katrine", 1000);

        teams.add(team);
        teams.add(team1);
        teams.add(team2);

        // "1" = administratorbruger
        // "2" = Delatgerbruger
        // "3" = Holdkaptajnbruger

        User user = new User("Frederik", 1234, "Administrator", "Nybegynder", 22, "Fbach95@gmail.com","fba95", "Frederik Bach Ankersen", "Aktiv");
        User user1 = new User("Tobias", 1234, "Administrator", "Erfaren", 21, "Tobias@gmail.com","tre96", "Tobias Reinert", "Inaktiv");
        User user2 = new User("Katrine", 1234, "Deltager", "Erfaren", 20, "Katrine@gmail.com","kzi96", "Katrine Zimling","Aktiv");
        User user3 = new User("Milan", 1234, "Deltager", "Erfaren", 19, "Milan@gmail.com","mah96", "Milan Ahmad","Inaktiv");
        User user4 = new User("Jakob", 1234, "Holdkaptajn", "Erfaren", 19, "Jakob@gmail.com","jba96", "Jakob Bach Ankersen","Inaktiv");



        users.add(user);
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);

        team.addUser(new User("Frederik", 1234, "1", "Nybegynder", 22, "Fbach95@gmail.com","0", "Frederik Bach Ankersen","Aktiv"));
        team1.addUser(new User("Tobias", 1234, "2", "Erfaren", 21, "Tobias@gmail.com","1", "Tobias Reinert","Aktiv"));
        team2.addUser(new User("Katrine", 1234, "2", "Erfaren", 20, "Katrine@gmail.com","2", "Katrine Zimling", "Aktiv"));

    }

    public ArrayList<Team> getTeams() { return teams; }

    public ArrayList<User> getUsers() { return users;
    }
}
