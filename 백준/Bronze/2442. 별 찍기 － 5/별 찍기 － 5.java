import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static StringBuilder sb = new StringBuilder();
    
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            for(int j=N-i; j>1; j--){
                sb.append(" ");
            }
            for(int j=0; j<(2*i+1); j++){
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());

    }

}