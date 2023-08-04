import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String[] str;

        Stack<String> stack = new Stack<>();

        while(true){

            stack = new Stack<>();
            str = br.readLine().split("");

            if(str[0].equals(".") && str.length == 1){
                break;
            }

            for(int i=0; i<str.length; i++){
                if(str[i].equals("(") || str[i].equals("[")){
                    stack.push(str[i]);
                }else if(str[i].equals(")")){
                    if(stack.isEmpty() || !stack.peek().equals("(")){
                        stack.push(")");
                        break;
                    }else{
                        stack.pop();
                    }
                }else if(str[i].equals("]")){
                    if(stack.isEmpty() || !stack.peek().equals("[")){
                        stack.push("]");
                        break;
                    }
                    stack.pop();
                }
            }

            if(stack.empty()){
                sb.append("yes\n");
            }else{
                sb.append("no\n");
            }

        }

        System.out.println(sb.toString().trim());

    }
}
