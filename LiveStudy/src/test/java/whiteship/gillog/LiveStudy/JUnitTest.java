package whiteship.gillog.LiveStudy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.TestMethodOrder;

/**
 * Unit test for simple App.
 */
public class JUnitTest {

    @BeforeEach
    void init() {
        System.out.println("각 메소드 실행 전 시작.");
    }

    @Order(3)
    @Test
    void test1() {
        System.out.println("test");
    }

    @Order(1)
    @Test
    void test3() {
        System.out.println("test3");
    }

    @Order(4)
    @Test
    void test2() {
        System.out.println("test2");
    }

    @Order(2)
    @Test
    void test4() {
        System.out.println("test4");
    }

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @TestFactory
    @RepeatedTest(4)
    void repeatedTest() {
        String testStr = null;
        assertThrows(NullPointerException.class, () -> {
            testStr.length();
        });
    }

    @DisplayName("Single test successful")
    @Test
    void testSingleSuccessTest() {
        System.out.println("Success");
    }
}
