import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static StringBuffer sb = new StringBuffer();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){

            int num = Integer.parseInt(br.readLine());

            for(int j = num/2; j > 1; j--){
                if(isPrime(j) && isPrime(num-j)){
                    sb.append(j + " " + (num-j) + "\n");
                    break;
                }
            }

        }

        System.out.println(sb.toString().trim());

    }

    private static boolean isPrime(int num){
        for(int i=2; i<=num/2; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}