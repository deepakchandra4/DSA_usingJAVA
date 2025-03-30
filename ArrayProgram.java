import java.util.Arrays;
import java.util.Scanner;

public class ArrayProgram {

    static void stringArr(String[] str){
        System.out.println(Arrays.toString(str));
    }

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int[] arr = new int[4];
        // arr[0] = 10 ;
        // arr[1] = 13 ;
        // arr[2] = 132 ;
        // arr[3] = 1453;
        // arr[4] = 45 ;
        // arr[5] = 1434 ;
        // arr[6] = 133 ;
        // arr[7] = 124 ;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
            // System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
        String[] str = {"Deepak" ,"Dijkstra"};
        stringArr(str);
    }
}
