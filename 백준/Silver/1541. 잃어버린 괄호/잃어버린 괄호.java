import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stMinus = new StringTokenizer(br.readLine(),"-");
        int sum = Integer.MAX_VALUE;
        int temp = 0;
        while(stMinus.hasMoreTokens()){
            temp = 0;
            StringTokenizer stPlus = new StringTokenizer(stMinus.nextToken(), "+");
            while(stPlus.hasMoreTokens()){
                temp += Integer.parseInt(stPlus.nextToken());
            }

            if(sum == Integer.MAX_VALUE){
                sum = temp;
            }else{
                sum -= temp;
            }
        }
        System.out.println(sum);
    }
}
