package Algorithm;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by rvishwasrao on 8/28/15.
 */
public class AshtonAndString {

    public static void main(String [] args) {
        String str = "dbac";
        int k = 3;
        char[] charArray = str.toCharArray();
        //Arrays.sort(charArray);
        List<String>  sb = retAllSubstrings(str);
        StringBuffer concatStr = concatAllSutbstring(sb);
        System.out.println(returnKthChar(concatStr, k));
    }
    public static List<String> retAllSubstrings(String str)
    {
        List<String> retBuff = new ArrayList<String>();

        for(int i = 0 ; i <= str.length() ; i++)
        {
            for(int j = i; j <= str.length() ;j++)
            {
                String sub = str.substring(i,j);
                if(!sub.isEmpty() && sub != null )retBuff.add(sub);
            }
        }
        Collections.sort(retBuff);
        return retBuff;
    }
    public static StringBuffer concatAllSutbstring(List<String> allSubs)
    {
        StringBuffer sb = new StringBuffer();
        for(String s: allSubs)
        {
            sb.append(s);
        }
        return sb;
    }
    public static Character returnKthChar(StringBuffer sb, int index)
    {
        return sb.charAt(index-1);
    }
}
