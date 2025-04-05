import java.util.Scanner;       // prime 

public class Prime{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        boolean isPrime = true;
        
        if(n<=1)
        {
            isPrime = false;
        }
        else
        {
        for(int i=2 ; i < n ; i++ )
        {
            if (n%i==0)
            {
                isPrime = false;
            }
        }
        if(isPrime == true)
        {
            System.out.println("n is prime");

        }
        else{
            System.out.println("n is not prime");
        }
    }



    }
    
}
