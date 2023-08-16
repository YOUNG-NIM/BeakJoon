import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static int num1;
    private static int num3;
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        num1 = 0; num3 = 0;
        calc(N);

        System.out.println(num1 + "\n" + (int)Math.pow(num1,2) + "\n" + num3);

    }

    public static void calc(int N){
        for(int i=1; i<=N; i++){
            num1 += i;
            num3 += (int)Math.pow(i,3);
        }
    }
}