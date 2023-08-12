import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    
    private static Deque<Integer> stack = new ArrayDeque<>();

    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st;

        String command = "";

        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine()," ");
            command = st.nextToken();
            if(command.equals("push")){
                push(Integer.parseInt(st.nextToken()));
            }else if(command.equals("pop")){
                sb.append(pop() + "\n");
            }else if(command.equals("size")){
                sb.append(size() + "\n");
            }else if(command.equals("empty")){
                sb.append(empty() + "\n");
            }else if(command.equals("top")){
                sb.append(top() + "\n");
            }
        }

        System.out.println(sb.toString().trim());
    }

    private static void push(int num){
        stack.push(num);
    }

    private static int pop(){
        if(empty() == 1){
            return -1;
        }else{
            return stack.pop();
        }
    }

    private static int empty(){
        if(stack.isEmpty())
            return 1;
        else
            return 0;
    }

    private static int size(){
        return stack.size();
    }

    private static int top(){
        if(empty() == 1){
            return -1;
        }else{
            return stack.peek();
        }
    }
}
