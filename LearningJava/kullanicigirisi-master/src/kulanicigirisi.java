import java.util.Scanner;


public class kulanicigirisi {
    public static void main(String[] args) {
        String a,b,c,d;
        a="doomslayer";
        b="serkanismygurl";

        System.out.println("!!!!!Hoşgeldiniz!!!!!");
        Scanner sc =new Scanner(System.in);
        System.out.print("Kullanıcı adı : ");
        c= sc.nextLine();
        Scanner sca =new Scanner(System.in);
        System.out.print("Şifre : ");
        d= sca.nextLine();

        if(c.equals(a) && d.equals(b)){
            System.out.print("Giriş başarılı");
        } else if (c.equals(a) && !d.equals(b)) {
            System.out.println("!!!!!Şifreniz yalnış!!!!!");

            int x;
            Scanner as = new Scanner(System.in);
            System.out.print("Şifrenizi sıfırlamak ister misiniz? (evet için \"1\",hayır için\"0\".)");
            x=as.nextInt();
            if (x==1){
                String ax;
                Scanner f = new Scanner(System.in);
                System.out.print("Yeni şifrenizi giriniz : ");
                ax=f.nextLine();
                if (ax.equals(b) || ax.equals(d)){
                    System.out.print("!!!!!Şifre oluşturulamadı, lütfen başka şifre giriniz.!!!!!");

                }
                else {
                    System.out.print("Şifre oluşturuldu");
                }
            }
            else{
                System.out.print("İyi günler dileriz.");
            }
        }
    }
}
