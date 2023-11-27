package NewJourney;

public class J7_even_number_of_digits {
    public static void main(String[] args) {
        int[] nums={121,52,65,231,1,2356,48454,65444};
        System.out.println(evennumberofdigits(nums));
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
    static int digits(int num){
        int count=0;
        while(num>0){
            count++;
            num = num/10;

        }
        return count;
    }
}
