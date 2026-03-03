import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        int a = Integer.parseInt(br.readLine());
        
        int[] arr = new int[a];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int b = Integer.parseInt(br.readLine());
        
        int c = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(b == arr[i]){
                c++;
            }
        }
        
        System.out.println(c);
    }
}