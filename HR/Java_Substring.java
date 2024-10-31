import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Java_Substring {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        String ne="";
        for(int i=start;i<end;i++)
        {
            ne+=S.charAt(i);
        }
        System.out.println(ne);
    }
}