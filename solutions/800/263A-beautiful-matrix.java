import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int t = 1;
        // t = fs.nextInt();
        while (t-- > 0) {
            int x_pos = 0;
            int y_pos = 0;
            int answer = 0;
            int[][] matrix = new int[5][5];
            for(int i=0; i<5; i++){
                for(int j=0; j<5; j++){
                    int n = fs.nextInt();
                    if (n == 1){
                        x_pos = i;
                        y_pos = j;
                    }
                    matrix[i][j] = n;
                }
            }
            answer = Math.abs(x_pos - 2) + Math.abs(y_pos - 2);
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
