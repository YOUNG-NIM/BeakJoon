import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        int N = 0;
        int num = 0;
        boolean flag = false;
        int answer = 0;

        N = scan.nextInt();

        for(int i=0; i<N; i++){
            num = scan.nextInt();
            flag = false;

            for(int j=2; j<num; j++){
                if(num % j == 0){
                    flag = true;
                    break;
                }
            }
            if(num != 1 && flag == false){
                answer++;
            }
        }

        System.out.println(answer);

    }
}
