import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine(); 
        int cnt = 0;
        for(int i  = 0; i < a.length(); i++){
            if(a.subString(i,i+1) == "c="){
                cnt++;
            }else if(a.subString(i,i+2) =="dz="){
                cnt++;
            }else if(a.subString(i,i+1) == "c-"){
                cnt++;
            }else if(a.subString(i,i+1) == "c-"){
                cnt++;
            }else if(a.subString(i,i+1) == "d-"){
                cnt++;
            }else if(a.subString(i,i+1) == "lj"){
                cnt++;
            }else if(a.subString(i,i+1) == "nj"){
                cnt++;
            }else if(a.subString(i,i+1) == "s="){
                cnt++;
            }else if(a.subString(i,i+1) == "z="){
                cnt++;
            };
        }
        System.out.println(cnt);
       
    }
}