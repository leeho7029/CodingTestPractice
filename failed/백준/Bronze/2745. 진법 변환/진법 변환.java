import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        int b = Integer.parseInt(st.nextToken());
        long result = 0;
        for(int i = 0; i < a.length; i++){
            char ch = a.charAt(i);
            int value;
            if (ch >= '0' && ch <= '9') {
                value = ch - '0';
            } else {
                value = ch - 'A' + 10;
            }
            
            result = result * b + value;
        }
        
        System.out.println(result);
    }
}