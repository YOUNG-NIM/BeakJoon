import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    private static StringTokenizer st;
    private static Stack<Integer> stack;
    private static int num;

    public static void main(String[]args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine()," ");

        for(int i=0; i<N;){

            //System.out.println();
            //System.out.println((i+1) + "를 찾습니다");
            if(!stack.isEmpty()){
                if(inStack(i+1)){
                    //System.out.println((i+1) + "를 샛길에서 발견");
                    i++;
                    continue;
                }
            }
            if(st.hasMoreTokens()){
                if(inString(i+1)){
                    //System.out.println((i+1) + "를 바로 발견");
                    i++;
                    continue;
                }else{
                    //System.out.println(num + "를 샛길에 배치");
                    stack.push(num);
                    continue;
                }
            }
            break;
        }
        if(stack.isEmpty() && !st.hasMoreTokens()){
            System.out.println("Nice");
        }else{
            System.out.println("Sad");
        }
    }

    private static boolean inStack(int n){
        //System.out.println("stack확인");
        //System.out.println(n + "과 " + stack.peek() + "을 비교");
        if(n == stack.peek()){
            stack.pop();
            return true;
        }
        return false;

    }
    private static boolean inString(int n){
        num = Integer.parseInt(st.nextToken());

        //System.out.println("String 확인");
        //System.out.println(n + "과" + num + "을 비교");

        if(n == num){
            return true;
        }
        //System.out.println(n + "미발견");
        return false;

    }
}
