import java.util.Scanner;

public class C2FWrong {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter a temperature in Centigrade to convert to Fahrenheit: ");
        double temp = stdin.nextDouble();
        System.out.println("Equivalent Fahrenheit temperature = " + (temp*5/9+32));
    }
}