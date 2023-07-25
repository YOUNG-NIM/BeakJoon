import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long num = 0;
        int cnt = 0;
        String temp = "";

        while(true){
            temp = num + "";
            if(temp.contains("666")){
                cnt++;
                if(cnt == n){
                    System.out.println(num);
                    return;
                }
            }
            num++;
        }
    }
}
