import java.util.Scanner;

public class Main {

    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        int M = 0;
        int N = 0;
        int min = 0;
        int sum = 0;
        boolean flag = false;

        M = scan.nextInt();
        N = scan.nextInt();

        for(int i=M; i<=N; i++){
            flag = true;
            if(i == 1){flag = false;}
            
            for(int j=2; j<=i; j++){
                if(i == 2){
                    flag = true;
                    break;
                }
                if(i !=j && i % j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                sum += i;
                if(min == 0)
                    min = i;
            }
        }

        if(min != 0){
            System.out.println(sum);
            System.out.println(min);
        }else{
            System.out.println(-1);
        }

        scan.close();
    }
}
