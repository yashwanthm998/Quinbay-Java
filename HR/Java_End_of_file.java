import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Java_End_of_file {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=1;
        while(in.hasNextLine())
        {
            String str=in.nextLine();
            System.out.println(n+" "+str);
            n++;
        }
    }
}