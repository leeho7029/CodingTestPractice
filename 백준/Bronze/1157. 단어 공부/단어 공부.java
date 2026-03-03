import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine().toUpperCase();
        
        int n = a.length();
        int[] arr = new int[26];
         for (int i = 0; i < n; i++) {
            int aa = a.charAt(i) - 'A';  // A=0, B=1 ...
            arr[aa] += 1;
        }
        int max = 0;
        int equal = 0;
        int maxIndex = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                maxIndex = i;
                equal = 1;
            }
            else if (arr[i] == max && max != 0) {
                equal++;           // 기존 1등과 같으면 동률 증가
            }
        }
        String result = null;
       
        if(equal > 1){
            result = "?";
        }else{
            result = String.valueOf((char)(maxIndex + 'A'));
        }
        
        System.out.println(result);
    }
}