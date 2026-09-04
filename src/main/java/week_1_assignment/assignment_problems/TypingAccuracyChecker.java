
public class TypingAccuracyChecker {
   public TypingAccuracyChecker() {
   }

   public static void main(String[] var0) {
      String var1 = "Programming";
      String var2 = "Programming!";
      int var3 = 0;
      int var4 = Math.min(var1.length(), var2.length());
      int var5 = var1.length();
      int var6 = -1;
      char var7 = ' ';
      char var8 = ' ';

      for(int var9 = 0; var9 < var4; ++var9) {
         if (var1.charAt(var9) == var2.charAt(var9)) {
            ++var3;
         } else if (var6 == -1) {
            var6 = var9 + 1;
            var7 = var1.charAt(var9);
            var8 = var2.charAt(var9);
         }
      }

      if (var6 == -1 && var1.length() != var2.length()) {
         var6 = var4 + 1;
         var7 = var1.length() > var4 ? var1.charAt(var4) : 45;
         var8 = var2.length() > var4 ? var2.charAt(var4) : 45;
      }

      double var11 = var5 > 0 ? (double)var3 / (double)Math.max(var1.length(), var2.length()) * (double)100.0F : (double)0.0F;
      if (var6 != -1) {
         System.out.printf("Matched: %d/%d | Accuracy: %.2f%% | First Mismatch at position %d ('%c' vs '%c')\n", var3, var5, var11, var6, var7, var8);
      } else {
         System.out.printf("Matched: %d/%d | Accuracy: %.2f%% | No Mismatches\n", var3, var5, var11);
      }

   }
}