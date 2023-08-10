import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static int cntP = 0;
    private static int cntR = 0;

    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            cntP = 0;
            cntR = 0;

            sb.append(isPalindrome(br.readLine()) + " " + cntR + "\n");
        }
        System.out.println(sb.toString().trim());

    }

    public static int isPalindrome(String str){
        cntP++;

        return recursion(str, 0, str.length()-1);

    }

    public static int recursion(String str, int min, int max){
        cntR++;
        
        if(min >= max){
            return 1;
        }else if(str.charAt(min) != str.charAt(max)){
            return 0;
        }else{
            return recursion(str, min+1, max-1);
        }
    }
}
