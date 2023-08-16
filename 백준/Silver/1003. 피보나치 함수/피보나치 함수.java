import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int zero;
    public static int one;

    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();
        int N = 0;

        for(int i=0; i<T; i++){
            zero = 0;
            one = 0;
            N = Integer.parseInt(br.readLine());
            fibonacci(N);
            sb.append(zero + " " + one + "\n");
        }

        System.out.println(sb.toString().trim());
    }

    private static void fibonacci(int n) {
        int temp = 0;
        if(n == 0){
            zero = 1;
            one = 0;
        }else if(n == 1){
            zero = 0;
            one = 1;
        }else{
            zero = 1;
            one = 1;
            for(int i=2; i<n; i++){
                temp = zero;
                zero = one;
                one = zero + temp;
            }
        }

    }
}