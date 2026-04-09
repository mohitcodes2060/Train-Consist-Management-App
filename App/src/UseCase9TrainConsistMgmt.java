import java.util.*;
import java.util.stream.Collectors;

public class UseCase9TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println("UC9 - Group Bogies by Type");
        System.out.println("==================================================\n");

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));
        bogies.add(new Bogie("AC Chair", 60));

        System.out.println("All Bogies:");
        bogies.forEach(System.out::println);

        // 🔥 Grouping logic
        Map<String, List<Bogie>> grouped =
                groupBogiesByType(bogies);

        System.out.println("\nGrouped Bogies:\n");

        for (Map.Entry<String, List<Bogie>> entry : grouped.entrySet()) {
            System.out.println("Bogie Type: " + entry.getKey());

            for (Bogie b : entry.getValue()) {
                System.out.println("  Capacity -> " + b.getCapacity());
            }
            System.out.println();
        }

        System.out.println("UC9 grouping completed...");
    }

    // 🔥 Reusable method (important for testing)
    public static Map<String, List<Bogie>> groupBogiesByType(List<Bogie> bogies) {

        return bogies.stream()
                .collect(Collectors.groupingBy(Bogie::getName));
    }
}