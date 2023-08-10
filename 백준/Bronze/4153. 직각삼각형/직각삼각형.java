import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static StringBuffer sb = new StringBuffer();
    public static void main(String[]args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[] num = new int[3];

        while(true){
            st = new StringTokenizer(br.readLine());
            num[0] = Integer.parseInt(st.nextToken());
            num[1] = Integer.parseInt(st.nextToken());
            num[2] = Integer.parseInt(st.nextToken());

            if(num[0] == 0 && num[1] == 0 && num[2] == 0){
                break;
            }

            if(num[0] < num[1] && num[2] < num[1]){
                calc(num[0], num[2], num[1]);
            }else if(num[1] < num[0] && num[2] < num[0]){
                calc(num[1], num[2], num[0]);
            }else{
                calc(num[1], num[0], num[2]);
            }

        }
        System.out.println(sb.toString().trim());

    }

    public static void calc(int a, int b, int c){
        if(Math.pow(c, 2) - Math.pow(a, 2) - Math.pow(b, 2) == 0){
            sb.append("right\n");
        }else{
            sb.append("wrong\n");
        }
    }
}