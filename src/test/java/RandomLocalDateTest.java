import org.junit.Test;

import java.time.LocalDate;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;

public class RandomLocalDateTest {

    @Test
    public void testGetRandom() {
        LocalDate randomDate = RandomLocalDate.getRandom();
        assertThat(randomDate.getYear(), greaterThan(1800));
    }

}