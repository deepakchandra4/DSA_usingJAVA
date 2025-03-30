import java.util.Scanner;

public class Method {
    
    public static void main(String[] args) {
        sum();
    }

    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number : ");
        int num2 = sc.nextInt();
        System.out.println("The sum is  : " + (num1 + num2));

    }
}
