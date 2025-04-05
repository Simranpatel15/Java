import java.util.Scanner;

public class Largest{
    public static void main(String args[])          // if-else
    {
       Scanner sc = new Scanner(System.in);         // largest of two num
       System.out.println("enter first num");
       int a = sc.nextInt();
       System.out.println("enter second num");
       int b = sc.nextInt();
       System.out.println("enter third num");
       int c = sc.nextInt();
       if(a>=b && a>=c)
       {
        System.out.println(a + "is largest num");
       }
       else  if (b>=a && b>=c)
       {
        System.out.println(b + "is largest num");
       }
       else 
       {
        System.out.println(c + "is largest num");
       }

    }  
}
