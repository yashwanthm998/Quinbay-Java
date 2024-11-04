import java.io.*;
import java.util.*;

public class Java_String_Tokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        String[] str=s.split("[^A-Za-z]+");
        int count = 0;
        for (String token : str) {
            if (!token.isEmpty()) {
                count++;
            }
        }
        System.out.println(count);
        for(String word:str)
        {
            System.out.println(word);
        }
        scan.close();
    }
}

