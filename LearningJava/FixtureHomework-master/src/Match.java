import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Match {
    private int team;
        ArrayList<String> Teams = new ArrayList<>();
        HashSet<String> Rounds1= new HashSet<>();
        HashSet<String> Rounds2 = new HashSet<>();
        ArrayList<String> match = new ArrayList<>();



    public void a(){

        for (int i = 0; i <999999 ; i++) {

            Scanner sc = new Scanner(System.in);

            System.out.println("add a team '1',create fixture'2',exit'3'");

            System.out.println("-------------------------------------------");
            int n = sc.nextInt();

            if (n == 1) {
                System.out.print("Enter a team name:");
                sc.nextLine();
                String name = sc.nextLine();
                Teams.add(name);
                System.out.println("Team added.");
                System.out.println("---------------------------------------------------");
            } else if (n == 2) {
                create_match();
            } else if (n==3) {
                break;
            }
        }
    }
            public void create_match(){
                ArrayList<String> ed = new ArrayList<>();
                ArrayList<String> ad = new ArrayList<>();


                if (Teams.size()%2!=0) {
                    Teams.add("Bay");
                }

                for (int i = 1; i <=Rounds1.size(); i++) {

                    String a;
                    String b;
                    int xe=0;

                    Random rand = new Random();
                    for (int j = 1; j <=Teams.size()/2 ; j++) {
                    a= Teams.get(rand.nextInt(Teams.size()));
                    b= Teams.get(rand.nextInt(Teams.size()));

                        if (a != b) {
                            if (match.contains(a+b) == false && Teams.contains(b+a)== false) {
                                if(ed.contains(a)==false && ad.contains(b)==false){
                                    ed.add(a);
                                    ad.add(b);
                                    match.add(b+a);
                                    match.add(a+b);
                                    Rounds1.add(a+"vs"+b);
                                    Rounds2.add(b+"vs"+a);
                                }
                            }
                        }
                    }
                }
                int x=0,y=1;
                System.out.println("----------------First Matches---------------");
                System.out.println("Week"+y);
                for (String o : Rounds1) {
                    System.out.println(o);
                    x++;
                    if (x == Teams.size()/2) {
                        System.out.println(" ");
                        x= 0;
                        y++;
                        System.out.println("Week"+y);
                    }
                }
                System.out.println("-------------------");
                for (String o: Rounds2 ) {
                    System.out.println(o);
                    x++;
                    if (x == Teams.size()/2) {
                        x= 0;
                        y++;
                        if (y<= (Teams.size()-1)/2) {
                            System.out.println("Week"+y);
                        }
                    }
                }
            }


}
