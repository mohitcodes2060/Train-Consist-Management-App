import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase20TrainConsistMgmntTest {

    private String[] getSampleData() {
        return new String[]{"BG101", "BG205", "BG309", "BG412", "BG550"};
    }

    @Test
    void testSearch_NormalCase() {
        boolean result = UseCase20TrainConsistMgmnt
                .safeSearch(getSampleData(), "BG309");

        assertTrue(result);
    }

    @Test
    void testSearch_NotFound() {
        boolean result = UseCase20TrainConsistMgmnt
                .safeSearch(getSampleData(), "BG999");

        assertFalse(result);
    }

    @Test
    void testSearch_EmptyArrayThrowsException() {
        String[] empty = {};

        assertThrows(IllegalStateException.class, () ->
                UseCase20TrainConsistMgmnt.safeSearch(empty, "BG101")
        );
    }

    @Test
    void testSearch_NullArrayThrowsException() {

        assertThrows(IllegalStateException.class, () ->
                UseCase20TrainConsistMgmnt.safeSearch(null, "BG101")
        );
    }

    @Test
    void testSearch_ExceptionMessage() {
        String[] empty = {};

        Exception ex = assertThrows(IllegalStateException.class, () ->
                UseCase20TrainConsistMgmnt.safeSearch(empty, "BG101")
        );

        assertEquals("Train consist is empty. Cannot perform search.", ex.getMessage());
    }
}