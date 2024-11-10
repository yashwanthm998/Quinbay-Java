import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.security.*;
public class Java_SHA_256{

    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        in.close();
        
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            
            byte[] hashBytes = md.digest(input.getBytes());
            
            StringBuilder hexHash = new StringBuilder();
            for (byte b : hashBytes) {
                hexHash.append(String.format("%02x", b));
            }
        
            System.out.println(hexHash.toString());
            
        } catch (NoSuchAlgorithmException e) {
            System.out.println("SHA-256 algorithm not found.");
        }
    }
}