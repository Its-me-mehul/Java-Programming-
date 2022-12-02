import java.util.*;

class rotate_rec_arr{

    public static void reverse(int[] num, int st, int en)
    {
        while(st < en){
            int temp = num[st];
            num[st] = num[en];
            num[en] = temp;

            st++;
            en--;
        }

        
    }
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] num = new int[n];
        for(int i=0;i<num.length;i++)
        {
            num[i] = scn.nextInt();
        }
        int r = scn.nextInt();

        r %= n;

        if(r < 0)
        {
            r += n;
        }

        reverse(num,0,r-1);
        reverse(num,r,n-1);
        reverse(num,0,n-1);

        for(int i = 0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }


    }
}