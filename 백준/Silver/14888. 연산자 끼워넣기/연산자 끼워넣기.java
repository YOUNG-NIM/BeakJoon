import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static StringBuilder sb = new StringBuilder();
    private static int N;
    private static int max = Integer.MIN_VALUE;
    private static int min = Integer.MAX_VALUE;

    private static int[] number;
    private static int[] operator = new int[4];

    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        number = new int[N];

        st = new StringTokenizer(br.readLine()," ");
        int cnt = 0;
        while(st.hasMoreTokens()){
            number[cnt] = Integer.parseInt(st.nextToken());
            cnt++;
        }

        st = new StringTokenizer(br.readLine()," ");
        cnt = 0;
        while(st.hasMoreTokens()){
            operator[cnt] = Integer.parseInt(st.nextToken());
            cnt++;
        }

        dfs(number[0],1);

        System.out.println(max + "\n" + min);
        
    }

    private static void dfs(int num, int idx) {
        if(idx == N){ // num에 있는 모든 값을 다 돌았다면
            max = Math.max(max, num); // 현재 계산된 값과 저장되어있는 값 중 큰 값을 max에 넣어라
            min = Math.min(min, num); // 현재 계산된 값과 저장되어있는 값 중 작은 값을 min에 넣어라
            return;
        }

        for(int i=0; i<4; i++){
            if(operator[i] > 0){
                // 지금 접근한 연산자가 남아있다면
                operator[i]--; // 연산자를 사용할 것
                switch(i){
                    case 0: dfs((num + number[idx]), (idx+1)); break; // 0번 연산자
                    case 1: dfs((num - number[idx]), (idx+1)); break; // 1번 연산자
                    case 2: dfs((num * number[idx]), (idx+1)); break; // 2번 연산자
                    case 3: dfs((num / number[idx]), (idx+1)); break; // 3번 연산자
                }
                operator[i]++; // 사용한 연산자를 반환할 것
            }
        }

    }
}