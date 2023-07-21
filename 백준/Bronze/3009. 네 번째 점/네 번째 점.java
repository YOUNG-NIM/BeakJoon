import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        int position[][] = new int[2][3];
        int answer[] = new int[2];
        
        for(int i=0; i<3; i++){
            for(int j=0; j<2; j++){
                position[j][i] = scan.nextInt();
            }
        }

        for(int i=0; i<2; i++){
            if(position[i][0] == position[i][1]){
                answer[i] = position[i][2];
            }else if(position[i][0] == position[i][2]){
                answer[i] = position[i][1];
            }else{
                answer[i] = position[i][0];
            }
        }
        System.out.println(answer[0] + " " + answer[1]);

    }
}
