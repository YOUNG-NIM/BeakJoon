import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static int A;
    private static int K;
    private static int cnt;
    private static int answer;
    private static int[] temp;
    private static int[] array;

    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        cnt = 0;
        answer = -1;
        
        A = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        array = new int[A];
        temp = new int[A];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<A; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }

        merge_sort(array, 0, array.length-1);
        System.out.println(answer);
    }

    private static void merge_sort(int[]array, int p, int r){
        
        if(cnt > K) return;
        if(p < r){
            int q = (p + r) / 2;
            merge_sort(array, p, q);
            merge_sort(array, q+1, r);
            merge(array, p, q, r);
        }
    }
    public static void merge(int[]array, int p, int q, int r){
        int i = p;
        int j = q+1;
        int t = 0;
        
        while(!(i > q) && !(j > r)){
            if(!(array[i] > array[j])){
                temp[t] = array[i];
                i++;
            }else{
                temp[t] = array[j];
                j++;
            }
            t++;
        }
        while(!(i > q)){
            temp[t++] = array[i++];
        }
        while(!(j > r)){
            temp[t++] = array[j++];
        }

        i = p; t = 0;
        while(!(i > r)){
            cnt++;
            if(cnt == K){
                answer = temp[t];
                break;
            }
            array[i++] = temp[t++];
        }
    }

    public static void show(int[]array, int p, int r){
        for(int i=p; i<=r; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
