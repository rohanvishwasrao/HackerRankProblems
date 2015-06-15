package Algorithm;



import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by rvishwasrao on 6/14/15.
 */
public class Panagram {

    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        inputString = inputString.toLowerCase();
        char [] inputChar = inputString.toCharArray();
        Map<Integer,Boolean> map = new HashMap<Integer,Boolean>();

        for(int i = 97;i <= 122 ; i++)
        {
            map.put(i,false);
        }
        for(char c : inputChar)
        {
            if((int)c >= 97 && (int)c <=122) {
                if (map.containsKey((int) c)) {
                    map.remove((int) c);
                    map.put((int)c,true);
                 }
            }
        }
        for(int i = 97;i <= 122 ; i++)
        {
            if(!map.get(i))
            {
                System.out.println("not pangram");
                return;
            }
        }
        System.out.println("pangram");
    }
}
