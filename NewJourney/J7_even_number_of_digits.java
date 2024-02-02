package NewJourney;

public class J7_even_number_of_digits {
    public static void main(String[] args) {
        int[] nums={121,52,65,231,1,2356,48454,65444};
        System.out.println(evennumberofdigits(nums));

//        System.out.println(digit2(-5362819));
    }
    static int evennumberofdigits(int[] nums){
        int count=0;
        for (int i:nums) {
            if(even(i)){
                count++;
            }
        }
        return count;
    }

  static boolean even(int i) {
        int numberofdigits=digits(i);
        return numberofdigits %2 ==0;

    }
//    static int digit2(int num){
//        if (num<0){
//            num=num*-1;
//
//        }
//        return(int)(Math.log10(num)+1);
//    }
    static int digits(int num){
            if (num<0){
        num=num*-1;

    }
        return(int)(Math.log10(num)+1);
}
//        if (num<0){
//            num=num*-1;
//
//        }
//        if (num==0){
//            return 1;
//        }
//        int count=0;
//        while(num>0){
//            count++;
//            num = num/10;
//
//        }
//        return count;
//    }
}
