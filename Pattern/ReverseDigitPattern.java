/* print this pattern 
 4 3 2 1
 4 3 2 1
 4 3 2 1
 4 3 2 1
 */

=======================================================================
 
//Using While Loop

import java.util.Scanner;
public class DSA2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter some number : ");
        int n = sc.nextInt();
        int i = 1;
        while (i<=n){
            int j = 1;
            while(j<=n){
                int s =  n-j+1 ;
              System.out.print(" " +s);
                j =j+1;        
            }
            System.out.println();
        i = i + 1;
        }
    }
}

=======================================================================
 
//Using for loop

import java.util.*;

public class DSA2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1; i <=n; i++){
            for(int j = 1; j<=n; j++){
                int s = n - j + 1 ;
                System.out.print(" "+s);
            }
            System.out.println();
        }
    }
}
=======================================================================
