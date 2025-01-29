import java.util.Scanner;

public class sumArray {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of Integers: ");
            int nums = scanner.nextInt();

   

            int[] numbers = new int[nums];


            for (int i = 0; i < nums; i++) {
                System.out.print("Enter Integer " + (i + 1) + " : ");
                numbers[i] = scanner.nextInt();

            }

            int sum = 0;
            for (int i = 0; i < nums; i++) {
                sum  += numbers[i];
            }

            System.out.print("The sum is: " + sum);
        }



    }

}
   