import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int[] degree = new int[3];
        int sum = 0;

        for(int i=0; i<3; i++){
            degree[i] = scan.nextInt();
            sum += degree[i];
        }

        if(sum != 180){
            System.out.println("Error");
        }else{
            if(degree[0] == degree[1] && degree[0] == degree[2])
                System.out.println("Equilateral");
            else if(degree[0] == degree[1] || degree[0] == degree[2] || degree[1] == degree[2])
                System.out.println("Isosceles");
            else
                System.out.println("Scalene");
        }
    }
}
