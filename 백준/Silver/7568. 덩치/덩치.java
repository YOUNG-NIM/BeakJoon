import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static StringBuffer sb = new StringBuffer();
    private static int[] height;
    private static int[] weight;
    private static int size;

    public static void main(String[]args)throws IOException{
        
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        insert();
        calc();
        
        System.out.println(sb.toString().trim());

    }

    private static void insert()throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        size = Integer.parseInt(br.readLine());
        height = new int[size];
        weight = new int[size];

        for(int i=0; i<size; i++){
            String[] str = br.readLine().split(" ");
            weight[i] = Integer.parseInt(str[0]);
            height[i] = Integer.parseInt(str[1]);
        }

    }

    private static void calc(){

        int cnt = 1;

        for(int i=0; i<size; i++){
            cnt = 1;
            for(int j=0; j<size; j++){
                if(i == j) continue;
                if(height[i] < height[j] && weight[i] < weight[j]){
                    cnt++;
                }
            }
            sb.append(cnt + " ");
        }
    }
}