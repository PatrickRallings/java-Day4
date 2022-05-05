package Methods;
import java.util.ArrayList;
import java.util.Scanner;

public class AverageMethod {
    public static ArrayList<Double> array = new ArrayList<Double>();

    public static void main(String[] args) {
        System.out.println("Let's find the sum and average of an array.\nHow many numbers do you want in your array?");
        int index = (int) AverageMethod.scanner();
        array = arrayCreator(index);
        System.out.println("Your array is: "+array);
        System.out.println("The sum of your array is "+sum(array)+" and its average is "+average(sum(array), index));
    }
    public static double scanner() {
        Scanner scan = new Scanner(System.in);
        return scan.nextDouble();
    }
    public static ArrayList<Double> arrayCreator(int index) {
        for (int i = 0; i < index; i++) {
            System.out.println("Please enter a number ("+(index-i)+" left).");
            array.add(AverageMethod.scanner());
        }
        return array;
    }
    public static double sum(ArrayList<Double> array) {
        double sum = 0;
        for (Double aDouble : array) {
            sum += aDouble;
        }
        return sum;
    }
    public static double average(double sum, int index) {
        return sum/index;
    }

}
