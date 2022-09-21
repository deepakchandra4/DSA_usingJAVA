/*
1 
2 1 
3 2 1 
4 3 2 1 
5 4 3 2 1 
 */



===================================================================
  
//Using For Loop

import java.util.Scanner;

public class DSA8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i<=n){
            int j = 1;
            while(j<=i){
                int s = i-j+1;
                System.out.print(" "+s);
                j = j + 1;  
            }
            System.out.println();
            i = i + 1;
        }
    }
    
}


===================================================================
//Using For Loop 
  

import java.util.Scanner;

public class DSA8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i ;
        for(i = 1; i <=n; i++ ){
            for(int j = 1; j<=i; j++ ){
                int s = i - j + 1;
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}

===================================================================
