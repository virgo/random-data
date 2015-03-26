import java.time.LocalDate;
import java.util.Random;

public class RandomLocalDate {

    private static Random RND = new Random();
    
    public static LocalDate getRandom() {
        int thisYear = LocalDate.now().getYear();

        int alteration = RND.nextInt(100);
        if(RND.nextBoolean())
            alteration *= -1;

        int year = thisYear + alteration;
        int day = RND.nextInt(367);

        return LocalDate.ofYearDay(year, day);
    }

}
