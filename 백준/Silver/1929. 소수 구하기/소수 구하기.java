import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st = new StringTokenizer(br.readLine());

        long M = Long.parseLong(st.nextToken());
        long N = Long.parseLong(st.nextToken());

        BigInteger bi;

        for(long i=M; i<=N; i++){
            bi = new BigInteger(String.valueOf(i));
            if(bi.isProbablePrime(10)){
                sb.append(bi + "\n");
            }

        }

        System.out.println(sb.toString().trim());

    }
}
