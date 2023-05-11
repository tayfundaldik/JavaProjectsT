import java.util.Scanner;




public class recursefib {

    static int fib(int a){

        if (a==1 || a==2){
            return 1;
        }
        return fib(a-1)+fib(a-2);

    }


    public static void main(String[] args) {
        int z;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to see MIGHTY FIBONACCI : ");
        z= sc.nextInt();
        System.out.println(fib(z));
    }
}
