import java.util.*;

class rotate{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        int num = scn.nextInt();
        int r = scn.nextInt();
        int digits = 0;
        int temp = num;

        while(temp > 0){
            temp /= 10;
            digits++;
        }

        r %= digits;

        if(r < 0)
        {
            r += digits;
        }

        int mul = (int) Math.pow(10,r);
        int  div  = (int) Math.pow(10, digits-r);

        int num1 = num % div;
        int num2 = num / div;

        int ans = (num1*mul) + num2;

        System.out.println(ans);



    }
}