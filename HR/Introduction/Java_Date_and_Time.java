import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Calendar;

class Result {

    public static String findDay(int month, int day, int year) {
    
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);  

        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        String[] days = { "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", 
                          "THURSDAY", "FRIDAY", "SATURDAY" };

        return days[dayOfWeek - 1]; 
    }
 }

public class Java_Date_and_Time {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
