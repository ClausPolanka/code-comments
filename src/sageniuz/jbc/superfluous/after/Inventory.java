package sageniuz.jbc.superfluous.after;

import sageniuz.jbc.Supply;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    List<Supply> supplies = new ArrayList<>();

    int countContaminatedSupplies() {
        if (supplies == null || supplies.isEmpty()) {
            // No supplies => no contamination
            return 0;
        }
        int contaminatedCounter = 0;
        for (Supply supply : supplies) {
            if (supply.isContaminated()) {
                contaminatedCounter++;
            }
        }
        return contaminatedCounter;
    }
}
