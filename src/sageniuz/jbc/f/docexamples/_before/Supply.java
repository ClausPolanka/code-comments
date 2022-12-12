package sageniuz.jbc.f.docexamples._before;

import java.util.regex.Pattern;

public class Supply {

    /**
     * The code universally identifies a supply.
     * <p>
     * It follows a strict format, beginning with an S (for supply), followed
     * by a five digit inventory number. Next comes a backslash that separates
     * the country code from the preceding inventory number. This country
     * code must be exactly two captial letters standing for one of the
     * participating nations (US, EU, RU, CN). After that follows a dot and
     * the actual name of the supply in lowercase letters.
     */
    static final Pattern CODE =
            Pattern.compile("^S\\d{5}\\\\(US|EU|RU|CN)\\.[a-z]+$");
}
