import java.util.Scanner;
  
public class Input{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter your name: ");
      String name = scanner.nextLine();

    System.out.println("Enter age: ");
      int age = scanner.nextInt();

    System.out.println("Enter your weight (in kilograms): ");
      double weight = scanner.nextDouble();
      
    System.out.println("Are you a smoker? (true/false): ");
      boolean isSmoker = scanner.nextBoolean();

    System.out.println("\n--- User Information ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Smoker: " + isSmoker);

    scanner.close();
  }
}
