import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name");
        String name = sc.nextLine();
        System.out.println("Enter your Last name");
        String lastName = sc.nextLine();
        System.out.println("Enter your Age");
        int age = sc.nextInt();
        System.out.print("Input weight in kilogram: ");
        double weight = sc.nextDouble();
        System.out.print("Input height in meters: ");
        double height = sc.nextDouble();
        double BMI = weight / (height * height);
        System.out.print("The Body Mass Index (BMI) is " + BMI + " kg/m2");
    }
}