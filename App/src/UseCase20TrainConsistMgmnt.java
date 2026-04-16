public class UseCase20TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC20 - Exception Handling During Search");
        System.out.println("========================================\n");

        // Example data
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        String searchId = "BG309";

        try {
            boolean found = safeSearch(bogieIds, searchId);

            if (found) {
                System.out.println("Bogie " + searchId + " found.");
            } else {
                System.out.println("Bogie " + searchId + " NOT found.");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nUC20 validation completed...");
    }

    // 🔥 Defensive Search Method
    public static boolean safeSearch(String[] bogieIds, String searchId) {

        // ---- DEFENSIVE CHECK ----
        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("Train consist is empty. Cannot perform search.");
        }

        // ---- NORMAL SEARCH (Linear Search) ----
        for (String id : bogieIds) {
            if (id.equals(searchId)) {
                return true;
            }
        }

        return false;
    }
}