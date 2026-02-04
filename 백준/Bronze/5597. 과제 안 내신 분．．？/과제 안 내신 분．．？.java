import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        int n = 30;
        int[] arr = new int[n];
       
        for(int i = 0; i< 28; i++){
            int a = Integer.parseInt(br.readLine())-1;
            arr[a] = 1;
        }
       
        for(int i = 0; i<30; i++){
            if (arr[i] == 0) {
                sb.append(i+1).append('\n');
            }
        }
        bw.write(sb.toString());
        bw.flush();
        
    }
}