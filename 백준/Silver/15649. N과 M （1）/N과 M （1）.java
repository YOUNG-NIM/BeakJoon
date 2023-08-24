import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static int[]arr;
    private static boolean[] visit;
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[]args)throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 최고 자연수 값
        int M = Integer.parseInt(st.nextToken()); // 수열의 크기값

        arr = new int[M];
        visit = new boolean[N];

        dfs(N,M,0);
        System.out.println(sb.toString().trim());

    }

    public static void dfs(int N, int M, int depth){
        if(depth == M){ // 현재 탐색하는 깊이값이 최대 깊이와 같다면
            for(int n : arr){
                sb.append(n + " ");
            }
            sb.append("\n");
            return;
        }

        for(int i=0; i<N; i++){
            if(!visit[i]){ // 수열에 i수를 사용하고 있는지 여부를 확인
                visit[i] = true; // i수를 사용할 것이므로 true로 전환
                arr[depth] = i+1; // arr에 i수를 기록 (i는 0부터이므로 1을 더해준다)
                dfs(N, M, depth +1 ); // dfs에 기록하거나 빈 수열을 채우기 위해 재귀함수 사용
                visit[i] = false; // dfs에 기록이 끝났으므로 사용여부를 false로 전환
            }
        }
    }
}
