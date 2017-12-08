import java.util.*;
import java.lang.*;
import java.io.*;
public class SubArraySum {
/* This program contains solution for the Geeks For Geeks Problem in the following link
https://practice.geeksforgeeks.org/problems/subarray-with-given-sum/0
This executes with time complexity O(n) for each input
*/
    public static int[] getSubArray(ArrayList A, int sum)
        {
            int sol[]= {-1,-1};
            int start=0,end,tempSum=0;
            while(start<A.size())
                {   
                    for(end=start;end<A.size();end++)
                        {
                            tempSum+=Integer.valueOf((Integer)A.get(end));
                            if(tempSum>=sum)
                                break;
                        }
                    if(tempSum==sum)
                        {
                            sol[0]=start+1;
                            sol[1]=end+1;
                            break;
                        }
                    else
                        {
                            start++;
                            tempSum=0;
                        }

                    
                }
                return sol;
        }

    public static void main(String[] args)
        {
            Scanner n = new Scanner(System.in);
            int testCases = n.nextInt();
            int[] eachArraySize = new int[testCases];
            int[] sums = new int[testCases];
            ArrayList[] inp = new ArrayList[testCases];
            int[][] op = new int[testCases][2];
            for(int i = 0;i<testCases;i++) {
                inp[i] = new ArrayList<Integer>();
                eachArraySize[i] = n.nextInt();
                sums[i] = n.nextInt();
                for(int j=0;j<eachArraySize[i];j++)
                    inp[i].add(n.nextInt());
            }
            for(int i = 0;i<testCases;i++)
                    op[i] = getSubArray(inp[i],sums[i]);    
            
            for(int i = 0;i<testCases;i++)
                {
                    if(op[i][0]==-1)
                    System.out.println(-1);
                    else
                    System.out.println(op[i][0] + " "+op[i][1]);

                }


        }

}