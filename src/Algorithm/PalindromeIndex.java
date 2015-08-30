package Algorithm;

/**
 * Created by rvishwasrao on 8/30/15.
 */
public class PalindromeIndex {

    public static void main(String [] args)
    {
        String [] strArray = {"bcbc","bacab","baakb","abccbma","a"};
        for(String s: strArray)
        {
            System.out.println(returnIndexToRemove(s));
        }

    }
    public static int returnIndexToRemove(String str)
    {
        int start = 0;
        int end = str.length()-1;

        while(start!=end)
        {
            if(str.charAt(start) != str.charAt(end))
            {
                return getIndex(str,start,end);
            }
            else
            {
                start++;
                end--;
            }
        }
        return -1;
    }

    public static int getIndex(String str, int start, int end)
    {
        char afterStart = str.charAt(start+1);
        char beforeEnd = str.charAt(end-1);
        if(str.charAt(start) == beforeEnd)
        {
            return end;
        }
        else if(str.charAt(end) == afterStart)
        {
            return start;
        }
        return -1;
    }
}
