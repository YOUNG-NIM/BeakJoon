import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        int H = 0; int W = 0; int N = 0;
        String roomH = "";
        String roomW = "";
        int lengthW = 0;

        for(int i=0; i<T; i++){
            st = new StringTokenizer(br.readLine()," ");
            H = Integer.parseInt(st.nextToken());
            W = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());

            lengthW = String.valueOf(W).length();

            roomH = String.valueOf(N%H);

            if(roomH.equals("0")){
                roomH = String.valueOf(H);
                roomW = String.valueOf(N/H);
            }else{
                roomW = String.valueOf(N/H + 1);
            }

            for( int j = roomW.length(); j < 2; j++){
                roomW = "0" + roomW;
            }

            sb.append(roomH + roomW + "\n");

        }

        System.out.println(sb.toString().trim());
    }
}
