import java.util.*;

class repeating_nums{
public static void main(String[] args)
{

    int[] arr = {1,2,2,3,2,3,4,1,67,4,5,6,6,};

    HashMap<Integer,Integer> map = new HashMap();

    for(int i = 0;i<arr.length;i++)
    {
        if(map.containsKey(arr[i]))
        {
            int freq = map.get(arr[i]);
            map.put(arr[i],freq+1);
        }
        else{
            map.put(arr[i],1);
        }

    }
    int max = 0;
    int maxEl = 0;

    for(int i : map.keySet()){

        int val = map.get(i);

        if(val > 1)
        {   
            System.out.println(i);
        }


    }

}

}
