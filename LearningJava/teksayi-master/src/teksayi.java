import java.util.Scanner;


public class teksayi {
    public static void main(String[] args) {

        int sayac = 0;
        boolean x = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : ");
        int a = sc.nextInt();
        int c = a % 2;
        if (c == 0) {
            sayac = a;
            System.out.println(sayac);
            while (!x) {
                System.out.print("Lütfen bir sayı giriniz : ");
                a = sc.nextInt();
                if (a > 0) {
                    if (c == 0 && a % 4 == 0) {
                        sayac += a;

                    } else if (a % 2 == 1) {

                        x = true;

                    }
                }
                System.out.println(sayac);
            }
        }
    }
}
