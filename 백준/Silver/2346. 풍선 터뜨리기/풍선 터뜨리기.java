import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[]args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        Deque<Integer> q = new ArrayDeque<>();
        Deque<Integer> seq = new ArrayDeque<>();

        for(int i=1; i<=N; i++){
            q.add(Integer.parseInt(st.nextToken()));
            seq.add(i);
        }

        int K = 0;
        K = q.poll();
        sb.append(seq.poll() + " ");

        for(int i=0; i<N; i++){

            if(!q.isEmpty()){
                if(K > 0){
                    for(int j=1; j<Math.abs(K); j++){

                        q.addLast(q.pollFirst());
                        seq.addLast(seq.pollFirst());
                    }
                    K = q.poll();
                    sb.append(seq.poll() + " ");
                }else{
                    for(int j=1; j<Math.abs(K); j++){

                        q.addFirst(q.pollLast());
                        seq.addFirst(seq.pollLast());
                    }
                    K = q.pollLast();
                    sb.append(seq.pollLast() + " ");
                }
            }
        }

        System.out.println(sb.toString().trim());

    }
}
