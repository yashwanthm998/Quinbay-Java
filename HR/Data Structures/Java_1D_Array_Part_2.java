import java.util.*;

public class Java_1D_Array_Part_2{

    public static boolean canWin(int leap, int[] game) {
        return canWinFromPosition(0, leap, game, new boolean[game.length]);
    }

    private static boolean canWinFromPosition(int position, int leap, int[] game, boolean[] visited) {
        
        if (position >= game.length) {
            return true;
        }
        if (position < 0 || game[position] == 1 || visited[position]) {
            return false;
        }
        visited[position] = true;
        return canWinFromPosition(position + 1, leap, game, visited) || 
               canWinFromPosition(position - 1, leap, game, visited) ||
               canWinFromPosition(position + leap, leap, game, visited); 
    }
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}