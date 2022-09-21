/* print the given pattern.
1 
2 3 
3 4 5 
4 5 6 7
5 6 7 8 9
 */

==================================================================

//Using While Loop


import java.util.Scanner;
public class DSA7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int i = 1;                   
        while(i <= n){
             int j = 1;
             int v = i;
             while(j<=i){
                 System.out.print(v+ " ");
                 j = j +1;
                 v = v + 1;
             }
             System.out.println();
             i = i +1;
        }
    }
}

==================================================================

//Using For Loop

import java.util.Scanner;
public class DSA7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            int v = i;
            for(int j =1; j<=i; j++){
                System.out.print(v + " ");
                v = v + 1;
            }
            System.out.println();
        }
    }
}

==================================================================
