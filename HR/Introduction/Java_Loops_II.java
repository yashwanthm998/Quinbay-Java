import java.util.*;
import java.io.*;
import java.math.*;

class Java_Loops_II{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int a,b,n;
        
        for(int i=0;i<t;i++){
             a = in.nextInt();
             b = in.nextInt();
             n = in.nextInt();  
             int result=a;
             int j=0;
             while(j<n)
             {
             
             result+=(int)(Math.pow(2,j)*b);
             System.out.print(result+" ");            
             j++;
        }
        System.out.println();
    }
        in.close();
    }
}