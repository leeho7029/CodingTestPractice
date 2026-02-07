import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken(); 
        String b= st.nextToken();
        StringBuilder sa = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        for(int i = a.length() - 1; i >= 0;i--){
            sa.append(a.charAt(i)); 
        }         
        for(int i = b.length() - 1; i >= 0;i--){
            sb.append(b.charAt(i)); 
        }     
        int aa = Integer.parseInt(sa.toString());
        int bb = Integer.parseInt(sb.toString());
        int max = aa>bb ? aa : bb;
        bw.write(String.valueOf(max));
        bw.flush();                                        
    }
}