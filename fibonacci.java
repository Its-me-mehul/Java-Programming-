import java.util.*;

public class fibonacci {

    public static void main()
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        if(n == 1)
        {
            System.out.println("0");
        }

        else if(n==2)
        {
            System.out.println("0 1");
        }

        else{
            int i = 0;
            int a = 0;
            int b = 1;
            while(i <= n)
            {
                System.out.print(a +" ");
               int sum = a + b;
               int temp = a;
               a = b;
               b = temp;

            }


        }
    }
    
}
