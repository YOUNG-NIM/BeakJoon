import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int A = 0;
        int B = 0;

        A = scan.nextInt();
        B = scan.nextInt();

        System.out.println(A * B);
        scan.close();

    }
}
