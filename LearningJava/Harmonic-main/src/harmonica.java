import java.util.Scanner;


public class harmonica {
    public static void main(String[] args) {
       double n;
       double w = 1;
        Scanner a =new Scanner(System.in);
        System.out.println("Enter a number: ");
        n= a.nextDouble();
        for (double i = 1; i <= n; i++) {
            i++;
            w = w+(1/i);

        }
        System.out.println(w);
    }
}
