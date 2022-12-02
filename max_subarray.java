import java.util.*;

class max_subarray{

    public static int count_max(int[] arr)
    {
        int mcount = 0;
        int count = 1;

        int i = 1;

        while(i <= arr.length-1)
        {
            if(arr[i] == arr[i-1])
            {
                count++;
            }

            else
            {   
                if(count > mcount)
                {
                    mcount = count;
                    count = 1;
                }
            }

            i++;
        }

        if(mcount < count)
        {
            mcount = count;
        }
            
        return mcount;
    }

    public static void maxSubArray(int[] arr, int target)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int st = 0;
        int end = -1;

        for(int i = 0;i<arr.length;i++)
        {
            sum += arr[i];

            if(sum == target)
            {
                st = 0;
                end = i;
                break;
            }

            if(map.containsKey(target-sum))
            {
                st = map.get(target - sum) + 1;
                end  = i;
                break;
            }

            map.put(sum,i);
        }

        if(end == -1)
        {
            System.out.println("No Such sub array found");
        }

        else{
            for(int i = st ;i <= end; i++)
            {
                System.out.print(arr[i]+" ");
            }
        }


    }
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<arr.length;i++)
        {
            arr[i] = scn.nextInt();
        }

        int target = scn.nextInt();

        //System.out.println(count_max(arr));

        maxSubArray(arr,target);

    }
}       