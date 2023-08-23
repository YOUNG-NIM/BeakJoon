import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String str = "";
        Boolean flag = false;

        while(true){
            str = br.readLine();
            if(str.equals("0")){
                break;
            }

            flag = true;

            for(int i=0; i<(str.length()/2);i++){
                if(str.charAt(i) == str.charAt(str.length()-i-1)){

                }else{
                    flag = false;
                }
            }

            if(flag){
                sb.append("yes\n");
            }else{
                sb.append("no\n");
            }
            
        }

        System.out.println(sb.toString().trim());
    }
}