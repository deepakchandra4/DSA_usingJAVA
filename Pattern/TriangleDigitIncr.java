/* print this pattern
1 
2 3 
4 5 6 
7 8 9 10 
 */
=====================================================================

Using while loop :)
=====================================================================
import java.util.*;
public class DSA6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        int i = 1;
        while(i<=n){
            int j =1;
            while(j<=i){
                System.out.print(count+" ");
                j = j +1;
                count = count +1;
            }
            System.out.println();
            i = i + 1;
        }

    }
}

=====================================================================
//Using for loop :)


import java.util.*;
public class DSA6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(count+" ");
                count = count + 1;
            }
            System.out.println();
        }
    }
}
=====================================================================
