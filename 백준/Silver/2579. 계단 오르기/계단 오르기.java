import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static StringBuilder sb = new StringBuilder();
    private static Integer dp[];
    private static int arr[];

    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine()); // 계단의 개수

        dp = new Integer[N+1]; // n번째 단을 밟았을 때 최대 값
        arr = new int[N+1]; // 0은 없는 배열 1부터 N까지의 수에 각 단에 적힌 수가 저장됨

        for(int i=1; i<=N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        dp[0] = arr[0]; // dp[0] = 0번째 단을 밟았을 때의 최대값(0번째 단은 없으므로 0으로 초기화)
        dp[1] = arr[1]; // dp[1] = 1번째 단을 밟았을 때의 최대값
        
        if(N >= 2){ // 단이 1개 뿐인 계단일 경우를 대비한 예외처리
            dp[2] = arr[1] + arr[2]; // "조건" 첫번째 단을 생략할 수 없다
        }

        System.out.println(find(N)); // N번째 단까지 모두 방문했을 때 최대값
    }

    private static int find(int N){ // 재귀방식

        if(dp[N] == null){
            dp[N] = Math.max(find(N-2), find(N-3) + arr[N-1]) + arr[N];
            /*  find(N-2)( = dp[N-2] : 지금 단의 두단전을 밟는 상황중 최대값)과
                find(N-3)( = dp[N-3] : 지금 단의 세단전을 밟는 상황중 최대값) + arr[N-1] (지금 단의 직전단의 값) 중 더 큰 값을
                arr[N] (지금 단의 값)에 더해 dp[N]에 저장 */ 
        }

        return dp[N];
    }
}