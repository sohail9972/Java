package allotherprograms;

import java.security.PublicKey;
import java.util.Scanner;

public class perfect_number {
  static boolean isperfectnum(int n) {
      int sum = 1;
      for (int i = 2; i * i <= n; i++) {
          if (n % i == 0) {
              if (i * i != n) {
                  sum = sum + i + n / i;
              } else {
                  sum = sum + i;
              }
          }
      }
          if (sum == n && n != 1) {
              return true;
          }

      return false;
  }
    public static void main(String[] args) {
        System.out.println("the Perfect numbers are :");
        for (int n=2;n<1000;n++){
            if (isperfectnum(n)){
                System.out.println(n);
            }
        }
    }
}
