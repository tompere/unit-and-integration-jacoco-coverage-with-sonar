package octosan;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExampleIT {

    @Test
    public void domainTest() {
        assertEquals("woow44woow", new ExampleDomainClass().exampleDomainMethodTestedByIT(44, "woow"));
    }
    
    @Test
    public void apiTest() {
        assertEquals("woowwoowwoow", new ExampleApiClass().exampleApiMethodTestedByIT(3, "woow"));        
    }
}
