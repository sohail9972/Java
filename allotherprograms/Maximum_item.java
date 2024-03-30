package allotherprograms;

import com.sun.security.jgss.GSSUtil;

import static sun.swing.MenuItemLayoutHelper.max;

public class Maximum_item {
    public static void main(String[] args) {
        int[] arr = {1, 2, 43, 54, 87, 67, 89};
        System.out.println(maxiumRange(arr,0,4));

    }

    static int maxiumRange(int[] arr, int start,int end) {

        if(end<start){
            return -1;
        }
        if (arr==null){
            return -1;
        }
int maxval=arr[0];
for (int i=start;i<=end;i++){
    if(arr[i]>maxval){
        maxval=arr[i];

    }
}
return maxval;
    }
}