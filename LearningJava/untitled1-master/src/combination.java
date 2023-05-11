import java.util.Scanner;


public class combination {
    public static void main(String[] args) {
        int c1 = 1;
        int c2 = 1;
        int c3 = 1;

        int x,y;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number : ");
        x = inp.nextInt();
        Scanner as = new Scanner(System.in);
        System.out.print("Which combination do you want : ");
        y = as.nextInt();
        int r = x-y;
        if (x >0 && y>0) {
            for (int i = 1; i <= x ; i++) {
                c1 *= i;
            }
            for (int i = 1; i <= y; i++) {
                c2 *= i;
            }
            for (int i = 1; i <=r; i++) {
                c3*= i;
            }
            int a = c1 / (c2*c3);
            System.out.println(a);
        }
        }
}
