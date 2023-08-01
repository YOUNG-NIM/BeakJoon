import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        Set<String> set = new HashSet<>();
        for(int i=0; i<N; i++){
            set.add(br.readLine());
        }

        int M = Integer.parseInt(str[1]);
        for(int i=0; i<M; i++){
            if(set.contains(br.readLine())){
                answer++;
            }
        }

        System.out.println(answer);
    }
}
