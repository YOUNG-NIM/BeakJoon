import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        int[] list = new int[N];

        for(int i=0; i<N; i++){
            list[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(list);

        for(Integer i:list){
            sb.append(i).append("\n");
        }
        System.out.println(sb);
    }
}
