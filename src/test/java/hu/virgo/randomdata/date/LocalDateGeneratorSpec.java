package hu.virgo.randomdata.date;


import com.insightfullogic.lambdabehave.JunitSuiteRunner;
import org.junit.runner.RunWith;

import static com.insightfullogic.lambdabehave.Suite.describe;
import static hu.virgo.randomdata.date.LocalDateGenerator.givenLocalDate;

@RunWith(JunitSuiteRunner.class)
public class LocalDateGeneratorSpec {
    static {
        describe(
                "a local date", it -> it.requires(100)
                        .example(givenLocalDate())
                        .toShow("is not empty", (expect, localdate) -> expect.that(localdate).isNotNull())
        );

    }
}
