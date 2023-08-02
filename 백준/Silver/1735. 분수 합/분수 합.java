import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int cnt = 2;
        int[] A = new int[cnt];
        int[] B = new int[cnt];

        for(int i=0; i<cnt; i++){
            st = new StringTokenizer(br.readLine());
            A[i] = Integer.parseInt(st.nextToken());
            B[i] = Integer.parseInt(st.nextToken());
        }

        int X = A[0]*B[1] + A[1]*B[0];
        int Y = B[0] * B[1];
        int gcd = calc(X, Y);

        System.out.println(X/gcd + " " + Y/gcd);

    }

    private static int calc(int a, int b){
        if(b == 0)
            return a;
        else
            return calc(b,a%b);
    }
}
