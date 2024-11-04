import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Java_BigInteger{

    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       String a= in.nextLine();
       String b= in.nextLine();
       
       BigInteger n1=new BigInteger(a);
       BigInteger n2=new BigInteger(b);
       
       BigInteger sum=n1.add(n2);
       BigInteger pro=n1.multiply(n2);
       
       System.out.println(sum);
       System.out.println(pro);
}
}