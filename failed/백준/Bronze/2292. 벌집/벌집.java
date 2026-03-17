import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        
        int n = a/6;
        
        System.out.println(n+1);
        
    }
}