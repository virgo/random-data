package hu.virgo.randomdata.date;

import com.insightfullogic.lambdabehave.generators.Generator;
import com.insightfullogic.lambdabehave.generators.SourceGenerator;

import java.time.LocalDate;

public class LocalDateGenerator implements Generator<LocalDate> {

    @Override
    public LocalDate generate(SourceGenerator source) {
        int thisYear = LocalDate.now().getYear();

        int alteration = source.generateInt(100);
        if (source.generateBoolean())
            alteration *= -1;

        int year = thisYear + alteration;
        int day = source.generateInt(367);

        return LocalDate.ofYearDay(year, day);
    }

}
