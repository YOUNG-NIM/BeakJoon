import java.util.Scanner;

public class Main {

    public static int N;
    public static int cnt;
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();

        calc();

        System.out.println(cnt);

    }

    public static void calc(){

        int share = N / 5;
        int rest = N % 5;
        cnt = 0;
        if(rest == 3){
            cnt = share + 1;
        }else{
            if(share > 0){
                if(rest ==  0){ // 모두 5
                    cnt = share;
                }else if(rest == 1){ // 3을 2봉지
                    cnt = share + 1;
                }else if(rest == 4){ // 3을 3봉지
                    cnt = share + 2;
                }else if(rest == 2 && share > 1){
                    cnt = share + 2;
                }else{
                    cnt = -1;
                }
            }else{
                cnt = -1;
            }
        }
    }
}
