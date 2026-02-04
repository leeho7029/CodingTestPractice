import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){        
            int a = Integer.parseInt(st.nextToken());
            arr[i] = a;
        }
        int max = arr[0];
        
        for(int i = 1; i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        
        double total =0;
        
        for(int i = 0; i < n; i++){
            total += (double) arr[i]/max*100;
        }
        
         double avg = total / n;
        
        bw.write(String.valueOf(avg));
        bw.flush();
        
       

    }
}