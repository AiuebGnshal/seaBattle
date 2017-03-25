package gameLogic;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class DotComTest {
    private DotCom testDot = new DotCom();


    @Before
    public void setUp() throws Exception {
        testDot.setName( "unit-test.ru" );

        List<String> locations = new ArrayList<>();
        locations.add("3");
        locations.add("45");
        locations.add("67");
        locations.add("15");

        testDot.setLocationCells(locations);
    }

    @Test
    public void test_checkYourself_success() throws Exception {
        String userGuess = "45";

        String result = testDot.checkYourself( userGuess );

        Assert.assertEquals("Попал", result);
    }


}