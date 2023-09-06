import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        for(int i=0; i<str.length(); i++){
            if((int)str.charAt(i) > 64 && (int)str.charAt(i) < 91) sb.append(String.valueOf(str.charAt(i)).toLowerCase());
            else sb.append(String.valueOf(str.charAt(i)).toUpperCase());}
        System.out.println(sb.toString().trim());
    }
}