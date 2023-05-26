public class String14_substring_coll {
    public static void main(String[] args) {
        String str="1234";

        for (int i=0;i<str.length();i++){
            for (int j=i+1;j<=str.length();j++){
                System.out.println(str.substring(i,j));
            }
        }
    }
}
