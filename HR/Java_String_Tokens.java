import java.io.*;
import java.util.*;

public class Java_String_Tokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        if(s.isEmpty()){
            System.out.println("0");
        }
        String[] str=s.split("[ !,?._'@]+");
        System.out.println(str.length);
        for(String word:str)
        {
            System.out.println(word);
        }
        scan.close();
    }
}

