import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int t = 1;
        // t = fs.nextInt();
        while (t-- > 0) {
            //Taking rows(n) and columns(m) as i/p
            int n =fs.nextInt();
            int m = fs.nextInt();
            //Boolean flag to take side. True->left, False->right
            boolean side = false;
            for(int i=1; i<=n; i++){
                //If i value is odd, fill # m times
                if(i%2!=0){
                    for(int j=1; j<=m; j++){
                        out.print("#");
                    }
                    out.print("\n");
                    continue;
                }
                if(side){
                    int num = 2;
                    out.print("#");
                    while(num<=m){
                        out.print(".");
                        num += 1;
                    }
                    out.println();
                    side = false;
                }else{
                    int num = 1;
                    while(num<m){
                        out.print(".");
                        num += 1;
                    }
                    out.print("#");
                    out.print("\n");
                    side = true;
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
