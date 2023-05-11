import java.util.Scanner;

public class calc1 {
    static void sum() {

        int b, i = 1;
        Scanner scb = new Scanner(System.in);

        int res = 0;
        while (true) {

            System.out.print("Number " + i++ + ": ");

            b = scb.nextInt();

            res += b;

            if (b == 0) {
                break;
            }
        }
        System.out.print("Your result :" + res);

    }

    static void min() {
        int a, n, res = 0;
        Scanner im = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        a = im.nextInt();
        for (int i = 1; i <= a; i++) {
            System.out.print("Number " + i + ": ");
            n = im.nextInt();
            if (i == 1) {
                res += n;
                continue;
            }
            res -= n;
        }

        System.out.print("Your result : " + res);

    }

    static void mult() {
        int res = 1, i=1,x;
        boolean r=true;
        Scanner mult = new Scanner(System.in);
        while (true){
            System.out.print("Number " + i++ + ": ");
            x=mult.nextInt();
            if (x == 1) {
                break;
            }
            if (x == 0) {
                res= 0;
                break;
            }
            res*=x;
        }

        System.out.println("Your result : " + res);

    }

    static void div() {
        double res=1,a,n;
        Scanner im = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        a = im.nextInt();
        for (int i = 1; i <= a; i++) {
            System.out.print("Number " + i + ": ");
            n = im.nextInt();
            if (i != 1 && n == 0) {

            }

            if (i == 1) {
                res = n;
                continue;
            }
            res /= n;
        }


        System.out.println("Your result : " + res);

    }

    static void exp() {
        int res=1,tab,us;
        Scanner base = new Scanner(System.in);
        System.out.print("Base : ");
        tab= base.nextInt();
        Scanner exp= new Scanner(System.in);
        System.out.print("Exponential : ");
        us= exp.nextInt();
        for (int i = 0; i < us; i++) {
            res*=tab;
        }

        System.out.println("Your result : " + res);

    }

    static void fac() {
       int res = 0,a;
        Scanner fac = new Scanner(System.in);
        System.out.print("Number for factorial : ");
        a= fac.nextInt();
        for (int i = a - 1; i > 0; i--) {
            a *= i;
            res = a;
        }

        System.out.println("Your result : " + res);

    }

    static void mod() {
        int res = 0,v,t;
        Scanner m1 = new Scanner(System.in);
        System.out.print("Number 1 : ");
        v = m1.nextInt();
        Scanner m2 = new Scanner(System.in);
        System.out.print("Number 2 : ");
        t = m2.nextInt();

        res = v%t;

        System.out.println("Your result : " + res);
    }

    static void rectarea() {
        int res,a,b;
        Scanner c1 = new Scanner(System.in);
        System.out.print("Edge 1 : ");
        a = c1.nextInt();
        Scanner c2 = new Scanner(System.in);
        System.out.print("Edge 2 : ");
        b = c2.nextInt();
        if (a == 0 || b==0) {
            res = 0;
        }
        res = a*b;

        System.out.println("Your rectangle area : " + res);

    }

    static void rectper() {
        int res ,a,b;
        Scanner c1 = new Scanner(System.in);
        System.out.print("Edge 1 : ");
        a = c1.nextInt();
        Scanner c2 = new Scanner(System.in);
        System.out.print("Edge 2 : ");
        b = c2.nextInt();
        res = (2*a)+(2*b);
        System.out.println("Your rectangle perimeter : " + res);
    }


    public static void main(String[] args) {
        int asd;
        Scanner sc = new Scanner(System.in);
        do{
        System.out.println("Which operation do you want? (1=sum,2=minus,3=mult,4=div,5=exponential,6=factorial,7=mod,8=area of rectangle,9=perimeter of rectangle,0=exit)");
        asd = sc.nextInt();
        switch (asd) {
            case 1:
                sum();
                break;
            case 2:
                min();
                break;
            case 3:
                mult();
                break;
            case 4:
                div();
                break;
            case 5:
                exp();
                break;
            case 6:
                fac();
                break;
            case 7:
                mod();
                break;
            case 8:
                rectarea();
                break;
            case 9:
                rectper();
                break;
            case 0:
                System.out.println("!!!!!Goodbye!!!!!");
                break;
            default:
                System.out.println("You entered a wrong number, please try again.");
        }
        }
        while (asd != 0);

    }


}
