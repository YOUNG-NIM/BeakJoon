import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static StringBuilder sb = new StringBuilder();
    
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String bomb = br.readLine();

        boolean flag = true;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            sb.append(ch);
            if(sb.length() >= bomb.length()){
                flag = true;
                for(int j=0; j<bomb.length(); j++){
                    char ch1 = sb.charAt(sb.length() - bomb.length() + j);
                    char ch2 = bomb.charAt(j);
                    if(ch1 != ch2){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    sb.delete(sb.length() - bomb.length(), sb.length());
                }
            }
        }

        if(sb.length() == 0)
            sb.append("FRULA");

        System.out.println(sb.toString().trim());
    }

}