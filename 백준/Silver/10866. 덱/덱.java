import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

    private static StringBuilder sb = new StringBuilder();
    private static int N;
    private static Deque<Integer> dq = new ArrayDeque<Integer>();
    private static StringTokenizer st;

    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine()," ");
            calc();
        }

        System.out.println(sb.toString().trim());
    }

    private static void calc(){
        switch(st.nextToken()){
            case "push_front":{
                dq.addFirst(Integer.parseInt(st.nextToken()));
                break;
            }
            case "push_back":{
                dq.addLast(Integer.parseInt(st.nextToken()));
                break;
            }
            case "pop_front":{
                if(!dq.isEmpty())
                    sb.append(dq.pollFirst() + "\n");
                else
                    sb.append("-1\n");
                break;
            }
            case "pop_back":{
                if(!dq.isEmpty())
                    sb.append(dq.pollLast() + "\n");
                else
                    sb.append("-1\n");
                break;
            }
            case "size":{
                sb.append(dq.size() + "\n");
                break;
            }
            case "empty":{
                sb.append(dq.isEmpty()?"1\n":"0\n");
                break;
            }
            case "front":{
                if(!dq.isEmpty())
                    sb.append(dq.peekFirst() + "\n");
                else
                    sb.append("-1\n");
                break;
            }
            case "back":{
                if(!dq.isEmpty())
                    sb.append(dq.peekLast() + "\n");
                else
                    sb.append("-1\n");
                break;
            }
        }
    }
}