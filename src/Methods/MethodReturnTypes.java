package Methods;

import java.util.Scanner;

public class MethodReturnTypes {
    public static void main(String[] args) {
        System.out.println("Please enter your name:");
        String name = MethodReturnTypes.scanner();
        System.out.println(MethodReturnTypes.output(areMatt(name), name));
    }
    public static String scanner() {
        Scanner scan =new Scanner(System.in);
        return scan.nextLine();
    }
    public static boolean areMatt(String name) {
        boolean check;
        check = name.equalsIgnoreCase("Matt");
        return check;
    }
    public static String output(boolean b, String name) {
        String output;
        if (b) {
            output = "Hey Matt, you were right about using floating points in the previous assignment.\nOh, and your name has "+nameLength(name)+" characters.";
        } else {
            output = "Hey "+name+", I hope you're having a good day.\nOh, and your name has "+nameLength(name)+" characters.";
        }
        return output;
    }
    public static int nameLength(String name) {
        return name.length();
    }
}
