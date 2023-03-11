import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnumDayTest {
    @Test
    public void testMonday() {
        EnumRunner enumRunner = new EnumRunner(Day.MONDAY);

        assertEquals("Mondays are exciting beginning!", enumRunner.tellItLikeItIs());
    }

    @Test
    public void testTuesday() {
        EnumRunner enumRunner = new EnumRunner(Day.TUESDAY);

        assertEquals("When things get serious..", enumRunner.tellItLikeItIs());
    }

    @Test
    public void testWednesday() {
        EnumRunner enumRunner = new EnumRunner(Day.WEDNESDAY);

        assertEquals("Almost there!!", enumRunner.tellItLikeItIs());
    }

    @Test
    public void testCalculateMoodForMonday() {
        assertEquals(7, Day.MONDAY.calculateMood());
    }

    @Test
    public void testCalculateMoodForTuesday() {
        assertEquals(7, Day.TUESDAY.calculateMood());
    }

    @Test
    public void testCalculateMoodForWednesday() {
        assertEquals(8, Day.WEDNESDAY.calculateMood());
    }
}
