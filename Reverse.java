public class Reverse {
    public static void main(String[] args)
 {
    int n= 10899;           // print the reverse of the number
     while(n>0)
    {
        int last_digit= n%10;
        System.out.print(last_digit);
        n=n/10;
    }
    System.out.print("\n");
                            // reverse the given number
     int a= 10899;
     int rev=0;
     while(a>0)
     {
        int last=a%10;
        rev=(rev*10) + last;
        a=a/10;
      }
      System.out.println(rev);
        
 }
    
}
