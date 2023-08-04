import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuffer sb = new StringBuffer();
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> q = new LinkedList<>();

        for(int i=0; i<N; i++){

            st = new StringTokenizer(br.readLine());
            
            switch(st.nextToken()){
                case "push":{
                    q.add(Integer.parseInt(st.nextToken()));
                    break;
                }
                case "pop":{
                    Integer num = q.poll();
                    if(num == null){
                        sb.append(-1 + "\n");
                    }else{
                        sb.append(num + "\n");
                    }
                    break;
                }
                case "size":{
                    sb.append(q.size() + "\n");
                    break;
                }
                case "empty":{
                    if(q.isEmpty()){
                        sb.append(1 + "\n");
                    }else{
                        sb.append(0 + "\n");
                    }
                    break;
                }
                case "front":{
                    Integer num = q.peekFirst();
                    if(num == null){
                        sb.append(-1 + "\n");
                    }else{
                        sb.append(num + "\n");
                    }
                    break;
                }
                case "back":{
                    Integer num = q.peekLast();
                    if(num == null){
                        sb.append(-1 + "\n");
                    }else{
                        sb.append(num + "\n");
                    }
                    break;
                }
            }
        }

        System.out.println(sb.toString().trim());
    }
}
