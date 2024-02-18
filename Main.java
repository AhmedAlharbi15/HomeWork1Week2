//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);
//    Q1:
//        System.out.print("Input the first number: ");
//        double num1 = scanner.nextDouble();
//        System.out.print("Input the second number: ");
//        double num2 = scanner.nextDouble();
//        System.out.print("Input the third number: ");
//        double num3 = scanner.nextDouble();
//
//        double smallest = findSmallest(num1, num2, num3);
//
//        System.out.println("The smallest value is " + smallest);
//
//    }
//
//    public static double findSmallest(double num1, double num2, double num3) {
//        double smallest = num1;
//
//        if (num2 < smallest) {
//            smallest = num2;
//        }
//        if (num3 < smallest) {
//            smallest = num3;
//        }
//
//        return smallest;
//    }
//

//        Q2:
//        System.out.print("Enter a number: ");
//        double number = scanner.nextDouble();
//
//        checkNumber(number);
//
//    }
//
//    public static void checkNumber(double number) {
//        if (number > 0) {
//            System.out.println("The number is positive.");
//        } else if (number < 0) {
//            System.out.println("The number is negative.");
//        } else {
//            System.out.println("The number is zero.");
//        }
//
//    }
//
//     Q3:
//        System.out.println("Enter a password:");
//        String password = scanner.nextLine();
//
//        if (isValidPassword(password)) {
//            System.out.println("Password is valid: " + password);
//        } else {
//            System.out.println("Password is invalid.");
//        }
//
//    }
//    public static boolean isValidPassword(String password) {
//        if (password.length() < 8) {
//            System.out.println("1. A password must have at least eight characters");
//            return false;
//        }
//
//        if (!password.matches("[a-zA-Z0-9]+")) {
//            System.out.println("2. A password consists of only letters and digits.");
//            return false;
//        }
//
//        int digitCount = 0;
//        for (char c : password.toCharArray()) {
//            if (Character.isDigit(c)) {
//                digitCount++;
//            }
//        }
//        if (digitCount < 2) {
//            System.out.println("3. A password must contain at least two digits.");
//            return false;
//        }
//        return true;
//    }

}
