import java.util.Scanner;
public class exp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x = input.nextInt();
        Scanner au = new Scanner(System.in);
        System.out.print("Enter an exponential : ");
        int y = au.nextInt();
        int a = 1;
        for (int i = 0; i < y; i++) {
            a*=x;
        }
        System.out.println(a);
    }
}
