import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static StringBuilder sb = new StringBuilder();
    private static int[] dp = new int[11];
    
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        dp[1] = 1; //초기값
        dp[2] = 2;
        dp[3] = 4;
        
        for(int i=4; i<11; i++){
            dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
        }

        for(int i=0; i<T; i++){
            int n = Integer.parseInt(br.readLine());
            sb.append(dp[n] + "\n");
        }
        System.out.println(sb.toString().trim());
    }
}