import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(scan.nextInt());
        list.add(scan.nextInt());
        list.add(scan.nextInt());

        Collections.sort(list);

        if(list.get(2) >= list.get(0) + list.get(1)){
            list.set(2 , list.get(0) + list.get(1) - 1);
        }

        System.out.println(list.get(0) + list.get(1) + list.get(2));

    }
    
}
