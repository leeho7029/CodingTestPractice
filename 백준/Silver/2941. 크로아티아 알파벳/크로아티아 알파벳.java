import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine(); 
        int cnt = 0;
        for(int i  = 0; i < a.length(); i++){
            if(i + 2 < a.length() && a.substring(i,i+3).equals("dz=")){
                cnt++;
                i += 2;
            }else if (i + 1 < a.length()) {
                String two = a.substring(i, i + 2);

                if (two.equals("c=") || two.equals("c-") ||
                    two.equals("d-") || two.equals("lj") ||
                    two.equals("nj") || two.equals("s=") ||
                    two.equals("z=")) {

                    cnt++;
                    i += 1;
                } else {
                    cnt++;
                }
            }else{
                cnt++;
            };
        }
        System.out.println(cnt);
       
    }
}