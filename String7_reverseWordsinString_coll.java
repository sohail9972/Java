public class String7_reverseWordsinString_coll {
    public static void main(String[] args) {
        String str="hello World come To NIE";

        String stringarr[]=str.split(" ");
        for (int i=stringarr.length-1;i>=0;i--){
            System.out.println(stringarr[i]);
        }
    }
}
