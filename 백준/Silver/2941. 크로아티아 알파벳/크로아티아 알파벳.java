import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        a= a.replace("dz=","*");
        a= a.replace("c=","*");
        a= a.replace("c-","*");
        a= a.replace("d-","*");
        a= a.replace("lj","*");
        a= a.replace("nj","*");
        a= a.replace("s=","*");
        a= a.replace("z=","*");
        
        System.out.println(a.length());
        
    
    }
}
