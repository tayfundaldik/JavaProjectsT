import java.util.Scanner;
public class signs {
    public static void main(String[] args) {
       int a , b;
        Scanner as =new Scanner(System.in);
        Scanner sa = new Scanner(System.in);
        System.out.println("Doğum ayınız ?");
        a= as.nextInt();
        System.out.println("Doğum gününüz ?");
        b = sa.nextInt();
        if (a == 3){
            if (b>0 && b<=20) {
                System.out.println("BALIK Burcusunuz");
            } else if (b>= 21) {
                System.out.println("Koç Burcusunuz");
            }
        }
        if (a == 4) {
            if (b>0 && b<=20) {
                System.out.println("Koç Burcusunuz");
            } else if (b>= 21) {
                System.out.println("Boğa Burcusunuz");
            }}
        if (a == 5) {
            if (b>0 && b<=21) {
                System.out.println("Boğa Burcusunuz");
            } else if (b>= 22) {
                System.out.println("İkizler Burcusunuz");
            }}
        if (a == 6) {
            if (b>0 && b<=22) {
                System.out.println("İkizler Burcusunuz");
            } else if (b>= 23) {
                System.out.println("Yengeç Burcusunuz");
            }}
        if (a == 7) {
            if (b>0 && b<=22) {
                System.out.println("Yengeç Burcusunuz");
            } else if (b>= 23) {
                System.out.println("Aslan Burcusunuz");
            }}
        if (a == 8) {
            if (b>0 && b<=22) {
                System.out.println("Aslan Burcusunuz");
            } else if (b>= 23) {
                System.out.println("Başak Burcusunuz");
            }}
        if (a == 9) {
            if (b>0 && b<=22) {
                System.out.println("Başak Burcusunuz");
            } else if (b>= 23) {
                System.out.println("Terazi Burcusunuz");
            }}
        if (a == 10) {
            if (b>0 && b<=22) {
                System.out.println("Terazi Burcusunuz");
            } else if (b>= 23) {
                System.out.println("Akrep Burcusunuz");
            }}
        if (a == 11) {
            if (b>0 && b<=21) {
                System.out.println("Akrep Burcusunuz");
            } else if (b>= 22) {
                System.out.println("Yay Burcusunuz");
            }}
        if (a == 512) {
            if (b>0 && b<=21) {
                System.out.println("Yay Burcusunuz");
            } else if (b>= 22) {
                System.out.println("Oğlak Burcusunuz");
            }}
        if (a == 1) {
            if (b>0 && b<=21) {
                System.out.println("Oğlak Burcusunuz");
            } else if (b>= 22) {
                System.out.println("Kova Burcusunuz");
            }}
        if (a == 2) {
            if (b>0 && b<=19) {
                System.out.println("Kova Burcusunuz");
            } else if (b>= 20) {
                System.out.println("Balık Burcusunuz");
            }

            }
        }

    }

