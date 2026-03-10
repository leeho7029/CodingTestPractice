import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        long a = Long.parseLong(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        
        while(a>0){
            int result = (int) a % b;
            if(result < 10){
                sb.append((char)(result+'0'));
            } else{
                sb.append((char) (result - 10 + 'A'));
            }
            
            a/=b;
        }

        System.out.print(sb.reverse());
    }
}