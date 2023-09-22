import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuffer temp = new StringBuffer();

        boolean flag = false;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == ' ' && !flag){
                temp.reverse();
                sb.append(temp + " ");
                temp = new StringBuffer();
                flag = false;
            } else if(str.charAt(i) == '>'){
                sb.append("<" + temp + ">");
                temp = new StringBuffer();
                flag = false;
            } else if(str.charAt(i) == '<'){
                temp.reverse();
                sb.append(temp);
                temp = new StringBuffer();
                flag = true;
            } else{
                temp.append(str.charAt(i));
            }
        }
        temp.reverse();
        sb.append(temp);

        System.out.println(sb.toString());
        
    }
}