import java.util.Scanner ;

public class ciftsayi {
    public static void main(String[] args) {
        int z = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int a = sc.nextInt();
        for (int i = 0; i <= a; i++) {
            if(i%3==0 && i%4==0){

                z+= i;
            }
        }
        System.out.println(z);
    }
}
