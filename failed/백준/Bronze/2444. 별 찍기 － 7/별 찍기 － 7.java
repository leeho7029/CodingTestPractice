import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        
        for(int i = 1; i < n+1  ; i++){
            for(int j = 0; j < n -i ; j++){
                bw.write(" ");
            }
            for(int l = 0; l < 2*i -1 ; l++){
                bw.write("*");
            }
            for(int k = 0; k < n -i ; k++){
                bw.write(" ");
            }
            bw.write("\n");
        }
        for(int i = n-1; i > 0 ; i--){
            for(int j = 0; j < n -i ; j++){
                bw.write(" ");
            }
            for(int l = 0; l < 2*n -1 ; l++){
                bw.write("*");
            }
            for(int k = 0; k < n -i ; k++){
                bw.write(" ");
            }
                bw.write("\n");
        }
        bw.flush();
    }
}