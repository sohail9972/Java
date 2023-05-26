public class String11_removingoccuranceofletter_Coll {
    public static void main(String[] args) {
        String str="The NaTional";
        char c='T';
        removeCharacter(str,c);
    }
    public static void removeCharacter(String str,char c){
        String finalString="";
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)!=c){
                finalString=finalString+str.charAt(i);
            }
        }
        System.out.println("the particular charecter is removed from given string "+ finalString);
    }
}
