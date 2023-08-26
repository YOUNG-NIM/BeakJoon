import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static int[] arr;
    private static int N;
    private static int cnt = 0;
    
    public static void main(String[]args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        nQueen(0);
        System.out.println(cnt);

    }

    private static void nQueen(int depth) {
        if(depth == N){
            cnt++;
            return;
        }
        for(int i=0; i<N; i++){
            arr[depth] = i; // 현재 깊이에 값 입력
            if(Possibility(depth)){
                nQueen(depth + 1);
            }

        }
    }

    private static boolean Possibility(int col) { // 매개변수로 현재 깊이에 값을 넣는 것이 가능한지 반환

        for(int i=0; i<col; i++){
            if(arr[col] == arr[i]){
                // 지금까지의 줄에 같은 x에 값이 있다면
                return false;
            } else if(Math.abs(col -i) == Math.abs(arr[col] - arr[i])){
                // 열의 차와 행의 차가 같은 위치라면 대각선에 놓여있는 것이다
                // 깊이(y)의 차의 절댓값이 위치(x)의 차의 절댓값과 같은지 비교해서 같다면 대각선에 놓인 것이라고 판단
                return false;
            }
        }

        // 위 조건에 만족하지 않는 경우
        return true;
    }
}