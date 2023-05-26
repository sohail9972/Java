public class String6_EvenLengthWord_Coll {
    public static void main(String[] args) {
        String str="hello My Word soha pick meou";
        for (String s:str.split(" ")) {
            if(s.length()%2==0) {
                System.out.println(s);
            }
        }
    }

}
