import java.util.Arrays;

public class UseCase17TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC17 - Sort Bogie Names using Arrays.sort() ");
        System.out.println("========================================\n");

        String[] bogies = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        System.out.println("Original Bogie Names:");
        System.out.println(Arrays.toString(bogies));

        // 🔥 BUILT-IN SORT
        sortBogieNames(bogies);

        System.out.println("\nSorted Bogie Names (Alphabetical):");
        System.out.println(Arrays.toString(bogies));

        System.out.println("\nUC17 sorting completed...");
    }

    // 🔥 Reusable method (important for tests)
    public static void sortBogieNames(String[] arr) {
        Arrays.sort(arr);
    }
}