import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        String nickname = "";
        Set<String> set = new HashSet<>();
        for(int i=0; i<N; i++){
            nickname = br.readLine();
            if(nickname.equals("ENTER")){
                cnt+=set.size();
                set = new HashSet<>();
            }else{
                set.add(nickname);
            }
        }
        System.out.println(cnt + set.size());
    }
}