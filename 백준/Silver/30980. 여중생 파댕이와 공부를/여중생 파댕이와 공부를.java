import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        StringBuffer[] sbarr = new StringBuffer[3];
        
        for(int i = 0; i < N; i++){
            br.readLine();
            st = new StringTokenizer(br.readLine(),".,+=");

            sbarr[0] = new StringBuffer();
            sbarr[1] = new StringBuffer();
            sbarr[2] = new StringBuffer();

            while(st.hasMoreTokens()){

                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int c = Integer.parseInt(st.nextToken());
                if(a+b == c){
                    if(c / 10 > 0){
                        String str = "*" + a + "+" + b + "=" + c + "*";
                        sbarr[0].append(".******.");
                        sbarr[1].append(str);
                        sbarr[2].append(".******.");
                    }else{
                        String str = "*" + a + "+" + b + "=" + c + "*.";
                        sbarr[0].append(".*****..");
                        sbarr[1].append(str);
                        sbarr[2].append(".*****..");
                    }
                }else{
                    if(c / 10 > 0){
                        String str = "." + a + "/" + b + "=" + c + ".";
                        sbarr[0].append(".../....");
                        sbarr[1].append(str);
                        sbarr[2].append("./......");
                    }else{
                        String str = "." + a + "/" + b + "=" + c + "..";
                        sbarr[0].append(".../....");
                        sbarr[1].append(str);
                        sbarr[2].append("./......");
                    }
                }
            }
            br.readLine();
            sb.append(sbarr[0] + "\n" + sbarr[1] + "\n" + sbarr[2] + "\n");
            
        }

        System.out.println(sb.toString().trim());
    }
}