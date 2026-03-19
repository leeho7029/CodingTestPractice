import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String n = br.readLine();
        int nn = Integer.parseInt(n);
        int result = 0;
        for(int i = 1; i < nn;i++){
            int sum = 0;
            sum += i+ sumAll(n)
                if(sum == nn){
                    result = sum;
                    break;
                }
        }
       
        static int sumAll(String n){
            int total = 0;
            for(int i = 0; i < n.length(); i++){
                total += (n.charAt(i) - '0')
            }
            return total;
        }            
        
        System.out.print(result);
    }
    
}