import java.util.*;
public class Java_Dequeue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        Set<Integer> set = new HashSet<>();
        
        int n = in.nextInt();
        int m = in.nextInt();
        int max=0;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            set.add(num);
            
            if(deque.size()==m){
                max=Math.max(max, set.size());    
                int removed = deque.removeFirst();
                if (!deque.contains(removed)) {
                set.remove(removed);
            }
            }
        }
        System.out.println(max);
    }
}



