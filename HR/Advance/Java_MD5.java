import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.security.*;

public class Java_MD5{

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(s.getBytes());
            byte[] digest = md.digest();

            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(String.format("%02x", b));
            }

            System.out.println(sb.toString());

        } catch (NoSuchAlgorithmException e) {
            System.out.println("MD5 algorithm not found.");
        }

    }
}