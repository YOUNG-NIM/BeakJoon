import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static String[][] chess;

    public static void main(String[]args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] str = new String[2];
        str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);
        chess = new String[N][M];
        int answer = 64;
        int temp;

        for(int i=0; i<N; i++){
            str = br.readLine().split("");
            for(int j=0; j<M; j++){
                chess[i][j] = str[j];
            }
        }

        for(int i=0; i<N-7; i++){
            for(int j=0; j<M-7; j++){
                temp = calc(i,j);
                if(answer > temp){
                    answer = temp;
                }
            }
        }
        System.out.println(answer);
    }
    public static int calc(int x, int y){
        int num = 0;
        String temp = chess[x][y];
        
        for(int i=x; i<x+8; i++){
            for(int j=y; j<y+8; j++){
                if(!chess[i][j].equals(temp)){
                    num++;
                }

                if(temp.equals("B")) temp = "W";
                else temp = "B";
            }
            if(temp.equals("B")) temp = "W";
            else temp = "B";
        }

        num = (num > 64-num) ? 64-num : num;
        return num;
    }
}