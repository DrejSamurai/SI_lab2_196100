import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;


class SILab2Test
{
    SILab2 siLab2 = new SILab2();

    //83116
    //23 5 16
    @Test
    void functionTest()
    {
        List<Integer> result = siLab2.function(Collections.singletonList(new Time(23, 5, 16)));
        assertEquals(Collections.singletonList(83116), result);
    }

    @Test
    void functionTest2()
    {
        List<Integer> result = siLab2.function(Collections.singletonList(new Time(23, 1, 1)));
        assertEquals(Collections.singletonList(82861), result);
    }


    @Test
    void functionTestRuntimeExceptions()
    {

        RuntimeException exception = assertThrows(RuntimeException.class, () ->
        {
            siLab2.function(Arrays.asList(new Time(23, 5, -16)));
        });
        String expectedMessage = "The seconds are not valid";
        assertEquals(exception.getMessage(), expectedMessage);
    }

    @Test
    void functionTestRuntimeExceptions2()
    {

        RuntimeException exception = assertThrows(RuntimeException.class, () ->
        {
            siLab2.function(Arrays.asList(new Time(24, 5, -16)));
        });
        String expectedMessage = "The time is greater than the maximum";
        assertEquals(exception.getMessage(), expectedMessage);
    }

}