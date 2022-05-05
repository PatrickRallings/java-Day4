import java.util.Scanner;

public class CountToEleven {
    public static void main(String[] args) {
        System.out.println("Enter a number less than 11");
        int inputNum = CountToEleven.scanner();
        CountToEleven.loop(inputNum);
    }
    public static int scanner() {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
    public static void loop(int inputNum) {
        for (int i = inputNum; i <= 11; i++) {
            System.out.println(i);
        }
    }
}
