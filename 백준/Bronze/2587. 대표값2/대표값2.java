import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int num = 5;
        int sum = 0;
        for(int i=0; i<num; i++){
            list.add(scan.nextInt());
            sum += list.get(i);
        }

        Collections.sort(list);

        System.out.println(sum / num);
        System.out.println(list.get(2));

    }
}
