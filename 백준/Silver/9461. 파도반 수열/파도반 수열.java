import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static Long[] array = new Long[101];

    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int N = Integer.parseInt(br.readLine());

        array[0] = 0L;
        array[1] = 1L;
        array[2] = 1L;
        array[3] = 1L;

        for(int i=0; i<N; i++){
            sb.append(padovan(Integer.parseInt(br.readLine())) + "\n");
        }

        System.out.println(sb.toString().trim());
    
    }

    public static long padovan(int N){
        if(array[N] == null){
            array[N] = padovan(N-2) + padovan(N-3);
        }
        return array[N];
    }
}
