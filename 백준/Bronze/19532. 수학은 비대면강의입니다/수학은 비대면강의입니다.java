import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();
        int f = scan.nextInt();

        int y = (a*f - d*c) / (a*e - d*b);
        int x = (f*b - e*c) / (b*d - e*a);
        System.out.println(x + " " + y);
    }
}
