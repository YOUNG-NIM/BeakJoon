import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int x = 0;
		int y = 0;
		int answer = 0;
		int nowcolor = 0;
		boolean colorchange = false;
		boolean touch = false;
		
		x = scan.nextInt();
		y = scan.nextInt();
		
		Integer[][] array = new Integer[x][y];
		
		for(int i=0; i<x; i++) {
			
			for(int j=0; j<y; j++) {
				
				array[i][j] = scan.nextInt();
				
			}
			
		}
		
		for(int i=0; i < x; i++) {
			
			for(int j=0; j < y; j++) {
				
				if(array[i][j] != 0) {
					
					if(touch == false) {
						
						touch = true;
						answer ++;
						
						nowcolor= array[i][j];
																		
					}else {
						
						if(nowcolor != array[i][j] && colorchange == false) {
							
							colorchange = true;
							answer ++;
							
						}else if(nowcolor == array[i][j] && colorchange == true) {
							
							colorchange = false;
							
						}
						
					}
					
				}
				else if(array[i][j] == 0 && touch == true) {
					
					touch = false;
					colorchange = false;
					
				}
				
			}
			
			touch = false;
			colorchange = false;
			
		}
		
		System.out.print(answer);

	}

}