import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase18TrainConsistMgmntTest {

    private String[] getSampleData() {
        return new String[]{"BG101", "BG205", "BG309", "BG412", "BG550"};
    }

    @Test
    void testSearch_BogieFound() {
        boolean result = UseCase18TrainConsistMgmnt
                .searchBogie(getSampleData(), "BG309");

        assertTrue(result);
    }

    @Test
    void testSearch_BogieNotFound() {
        boolean result = UseCase18TrainConsistMgmnt
                .searchBogie(getSampleData(), "BG999");

        assertFalse(result);
    }

    @Test
    void testSearch_FirstElementMatch() {
        boolean result = UseCase18TrainConsistMgmnt
                .searchBogie(getSampleData(), "BG101");

        assertTrue(result);
    }

    @Test
    void testSearch_LastElementMatch() {
        boolean result = UseCase18TrainConsistMgmnt
                .searchBogie(getSampleData(), "BG550");

        assertTrue(result);
    }

    @Test
    void testSearch_SingleElementArray() {
        String[] single = {"BG101"};

        boolean result = UseCase18TrainConsistMgmnt
                .searchBogie(single, "BG101");

        assertTrue(result);
    }
}