import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int sum = 0;
        int min = Integer.MAX_VALUE;
        

        for(int i=0; i<7; i++){
            int N = Integer.parseInt(br.readLine());

            if(N%2 == 1){
                sum += N;
                if(min > N){
                    min = N;
                }
            }

            sb.append("\n");
        }

        if(sum == 0){
            System.out.println(-1);
        }else{
            System.out.println(sum + "\n" + min);
        }
    }
}