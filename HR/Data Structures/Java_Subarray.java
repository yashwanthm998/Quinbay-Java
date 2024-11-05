import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Java_Subarray {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        int count=0;
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        
        for(int s=0;s<n;s++)
        {
            int sum=0;
            for(int e=s;e<n;e++){
                sum+=a[e];
            
            if(sum<0){
                count++;
            }
        }
        }
        System.out.println(count);
        
    }
}