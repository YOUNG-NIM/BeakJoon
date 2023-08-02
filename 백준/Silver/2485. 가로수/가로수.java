import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Set<Long> set = new HashSet<>();
        int N = Integer.parseInt(br.readLine());

        long X = Long.parseLong(br.readLine());
        long min = X;
        X = 0;
        long Y = 0;
        long max = X;

        for(int i=1; i<N; i++){
            Y = Long.parseLong(br.readLine())-min;
            set.add(Y);
            if(max < Y) max = Y;
            //System.out.println("X : " + X + "Y : " + Y);
            X = calc(X,Y);
        }

       // System.out.println(max + " / " + X + " - " + set.size());

        System.out.println(max/X - set.size());

    }
    private static long calc(long a, long b){
        if(b == 0)
            return a;
        else
            return calc(b,a%b);
    }
}
