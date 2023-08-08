import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    private static Map<Integer,Integer> map;
    private static Integer[] key;
    private static Integer[] key2;
    private static int N;
    private static StringBuffer sb = new StringBuffer();

    public static void main(String[]args)throws IOException{
        
        mapPut();
        middle();
        most();
        range();

        System.out.println(sb.toString().trim());
        
    }

    private static void mapPut()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        map = new HashMap<>();

        N = Integer.parseInt(br.readLine());
        int key;
        int value;
        double sum = 0;
        key2 = new Integer[N];

        for(int i=0; i<N; i++){
            key = Integer.parseInt(br.readLine());
            sum += key;
            value = 0;
            if(map.containsKey(key)){
                value = map.get(key) + 1;
            }
            map.put(key, value);
            key2[i] = key;
        }
        sb.append(Math.round(sum/N) + "\n");
    }

    private static void middle(){
        key = map.keySet().toArray(new Integer[0]);
        Arrays.sort(key);
        Arrays.sort(key2);

        //System.out.println("key2[" + key2.length/2 + "]" + " = " + key2[key2.length/2]);
        sb.append(key2[key2.length/2] + "\n");
    }

    private static void most(){
        Integer[] value = map.values().toArray(new Integer[0]);
        Arrays.sort(value);
        int num = 0;
        int cnt = 0;

        for(int i=0; i<key.length; i++){
            //System.out.println( "map.get(" + key[i] + ") = "+ map.get(key[i]) + " == " + value[value.length-1]);
            if(map.get(key[i]) == value[value.length-1]){
                num = key[i];
                cnt++;
            }

            if(cnt == 2){
                break;
            }
        }

        sb.append(num + "\n");
    }

    private static void range(){
        int min = key[0];
        int max = key[key.length-1];

        sb.append(max - min + "\n");
    }

}
