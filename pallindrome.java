import java.util.*;

class reverse{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        long num = scn.nextLong();
        long temp = num;

        long ans = 0;

        while(num > 0)
        {
            long dig = num % 10;
            ans = ans*10 + dig;
            
            num /=10;

        }

        if(ans != temp){
            System.out.println("Number is not a pallindrome");
        }

        else{
            System.out.println("Number is a pallindrome");
        }
    }
}