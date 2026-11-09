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
            int groups = 0;
            Deque<String> stack = new ArrayDeque<>();
            for(int i=0; i<n; i++){
                String ip = fs.next();
                if(!stack.isEmpty()){
                    if(stack.peek().equals(ip)){
                        stack.push(ip);
                    }else{
                        while(!stack.isEmpty()){
                            stack.pop();
                        }
                        groups += 1;
                        stack.push(ip);
                    }
                }else{
                    stack.push(ip);
                }
            }
            if(!stack.isEmpty()){
                while(!stack.isEmpty()){
                    stack.pop();
                }
                groups += 1;
            }
            out.println(groups);
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
