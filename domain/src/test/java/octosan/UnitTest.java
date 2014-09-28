package octosan;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTest {

    @Test
    public void test() {
        assertEquals("0 a1 a2 a3 a", new ExampleDomainClass().methodTestedOnlyByJUnit("a", 2));
    }
}
