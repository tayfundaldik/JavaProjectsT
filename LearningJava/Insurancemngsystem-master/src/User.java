import Address.Address;

import java.time.LocalDate;
import java.util.ArrayList;

public class User {
    private String NAME;
    private String SURNAME;
    private String EMAIL;
    private String PASSWORD;
    private String JOB;
    private int AGE;
    ArrayList<Address> Arr= new ArrayList<>();
    private LocalDate DATE;

    public User(String NAME, String SURNAME, String EMAIL, String PASSWORD, String JOB, int AGE, LocalDate DATE) {
        this.NAME = NAME;
        this.SURNAME = SURNAME;
        this.EMAIL = EMAIL;
        this.PASSWORD = PASSWORD;
        this.JOB = JOB;
        this.AGE = AGE;

        this.DATE = DATE;
    }
    public void play(){

    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getSURNAME() {
        return SURNAME;
    }

    public void setSURNAME(String SURNAME) {
        this.SURNAME = SURNAME;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public String getJOB() {
        return JOB;
    }

    public void setJOB(String JOB) {
        this.JOB = JOB;
    }

    public int getAGE() {
        return AGE;
    }

    public void setAGE(int AGE) {
        this.AGE = AGE;
    }


    public LocalDate getDATE() {
        return DATE;
    }

    public void setDATE(LocalDate DATE) {
        this.DATE = DATE;
    }
}
