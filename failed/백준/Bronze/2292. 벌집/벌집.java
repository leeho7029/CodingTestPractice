import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int end = 1;
        int count = 0;
        while(a>end){
            end += 6*count;
            count++;
        }
        System.out.println(count+1);
        
    }
}