package Methods;

import java.util.Scanner;

public class DivideMethod {
    public static void main(String[] args) {
        System.out.println("Enter your first number:");
        double numOne = DivideMethod.scanner();
        System.out.println("Enter your second number:");
        double numTwo = DivideMethod.scanner();
        System.out.println("Your result is:\n"+numOne+" / "+numTwo+" = "+DivideMethod.divide(numOne, numTwo));
    }
    public static double divide(double numOne, double numTwo) {
        return numOne / numTwo;
    }
    public static double scanner() {
        Scanner scan = new Scanner(System.in);
        return scan.nextDouble();
    }
}
