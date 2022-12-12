package sageniuz.jbc.j.javadocconstructors._before;

import sageniuz.jbc.a.superfluous.Supply;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Inventory {
    List<Supply> supplies;

    /**
     * Constructor for a new Inventory.
     */
    public Inventory() {
        this(new ArrayList<>());
    }

    /**
     * Another Constructor for a new Inventory.
     * <p>
     * It is possible to add some supplies to the Inventory.
     */
    public Inventory(Collection<Supply> initialSupplies) {
        this.supplies = new ArrayList<>(initialSupplies);
    }
}
