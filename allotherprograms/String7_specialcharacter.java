package allotherprograms;

public class String7_specialcharacter {
    public static void main(String[] args) {

        String str="abs@#$";
String restofString="";
        int count=0;
        for (int i=0;i<str.length();i++) {
            if (!Character.isLetter(str.charAt(i)) &&
                    !Character.isDigit(str.charAt(i)) && !Character.isWhitespace(str.charAt(i)))
            {
                count++;
            }
            else {
                restofString= restofString + str.charAt(i);
            }
        }
        if (count==0){
            System.out.println("there is no Special character");
        }
        else {
            System.out.println("the number of Special Charcter  "+ count);
        }
        System.out.println("remaining string  "+restofString);
    }

}
