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
            String answer = "";
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) != '+'){
                    arr.add(Integer.parseInt(String.valueOf(s.charAt(i))));
                }
        }
        Collections.sort(arr);
    for(int j=0; j<arr.size(); j++){
        if(j == arr.size()-1){
            answer = answer + arr.get(j).toString();
            break;
        }
    answer = answer + arr.get(j);
    answer = answer + "+";
}
out.println(answer.toString());
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
