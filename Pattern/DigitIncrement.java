/* print this pattern
 1 2 3
 4 5 6
 7 8 9
 */

=====================================================================
 
//Using While Loop.
 
import java.util.*;

public class DSA3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int count = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.print(" " +count);
                count = count+1;
                j = j + 1;
            }
            System.out.println();
            i = i + 1;
        }
    }
}

=====================================================================

//Using For Loop.
 

import java.util.*;

public class DSA3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        for(int i =1; i <=n; i++){
            for(int j = 1; j<=n; j++){
                System.out.print(" " +count);
                count = count +1;
            }
            System.out.println();
        }
    }
}
=====================================================================
