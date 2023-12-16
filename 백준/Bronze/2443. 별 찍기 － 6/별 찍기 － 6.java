import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            for(int j=0; i-j>0; j++){
                sb.append(" ");
            }
            for(int j=2*(N-i); j>1; j--){
                sb.append("*");
            }

            sb.append("\n");
        }

        System.out.println(sb.toString().trim());
    }
}
