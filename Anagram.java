import java.util.*;
public class Anagram {
/* Anagram is a word, phrase, or name formed by rearranging the letters of another, such as spar, formed from rasp.
Given two Strings this program finds if one is the Anagram of other */
/* Time Complexity: O(n) where n is the number of characters in given two strings each.
*/

static int findAnagram(String a, String b)
    {
       int[] aint = new int[26];
       int[] bint = new int[26];
       char[] aa = a.toCharArray();
       char[] bb = b.toCharArray();
       int soln=0;
       if(aa.length!=bb.length)
            soln = -1;
        else
            {
                for(int i=0;i<aa.length;i++)
                    {
                        int ascii1 = (int)(aa[i]);
                        aint[ascii1-97]++;
                        int ascii2 = (int)(bb[i]);
                        bint[ascii2-97]++;
                    }
                    for(int i=0;i<aint.length;i++)
                        {
                            if(aint[i]>=bint[i])
                                soln+=(aint[i]-bint[i]);
                        }

            }
            return soln;

    }
public static void main(String[] args)
    {
        String a = "cat";
        String b = "act";
        System.out.println(findAnagram(a,b));
    }
}