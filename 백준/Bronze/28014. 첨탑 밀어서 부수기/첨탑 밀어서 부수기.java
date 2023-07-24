import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt;
		StringTokenizer st;
		int answer = 0;
		
		int x = 0;
		int y = 0;
		
		cnt = Integer.parseInt(bf.readLine());
		st = new StringTokenizer(bf.readLine());
		
		for(int i=0; i<cnt; i++) {
			
			y = Integer.parseInt(st.nextToken());
			
			if(x <= y) {
				
				answer ++;
				
			}
			
			x = y;
			
		}
		
		System.out.print(answer);
		
	}

}