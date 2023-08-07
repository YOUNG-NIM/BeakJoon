import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());

        int k = 0;
        int n = 0;

        for(int i=0; i<T; i++){
            k = Integer.parseInt(br.readLine());
            n = Integer.parseInt(br.readLine());

            sb.append(calc(k, n) + "\n");
        }

        System.out.println(sb.toString().trim());

    }

    private static int calc(int k, int n){
        if(n == 1){
            return 1;
        }
        if(k == 0){
            return n;
        }
        return calc(k, n-1) + calc(k-1, n);
    }
}
