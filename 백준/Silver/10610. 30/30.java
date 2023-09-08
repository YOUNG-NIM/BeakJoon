import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    private static StringBuilder sb = new StringBuilder();
    private static int cnt = 0;
    private static Integer[] N;
    private static boolean isZero;
    
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int sum = 0;
        N = new Integer[str.length()];
        isZero = false;

        for(int i=0; i<str.length(); i++){
            N[cnt] = Character.getNumericValue(str.charAt(i));
            sum += N[cnt];
            if(N[cnt] == 0){
                isZero = true;
            }
            cnt++;
        }

        if(sum % 3 != 0 || !isZero){
            sb.append("-1");
        }else{
            Arrays.sort(N, Collections.reverseOrder());
            for(int num : N){
                sb.append(num);
            }
        }

        System.out.println(sb.toString().trim());
        
    }
}