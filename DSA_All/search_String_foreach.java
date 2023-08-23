package DSA_All;

public class search_String_foreach {
    public static void main(String[] args) {
        String name = "Engineering";
        char key = 'e';
        boolean ans = find_nameagain(name, key);
        System.out.println(ans);
    }

    static boolean find_nameagain(String str, char key) {
        if (str.length() == 0) {
            return false;
        }
        for (char ch : str.toCharArray()) {
            if (ch == key) {
                return true;
            }
        }
        return false;
    }
}