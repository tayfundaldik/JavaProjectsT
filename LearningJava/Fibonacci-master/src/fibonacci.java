import java.util.Scanner;


public class fibonacci {
    public static void main(String[] args) {
        int n;
        int count = 0;
        int b=1;
        int c = 0;
        int z = 0;
        Scanner inp = new Scanner(System.in);
        n = inp.nextInt();

        for (int i = 0; i < n-2; i++) {
                c = count + b;
                System.out.println(count + " + " + b + " = " + c);
                count = b;
                b = c;



        }
    }
}
