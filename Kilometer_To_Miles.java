import java.util.Scanner;

public class Kilometer_To_Miles {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the distance in kilometers: ");
    double kilometers = scanner.nextDouble();

    double miles = kilometers * 0.621371;

    System.out.printf("The distance in miles is: " + miles);
  }
}