import java.util.Stack;

public class String5_BalencedString_coll {
    public static void main(String[] args) {
        String str="{{(){[]}}}";
        Stack<Character> st=new Stack();
        for (int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if (st.empty()){
                st.push(c);
            } else if (c=='{' || c=='[' || c=='(') {
                st.push(c);
            } else if (c=='}' && st.peek()=='{') {
                st.pop();
            }
            else if (c==')' && st.peek()=='(') {
                st.pop();
            }
            else if (c==']' && st.peek()=='[') {
                st.pop();
            }
        }
        if (st.empty()){
            System.out.println("given string is Balanced");
        }
        else{
            System.out.println("not balenced");
        }

    }
}
