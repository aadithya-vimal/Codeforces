import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int t = 1;
        // t = fs.nextInt();
        while (t-- > 0) {
            //taking i/p and initializing all req variables
            int n = fs.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                int height = fs.nextInt();
                arr[i]=height;
            }
            int answer = 0;
            int maxHeight = arr[0];
            int minHeight = arr[0];
            int maxIndex = 0;
            int minIndex = 0;
            //taking largest height, smallest height
            for(int i=1; i<n; i++){
                if(arr[i]>maxHeight){
                    maxHeight = arr[i];
                    maxIndex = i;
                }
                if(arr[i]<=minHeight){
                    minHeight = arr[i];
                    minIndex = i;
                }
            }
            //checking no. of swaps
            int maxSwaps = maxIndex;
            int minSwaps = n - minIndex - 1;
            answer = maxSwaps + minSwaps;
            if(maxIndex>minIndex){
                answer -= 1;
            }
            out.println(answer);
        }

        out.flush();
    }

    static class FastScanner {
        private final BufferedReader br;
        private StringTokenizer st;

        FastScanner(InputStream in) {
            br = new BufferedReader(new InputStreamReader(in));
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) {
                String line = br.readLine();
                if (line == null) return null;
                st = new StringTokenizer(line);
            }
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }
    }
}
