import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[]args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println(calc(N));
    }

    private static int calc(int N){

        int cnt = 0;
        String[] num;
        
        for(int i=1; i<=N; i++){
            num = String.valueOf(i).split("");
            if(compare(num)){
                cnt++;
            }
        }

        return cnt;

    }

    private static boolean compare(String[] num){

        int div;
        if(num.length > 2){
            div = Integer.parseInt(num[1]) - Integer.parseInt(num[0]);
            for(int i=2; i<num.length; i++){
                if(div != Integer.parseInt(num[i]) - Integer.parseInt(num[i-1])){
                    return false;
                }
            }
        }else{
            return true;
        }

        return true;

    }
    
}
