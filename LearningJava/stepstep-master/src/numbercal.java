import java.util.Scanner;
public class numbercal {
    public static void main(String[] args) {
        int a;
        int c  =0;
        int y = 0;
        Scanner x = new Scanner(System.in);
        System.out.print("Enter a number : ");
        a = x.nextInt();
        while (a!=0){
            c = a% 10;
            y += c;
            a/=10;
        }
        System.out.println(y);
    }
}
