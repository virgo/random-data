package hu.virgo.randomdata.date;

import com.insightfullogic.lambdabehave.impl.generators.RandomNumberGenerator;
import org.junit.Test;

import java.time.LocalDate;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;

public class LocalDateGeneratorTest {

    @Test
    public void testGenerate() throws Exception {
        LocalDateGenerator generator = new LocalDateGenerator();
        LocalDate randomDate = generator.generate(new RandomNumberGenerator());

        assertThat(randomDate.getYear(), greaterThan(1800));
    }
}