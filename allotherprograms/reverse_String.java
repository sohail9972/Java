package allotherprograms;

public class reverse_String {
    public static void main(String[] args) {
        //using the concatenation

        String str1="ABCD";
        String rev="";

        for (int i=str1.length()-1;i>=0;i--){
            rev=rev+str1.charAt(i);
        }
        System.out.println(rev);
    }
}
