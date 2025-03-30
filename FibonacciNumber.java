import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int prev = 0 , current = 1 , count = 2;
        while(count <= n){
            int  temp = current ; 
            current = current + prev;
            prev = current;
            count++;
        }
        System.out.println(current);
    }
}
