import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st;
        StringTokenizer st_;

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> q = new ArrayDeque<>();

        st = new StringTokenizer(br.readLine(), " ");
        st_ = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++){
            if(st.nextToken().equals("0")){
                q.add(Integer.parseInt(st_.nextToken()));
            }else{
                st_.nextToken();
            }
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        int temp = 0;
        for(int i=0; i<M; i++){
            temp = Integer.parseInt(st.nextToken());
            q.addFirst(temp);
            sb.append(q.pollLast() + " ");
        }

        System.out.println(sb.toString().trim());

    }
}