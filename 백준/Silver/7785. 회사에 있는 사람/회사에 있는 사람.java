import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st;
        
        Set<String> set = new HashSet<>();
        int N = Integer.parseInt(br.readLine());
        String name;
        Boolean enter;

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            name = st.nextToken();
            enter = st.nextToken().equals("enter")? true : false;
            if(enter){
                set.add(name);
            }else{
                set.remove(name);
            }
        }

        String[] arr = set.toArray(new String[set.size()]);
        Arrays.sort(arr,Collections.reverseOrder());

        for(String s:arr){
            sb.append(s + "\n");
        }
        System.out.println(sb);

    }
    
}
