import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static boolean prime[] = new boolean[246913];
    public static void main (String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        
        int num = 0;
        calc();

        while(true){
            num = Integer.parseInt(br.readLine());
            if(num == 0) break;

            int cnt = 0;
            for(int i= num+1; i<=2*num; i++){
                if(!prime[i]) cnt++;
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
