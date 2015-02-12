package z.ac.cput.kar;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/02/12.
 */
public class inttest {
    App obj = new App();
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testName() throws Exception {
        Assert.assertEquals("Hello World!", obj.main());

    }

    @After
    public void tearDown() throws Exception {


    }
}
