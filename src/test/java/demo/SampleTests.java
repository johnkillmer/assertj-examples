package demo;

import org.joda.time.DateTime;
import org.junit.Test;

import static org.assertj.jodatime.api.Assertions.assertThat;


public class SampleTests {

    @Test
    public void testIsBefore() {

        DateTime dateTime = new DateTime(2002, 10, 22, 0, 0, 0);

        assertThat(dateTime).isBefore(new DateTime("2004-12-13T21:39:45.618-08:00"));
        assertThat(dateTime).isBefore("2004-12-13T21:39:45.618-08:00");
    }

    @Test
    public void testIgnoringSecondsAndMilliSeconds() {
        DateTime expectedDate = new DateTime(2018, 4, 1, 11, 30, 25, 53);
        DateTime actualDate = new DateTime(2018, 4, 1, 11, 30, 15, 23);

        assertThat(actualDate).isEqualToIgnoringSeconds(expectedDate);
    }

}
