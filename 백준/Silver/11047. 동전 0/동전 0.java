import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int A[] = new int[N];

        int cnt = 0;

        for(int i=0; i<N; i++){
            A[i] = Integer.parseInt(br.readLine());
        }

        for(int i=N-1; i>=0; i--){
            while(true){
                if(K < 0){
                    break;
                }

                if(A[i] > K){
                    break;
                } else{
                    cnt++;
                    //System.out.println(K + "-= " + A[i]);
                    K -= A[i];
                }
            }
            if(K < 0){
                break;
            }
        }
        

        System.out.println(cnt);
        
    }
}