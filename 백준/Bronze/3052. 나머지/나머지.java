import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = 10;
        int[] arr = new int[42];
        int count = 0;
        
        for(int i = 0; i < 10; i++){
            int a = Integer.parseInt(br.readLine());
            int b = a % 42;
            arr[b] = 1;
        }
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1){
                count++;
            }
        }
        
        System.out.println(count);
    }
}