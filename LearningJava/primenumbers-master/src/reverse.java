
public class reverse {
    public static void main(String[] args) {
        int sayac = 0;
        int a = 0;
        for (int i = 2; i < 100; i++) {
            sayac = i;
            int b = 0;
            for (int j = 2; j < sayac ; j++) {

                if (sayac%j == 0 ) {
                    b=1;
                    break;
                }

                }
            if (b == 0) {
                System.out.print(sayac + " ");
            }


            }
                }
            }





