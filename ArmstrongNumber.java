import java.util.Scanner;

public class ArmstrongNumber {

    static boolean isArm(int n){
        int original = n;
        int sum = 0;
        while(n>0){
            int rem = n % 10;
            n = n / 10;
            int cube = rem*rem*rem;
            sum = sum + cube;
        }
        if(sum == original){
            return  true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean check = isArm(n);
        System.out.println(check);
        for(int i=100; i<=10000; i++){
            if(isArm(i)){
                System.out.print(" "+i);
            }
        }
    }
}
