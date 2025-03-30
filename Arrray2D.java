import java.util.Arrays;
import java.util.Scanner;

public class Arrray2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = {
            {1 , 3 , 4},
            {2 , 4 },
            {3 ,5, 7, 8},
        };
        // System.out.println(Arrays.deepToString(arr));
        for(int a[] : arr){
            System.out.println(a);
        }
        for (int row = 0; row < arr.length; row++) {
            // for (int col = 0; col < arr[row].length; col++) {
            //     System.out.print(" " + arr[row][col]);
            // }
            // System.out.println();
        }
    }
}
