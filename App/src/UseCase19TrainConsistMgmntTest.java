import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase19TrainConsistMgmntTest {

    private String[] getSortedData() {
        return new String[]{"BG101", "BG205", "BG309", "BG412", "BG550"};
    }

    @Test
    void testBinarySearch_Found() {
        boolean result = UseCase19TrainConsistMgmnt
                .binarySearch(getSortedData(), "BG309");

        assertTrue(result);
    }

    @Test
    void testBinarySearch_NotFound() {
        boolean result = UseCase19TrainConsistMgmnt
                .binarySearch(getSortedData(), "BG999");

        assertFalse(result);
    }

    @Test
    void testBinarySearch_FirstElement() {
        boolean result = UseCase19TrainConsistMgmnt
                .binarySearch(getSortedData(), "BG101");

        assertTrue(result);
    }

    @Test
    void testBinarySearch_LastElement() {
        boolean result = UseCase19TrainConsistMgmnt
                .binarySearch(getSortedData(), "BG550");

        assertTrue(result);
    }

    @Test
    void testBinarySearch_SingleElement() {
        String[] single = {"BG101"};

        boolean result = UseCase19TrainConsistMgmnt
                .binarySearch(single, "BG101");

        assertTrue(result);
    }
}