import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[4];
        
        for(int i =0; i < n ; i++){
            int a = Integer.parseInt(br.readLine());
            int q = a / 25;
            a %= 25;

            int d = a / 10;
            a %= 10;

            int ni = a / 5;
            a %= 5;

            int p = a / 1;

            sb.append(q).append(" ")
              .append(d).append(" ")
              .append(ni).append(" ")
              .append(p).append("\n");
        }
        System.out.print(sb);
    }
}