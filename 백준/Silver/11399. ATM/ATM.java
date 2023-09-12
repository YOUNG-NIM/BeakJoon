import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb = new StringBuilder();
    
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int[] array = new int[N];
        for(int i=0; i<N; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(array);

        int sum = 0;

        for(int i=0; i<N; i++){
            for(int j=0; j<=i; j++){
                sum+=array[j];
            }
        }

        System.out.println(sum);
    }
}