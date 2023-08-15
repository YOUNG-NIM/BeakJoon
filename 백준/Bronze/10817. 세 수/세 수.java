import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A =  Integer.parseInt(st.nextToken());
        int B =  Integer.parseInt(st.nextToken());
        int C =  Integer.parseInt(st.nextToken());

        if(A >= B && A >= C){
            if(B > C){
                System.out.println(B);
            }else{
                System.out.println(C);
            }
        }else if(B >= A && B >= C){
            if(A > C){
                System.out.println(A);
            }else{
                System.out.println(C);
            }
        }else if(C >= A && C >= B){
            if(A > B){
                System.out.println(A);
            }else{
                System.out.println(B);
            }
        }
    }
    
}