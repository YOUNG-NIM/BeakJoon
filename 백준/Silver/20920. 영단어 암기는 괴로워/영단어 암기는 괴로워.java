import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();
        String str = "";
        int cnt = 0;

        for(int i=0; i<N; i++){
            str = br.readLine();
            cnt = 0;

            if(str.length() >= M){
                if(map.containsKey(str)){
                    cnt = map.get(str)+1;
                }
                map.put(str, cnt);
            }
        }

        List<String> list = map.keySet().stream().collect(Collectors.toList());

        list.sort((k1, k2)->{ // list에 있는 key값을 두개씩 가져와 sort할건데 그 방식을 람다식으로 내가 구성
            // key값을 이용해 map에 있는 사용빈도수를 가져오기
            int n1 = map.get(k1);
            int n2 = map.get(k2);

            if(n1 == n2){ // 사용 빈도수가 같다면
                if(k1.length() == k2.length()){ // 두개의 키 값의 길이가 같다면
                    return k1.compareTo(k2);
                }
                return k2.length() - k1.length();
            }
            return n2-n1;
        });

        for(int i=0; i<list.size(); i++){
            sb.append(list.get(i)+"\n");
        }

        System.out.println(sb.toString().trim());
        
    }
}
