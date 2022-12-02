import java.util.*;

class reverse_str{

    public static void reverse(String str)
    {
            if(str == "")
            {
                return;
            }
            char ch = str.charAt(str.length()-1);
            System.out.print(ch);

            reverse(str.substring(0,str.length()-1));

    }
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();

        // reverse(str); By recursion

        for(int i = str.length()-1;i>=0;i--)
        {
            char ch = str.charAt(i);
            System.out.print(ch);
        }

    }
}