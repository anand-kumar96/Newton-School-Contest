import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    Stack<Character>st=new Stack<>();
    for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        if(!st.isEmpty()&&st.peek()==ch){
            st.pop();
        }else{
            st.push(ch);
        }
    }
    StringBuilder sb=new StringBuilder();
    while(!st.isEmpty()){
        sb.append(st.pop());
    }
    System.out.println(sb.reverse());
    }
}
