import java.util.Scanner;

public class Java_Anagrams {

    static boolean isAnagram(String a, String b) {
        a=a.toLowerCase();
        b=b.toLowerCase();
        
        int[] count=new int[26];
        if (a.length()!=b.length())
        {
            return false;
        }
        for(char s: a.toCharArray())
        {
            count[s-'a']++;
        }
        for (char s: b.toCharArray())
        {
            count[s-'a']--;
        }
        for (int c:count)
        {
            if(c!=0)
            {
               return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}