public class UseCase16TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC16 - Manual Sorting using Bubble Sort ");
        System.out.println("========================================\n");

        int[] capacities = {72, 56, 24, 70, 60};

        System.out.println("Original Capacities:");
        printArray(capacities);

        // 🔥 CALL SORT METHOD
        bubbleSort(capacities);

        System.out.println("\nSorted Capacities (Ascending):");
        printArray(capacities);

        System.out.println("\nUC16 sorting completed...");
    }

    // 🔥 REUSABLE METHOD (IMPORTANT FOR TESTS)
    public static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Helper method
    public static void printArray(int[] arr) {
        for (int c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}