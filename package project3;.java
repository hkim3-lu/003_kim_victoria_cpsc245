package project3;
import Java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int number = reader.nextInt();
        System.out.println("You entered: " + number);
        
        Scanner reader1 = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int number1 = reader1.nextInt();
        System.out.println("Read the entered number is " + number1);

        Scanner reader2 = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int number2 = reader1.nextInt();
        System.out.println("Read the third entered number is " + number2);

        reader.close();
        reader1.close();
        reader2.close();
    }
}
