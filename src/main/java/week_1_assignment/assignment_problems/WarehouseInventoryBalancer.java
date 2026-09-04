public class WarehouseInventoryBalancer {
   public WarehouseInventoryBalancer() {
   }

   public static void analyzeInventory(int[] var0, int[] var1) {
      int var2 = 0;
      int var3 = 0;

      for(int var4 = 0; var4 < var0.length; ++var4) {
         var2 += var0[var4];
      }

      for(int var8 = 0; var8 < var1.length; ++var8) {
         var3 += var1[var8];
      }

      if (var2 == var3) {
         System.out.println("Balanced");
      } else {
         System.out.println("Not Balanced");
      }

      int var9 = var0[0];
      String var5 = "Section A";
      int var6 = 0;

      for(int var7 = 0; var7 < var0.length; ++var7) {
         if (var0[var7] > var9) {
            var9 = var0[var7];
            var5 = "Section A";
            var6 = var7;
         }
      }

      for(int var10 = 0; var10 < var1.length; ++var10) {
         if (var1[var10] > var9) {
            var9 = var1[var10];
            var5 = "Section B";
            var6 = var10;
         }
      }

      System.out.println("Highest Quantity: " + var9);
      System.out.println("Found in: " + var5);
      System.out.println("Index: " + var6);
   }

   public static void main(String[] var0) {
      int[] var1 = new int[]{10, 25, 15, 40};
      int[] var2 = new int[]{20, 30, 15, 25};
      analyzeInventory(var1, var2);
   }
}
