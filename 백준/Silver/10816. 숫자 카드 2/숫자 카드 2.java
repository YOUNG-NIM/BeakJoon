import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st;

        int[] counting = new int[20000001];

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine()," ");

        for(int i=0; i<N; i++){
            counting[Integer.parseInt(st.nextToken())+10000000]++;
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine()," ");
        
        for(int i=0;i<M; i++){
            sb.append(counting[Integer.parseInt(st.nextToken())+10000000] + " ");
        }
        System.out.println(sb);

    }
}
