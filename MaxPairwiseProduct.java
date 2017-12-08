import java.util.*;
import java.io.*;
/* This Problem returns a number which is a product of largest two numbers in a given array */
/* Time Complexity is O(n) */
public class MaxPairwiseProduct {
    static int getMaxPairwiseProduct(int[] numbers) {
        int fl=0, sl=0;
        int n = numbers.length;
        for (int i = 0; i < n; i++) {
            if(numbers[i]>fl)
                {
                sl=fl;
                fl=numbers[i];
                }
            else
            {
            if(numbers[i]>sl)
                sl = numbers[i];
            }


        }
        return fl*sl;
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(getMaxPairwiseProduct(numbers));
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

}