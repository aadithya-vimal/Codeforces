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
            int x = 0;
            for(int i=0; i<n; i++){
                String s=fs.next();
                if(s.charAt(0) == 'X'){
                    if(s.charAt(1) == '+' && s.charAt(2) == '+'){
                        x++;
                    }else if(s.charAt(1) == '-' && s.charAt(2) == '-'){
                    x--;
                }
        }else if(s.charAt(2) == 'X'){
        if(s.charAt(0) == '+' && s.charAt(1) == '+'){
            ++x;
        }else if(s.charAt(0) == '-' && s.charAt(1) == '-'){
        --x;
    }
}
}
out.println(x);
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
