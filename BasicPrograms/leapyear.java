package BasicPrograms;

import java.util.Scanner;

public class leapyear {
   public static void main(String[] args) {
      int year;
      System.out.println("Enter any year:");
      Scanner sc = new Scanner(System.in);
      year = sc.nextInt();
      sc.close();

      boolean isLeap = false;

      if (year % 4 == 0) {
         if (year % 100 == 0) {
            if (year % 400 == 0) {
               isLeap = true;
            } else {
               isLeap = false;
            }
         } else {
            isLeap = true;
         }
      } else {
         isLeap = false;
      }

      if (isLeap == true) {
         System.out.println(year + " " + "is leap year");

      } else {
         System.out.println(year + "" + "is not a leap year");
      }

      /*
       * if ((year%400==0)||((year%4==0)&&(year%100!=0))) {
       * System.out.println(year+" "+"is a leap year.");
       * 
       * } else {
       * System.out.println(year+" "+"is not a leap year.");
       * }
       */
   }
}
