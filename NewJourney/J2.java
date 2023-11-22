package NewJourney;

public class J2 {
    public static void main(String[] args) {
    String name="Bhopal";
    char key='s';
        System.out.println(findnletter(name,key));
    }

    static boolean findnletter(String str,char key){
        if (str.length()==0){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(key==str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
