import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {

            while (true) {
                System.out.print("Enter a number: ");
                int number = scanner.nextInt();

                if (number % 2 == 0) {
                    System.out.println("The number is even.");
                } else {
                    System.out.println("The number is odd.");
                }

                System.out.print("Do you want to continue? (yes/no): ");
                String answer = scanner.next();

                if (answer.equals("no")) {
                    break;
                }
                
            }
            
        }

    }
    
}
