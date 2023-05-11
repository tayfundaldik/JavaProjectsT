import java.util.Scanner;


public class havadurumu {
    public static void main(String[] args) {
        int a;
        Scanner sp = new Scanner(System.in);
        System.out.println("Hava bugün kaç derece ?");
        a = sp.nextInt();
        String f = a>25 ?"Yüzmeniz önerilir.":"!!!!!Yanlış bir değer girdiniz!!!!!";
        String e = a>=15 && a<25?"Piknik yapmanız önerilir.": f;
        String d = a >= 5 && a < 15?"Sinemaya gitmeniz önerilir.":e;
        String  c = 5>a?"Kayağa gitmeniz önerilir.":d;
        System.out.print(c);

    }
}
