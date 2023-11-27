package NewJourney;

public class J3 {
    public static void main(String[] args) {
        String name="Indian";
        char key='f';
        System.out.print(searchusingforeach(name,key));
    }
    static boolean searchusingforeach(String str,char key){
        if (str.length()==0){
            return false;
        }
        for (char ch:str.toCharArray()) {
            if (ch==key){
                return true;
            }
        }
        return false;
    }
}
