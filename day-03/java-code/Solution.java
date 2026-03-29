import java.util.Scanner;

public class Solution {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("---------------- FIZZBUZZ -----------------");
      float num = 0.0f;
      System.out.print("Enter a number between 1 to 100: ");
      num = sc.nextFloat();
      if (num < 1.0f && num > 100.0f) {
         System.out.println("Invalid input");
      } else if (num % 15.0f == 0.0f) {
         System.out.println("FIZZBUZZ");
      } else if (num % 5.0f == 0.0f) {
         System.out.println("BUZZ");
      } else if (num % 3.0f == 0.0f) {
         System.out.println("FIZZ");
      } else {
         System.out.println(num);
      }
      System.out.println("----------- MULTIPLICATION TABLE ------------");
      for(int i = 1; i <=12; i++){
         for(int j = 1; j <= 10; j++){
            System.out.print("  ");
            System.out.printf("%3d",i*j);
            System.out.print("  ");
         }
         System.out.println();
      }

      System.out.println("--------------- PATTERNS -----------------");
      int choice = 0, row = 0;
      System.out.print("1.Right Triangel 2.Pyramid 3.Diamon: ");
      choice = sc.nextInt();
      System.out.print("Enter the number of rows: ");
      row = sc.nextInt();
      switch (choice) {
         case 1:
            for (int i = 1; i < row+1; i++) {
               System.out.println("*".repeat(i));
            }
            break;
         case 2:
            for(int i=1; i<row+1; i++){
               System.out.print(" ".repeat(row - i));
               System.out.println("*".repeat(2 * i - 1));
            }
         default:
            break;
         case 3:
            for(int i=1; i<row+1; i++){
               System.out.print(" ".repeat(row - i));
               System.out.println("*".repeat(2 * i - 1));
            }
            for(int i=row; i>0; i--){
               System.out.print(" ".repeat(row - i));
               System.out.println("*".repeat(2 * i - 1));
            }
      }
      sc.close();
   }
}
