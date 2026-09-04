
public class MovieReviewWordLengthProfiler {
   public MovieReviewWordLengthProfiler() {
   }

   public static void classifyWordLengths(String var0) {
      String[] var1 = var0.split(" ");
      int var2 = 0;
      int var3 = 0;
      int var4 = 0;

      for(int var5 = 0; var5 < var1.length; ++var5) {
         int var6 = var1[var5].length();
         if (var6 >= 1 && var6 <= 4) {
            ++var2;
         } else if (var6 >= 5 && var6 <= 8) {
            ++var3;
         } else if (var6 >= 9) {
            ++var4;
         }
      }

      System.out.println("Short: " + var2);
      System.out.println("Medium: " + var3);
      System.out.println("Long: " + var4);
   }

   public static void main(String[] var0) {
      String var1 = "This movie was absolutely fantastic and entertaining";
      classifyWordLengths(var1);
   }
}
