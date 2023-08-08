import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        int N = 0;
        int M = 0;

        BigInteger FM = new BigInteger("1");
        BigInteger FN = new BigInteger("1");
        BigInteger FMN = new BigInteger("1");

        for(int i=0; i<T; i++){
            st = new StringTokenizer(br.readLine()," ");
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            if(M == N){
                sb.append(1 + "\n");
            }else{
                FM = calcfact(M);
                FN = calcfact(N);
                FMN = calcfact(M-N);
                sb.append( FM.divide(FN.multiply(FMN)) + "\n");
            }
        }

        System.out.println(sb.toString().trim());

    }

    public static BigInteger calcfact(int n){

        BigInteger bi = new BigInteger("1");
        //System.out.print( n + "! = ");
        for(int i=1; i<=n; i++){
            
            //System.out.print(i + " * ");
            bi = bi.multiply(new BigInteger("" + i));
        }

        //System.out.println();
        //System.out.println( n + "! = " + bi);

        return bi;
        
    }
}
