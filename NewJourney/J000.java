package NewJourney;

public class J000 {
    public static void main(String[] args) {
        int[] arr={41,5,32,564,45412,52636,78};
        System.out.println(numberofevendigits(arr));
    }

    static int numberofevendigits(int[] arr) {
        int count=0;
        for (int i:arr) {
            if (even(i)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int i) {
        int numberofdigits=digits(i);
        return numberofdigits % 2==0;
    }

   static int digits(int i) {
        int count=0;
      while (i>0){
          count++;
          i=i/10;
        }
      return count;
    }
}
