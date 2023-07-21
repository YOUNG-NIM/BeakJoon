import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int x = 0;
        int y = 0;
        int w = 0;
        int h = 0;
        int minx = 0;
        int miny = 0;
        int min = 0;

        x = scan.nextInt();
        y = scan.nextInt();
        w = scan.nextInt();
        h = scan.nextInt();

        minx = (w - x < x - 0) ? w - x : x - 0;
        miny = (h - y < y - 0) ? h - y : y - 0;

        min = (minx < miny) ? minx : miny;

        System.out.println(min);

    }
}
