import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int t = 1;
        // t = fs.nextInt();
        while (t-- > 0) {
            int n = fs.nextInt();
            int s = fs.nextInt();
            String queue = fs.next();
            char[] standings = new char[n];
            char temp = ' ';
            standings = queue.toCharArray();
            for(int i=0; i<s; i++){
                for(int j=0; j+1<n; j++){
                    if(standings[j]=='B' && standings[j+1]=='G'){
                        temp = standings[j];
                        standings[j] = standings[j+1];
                        standings[j+1] = temp;
                        j++;
                    }
                }
            }
            String answer = new String(standings);
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
