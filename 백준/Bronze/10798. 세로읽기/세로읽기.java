import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] a = new String[5];
        int m = 1;
        for(int i = 0; i < 5; i++){
            String s = br.readLine();
            if(m < s.length()){
                m = s.length();
            }
            a[i] = s;
        }
        
           for(int i = 0; i < m; i++){
              for(int j = 0; j < 5; j++){
                  int k = a[j].length();
                  if(i < a[j].length()){
                      sb.append(a[j].charAt(i));
                  }  
                    
              }
        }
        
        System.out.print(sb);

    }
}