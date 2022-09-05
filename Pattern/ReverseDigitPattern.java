/* Task : print this pattern 
 4 3 2 1
 4 3 2 1
 4 3 2 1
 4 3 2 1
 */



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
