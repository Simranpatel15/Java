public class Ternary {
    public static void main(String[] args) {
        int num = 4;
        String type=((num % 2)==0) ? "even" :"odd" ;    // ternary operator
        System.out.println(type);

        int marks=30;
        String a = marks>=33?"pass": "fail";
        System.out.println(a);
    }
    
}
