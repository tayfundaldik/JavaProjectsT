import java.util.Scanner;



public class notortalamasi2 {
    public static void main(String[] args) {
        double a,b,c,d,e;
        Scanner af = new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz : ");
        a=af.nextDouble();
        Scanner ae = new Scanner(System.in);
        System.out.print("Fizik notunuzu giriniz : ");
        b=ae.nextDouble();
        Scanner as = new Scanner(System.in);
        System.out.print("Türkçe notunuzu giriniz : ");
        c=as.nextDouble();
        Scanner aq = new Scanner(System.in);
        System.out.print("Kimya notunuzu giriniz : ");
        d=aq.nextDouble();
        Scanner ar = new Scanner(System.in);
        System.out.print("Müzik notunuzu giriniz : ");
        e=ar.nextDouble();
        if((a<0 || a>100)||(b<0||b>100)||(c<0||c>100)||(d<0||d>100)||(e<0||e>100)){

            System.out.println("Yanlış not girildi. Lütfen Tekrar deneyiniz.");
            }
        else{
        double x=(a+b+c+d+e)/5;
             if(x<55){

                System.out.print("Sınıfı Geçemediniz...");
            }
            else{
                System.out.print("!!!!! Tebrikler Sınıfı Geçtiniz !!!!!");
            }
        }

            }

        }


