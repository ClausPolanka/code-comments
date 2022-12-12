package sageniuz.jbc.f.docexamples.after;

import java.util.regex.Pattern;

public class Supply {

    /**
     * The expression universally identifies a supply code.
     * <p>
     * Format: {@literal "S<inventory-number>\<COUNTRY-CODE>.<name>"}
     * <br/><br/>
     * Valid examples:
     * <pre>
     * "S12345\US.pasta",
     * "S08342\CN.wrench",
     * "S88888\EU.laptop",
     * "S12233\RU.brush"
     * </pre>
     * Invalid examples:
     * <pre>
     * "R12345\RU.fuel"     (Resource, not supply)
     * "S1234\US.light"     (Need five digits)
     * "S01234\AI.coconut"  (Wrong country code. Use US, EU, RU, or CN)
     * " S88888\EU.laptop"  (Trailing whitespaces)
     * </pre>
     */
    static final Pattern SUPPLY_CODE =
            Pattern.compile("^S\\d{5}\\\\(US|EU|RU|CN)\\.[a-z]+$");
}
