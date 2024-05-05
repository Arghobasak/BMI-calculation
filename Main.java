import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Male and Female BMI calculator!");

    System.out.println();
    
    int age;
    double height, weight, BMI1, BMI2;
    System.out.print("\n\nEnter your age: ");
    age = input.nextInt();
    System.out.print("Enter your height: ");
    height = input.nextDouble();
    System.out.print("Enter your weight: ");
    weight = input.nextDouble();

    BMI1 = 655 + (9.6 * weight) + (1.8 * height) - (4.7 * age);
    BMI2 = 66 + (13.7 * weight) + (5 * height) - (6.8 * age);

    System.out.println();

    System.out.println("BMI is (Male): "+BMI1+ " calory");
    System.out.println("BMI is (Female): "+ BMI2+ " calory");

    char work1, work2, work3, work4, work5;

    System.out.println();

    System.out.print("Do you work out(y/n)?: ");
    work1 = input.next().charAt(0);
    System.out.print("Do you light work out and weekly 2-3 days playing (y/n)?: ");
    work2 = input.next().charAt(0);
    System.out.print("Do you work out and weekly 2-3 very playing (y/n)?: ");
    work3 = input.next().charAt(0);
    System.out.print("Do you work out and weekly everyday very playing (y/n)?: ");
    work4 = input.next().charAt(0);
    System.out.print("Do you hardworkout and very runing, playing (y/n)?: ");
    work5 = input.next().charAt(0);

    System.out.println();

    if (work1 == 'y') {
      System.out.print("\n\nYour corect BMI is: "+ BMI1 * 1.2 + " calory");
    }
    else if (work1 == 'y') {
      System.out.print("\n\nYour corect BMI is: "+ BMI2 * 1.2 + " calory");
    }
    else if (work2 == 'y') {
      System.out.print("\n\nYour corect BMI is: "+ BMI1 * 1.375 + " calory");
    }
    else if (work2 == 'y') {
      System.out.print("\n\nYour corect BMI is: "+ BMI2 * 1.375 + " calory");
    }
    else if (work3 == 'y') {
      System.out.print("\n\nYour corect BMI is: "+ BMI1 * 1.55 + " calory");
    }
    else if (work3 == 'y') {
      System.out.print("\n\nYour corect BMI is: "+ BMI2 * 1.55 + " calory");
    }
    else if (work4 == 'y') {
      System.out.print("\n\nYour corect BMI is: "+ BMI1 * 1.725 + " calory");
    }
    else if (work4 == 'y') {
      System.out.print("\n\nYour corect BMI is: "+ BMI2 * 1.725 + " calory");
    }
    else if (work5 == 'y') {
      System.out.print("\n\nYour corect BMI is: "+ BMI1 * 1.9 + " calory");
    }
    else if (work5 == 'y') {
      System.out.print("\n\nYour corect BMI is: "+ BMI2 * 1.9 + " calory");
    }
    else {
      System.out.print("Okay");
    }

    System.out.println();

    System.out.print("\n\nThank you for using our BMI calculator !!");
    
  }
}
