import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    private static StringBuilder sb = new StringBuilder();
    private static int[][] array;
    
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        array = new int[N][2];

        String[] str;

        for(int i=0; i<N; i++){
            str = br.readLine().split(" ");
            array[i][0] = Integer.parseInt(str[0]);
            array[i][1] = Integer.parseInt(str[1]);
        }

        Arrays.sort(array, new Comparator<int[]>(){

            public int compare(int[] o1, int[] o2) {

                if(o1[1] == o2[1]){// 종료 시간이 같을 경우 시작 시간이 빠른 순
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1]; // 종료 시간이 빠른 순
            }

        });

        int cnt = 0;
        int prev_end_time = 0;

        for(int i=0; i<N; i++){
            if(prev_end_time <= array[i][0]){
                prev_end_time = array[i][1];
                cnt++;
            }
        }

        System.out.println(cnt);
        
    }
}