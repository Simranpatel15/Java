import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of radius");
        float r = sc.nextFloat();
       
        float area = 3.14f *r*r;         // decimal value is consider as double so to convert double int float we use f
        System.out.println("area of circle" + area);

        
    }
    
}
