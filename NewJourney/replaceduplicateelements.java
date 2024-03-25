package NewJourney;

public class replaceduplicateelements {
    public static void main(String[] args) {
        String str = "hello";

        char str1[] = str.toCharArray();
        for (int i=0;i<str1.length;i++) {
                if (str1[i]=='l'){
                    str1[i]='t';
                }
        }
        System.out.println(str1);
    }
}
