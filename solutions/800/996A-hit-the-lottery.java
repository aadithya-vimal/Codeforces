import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int t = 1;
        // t = fs.nextInt();
        while (t-- > 0) {
            //can take bills of 100, 20, 10, 5, 1
            //taking initial amount i/p
            int n = fs.nextInt();
            int numberOfBills = 0;
            while(n>0){
                if(n>=100){
                    n -= 100;
                    numberOfBills += 1;
                    continue;
                }else if(n>=20){
                    n -= 20;
                    numberOfBills += 1;
                    continue;
                }else if(n>=10){
                    n -= 10;
                    numberOfBills += 1;
                    continue;
                }else if(n>=5){
                    n -= 5;
                    numberOfBills += 1;
                    continue;
                }else if(n>=1){
                    n -= 1;
                    numberOfBills += 1;
                    continue;
                }
            }
            out.println(numberOfBills);
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
