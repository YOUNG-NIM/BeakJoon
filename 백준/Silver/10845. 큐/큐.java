import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuffer sb = new StringBuffer();

        Deque<Integer> q = new ArrayDeque<Integer>();

        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine()," ");

            switch(st.nextToken()){
                case "push":{
                    q.add(Integer.parseInt(st.nextToken()));
                    break;
                }
                case "pop":{
                    if(q.isEmpty()){
                        sb.append("-1\n");
                    }else{
                        sb.append(q.pollFirst()+"\n");
                    }
                    break;
                }
                case "size":{
                    sb.append(q.size()+"\n");
                    break;
                }
                case "empty":{
                    if(q.isEmpty()){
                        sb.append("1\n");
                    }else{
                        sb.append("0\n");
                    }
                    break;
                }
                case "front":{
                    if(q.isEmpty()){
                        sb.append("-1\n");
                    }else{
                        sb.append(q.peekFirst()+"\n");
                    }
                    break;
                }
                case "back":{
                    if(q.isEmpty()){
                        sb.append("-1\n");
                    }else{
                        sb.append(q.peekLast()+"\n");
                    }
                    break;
                }
                default:{
                    sb.append("ERROR");
                    break;
                }
            }
        }

        System.out.println(sb.toString().trim());
        
    }
}