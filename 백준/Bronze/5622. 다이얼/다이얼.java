import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] al = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};

        String a = br.readLine();
        int number = 0;
        for(int i = 0; i < a.length(); i++){
            char aa = a.charAt(i);
            for(int j = 0; j < al.length; j++){
                if(al[j].indexOf(aa) != -1){
                    number += (j + 3);
                    break;
                } 
            }
        }
        System.out.print(number);
    }
}