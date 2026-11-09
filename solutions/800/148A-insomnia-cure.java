import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int t = 1;
        // t = fs.nextInt();
        while (t-- > 0) {
            //Taking all i/p in the predefined formats
            int k = fs.nextInt();
            int l = fs.nextInt();
            int m = fs.nextInt();
            int n = fs.nextInt();
            int d = fs.nextInt();
            //Initializing answer variable, boolean array
            int ans = 0;
            for(int i=1; i<=d; i++){
                if(i%k == 0 || i%l == 0 || i%m == 0 || i%n == 0){
                    ans += 1;
                }
            }
            out.println(ans);
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
