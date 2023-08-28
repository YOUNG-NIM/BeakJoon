import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[]args)throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int min = Integer.MAX_VALUE;
        int num = 0;
        int sum = -50;

        for(int i=0; i<3; i++){
            num = Integer.parseInt(br.readLine());
            //System.out.println(i + "번째에" + num + "이 입력됨");
            if(num < min){
                min = num;
            }
        }

        sum += min;
        min = Integer.MAX_VALUE;

        for(int i=0; i<2; i++){
            num = Integer.parseInt(br.readLine());
            //System.out.println(i + "번째에" + num + "이 입력됨");
            if(num < min){
                min = num;
            }
        }

        sum += min;
        System.out.println(sum);

    }
}