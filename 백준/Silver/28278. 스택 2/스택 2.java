
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    private static Stack<Integer> stack = new Stack<>();
    private static StringTokenizer st;

    public static void main(String[]args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int N = Integer.parseInt(br.readLine());
        int order = 0;

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine()," ");
            order = Integer.parseInt(st.nextToken());

            switch(order){
                case 1:{
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                }
                case 2:{
                    if(stack.isEmpty()){
                        sb.append(-1 + "\n");
                    }else{
                        sb.append(stack.peek() + "\n");
                        stack.pop();
                    }
                    break;
                }
                case 3:{
                    sb.append(stack.size() + "\n");
                    break;
                }
                case 4:{
                    if(stack.isEmpty()){
                        sb.append(1 + "\n");
                    }else{
                        sb.append(0 + "\n");
                    }
                    break;
                }
                case 5:{
                    if(stack.isEmpty()){
                        sb.append(-1 + "\n");
                    }else{
                        sb.append(stack.peek() + "\n");
                    }
                    break;
                }
            }
        }
        System.out.println(sb.toString().trim());
    }
}