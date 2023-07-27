import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int N = Integer.parseInt(br.readLine());
        int[] origin = new int[N];
        Map<Integer, Integer> map = new HashMap<>();
        String[] str;

        str = br.readLine().split(" ");
        for(int i=0; i<N; i++){
            origin[i] = Integer.parseInt(str[i]);
            map.put(origin[i], null);
        }

        List<Integer> list = new ArrayList<>(map.keySet());
        
        Collections.sort(list);

        for(int i=0; i<list.size(); i++){
            map.put(list.get(i),i);
        }
        
        for(int i=0; i<origin.length; i++) {
        	sb.append(map.get(origin[i]) + " ");
        }
        System.out.println(sb);

    }
}
