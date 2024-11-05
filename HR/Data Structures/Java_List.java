import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Java_List {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        List<Integer> lists=new ArrayList<>();
        int n=in.nextInt();
        for (int i=0;i<n;i++){
            lists.add(in.nextInt());
        }
        int q=in.nextInt();
        for(int i=0;i<q;i++){
            String com=in.next();
            
            if(com.equals("Insert")){
                int index=in.nextInt();
                int val=in.nextInt();
                lists.add(index, val);
            }
            if(com.equals("Delete")){
                int pos=in.nextInt();
                lists.remove(pos);
            }
        }
        for (Integer ele : lists) {
            System.out.print(ele + " ");
        }
            }
}