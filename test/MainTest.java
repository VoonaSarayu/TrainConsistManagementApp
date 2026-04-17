import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    // ✅ Test 1: Exception when array is empty
    @Test
    void testSearch_ThrowsExceptionWhenEmpty() {
        String[] bogies = {};
        assertThrows(RuntimeException.class, () -> {
            Main.search(bogies, "BG101");
        });
    }

    // ✅ Test 2: Bogie found
    @Test
    void testSearch_BogieFound() {
        String[] bogies = {"BG101", "BG205", "BG309"};
        assertTrue(Main.search(bogies, "BG101"));
    }

    // ✅ Test 3: Bogie not found
    @Test
    void testSearch_BogieNotFound() {
        String[] bogies = {"BG101", "BG205", "BG309"};
        assertFalse(Main.search(bogies, "BG999"));
    }

    // ✅ Test 4: Single element case
    @Test
    void testSearch_SingleElement() {
        String[] bogies = {"BG101"};
        assertTrue(Main.search(bogies, "BG101"));
    }
}