/* print this pattern
 1 2 3 4
 1 2 3 4
 1 2 3 4
 1 2 3 4
 */

===================================================================
//Using While Loop :)

import java.util.Scanner;
class DSA1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i<=n){
            int j = 1;
            while(j<=n){
              System.out.print(" " +j);
                j =j+1;        
            }
            System.out.println();
        i = i + 1;
        }
    }
}
====================================================================
//Using for loop :)

import java.util.*;

public class DSA1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1; i <=n; i++){
            for(int j = 1; j<=n; j++){
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }
}

====================================================================
