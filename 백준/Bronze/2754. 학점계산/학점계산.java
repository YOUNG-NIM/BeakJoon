import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static String str1;
    private static String str2;
    private static Integer[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] score = br.readLine().split("");

        Double dScore = 0.0;

        switch(score[0]){
            case "A":
            dScore += 4;
            break;
            case "B":
            dScore += 3;
            break;
            case "C":
            dScore += 2;
            break;
            case "D":
            dScore += 1;
            break;
        }

        if(score.length > 1){
            switch(score[1]){
                case "+": 
                dScore += 0.3;
                break;
                case "-":
                dScore -= 0.3;
                break;
            }
        }

        System.out.println(dScore);

    }
}