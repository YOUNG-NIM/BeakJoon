import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static char[][] array; // 별찍기를 할 static 배열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        array = new char[N][N]; // 별찍기를 할 배열 초기화
        star(0,0,N,false);

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                sb.append(array[i][j]);
            }
            sb.append("\n");
        }
        System.out.println(sb.toString().trim());

    }

    private static void star(int x, int y, int N, boolean blank) {

        if(blank){ // blank 값이 true라면
            for(int i=x; i<x+N; i++){
                for(int j=y; j<y+N; j++){
                    array[i][j] = ' ';
                }
            }
            return;
        }

        if(N == 1){ // 채워야 하는 길이가 1이라면
            array[x][y] = '*';
            return;
        }

        int size = N/3; // 채워야 하는 한 블록 단위의 길이
        int cnt = 0; // 별 누적 출력 세는 변수 5번째는 blank 출력해야 함

        for(int i=x; i<x+N; i+=size){
            for(int j=y; j<y+N; j+=size){
                cnt++;
                if(cnt == 5){ // 5번째 채우기는 공백이어야 한다
                    star(i,j,size,true);
                }else{
                    star(i,j,size,false);
                }
            }
        }

    }
}

