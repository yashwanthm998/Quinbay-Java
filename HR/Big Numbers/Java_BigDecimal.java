import java.math.BigDecimal;
import java.util.*;
class Java_BigDecimal{

    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();
        Arrays.sort(s, 0, n, new Comparator<String>() {
            public int compare(String a, String b) {
                BigDecimal n1 = new BigDecimal(a);
                BigDecimal n2 = new BigDecimal(b);
                return n2.compareTo(n1); 
            }
        });

        
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}