import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    private static StringBuilder sb = new StringBuilder();
    private static String str;
    private static List<String> list;
    
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();
        list = new ArrayList<String>();

        calc();
        System.out.println(sb.toString().trim());
    }

    private static void calc() {

        for(int i=0; i<str.length(); i++){
            list.add(str.substring(i, str.length()));
        }
        listToString();
    }

    private static void listToString(){

        Collections.sort(list);
        for(String s: list){
            sb.append(s + "\n");
        }

    }
}