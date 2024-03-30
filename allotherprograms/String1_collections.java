package allotherprograms;

import java.util.Map;
import java.util.TreeMap;

public class String1_collections {
    public static void main(String[] args) {
        String str="Hello World to Sohail";
//        
        String1_collections word = new String1_collections();
        word.getvowelcount(str);
        word.frequency(str);
    }
    private void getvowelcount(String str) {
int wordCount=0; int vowelcount=0;int upperCasecount=0;
for (int i=0;i<str.length();i++){
    char c = str.charAt(i);

    switch (c){
        case ' ':
        case '.':
            wordCount++;
    }
    switch (c){
        case 'A':
        case 'E':
        case 'I':
        case 'O':
        case 'U':
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
            vowelcount++;
    }
    if (c>=65 && c<=99){
        upperCasecount++;
    }
}
        System.out.println("Wordcount = " +wordCount);
        System.out.println("vowelcount = " +vowelcount);
        System.out.println("uppercase count= " +upperCasecount);
    }
    private void frequency(String str) {
        TreeMap<Character,Integer>map=new TreeMap<>();
        for (int i=0;i<str.length();i++){
            Integer c= map.get(str.charAt(i));

            if (map.get(str.charAt(i))==null){
                map.put(str.charAt(i),1);
            }
            else{
                map.put(str.charAt(i),++c);
            }
        }
        for (Map.Entry entry: map.entrySet()) {
            System.out.println("Charecter = " +entry.getKey());
            System.out.println("Charecter = " +entry.getValue());
        }
    }
}
