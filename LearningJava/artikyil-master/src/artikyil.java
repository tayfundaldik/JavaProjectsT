import java.util.Scanner;


public class artikyil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Yılı giriniz : ");
        int a = sc.nextInt();
        double x= a%4;
        double y= a%400;
        if (x == 0 || y== 0 )
        {
            System.out.println("Artık yıl girilmiştir.");
        }
        else {
            System.out.println("Artık olmayan bir yıl girilmiştir.");
        }
    }
}
