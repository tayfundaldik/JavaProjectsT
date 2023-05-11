import java.util.Scanner;

public class exp {

    public static void main(String[] args) {
        int a,b,res;

        System.out.println("!!!!!Welcome to exponential calculator!!!!!");
        Scanner sc = new Scanner(System.in);
        Scanner ad = new Scanner(System.in);
       while (true){

        System.out.print("Base : ");
        a = sc.nextInt();
        System.out.print("Exponential : ");
        b = ad.nextInt();
        res = exp(b,a);
        System.out.println("Your Result : " + res);


       }
    }
    static int exp (int t,int y) {
        if (t <= 0) {
            return 1;
        }
            return y * exp(t-1 , y);
    }

}
