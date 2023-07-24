import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str;
        int[] card;
        int answer = 0;

        str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        card = new int[N];
        int M = Integer.parseInt(str[1]);

        str = br.readLine().split(" ");
        for(int i=0; i<N; i++){
            card[i] = Integer.parseInt(str[i]);
        }

        answer = search(card, N, M);

        System.out.println(answer);

    }

    static int search(int[] card, int N, int M){
        int result = 0;
        int temp = 0;
        
        for(int i = 0; i < (N - 2); i++){
            for(int j = (i + 1); j < (N - 1); j++){
                for(int z = (j + 1); z < N; z++){
                    temp = card[i] + card[j] + card[z];
                    if( M == temp ){
                        return M;
                    }

                    if(result < temp && temp < M){
                        result = temp;
                    }
                }
            }
        }

        return result;
    }
}
