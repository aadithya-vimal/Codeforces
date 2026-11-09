import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int t = 1;
        // t = fs.nextInt();
        while (t-- > 0) {
            //Taking number of test cases
            int n = fs.nextInt();
            //Iterating through each test case and finding all possible 2 number sums (3 possibilities)
            for(int i=0; i<n; i++){
                boolean isSum = false;
                int a = fs.nextInt();
                int b = fs.nextInt();
                int c = fs.nextInt();
                int sum1 = a+b;
                int sum2 = b+c;
                int sum3 = a+c;
                if(a==sum2 || b==sum3 || c==sum1){
                    isSum = true;
                }
                if(isSum){
                    out.println("YES");
                }else{
                    out.println("NO");
                }
            }
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
