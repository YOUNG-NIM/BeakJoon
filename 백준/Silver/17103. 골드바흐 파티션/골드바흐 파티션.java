import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static boolean prime[] = new boolean[1000000];
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int T = Integer.parseInt(br.readLine());
        int num = 0;
        int cnt = 0;
        calc();

        for(int i=0; i<T; i++){
            num = Integer.parseInt(br.readLine());
            cnt = 0;

            for(int j=2; j<=num/2; j++){
                if(!prime[j] && !prime[num-j]){
                    cnt++;
                }
            }

            sb.append(cnt + "\n");

        }

        System.out.println(sb.toString().trim());

    }

    private static void calc(){
        prime[0] = prime[1] = true;

        for(int i=2; i<=Math.sqrt(prime.length);i++){
            if(prime[i]) continue;

            for(int j = i*i; j < prime.length; j += i){
                prime[j] = true;
            }
        }
    }
}
