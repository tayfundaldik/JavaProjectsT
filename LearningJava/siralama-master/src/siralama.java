import java.util.Scanner;

public class siralama {
    public static void main(String[] args) {
        long a,b,c;

        Scanner sc= new Scanner(System.in);
        Scanner sce= new Scanner (System.in);
        Scanner scc=new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz : ");
        a = sc.nextLong();
        System.out.print("İkinci Sayıyı Giriniz : ");
        b= sce.nextLong();
        System.out.print("Üçüncü Sayıyı Giriniz : ");
        c= scc.nextLong();
        if(a<b&&a<c){
            if(b<c){
                System.out.print(a + ","+b +","+ c);
            } else if (c<b) {
                System.out.print(a+","+c+","+b);
            }
            else {
                System.out.print("Lütfen büyüklükleri farklı sayılar giriniz");
            }
        }
        if(b<a && b<c){
            if(a<c){
                System.out.print(b +","+a +","+ c);
            } else if (c<a) {
                System.out.print(b+","+c+","+a);
            }
            else {
                System.out.print("Lütfen büyüklükleri farklı sayılar giriniz");
            }
        }
        if(c<b&&c<a){
            if(a>b){
                System.out.print(c + ","+b +","+ a);
            } else if (b>a) {
                System.out.print(c+","+a+","+b);
            }
            else {
                System.out.print("Lütfen büyüklükleri farklı sayılar giriniz");
            }
        }
    }
}
