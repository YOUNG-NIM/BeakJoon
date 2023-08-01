import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuffer sb = new StringBuffer();

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String temp;

        Set<String> name = new HashSet<>();

        for(int i=0; i<N; i++){
            name.add(br.readLine());
        }

        List<String> result = new ArrayList<>();

        for(int i=0; i<M; i++){
            temp = br.readLine();
            if(name.contains(temp)){
               result.add(temp);
            }
        }
        
        System.out.println(result.size());
        Collections.sort(result);

        for(String s:result){
            sb.append(s + "\n");
        }

        System.out.println(sb);

    }
}
