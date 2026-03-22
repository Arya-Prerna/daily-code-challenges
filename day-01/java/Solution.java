// CONCEPT: Java is Statically Typed.
// Every variable must have a declared type (like String, int, double).
// These types are checked during compilation, making the code more robust but verbose.
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "";
        int age = 0;
        float height = 0.0f;

        System.out.print("What is your name? ");
        name = sc.nextLine();

        System.out.print("What is your age? ");
        age = sc.nextInt();

        System.out.print("What is your height? ");
        height = sc.nextFloat();

        System.out.printf("Hello, %s! You are %d years old and %.1f meters tall.", name, age, height);
        System.out.println();
        System.out.println("-------------- Temp Converter ----------------");
        float temp = 0.0f;
        System.out.print("Enter the temperature in Celsius: ");
        temp = sc.nextFloat();
        float fahrenheit = (temp * 9/5) + 32;
        float kelvin = temp + 273.15f;
        System.out.printf("The temperature in Fahrenheit is %.2f and in kelvin is %.2f", fahrenheit, kelvin);
        sc.close();
    }
}