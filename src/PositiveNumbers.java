import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter a number:");
            int inputNum = PositiveNumbers.scanner();
            if (Integer.valueOf(inputNum) == 0) {
                break;
            } else if (Integer.valueOf(inputNum) > 0) {
                System.out.println("Number is "+inputNum);
                continue;
            } else {
                System.out.println("Must be a positive number.");
            }
        }

    }
    public static int scanner() {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
}
