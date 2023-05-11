import java.util.Arrays;
public class Main {
    static boolean Found(int[]arr3,int x){
        for (int i:arr3) {
            if (i == x) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int x=0;
        int[] arr = {3,7,3,3,2,2,9,10,21,1,33,9,1};
        int arr2[]= new int [arr.length];
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr.length ; j++) {
                if (i != j && arr[i]==arr[j]) {
                    if (!Found(arr2,arr[i])) {
                    arr2[x++] = arr[i];
                    }
                    break;

                }
             }

            }
        for (int a : arr2) {
            if (a != 0 && a%2==0) {
                System.out.println(a);
            }
        }
        }
    }

