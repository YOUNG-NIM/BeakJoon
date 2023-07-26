import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[]args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i<N; i++){
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);

        for(Integer i : list){
            sb.append(i).append("\n");;
        }
        System.out.println(sb);
    }
}
