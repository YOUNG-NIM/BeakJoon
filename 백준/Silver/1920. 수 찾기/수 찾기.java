import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine()," ");
        Set<Integer> setN = new HashSet<>();
        for(int i=0; i<N; i++){
            setN.add(Integer.parseInt(st.nextToken()));
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<M; i++){
            if(setN.contains(Integer.parseInt(st.nextToken()))){
                sb.append("1\n");
            }else{
                sb.append("0\n");
            }
        }

        System.out.println(sb.toString().trim());

    }
}