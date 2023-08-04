import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String[] str;

        int T = Integer.parseInt(br.readLine());
        int num = 0;

        for(int i=0; i<T; i++){
            str = br.readLine().split("");
            num = 0;
            
            for(int j=0; j<str.length; j++){

                if(num == -1){
                    break;
                }
                if(str[j].equals("(")){
                    num++;
                }else{
                    num--;
                }

            }

            if(num == 0){
                sb.append("YES\n");
            }else{
                sb.append("NO\n");
            }
        }

        System.out.println(sb.toString().trim());
    }
}
