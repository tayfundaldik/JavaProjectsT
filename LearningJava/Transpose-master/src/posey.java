import java.util.Scanner;
import java.util.Arrays;
public class posey {
    public static void main(String[] args) {
        int [][] list = {
                {2,3,5},
                {8,4,7}
        };
        int [][] tmatrix = new int [3][2];
        System.out.println("Matris :");
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length ; j++) {
                System.out.print(list[i][j] + " ");
            }
            System.out.println();
        }
        for (int row = 0; row < list.length ; row++) {
            for (int col = 0; col < list[row].length; col++) {
                tmatrix[col][row]=list[row][col];

            }
        }
        System.out.println("Transpoze :");
        for (int i = 0; i < tmatrix.length ; i++) {
            for (int j = 0; j < tmatrix[i].length; j++) {
                System.out.print(tmatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
