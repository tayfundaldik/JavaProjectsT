import java.util.Scanner;

public class java19 {
    public static void main(String[] args) {
        long a,b,d;
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz : ");
        a=sc.nextLong();
        Scanner avp = new Scanner(System.in);
        System.out.print("İkinci sayıyı giriniz : ");
        b = avp.nextLong();
        Scanner av =new Scanner(System.in);
        System.out.print("Yapmak istediğiniz işlemi seçiniz (toplama için \"1\",çıkarma için \"2\",çarpma için \"3\",bölme için \"4\" tuşlarını kullanınız.) : ");
        c= av.nextInt();
        if (c==1){
            d=a+b;
            System.out.print("Toplama işleminizin sonucu : "+d);
        } else if (c==2) {
            d=a-b;
            System.out.print("Çıkarma işlemi sonucunuz : "+d);
        } else if (c==3) {
            d=a*b;
            System.out.print("Çarpma işlemi sonucunuz : "+d);
        } else if (c==4) {
            d=a/b;
            System.out.print("Bölme işlemi sonucunuz : "+d);
        }else {
            System.out.print("!!!!!Yanlış tuşlama yaptınız!!!!!");
        }
    }
}
