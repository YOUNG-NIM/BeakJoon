import java.util.Scanner;

public class Main{

    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        calc(N);
    }
    public static void calc(int n){
        int num = 0;

        for(int a=0; a<10; a++){
            for(int b=0; b<10; b++){
                for(int c=0; c<10; c++){
                    for(int d=0; d<10; d++){
                        for(int e=0; e<10; e++){
                            for(int f=0; f<10; f++){
                                num = a*100000+b*10000+c*1000+d*100+e*10+f*1;
                                if(num+a+b+c+d+e+f == n){
                                    System.out.println(num);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println(0);
    }

}