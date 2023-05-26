import java.util.HashSet;

//Str1=ABCD;
//str2=CDAB;
public class String9_rotationofString {
    public static void main(String[] args) {
        String str1 = "ABCD";
        String str2 = "DCAB";
        System.out.println(isang(str1, str2));
//        if (isrotational(str1,str2)){
//            System.out.println("its rotational");
//        }else{
//            System.out.println("not rotational");
//        }
//
//    }
//    public static boolean isrotational(String str1,String str2){
//        return (str1.length()==str2.length()) && ((str1+str2).indexOf(str2) !=-1);


    }

    private static boolean isang(String str1, String str2) {
int count[]=new int[256];

for (int i=0;i<str1.length();i++){
    count[str1.charAt(i)]++;
    count[str2.charAt(i)]--;
}

for (int i=0;i< count.length;i++){
    if (count[i]!=0){
        return false;
    }
}
return true;
    }
}
