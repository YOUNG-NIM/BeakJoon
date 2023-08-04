import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int K = Integer.parseInt(br.readLine());
        int num = 0;
        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<K; i++){
            num = Integer.parseInt(br.readLine());
            if(num == 0){
                sum -= stack.peek();
                stack.pop();
            }else{
                sum += num;
                stack.push(num);
            }
        }

        System.out.println(sum);

    }
    
}
