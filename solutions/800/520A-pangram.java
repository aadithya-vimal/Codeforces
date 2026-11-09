import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int t = 1;
        // t = fs.nextInt();
        while (t-- > 0) {
            //take int and string i/p
            int n = fs.nextInt();
            String a = fs.next();
            a=a.toLowerCase();
            //initialize alphabet holding ds
            Set<Character> set = new HashSet<>();
            for(char c='a'; c<='z'; c++){
                set.add(c);
            }
            //checking if word is pangram
            for(int i=0; i<n; i++){
                set.remove(a.charAt(i));
            }
            //returning answer
            if(set.isEmpty()){
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
