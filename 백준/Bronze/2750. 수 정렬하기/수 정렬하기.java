import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();

        int N = scan.nextInt();

        for(int i=0; i<N; i++){
            list.add(scan.nextInt());
        }
        Collections.sort(list);

        for(int i=0; i<N; i++){
            System.out.println(list.get(i));
        }

    }
}