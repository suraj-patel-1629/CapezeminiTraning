
import java.util.Scanner;

class Area_Circle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double radius = sc.nextDouble();
    double area = Math.PI * Math.pow(radius, 2);
    System.out.println("Area of circle : " + area);
  }
}
