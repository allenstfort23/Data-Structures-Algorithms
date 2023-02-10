import java.util.*;
public class Recursion {
    public static void main(String[] args) {
        System.out.println("Enter Integer for Factorial: ");
        Scanner newInput = new Scanner(System.in);
        int tester = newInput.nextInt();
        System.out.println("The factorial of " + " = " + calcFactorial(tester));
    }
    public static long calcFactorial(int input) {
        if(input == 1) {
            System.out.println(input + "<-------");
            return 1;
        }
        return input * calcFactorial(input -1);
    }
}
