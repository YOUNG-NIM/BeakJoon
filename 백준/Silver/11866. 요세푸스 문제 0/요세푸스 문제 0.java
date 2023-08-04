import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer("<");
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Queue<Integer> q = new LinkedList<>();

        for(int i=1; i<=N; i++){
            q.add(i);
        }

        while(true){
            if(q.size() == 1){
                sb.append(q.peek() + ">");
                break;
            }
            for(int i=1; i<K; i++){
                q.add(q.poll());
            }
            sb.append(q.poll() + ", ");
        }

        System.out.println(sb.toString().trim());
    }
}
