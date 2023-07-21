import java.util.Scanner;

public class Main {

    public static void main(String[]args){
        
        Scanner scan = new Scanner(System.in);
        int N = 0;
        int sum = 0;
        int minX = -10000;
        int maxX = 10000;
        int minY = -10000;
        int maxY = 10000;
        int x = 0;
        int y = 0;

        N = scan.nextInt();

        for(int i=0; i < N; i++){
            x = scan.nextInt();
            y = scan.nextInt();
            
            minX = (minX < x) ? x : minX;
            maxX = (maxX > x) ? x : maxX;
            minY = (minY < y) ? y : minY;
            maxY = (maxY > y) ? y : maxY;
        }
        
        System.out.println((maxX - minX) * (maxY - minY));

        scan.close();

    }
    
}
