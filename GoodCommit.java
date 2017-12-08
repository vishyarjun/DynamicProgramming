import java.util.*;
public class GoodCommit {
/* This Program is used to find the last occurence of good Commit. Good Commit is represented as 0, bad commit as 1.
Given an Sorted array of 0's and 1's, find the last occurence of zero in the array */
/* Since Binary Search is implemented, order is O(log n) */
    static int findLastGoodCommit(int[] arr,int startIndex,int endIndex)
        {
            int solution=-1;
            if(endIndex<=startIndex)
              {
                  if(arr[startIndex]==1)
                        solution= -1;
                  else
                  solution= startIndex;
              }
            else
                {
                    int mid = (startIndex+endIndex)/2;
                    if(arr[mid]==0)
                        {
                            if(mid<endIndex-1&&arr[mid+1]==1)
                            solution= mid+1;
                            else
                            solution= findLastGoodCommit(arr,mid+1,endIndex);
                        }
                    else
                        {
                            if(arr[mid]==1)
                            {
                                if(mid>=1&&arr[mid-1]==0)
                                solution= mid;
                                else
                                solution= findLastGoodCommit(arr,startIndex,mid-1);

                            }

                        }
                }
            return solution;
        }

    public static void main (String[] args)
    {
        int[] arr = {0,0,0,0,0,1,1,1,1,1,1,1};
        int lastGoodCommit = findLastGoodCommit(arr,0,arr.length-1);
        System.out.println(lastGoodCommit);
    }
}