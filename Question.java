import java.util.Scanner;

public class Question {
   public Question() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);

      while(true) {
         System.out.println("enter your number");
         int var2 = var1.nextInt();
         if (var2 % 10 == 0) {
            return;
         }

         System.out.println(var2);
      }
   }
}