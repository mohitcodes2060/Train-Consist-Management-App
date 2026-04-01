import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseCase8TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println("UC8 - Filter Passenger Bogies Using Streams");
        System.out.println("==================================================\n");

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        System.out.println("All Bogies:");
        bogies.forEach(System.out::println);

        // Reusable method
        List<Bogie> filtered = filterBogiesByCapacity(bogies, 60);

        System.out.println("\nFiltered Bogies (Capacity > 60):");
        filtered.forEach(System.out::println);

        System.out.println("\nUC8 filtering completed...");
    }

    // 🔥 IMPORTANT: Reusable method (used in tests also)
    public static List<Bogie> filterBogiesByCapacity(List<Bogie> bogies, int threshold) {

        return bogies.stream()
                .filter(b -> b.getCapacity() > threshold)
                .collect(Collectors.toList());
    }
}