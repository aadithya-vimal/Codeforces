import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int t = 1;
        // t = fs.nextInt();
        while (t-- > 0) {
            //Taking inputs n and h, initializing array, and req. variables
            int n = fs.nextInt();
            int h = fs.nextInt();
            int[] heights = new int[n];
            int minWidth = 0;
            int tooTall = 0;
            int correctHeight = 0;
            int answer = 0;
            //Taking inputs of the height
            for(int i=0; i<n; i++){
                heights[i] = fs.nextInt();
                if(heights[i]>h){
                    tooTall += 1;
                }else{
                    correctHeight += 1;
                }
            }
            answer = (correctHeight*1) + (tooTall*2);
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
