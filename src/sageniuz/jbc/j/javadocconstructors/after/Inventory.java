package sageniuz.jbc.j.javadocconstructors.after;

import sageniuz.jbc.a.superfluous.Supply;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Inventory {
    List<Supply> supplies;

    /**
     * Creates an empty inventory.
     *
     * @see Inventory#Inventory(Collection) instantiate with initial supplies.
     */
    public Inventory() {
        this(new ArrayList<>());
    }

    /**
     * Creates an inventory with an initial shipment of supplies.
     *
     * @param initialSupplies Initial supplies. Must not be null, can be empty.
     * @throws NullPointerException if initialSupplies is null
     * @see Inventory#Inventory() instantiate with no supplies.
     */
    public Inventory(Collection<Supply> initialSupplies) {
        this.supplies = new ArrayList<>(initialSupplies);
    }
}
