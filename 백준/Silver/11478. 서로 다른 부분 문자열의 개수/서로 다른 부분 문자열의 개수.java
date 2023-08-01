import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

    static private Set<String> set = new HashSet<>();
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        calc(str);

        System.out.println(set.size());

    }
    static private void calc(String s){

        String[] arr = s.split("");
        String temp;

        for(int i=0; i<s.length(); i++){
            temp = "";
            for(int j=i+1; j<=s.length(); j++){
                temp = s.substring(i,j);
                set.add(temp);
            }
        }
    }

}
