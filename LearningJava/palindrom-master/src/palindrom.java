import java.util.Scanner;


public class palindrom {

    static boolean ispal(int x){
        int c = x,a=0,b;

        while (c!=0){
            b = c % 10;
            a = (a * 10) + b;
            c/=10;
        }
        if (x == a) {
            System.out.println("It is a palindromic number.");
        }
        else {
            System.out.println("It is not a palindromic number.");
        }
        return true;
    }


    public static void main(String[] args) {
        int y;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a palindromic number : ");
        y = input.nextInt();

        ispal(y);


    }
}
