/* print this pattern
 * 
 *  * 
 *  *  * 
 *  *  *  * 
 *  *  *  *  * 
 
 */

=================================================================

//Using WHile Loop.

import java.util.*;
public class DSA4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i <=n){
            int j = 1;
            while(j <=i){
                System.out.print(" * ");
                j = j + 1;
            }
            System.out.println();
            i = i +1;
        }
    }
}

=================================================================

//Using while Loop

import java.util.*;
public class DSA4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++ ){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
=================================================================
