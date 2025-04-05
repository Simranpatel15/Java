import java.util.Scanner;

public class Else {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your age");
    int age= sc.nextInt();
    if(age>=18)
    {
        System.out.println("Adult");
    }
    else if(age>=13 && age< 18)
    {
        System.out.println("teenager");
    }
    else
    {
        System.out.println("child");  

    }

}
    
}
