import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    private static StringBuffer sb = new StringBuffer();

    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        long n = Long.parseLong(br.readLine());
        long num = 0;

        for(int i=0; i<n; i++){
            num = Long.parseLong(br.readLine());
            if(num <= 2){
                sb.append(2 + "\n");
            }else{
                calc(num);
            }
        }

        System.out.println(sb.toString().trim());
    }

    public static void calc(long n){
        boolean flag=false;
        BigInteger bi = new BigInteger(String.valueOf(n));
        if(bi.isProbablePrime(10))
            sb.append(bi + "\n");
        else
            sb.append(bi.nextProbablePrime() + "\n");
    }
}
