public class WarehouseInventoryBalancer {

    public static void analyzeInventory(int[] sectionA, int[] sectionB) {

        int totalA = 0;
        int totalB = 0;

        for (int i = 0; i < sectionA.length; i++) {
            totalA += sectionA[i];
        }

     
        for (int i = 0; i < sectionB.length; i++) {
            totalB += sectionB[i];
        }

        if (totalA == totalB) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }

        int highest = sectionA[0];
        String highestSection = "Section A";
        int highestIndex = 0;

        for (int i = 0; i < sectionA.length; i++) {
            if (sectionA[i] > highest) {
                highest = sectionA[i];
                highestSection = "Section A";
                highestIndex = i;
            }
        }

        for (int i = 0; i < sectionB.length; i++) {
            if (sectionB[i] > highest) {
                highest = sectionB[i];
                highestSection = "Section B";
                highestIndex = i;
            }
        }

        System.out.println("Highest Quantity: " + highest);
        System.out.println("Found in: " + highestSection);
        System.out.println("Index: " + highestIndex);
    }

    public static void main(String[] args) {

        int[] sectionA = {10, 25, 15, 40};
        int[] sectionB = {20, 30, 15, 25};

        analyzeInventory(sectionA, sectionB);
    }
}