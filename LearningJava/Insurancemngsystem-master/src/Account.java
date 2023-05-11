import Insurance.AuthenticationStatus;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Account implements Comparable<Account>{
    private AuthenticationStatus LOGIN;
    private User USER;
    ArrayList<String> ins_list = new ArrayList<>();


    public void UserLog(String j, String p)throws InvalidAuthenticationException{
            if (j == USER.getEMAIL() && p == USER.getPASSWORD()) {
                LOGIN = AuthenticationStatus.SUCCESS;
                Logonoff(true);
                System.out.println("Welcome again " + USER.getNAME() + USER.getSURNAME() + ".");
                USER.play();
            }else{

                throw new InvalidAuthenticationException("Your email or password is incorrect.\nPlease try again.");
            }
        }
        public void AddingAddress(int x){
        String ab;
        Scanner inp = new Scanner(System.in);
        ab= USER.Arr.get(x).toString();
            System.out.println("You are adding more information on your adress.\nPlease enter your information here.");
            System.out.print(ab);
            String lm = inp.nextLine();
            System.out.println("Your address is "+ab+lm);
        }
        public void RemovingAddress(int x){
            USER.Arr.remove(x);
            System.out.println("The deleting process is done.");
        }
        public void Logonoff(boolean a) {
            if (a == true) {
                System.out.println("You are logged in.");
            }
        }
        public abstract void InsurancePolicy(int x);
    }

