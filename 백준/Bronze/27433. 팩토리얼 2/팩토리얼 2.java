import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        calc(Integer.parseInt(br.readLine()));
    }
    private static void calc(int num){
        BigInteger bi = new BigInteger("1");
        for(int i=1; i<=num; i++){
            //System.out.print( bi + " * " + new BigInteger("" + i));
            bi = bi.multiply(new BigInteger("" + i));
            //System.out.print(" = " + bi + "\n");
        }
        System.out.println(bi);
    }
}