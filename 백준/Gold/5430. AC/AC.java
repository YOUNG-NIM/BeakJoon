import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

    private static Deque<Integer> deque;
    private static StringBuffer sb = new StringBuffer();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
            String p = br.readLine();
            int number = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine(),"[],");
            deque = new ArrayDeque<Integer>();

            for(int j=0; j<number; j++){
                deque.add(Integer.parseInt(st.nextToken()));
            }

            AC(p);
        }

        System.out.println(sb.toString().trim());

    }

    private static void AC(String p) {
        boolean forward_direction = true;

        for(int i=0; i<p.length(); i++){
            char function = p.charAt(i);

            if(function == 'R'){
                forward_direction = !forward_direction;
                continue;
            }

            if(forward_direction){
                if(deque.pollFirst() == null){
                    sb.append("error\n");
                    return;
                }
            }else{
                if(deque.pollLast() == null){
                    sb.append("error\n");
                    return;
                }
            }
        }

        makePrintString(forward_direction);

    }

    private static void makePrintString(boolean forward_direction) {
        sb.append('[');

        if(deque.size() > 0){
            if(forward_direction){
                sb.append(deque.pollFirst());
                while(!deque.isEmpty()){
                    sb.append("," + deque.pollFirst());
                }
            }else{
                sb.append(deque.pollLast());
                while(!deque.isEmpty()){
                    sb.append("," + deque.pollLast());
                }
            }
            
        }

        sb.append("]\n");
    }
}