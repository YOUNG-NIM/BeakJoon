import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int answer = A + B;

        Set<Integer> setA = new HashSet<>();
        //Set<Integer> setB = new HashSet<>();
        int temp;

        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<A; i++){
            setA.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<B; i++){
            temp = Integer.parseInt(st.nextToken());

            if(setA.contains(temp)){
                answer -= 2;
            }
        }
        System.out.println(answer);
    }
}
