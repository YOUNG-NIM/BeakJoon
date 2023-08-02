import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st;
        int A = 0;
        int B = 0;
        int gcd = 0;

        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
            st = new StringTokenizer(br.readLine(), " ");
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            if(A > B)
                gcd = calc(A, B);
            else
                gcd = calc(B, A);

            sb.append(A * B / gcd + "\n");

        }

        System.out.println(sb.toString().trim());
    }

    private static int calc(int a, int b){
        if(b == 0)
            return a;
        else
            return calc(b,a%b);
    }
}
