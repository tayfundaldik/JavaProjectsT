import java.net.SocketTimeoutException;
import java.util.Scanner;


public class flightprice {
    public static void main(String[] args) {
        double x,y,total;
        int z;
        Scanner sc = new Scanner(System.in);
        Scanner sx = new Scanner(System.in);
        Scanner sz = new Scanner (System.in);


        System.out.print("Lütfen gitmek istediğiniz mesafeyi giriniz (km): ");
        x= sc.nextDouble();
        System.out.print("Lütfen yaşınızı giriniz : ");
        y= sx.nextDouble();
        System.out.print("Lütfen yolculuk tipinizi seçiniz (Tek yön için 1'i, Gidiş-Dönüş için 2'yi tuşlayınız) : ");
        z = sz.nextInt();
        total=x* 0.10;
        if (x > 0 && y > 0 && y<110 && 0<z && z<=2) {
            if (z == 1) {
                if (12>y) {
                    double re = total-(total * 0.5);
                    System.out.println("Ödemeniz Gereken Tutar "+re+"TL");
                } else if (y>=12 && y<=24) {
                    double t = total-(total*0.10);
                    System.out.println("Ödemeniz Gereken Tutar : "+t+"TL");
                }else if(24<y && y<65 ){
                    System.out.println("Ödemeniz Gereken Tutar : "+total+"TL");
                }
                else if (y>=65) {
                    double yasli = total -(total*0.3);
                    System.out.println("ÖDemeniz Geren Tutar : "+yasli+"TL");
                }
            }
            else {
                double a =total*2;
                double b =a-(a*0.2);
                if (12>y) {
                    double re = b-(b * 0.5);
                    System.out.println("Ödemeniz Gereken Tutar "+re+"TL");
                } else if (y>=12 && y<=24) {
                    double t = b-(b*0.10);
                    System.out.println("Ödemeniz Gereken Tutar : "+t+"TL");

                } else if(24<y && y<65 ){
                    System.out.println("Ödemeniz Gereken Tutar : "+b+"TL");
                }
                else if (y>=65) {
                    double yasli = b -(b*0.3);
                    System.out.println("ÖDemeniz Geren Tutar : "+yasli+"TL");
                }

            }
        }
        else {
            System.out.println("!!!!!Hatalı Veri Girdiniz!!!!!");
        }

    }
}
