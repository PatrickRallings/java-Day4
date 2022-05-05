import java.util.Scanner;

public class StopAtFive {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Give a number:");
            int inputNum = StopAtFive.scanner();
            if (Integer.valueOf(inputNum) == 5) {
                break;
            }
        }
    }
    public static int scanner() {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
}
