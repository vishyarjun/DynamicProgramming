import java.util.*;
import java.lang.*;

public class Knap01Sack {
/* This problem is a solution for the classic 0-1 Knapsack problem. This is implemented by using Dynamic Programming Approach */
static void printSack(int[] values, int [] wt, int maxWeight)
    {
        int[][] matrix = new int[maxWeight+1][values.length];

        for(int w=0;w<maxWeight+1;w++)
            {
                for(int i =0;i<values.length;i++)
                    {
                        if(i==0||w==0)
                            matrix[w][i]=0;
                        else if (wt[i]>w)
                            matrix[w][i] = matrix[w][i-1];
                        else
                            matrix[w][i] = Math.max(matrix[w][i-1],values[i]+matrix[w-wt[i]][i-1]);
                    }
            }
        System.out.println("Total Value is: "+ matrix[maxWeight][values.length-1]);
        printElements(matrix, values, wt, maxWeight);
        }
static void printElements(int[][] matrix, int[] values, int [] wt, int maxWeight)
    {
        System.out.println("Items Used are");
        int i = values.length-1;
        int w = maxWeight;
        while (i>0)
        {
            if(matrix[w][i]!=matrix[w][i-1])
                {
                System.out.println("Item: "+i+"(w:"+wt[i]+")(val:"+values[i]+ ") || ");
                w=w-wt[i];

                }
            i--;


        }

    }
public static void main(String args[]) {

    Scanner in = new Scanner(System.in);
    System.out.println("Number of Items:");
    int n = in.nextInt();
    System.out.println("Max Weight:");
    int maxWeight = in.nextInt();
    int[] values = new int[n+1];
    int[] wt = new int[n+1];
    values[0]=0;
    wt[0]=0;
    System.out.println("Values:");
    for(int i=1;i<=n;i++)
        values[i] = in.nextInt();
    System.out.println("Weights of Each Item:");
    for(int i=1;i<=n;i++)
        wt[i] = in.nextInt();
    printSack(values,wt,maxWeight);


}

}