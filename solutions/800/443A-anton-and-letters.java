import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int t = 1;
        // t = fs.nextInt();
        while (t-- > 0) {
            //taking i/p as string
            String ip = fs.nextLine();
            //using for loop to iterate into set
            HashSet<Character> set = new HashSet<>();
            //adding only valid characters to set
            for(int i=0; i<ip.length(); i++){
                char ch = ip.charAt(i);
                if(ch>='a' && ch<='z'){
                    set.add(ch);
                }
            }
            //printing final answer as set size
            out.println(set.size());
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
        
        String nextLine() throws IOException {
            if (st != null && st.hasMoreTokens()) {
                StringBuilder sb = new StringBuilder();
                while (st.hasMoreTokens()) {
                    sb.append(st.nextToken()).append(" ");
                }
                return sb.toString().trim();
            }
            return br.readLine();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }
    }
}
