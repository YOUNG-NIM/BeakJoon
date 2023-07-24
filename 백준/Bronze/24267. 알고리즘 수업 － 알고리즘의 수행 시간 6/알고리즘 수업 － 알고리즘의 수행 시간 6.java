import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        long num = scan.nextLong();

        System.out.println(num * (num-1) * (num-2) / 6);
        System.out.println(3);
    }
}
