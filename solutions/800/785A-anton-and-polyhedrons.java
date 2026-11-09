import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int t = 1;
        // t = fs.nextInt();
        while (t-- > 0) {
            //Taking no. of polyhedrons, and initializing answer variable
            int n = fs.nextInt();
            int ans = 0;
            //Taking each polyhedron, and simultaneously summing their no.of sides
            for(int i=0; i<n; i++){
                String poly = fs.next();
                if(poly.equals("Tetrahedron")){
                    ans += 4;
                }else if(poly.equals("Cube")){
                    ans += 6;
                }else if(poly.equals("Octahedron")){
                    ans += 8;
                }else if(poly.equals("Dodecahedron")){
                    ans += 12;
                }else if(poly.equals("Icosahedron")){
                    ans += 20;
                }
            }
            out.println(ans);
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
