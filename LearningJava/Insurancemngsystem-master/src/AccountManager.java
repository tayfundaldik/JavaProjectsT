import com.sun.java.accessibility.util.AccessibilityListenerList;
import com.sun.source.tree.Tree;

import java.util.Scanner;
import java.util.TreeSet;

public class AccountManager{
    Account ACC;
    Scanner inp = new Scanner(System.in);
    Scanner sc = new Scanner(System.in);

    TreeSet <Account> AccList = new TreeSet<>();


    public void Login(String a , String b){
        try{
            if (AccList.contains(a) && AccList.contains(b)) {
            ACC.UserLog(a,b);
            }
        }catch (InvalidAuthenticationException e){
            System.out.println(e.getMessage());
        }
    }
}
