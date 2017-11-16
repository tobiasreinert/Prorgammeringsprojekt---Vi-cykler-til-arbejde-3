package model;

public class User {

    private String userName;
    private int passWord;
    private String type;
    private String cykelistType;
    private int alder;
    private String email;
    private String id;
    private String navn;
    private String aktivitetsStatus;

    public User(){

    }


    public User (String userName, int passWord, String type, String cykelistType, int alder, String email, String id, String navn, String aktivitetsStatus) {
        this.userName = userName;
        this.passWord = passWord;
        this.type = type;
        this.cykelistType = cykelistType;
        this.alder = alder;
        this.email = email;
        this.id = id;
        this.navn = navn;
        this.aktivitetsStatus = aktivitetsStatus;
    }


    public String getUserName() { return userName; }

    public void setUserName(String userName) { this.userName = userName; }

    public int getPassWord() { return passWord; }

    public void setPassWord(int passWord) { this.passWord = passWord; }

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }

    public String getCykelistType() { return cykelistType; }

    public void setCykelistType(String cykelistType) { this.cykelistType = cykelistType; }

    public int getAlder() { return alder; }

    public void setAlder(int alder) { this.alder = alder; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getId () {return id; }

    public void setId(String id) { this.id = id; }

    public String getNavn() { return navn; }

    public void setNavn(String navn) { this.navn = navn; }

    public String getAktivitetsStatus() { return aktivitetsStatus; }

    public void setAktivitetsStatus(String aktivitetsStatus) { this.aktivitetsStatus = aktivitetsStatus; }
}
