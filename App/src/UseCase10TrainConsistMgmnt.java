import java.util.ArrayList;
import java.util.List;

public class UseCase10TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println("UC10 - Count Total Seats in Train");
        System.out.println("==================================================\n");

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));

        System.out.println("Bogies in Train:");
        bogies.forEach(System.out::println);

        // 🔥 Aggregation logic
        int totalSeats = calculateTotalCapacity(bogies);

        System.out.println("\nTotal Seating Capacity of Train: " + totalSeats);
        System.out.println("\nUC10 aggregation completed...");
    }

    // 🔥 Reusable method for testing
    public static int calculateTotalCapacity(List<Bogie> bogies) {

        return bogies.stream()
                .map(Bogie::getCapacity)     // extract capacity
                .reduce(0, Integer::sum);   // aggregate
    }
}