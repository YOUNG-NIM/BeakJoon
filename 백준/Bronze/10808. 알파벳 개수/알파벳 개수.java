import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int[] array = new int[26];
        String str = br.readLine();

        for(int i=0; i<array.length; i++){
            array[i] = 0;
        }

        for(int i=0; i<str.length(); i++){
            array[(int)str.charAt(i)-97]++;
        }

        for(int i=0; i<array.length; i++){
            sb.append(array[i] + " ");
        }
        System.out.println(sb);

    }
}