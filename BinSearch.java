public class BinSearch {
/* This is a classic Binary Search Program that is used to find a number in a given sorted Array. It uses Iterative Approach */
/* Time Complexity: O(log n) */
    public static void findNumber(int[] input, int search)
        {
            int start=0;
            int end = input.length-1;
            while(start<=end)
                {
                    int mid = start+((end-start)/2);
                    if(input[mid]>search)
                            end=mid-1;
                    else if(input[mid]<search)
                            start=mid+1;
                    else
                        {
                        System.out.println("The index is "+ mid);
                        return;
                        }

                }
                System.out.println("Number not found");

        }
    public static void main(String[] args)
        {
            int [] input = {1, 7, 9, 20, 26, 30, 35};
            findNumber(input,7);
        }
}