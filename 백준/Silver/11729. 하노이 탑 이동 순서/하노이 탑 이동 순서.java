import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        int K = Integer.parseInt(br.readLine());

        sb.append((int)(Math.pow(2, K)-1) + "\n");
        calc(K, 1, 2, 3);
        
        System.out.println(sb.toString().trim());

    }
    public static void calc(int K, int from, int mid, int to){

        if(K == 1){
            sb.append(from + " " + to + "\n");
            return;
        }

        calc(K-1, from, to, mid);
        calc(1, from, mid, to);
        calc(K-1, mid, from, to);
    }
}

