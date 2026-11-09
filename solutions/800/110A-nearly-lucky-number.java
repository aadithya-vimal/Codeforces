import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int t = 1;
        // t = fs.nextInt();
        while (t-- > 0) {
            String s = fs.next();
            int counterNum = 0;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)=='4' || s.charAt(i)=='7'){
                    counterNum += 1;
                }
            }  
            String s2 = String.valueOf(counterNum);
            boolean nearlyLucky = true;
            for(int j=0; j<s2.length(); j++){
                if(s2.charAt(j)!='4' && s2.charAt(j)!='7'){
                    nearlyLucky = false;
                }
            }
            if(nearlyLucky){
                out.println("YES");
            }else{
                out.println("NO");
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
