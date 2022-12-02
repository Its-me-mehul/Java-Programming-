import java.util.*;

class rotate_int{
    
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();

        int t = n;
        int count = 0;

        while(t > 0)
        {
            t /= 10;
            count++;

        }
        if(r > n)
        {
            r %= count;
        }

        if(r < 0)
        {
            r += count;
        }

        int mul = 1;
        int div = 1;

        mul = (int)Math.pow(10, r);
        div = (int)Math.pow(10, count-r);

        int preAns1 = n / div;
        int preAns2 = n % div;

        int ans = preAns2 * mul + preAns1;

        System.out.println(ans);
    }
}