import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int cnt = 0;
        
        
        for(int i = 0; i < a; i++){
            int prev = -1;
            boolean[] alp = new boolean[26];
            String b = br.readLine();
            boolean ok = true;
            for(int j = 0; j < b.length(); j++){
                char ch = b.charAt(j);
                if(alp[ch-'a'] == true && prev != (ch-'a')){
                    ok = false;
                    break;
                }
                alp[ch-'a'] = true;
                prev = ch - 'a';
            }
            if(ok){
                cnt++;
            }
       
        }
        System.out.println(cnt);
    }
}