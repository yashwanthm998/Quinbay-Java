import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Java_Exception_Handling_Try_catch{

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       try {
            int x = in.nextInt();
            int y = in.nextInt();
            int c = x / y;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        } finally {
            in.close(); 
        }
    }
}