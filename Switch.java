import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();
        switch (day) {
            case "Monday" -> System.out.println("It's a Monday");
            case "Tuesday" -> System.out.println("It's a Tuesday");
            case "Wednesday" -> System.out.println("It's a Wednesday");
            case "Thursday" -> System.out.println("It's a Thursday");
            case "Friday" -> System.out.println("It's a Friday");        
            default -> System.out.println("Invalid Entry");
        }
    }
}
