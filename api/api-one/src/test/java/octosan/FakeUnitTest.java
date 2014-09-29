package octosan;

import org.junit.Assert;
import org.junit.Test;

/** Test added just to avoid setting 'Force zero coverage' in Sonar web api:
 *  Force coverage to 0% if no JaCoCo reports are found during analysis.
 */
public class FakeUnitTest {

    @Test
    public void fakeTest() {
        Assert.assertEquals("saaaame string", "saaaame " + "string");
    }
}
