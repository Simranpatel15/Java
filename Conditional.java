import java.util.Scanner;

public class Conditional {
    public static void main(String args[])          // if-else
    {
       Scanner sc = new Scanner(System.in);         // largest of two num
       System.out.println("enter first num");
       int a = sc.nextInt();
       System.out.println("enter second num");
       int b = sc.nextInt();
       if(a>=b)
       {
        System.out.println(a + "is largest num");
       }
       else
       {
        System.out.println(b + "is largest num");
       }


       if (a%2==0)                               // even odd
       {
        System.out.println(a +"is even num");
       }

       else
       {
        System.out.println(a +"is odd num");
       }

    }
    
}
