import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static int[]arr;
    private static StringBuilder sb = new StringBuilder();
    private static int N,M;
    public static void main(String[]args)throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken()); // 최고 자연수 값
        M = Integer.parseInt(st.nextToken()); // 수열의 크기값

        arr = new int[M];

        dfs(1,0);
        System.out.println(sb.toString().trim());

    }

    public static void dfs(int at, int depth){
        if(depth == M){ // 현재 탐색하는 깊이값이 최대 깊이와 같다면
            for(int n : arr){
                sb.append(n + " ");
            }
            sb.append("\n");
            return;
        }

        for(int i=at; i<=N; i++){
            arr[depth] = i; // arr에 i수를 기록 (i는 0부터이므로 1을 더해준다)
            dfs(i+1, depth +1 ); // dfs에 기록하거나 빈 수열을 채우기 위해 재귀함수 사용
        }
    }
}
