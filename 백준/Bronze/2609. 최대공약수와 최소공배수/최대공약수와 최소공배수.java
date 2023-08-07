import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());

		int gcd = getgcd(A, B);

		System.out.println(gcd);
		System.out.println(A*B/gcd);
	}

	public static int getgcd(int a, int b){
		if(b == 0) return a;
		else return getgcd(b, a%b);
	}

}