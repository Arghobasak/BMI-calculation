import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int age;
    double height, weight, BMI1, BMI2;

    System.out.print("Enter your age: ");
    age = input.nextInt();

    System.out.print("Enter your height: ");
    height = input.nextDouble();

    System.out.print("Enter your weight: ");
    weight = input.nextDouble();

    BMI1 = 655 + (9.6 * weight) + (1.8 * height) - (4.7 * age);
    BMI2 = 66 + (13.7 * weight) + (5 * height) - (6.8 * age);

    System.out.println();

    System.out.println("Your normal BMI is (M): "+BMI1+" calory");
    System.out.println("Your normal BMI is (F): "+BMI2+" calory");

    System.out.println();

    char ch1, ch2, ch3, ch4, ch5;
    System.out.print("Worke out? (y/n): ");
    ch1 = input.next().charAt(0);
    System.out.print("Light work out, weekly 2-3 days played? (y/n): ");
    ch2 = input.next().charAt(0);
    System.out.print("Work out, weekly 2-3 days very played? (y/n): ");
    ch3 = input.next().charAt(0);
    System.out.print("Worke out, weekly everydays very played? (y/n): ");
    ch4 = input.next().charAt(0);
    System.out.print("Very hard work, very rub and played? (y/n): ");
    ch5 = input.next().charAt(0);

    double work1;
    work1 = BMI1 * 1.2;
    double work2;
    work2 = BMI1 * 1.375;
    double work3;
    work3 = BMI1 * 1.55;
    double work4;
    work4 = BMI1 * 1.725;
    double work5;
    work5 = BMI1 * 1.9;

    double workF1;
    workF1 = BMI2 * 1.2;
    double workF2;
    workF2 = BMI2 * 1.375;
    double workF3;
    workF3 = BMI2 * 1.55;
    double workF4;
    workF4 = BMI2 * 1.725;
    double workF5;
    workF5 = BMI2 * 1.9;

    System.out.println();

    if (ch1 == 'y') {
      System.out.println("Your corect BMI is (M): "+work1+" calory");
    }
    else if (ch2 == 'y') {
      System.out.println("Your corect BMI is (M): "+work2+" calory");
    }
    else if (ch3 == 'y') {
      System.out.println("Your corect BMI is (M): "+work3+" calory");
    }
    else if (ch4 == 'y') {
      System.out.println("Your corect BMI is (M): "+work4+" calory");
    }
    else if (ch5 == 'y') {
      System.out.println("Your corect BMI is (M): "+work5+" calory");
    }
    else {
      System.out.print("Sorry, You are a not human !!");
    }
    if (ch1 == 'y') {
      System.out.print("Your corect BMI is (F): "+workF1+" calory");
    }
    else if (ch2 == 'y') {
      System.out.print("Your corect BMI is (F): "+workF2+" calory");
    }
    else if (ch3 == 'y') {
      System.out.print("Your corect BMI is (F): "+workF3+" calory");
    }
    else if (ch4 == 'y') {
      System.out.print("Your corect BMI is (F): "+workF4+" calory");
    }
    else if (ch5 == 'y') {
      System.out.print("Your corect BMI is (F): "+workF5+" calory");
    }
    else {
      System.out.print("Sorry, You are a not human !!");
    }
  }
}