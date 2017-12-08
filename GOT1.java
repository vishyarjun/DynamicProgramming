import java.util.*;
public class GOT1 {
/* This Program is used to find whether a given String is a palindrom or Not
Time Complexity O(n) where n is the number of chars in string */
    static String findAnaPal(String a)
        {
            int[] aint = new int[26];
            char[] aa = a.toCharArray();

            for(int i=0;i<aa.length;i++)
                {
                    int ascii = (int)aa[i];
                    aint[ascii-97]++;
                }
            int nodds=0;
            for(int i=0;i<aint.length;i++)
                {
                    if(aint[i]%2!=0)
                        nodds++;
                }
            if(nodds<=1)
                return "Yes";
            else
                return "No";
        }


    public static void main(String[] args)
        {
            String a = "malayalam";
            System.out.println(findAnaPal(a));

        }
}