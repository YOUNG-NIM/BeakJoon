import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static StringBuilder sb = new StringBuilder();

    private static int capital;
    private static int small;
    private static int number;
    private static int space;

    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String s;
        while((s = br.readLine()) != null){
            small = 0;
            capital = 0;
            number = 0;
            space = 0;

            for(int i=0; i<s.length(); i++){
                char c = s.charAt(i);
                if(c == ' ') space++;
                if(Character.isUpperCase(c)) capital++;
                if(Character.isLowerCase(c)) small++;
                if(Character.isDigit(c)) number++;
            }

            sb.append(small + " " + capital + " " + number + " " + space + "\n");
        }

        System.out.println(sb);
        
    }
}