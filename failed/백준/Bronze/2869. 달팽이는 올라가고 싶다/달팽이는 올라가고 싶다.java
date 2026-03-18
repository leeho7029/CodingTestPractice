import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToke\n());
        int v = Integer.parseInt(st.nextToken());

        int day = (v - a)/(a-b)
        if((v - a) % (a - b) != 0){
            day++;
        }

        System.out.println(day);
    }
}