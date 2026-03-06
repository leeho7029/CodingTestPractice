import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        int max = 0;
        int a = 1;
        int b = 1;
        for(int i =1; i < 10 ;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 1; j < 10; j++){
                int m = Integer.parseInt(st.nextToken());
                if(m > max){
                    max = m;
                    a = i;
                    b = j;
                }
            }                                      
        }
        
        System.out.println(max);
        System.out.println(a + " "+b);
    }
}