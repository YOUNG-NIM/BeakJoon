import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int F = 0;

        while(st.hasMoreTokens()){
            F += Integer.parseInt(st.nextToken());
        }

        if(F < T){
            System.out.println("Padaeng_i Cry");
        }else{
            System.out.println("Padaeng_i Happy");
        }
    }
}
