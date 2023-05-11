import java.util.Scanner;

public class Zodiac {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz : ");
        a = sc.nextInt();
        double c = a%12;

        if (c == 0 ) {
            System.out.println("Çin Zodyağı Burcunuz : Maymun");
        } if (c == 1 ) {
            System.out.println("Çin Zodyağı Burcunuz : Horoz");
        } if (c == 2 ) {
            System.out.println("Çin Zodyağı Burcunuz : Köpek");
        } if (c == 3 ) {
            System.out.println("Çin Zodyağı Burcunuz : Domuz");
        } if (c == 4 ) {
            System.out.println("Çin Zodyağı Burcunuz : Fare");
        } if (c == 5 ) {
            System.out.println("Çin Zodyağı Burcunuz : Öküz");
        } if (c == 6 ) {
            System.out.println("Çin Zodyağı Burcunuz : Kaplan");
        } if (c == 7 ) {
            System.out.println("Çin Zodyağı Burcunuz : Tavşan");
        } if (c == 8 ) {
            System.out.println("Çin Zodyağı Burcunuz : Ejderha");
        }if (c == 9 ) {
            System.out.println("Çin Zodyağı Burcunuz : Yılan");
        }if (c == 10 ) {
            System.out.println("Çin Zodyağı Burcunuz : At");
        }if (c == 11 ) {
            System.out.println("Çin Zodyağı Burcunuz : Koyun");
        }

    }
}
