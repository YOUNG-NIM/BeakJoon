import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        int n = 0;
        int answer = 0;
        int cx = 0;
        int cy = 0;
        int cr = 0;

        for(int i=0; i<T; i++){
            st = new StringTokenizer(br.readLine());
            x1 = Integer.parseInt(st.nextToken());
            y1 = Integer.parseInt(st.nextToken());
            x2 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());

            n = Integer.parseInt(br.readLine());
            answer = 0;

            for(int j=0; j<n; j++){
                st = new StringTokenizer(br.readLine());
                cx = Integer.parseInt(st.nextToken());
                cy = Integer.parseInt(st.nextToken());
                cr = Integer.parseInt(st.nextToken());

                boolean flag1 = false;
                boolean flag2 = false;

                if(Math.pow(x1-cx,2) + Math.pow(y1-cy,2) < Math.pow(cr,2)) flag1 = true;
                if(Math.pow(x2-cx,2) + Math.pow(y2-cy,2) < Math.pow(cr,2)) flag2 = true;

                if(flag1 != flag2) answer ++;
            }

            sb.append(answer + "\n");

        }

        System.out.println(sb.toString().trim());
    }
}
