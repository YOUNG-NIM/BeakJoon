import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int N = 0;
        N = scan.nextInt();

        if(N == 1){
            return;
        }
        calc(N,2);
        scan.close();
    }
    public static void calc(int N, int i){
        if(N / i > 0){
            if(N % i == 0){
                System.out.println(i);
                calc(N/i, i);
            }else{
                calc(N, i+1);
            }
        }else{
            if(N/i != 0)
                System.out.println();
        }
        
    }
}
