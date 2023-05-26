import java.awt.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class String16_duplicateelements_coll {

    public static void main(String[] args) {
        String[] duplicates=new String[]{"java","C","c++","python","C","java"};
        List<String> duplicatesList=Arrays.asList(duplicates);
        Set<String>duplicatedSet=new HashSet<>(duplicatesList);
        if (duplicatesList.size()!=duplicatedSet.size()){
            System.out.println("the Array has duplicates");
        }
        else {
            System.out.println("the Array doesnt has the Duplicates");
        }

    }
}
