import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase8TrainConsistMgmtTest {

    private List<Bogie> getSampleBogies() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));
        return bogies;
    }




    @Test
    void testFilter_CapacityGreaterThanThreshold() {
        List<Bogie> result =
                UseCase8TrainConsistMgmt.filterBogiesByCapacity(getSampleBogies(), 60);

        assertEquals(2, result.size());
    }

    @Test
    void testFilter_CapacityEqualToThreshold() {
        List<Bogie> result =
                UseCase8TrainConsistMgmt.filterBogiesByCapacity(getSampleBogies(), 72);

        assertFalse(result.stream().anyMatch(b -> b.getCapacity() == 72));
    }

    @Test
    void testFilter_NoBogiesMatching() {
        List<Bogie> result =
                UseCase8TrainConsistMgmt.filterBogiesByCapacity(getSampleBogies(), 100);

        assertTrue(result.isEmpty());
    }

    @Test
    void testFilter_AllBogiesMatching() {
        List<Bogie> result =
                UseCase8TrainConsistMgmt.filterBogiesByCapacity(getSampleBogies(), 10);

        assertEquals(4, result.size());
    }

    @Test
    void testFilter_EmptyBogieList() {
        List<Bogie> empty = new ArrayList<>();

        List<Bogie> result =
                UseCase8TrainConsistMgmt.filterBogiesByCapacity(empty, 60);

        assertTrue(result.isEmpty());
    }

    @Test
    void testFilter_OriginalListUnchanged() {
        List<Bogie> original = getSampleBogies();

        List<Bogie> filtered =
                UseCase8TrainConsistMgmt.filterBogiesByCapacity(original, 60);

        assertEquals(4, original.size());
        assertNotSame(original, filtered);
    }
}