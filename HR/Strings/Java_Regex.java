import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Java_Regex{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}
class MyRegex {
    String pattern = "^((\\d|\\d{2}|0\\d{2}|1\\d{2}|2[0-4]\\d|25[0-5])\\.){3}(\\d|\\d{2}|0\\d{2}|1\\d{2}|2[0-4]\\d|25[0-5])$";
}
