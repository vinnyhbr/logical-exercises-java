public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Chickens!");

        int totalEggs = 0;
        System.out.println("Initial Total eggs: "+ totalEggs);
        //First | eggsPerChicken = 5, chickenCount = 3
        int eggsPerChicken = 5;
        int chickenCount = 3;
        System.out.println("First scenario: eggs per chicken= "+eggsPerChicken+", chicken count= "+chickenCount+", total eggs= "+ totalEggs+".");
        // day 1 - Monday
        totalEggs += eggsPerChicken * chickenCount;
        System.out.println("End monday, total eggs: "+ totalEggs);
        // day 2 - Tuesday
        chickenCount++;
        totalEggs += eggsPerChicken * chickenCount;
        System.out.println("End Tuesday, total eggs: "+ totalEggs);
        // day 3 - Wednesday
        chickenCount /= 2;
        totalEggs += eggsPerChicken * chickenCount;
        System.out.println("End Wednesday, total eggs: "+ totalEggs);

        System.out.print("\n ----------------------------- \n \n");
        //Second | eggsPerChicken = 4, chickenCount = 8;
        eggsPerChicken = 4;
        chickenCount = 8;
        totalEggs = 0;
        System.out.println("Second scenario: eggs per chicken= "+eggsPerChicken+", chicken count= "+chickenCount+", total eggs= "+ totalEggs+".");
        totalEggs += eggsPerChicken * chickenCount;
        System.out.println("End monday, total eggs: "+ totalEggs);
        // day 2 - Tuesday
        chickenCount++;
        totalEggs += eggsPerChicken * chickenCount;
        System.out.println("End Tuesday, total eggs: "+ totalEggs);
        // day 3 - Wednesday
        chickenCount /= 2;
        totalEggs += eggsPerChicken * chickenCount;
        System.out.println("End Wednesday, total eggs: "+ totalEggs);
    }
}