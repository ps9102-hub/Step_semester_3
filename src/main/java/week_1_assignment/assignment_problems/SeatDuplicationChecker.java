
package assignment_problems;

public class SeatDuplicationChecker {
   public SeatDuplicationChecker() {
   }

   static void checkDuplicateSeats(int[] var0) {
      boolean var1 = false;

      for(int var2 = 0; var2 < var0.length; ++var2) {
         for(int var3 = var2 + 1; var3 < var0.length; ++var3) {
            if (var0[var2] == var0[var3]) {
               System.out.println("Duplicate Seat Number Found: " + var0[var2]);
               var1 = true;
            }
         }
      }

      if (!var1) {
         System.out.println("No Duplicate Seats Found");
      }

   }

   public static void main(String[] var0) {
      int[] var1 = new int[]{101, 102, 103, 102, 105};
      checkDuplicateSeats(var1);
   }
}
