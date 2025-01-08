import java.util.Scanner;

public class Celsius_To_Fahrenheit {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the temperature in Celsius: ");
    double celsius = scanner.nextDouble();
    double fahrenheit = (celsius * 9 / 5) + 32;

    System.out.printf("The temperature in Fahrenheit is: %.2f\n", fahrenheit);
  }
}
