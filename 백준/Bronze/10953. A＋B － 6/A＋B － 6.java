import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        int A = 0; int B = 0;
        for(int i=0; i<T; i++){
            st = new StringTokenizer(br.readLine(), ",");
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());

            sb.append((A+B) + "\n");
        }
        System.out.println(sb.toString().trim());

    }
}