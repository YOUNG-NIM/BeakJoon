import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());
        Integer[] arrayA = new Integer[N];
        Integer[] arrayB = new Integer[N];
        int answer = 0;

        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<N; i++){
            arrayA[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<N; i++){
            arrayB[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arrayA);
        Arrays.sort(arrayB, Collections.reverseOrder());

        for(int i=0; i<N; i++){
            answer += arrayA[i]*arrayB[i];
        }
        System.out.println(answer);
    }
}
