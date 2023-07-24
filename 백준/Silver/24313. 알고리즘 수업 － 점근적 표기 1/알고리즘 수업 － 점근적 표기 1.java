import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String[] str = br.readLine().split(" ");
        int a1 = Integer.parseInt(str[0]);
        int a0 = Integer.parseInt(str[1]);
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());

        int result = (a1 * n0 + a0 <= c * n0) && (c >= a1) ? 1 : 0;
        System.out.println(result);
    }
    
}