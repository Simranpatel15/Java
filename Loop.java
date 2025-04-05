import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        int i=0;
        while(i<10)
        {
             System.out.println("Hello world");
             i++;
         }
                
    
 

        int j=1;
        while(j<=10)
        {
            System.out.println(j);
            j++;
        }

    Scanner sc = new Scanner(System.in);          // Sum of n natural number
    System.out.println("enter the value of n");
    int n= sc.nextInt();
    int sum=0;
    int k=1;
    while ( k <=n)
   {
        sum=sum+k;   // sum+=i;
        k++;
        
   }
    
    System.out.println("sum of n natural num is :" +sum);
 
}
 }
    

