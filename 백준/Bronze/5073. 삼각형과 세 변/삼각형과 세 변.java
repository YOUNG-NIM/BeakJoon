import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int line[] = new int[3];
        int sum = 0;
        int max = 0;

        while(true){
            sum = 0;
            max = 0;
            for(int i=0; i<3; i++){
                line[i] = scan.nextInt();
                max = (max < line[i])? line[i] : max;
                sum += line[i];
            }
            if(max == 0){
                break;
            }

            if(max >= (sum - max)){
                System.out.println("Invalid");
            }else if(line[0] == line[1] && line[0] == line[2]){
                System.out.println("Equilateral");
            }else if(line[0] == line[1]|| line[0] == line[2] || line[1] == line[2]){
                System.out.println("Isosceles");
            }else{
                System.out.println("Scalene");
            }
        }
        scan.close();
    }
}
