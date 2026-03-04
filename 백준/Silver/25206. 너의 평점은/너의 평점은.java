import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 20;
        int total = 20;
        double result = 0.0;
        double credit = 0.0;
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            double b = Double.parseDouble(st.nextToken());
            String c = st.nextToken();
            double aa; // 결과를 담을 변수
            if (c.equals("P")) continue;
            switch (c) {
                case "A+":
                    aa = 4.5;
                    break;
                case "A0":
                    aa = 4.0;
                    break;
                case "B+":
                    aa = 3.5;
                    break;
                case "B0":
                    aa = 3.0;
                    break;
                case "C+":
                    aa = 2.5;
                    break;
                case "C0":
                    aa = 2.0;
                    break;
                case "D+":
                    aa = 1.5;
                    break;
                case "D0":
                    aa = 1.0;
                    break;
                case "F":
                    aa = 0.0;
                    break;
                case "P":
                    aa = 0.0;
                    break;
                default:
                    aa = 0.0; 
                    break;
            }
            result += (b * aa);
            credit += b;    
            
        }
        
        System.out.println(result/credit);
    }
}