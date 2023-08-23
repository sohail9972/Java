package DSA_All;

public class search_string {
    public static void main(String[] args) {
        String name= "sohail";
        char key='i';
        boolean ans = seacrh_char(name,key);
        System.out.println(ans);
    }
    static boolean seacrh_char(String str, char key) {
        if (str.length()==0){
            return false;
        }
        for (int i=0;i<str.length();i++){
            if (key==str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
