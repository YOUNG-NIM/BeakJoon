import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<String>();
        String[] str = new String[N];

        for(int i=0; i<N; i++){
            set.add(br.readLine());
        }

        str = set.toArray(new String[0]);

        Arrays.sort(str,new Comparator<String>() {
            public int compare(String s1, String s2){
                if(s1.length() == s2.length()){
                    return s1.compareTo(s2);
                }else{
                    return s1.length() - s2.length();
                }
            }
        });

        for(int i=0; i<str.length; i++){
            System.out.println(str[i]);
        }

    }
}
