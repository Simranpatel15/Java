public class Pat {
    public static void main(String[] args) {
        int line,i;
        for(line=1; line<=4 ; line++)
        {
            for(i=1; i<=line ; i++)
            {
                System.out.print(i);
            }
            System.out.println();
        }

        int j,k;
        char ch= 'A';
        for(j=1; j<=4 ; j++)
        {
            for(k=1; k<=j ; k++)
            {   
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    
}
