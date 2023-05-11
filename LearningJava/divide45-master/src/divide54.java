import java.util.Scanner;


public class divide54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean x = false;
        int count1 = 1;
        int count2 = 1;


        while (!x) {
                System.out.print("Give a number : ");
               int a = sc.nextInt();
            if (a<0) {
                        System.out.println("!!!!!Wrong Number!!!!!");
                        break;
                    }

            for (int i = 0; i <185685 ; i++) {

                    count1 *= 4;
                    System.out.println(count1);
                    count2 *= 5;
                    System.out.println(count2);
                    if (a / count1 < 4 && a % count2 < 5 ) {
                        break;
                    }
            }
                        x = true;
        }
    }


}


