import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[]args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        String[] result = String.valueOf(A*B*C).split("");
        int[] cnt = new int[10];

        for(int i=0; i<result.length; i++){
            cnt[Integer.parseInt(result[i])]++;
        }

        for(int i=0; i<cnt.length; i++){
            sb.append(cnt[i] + "\n");
        }
        System.out.println(sb.toString().trim());
    }
}
