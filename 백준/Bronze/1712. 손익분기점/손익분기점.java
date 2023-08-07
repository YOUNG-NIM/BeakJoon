import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        long i = 0;

        if( B < C ){
            while(true){
                i++;
                if((A + B*i) < C*i){
                    break;
                }
            }
        }else{
            i = -1;
        }
        
        System.out.println(i);

    }
}
