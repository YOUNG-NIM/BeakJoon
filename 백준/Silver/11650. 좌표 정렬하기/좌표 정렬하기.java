import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] str;
        int[][] num = new int[N][2];

        for(int i=0; i<N; i++){
            str = br.readLine().split(" ");
            num[i][0] = Integer.parseInt(str[0]);
            num[i][1] = Integer.parseInt(str[1]);
        }

        Arrays.sort(num, new Comparator<int[]>(){
            public int compare(int[] n1, int[] n2){
                if(n1[0] == n2[0]){
                    return n1[1] - n2[1];
                }
                else{
                    return n1[0] - n2[0];
                }
            }
        });

        for(int i=0; i<N; i++){
            System.out.println(num[i][0] + " " + num[i][1]);
        }
        
    }
}
