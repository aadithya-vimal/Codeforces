import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int t = 1;
        // t = fs.nextInt();
        while (t-- > 0) {
            //Taking number of numbers as n
            int n = fs.nextInt();
            //Iterating through each number and outputting required info
            for(int i=0; i<n; i++){
                int num = fs.nextInt();
                ArrayList<Integer> arr = new ArrayList<>();
                int originalNum = num;
                while(num>0){
                    int digit = num % 10;
                    arr.add(digit);
                    num /= 10;
                }
                int power = 0;
                ArrayList<Integer> result = new ArrayList<>();
                for(int elem: arr){
                    if(elem != 0){
                        result.add(elem*(int)(Math.pow(10,power)));
                    }
                    power += 1;
                }
                out.println(result.size());
                for(int factor: result){
                    out.print(factor+" ");
                }
                out.println();
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
