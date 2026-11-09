import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int t = 1;
        // t = fs.nextInt();
        while (t-- > 0) {
            //taking all i/p and placing directly into set
            int n = fs.nextInt();
            HashSet<Integer> set = new HashSet<>();
            int a = fs.nextInt();
            for(int i=0; i<a; i++){
                set.add(fs.nextInt());
            }
            int b = fs.nextInt();
            for(int i=0; i<b; i++){
                set.add(fs.nextInt());
            }
            if(set.size()==n){
                out.println("I become the guy.");
            }else{
                out.println("Oh, my keyboard!");
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
