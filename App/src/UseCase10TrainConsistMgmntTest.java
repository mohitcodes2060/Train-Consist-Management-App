import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase10TrainConsistMgmntTest {

    private List<Bogie> getSampleBogies() {
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));

        return bogies;
    }

    @Test
    void testReduce_TotalSeatCalculation() {
        int total =
                UseCase10TrainConsistMgmnt.calculateTotalCapacity(getSampleBogies());

        assertEquals(222, total);
    }

    @Test
    void testReduce_MultipleBogiesAggregation() {
        int total =
                UseCase10TrainConsistMgmnt.calculateTotalCapacity(getSampleBogies());

        assertTrue(total > 0);
    }

    @Test
    void testReduce_SingleBogieCapacity() {
        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("Sleeper", 72));

        int total =
                UseCase10TrainConsistMgmnt.calculateTotalCapacity(list);

        assertEquals(72, total);
    }

    @Test
    void testReduce_EmptyBogieList() {
        int total =
                UseCase10TrainConsistMgmnt.calculateTotalCapacity(new ArrayList<>());

        assertEquals(0, total);
    }

    @Test
    void testReduce_CorrectCapacityExtraction() {
        int total =
                UseCase10TrainConsistMgmnt.calculateTotalCapacity(getSampleBogies());

        assertEquals(72 + 56 + 24 + 70, total);
    }

    @Test
    void testReduce_AllBogiesIncluded() {
        int total =
                UseCase10TrainConsistMgmnt.calculateTotalCapacity(getSampleBogies());

        assertEquals(222, total);
    }

    @Test
    void testReduce_OriginalListUnchanged() {
        List<Bogie> original = getSampleBogies();

        int total =
                UseCase10TrainConsistMgmnt.calculateTotalCapacity(original);

        assertEquals(4, original.size());
    }
}