package allotherprograms;

public class String13_palimdrome_coll {
    public static void main(String[] args) {
        String str="civic";
        if (ispalindrome(str)){
            System.out.println("its a palindrom");
        }
        else {
            System.out.println("not a palindrome");
        }
    }

    public static boolean ispalindrome(String str) {
    int i=0,j=str.length()-1;
    while (i<j){
        if (str.charAt(i)!=str.charAt(j)){
            return false;
        }
        i++;
        j--;
    }
    return true;
    }
}
