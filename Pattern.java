public class Pattern
 {
    public static void main(String[] args) {
        int line , i;
        for(line=1; line<=4; line++)
        {
            for(i=1; i<=line; i++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
     int j,k;
     for(j=1;j<=4;j++)
     {
        for(k=1;k<=4-j+1 ;k++)
        {
            System.out.print("*");

        }
        System.out.println();
     }

    }
    
}
