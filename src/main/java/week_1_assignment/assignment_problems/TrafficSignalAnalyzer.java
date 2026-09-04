public class TrafficSignalAnalyzer {
   public TrafficSignalAnalyzer() {
   }

   public static void findLongestStreak(String var0) {
      if (var0 != null && !var0.isEmpty()) {
         char var1 = var0.charAt(0);
         int var2 = 1;
         char var3 = var0.charAt(0);
         int var4 = 1;

         for(int var5 = 1; var5 < var0.length(); ++var5) {
            if (var0.charAt(var5) == var3) {
               ++var4;
            } else {
               var3 = var0.charAt(var5);
               var4 = 1;
            }

            if (var4 > var2) {
               var2 = var4;
               var1 = var3;
            }
         }

         System.out.println("Longest streak: " + var1);
         System.out.println("Length: " + var2);
      }
   }

   public static void main(String[] var0) {
      String var1 = "RRGGGYRR";
      findLongestStreak(var1);
   }
}