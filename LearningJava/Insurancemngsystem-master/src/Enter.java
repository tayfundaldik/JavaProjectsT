import java.util.Scanner;

public class Enter {
    private String EMAILe;
    private String PASSWORDe;
    Scanner inp = new Scanner(System.in);

    public Enter(String EMAILe, String PASSWORDe) {
        this.EMAILe = EMAILe;
        this.PASSWORDe = PASSWORDe;
    }
    public void getInfo(){
        System.out.println("Please enter your e-mail.");
        String el = inp.nextLine();
        System.out.println("Please enter your password.");
        String pw = inp.nextLine();
    }
    public String getEMAILe() {
        return EMAILe;
    }


    public void setEMAILe(String EMAILe) {
        this.EMAILe = EMAILe;
    }

    public String getPASSWORDe() {
        return PASSWORDe;
    }

    public void setPASSWORDe(String PASSWORDe) {
        this.PASSWORDe = PASSWORDe;
    }

}
