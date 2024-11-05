import java.util.*;
class Java_Stack{
    
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            System.out.println(Stack(input));
		}
		sc.close();
	}
    
    public static boolean Stack(String input){
        Stack<Character> str=new Stack<>();
        char[] a=input.toCharArray();
        for(char ch:a){
            if(ch=='('||ch=='{'||ch=='[')
            str.push(ch);
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (str.isEmpty()) {
                    return false;
                }         
                char top = str.pop();
                if ((ch == ')' && top != '(') || 
                    (ch == '}' && top != '{') || 
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return str.isEmpty();
        
    }
}



