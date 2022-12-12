/**
 * Classes for managing an inventory of supplies.
 * <p>
 * The core class is the {@link sageniuz.jbc.a.superfluous._before.Inventory}
 * that lets you
 * <ul>
 *     <li>stock it up from {@link logistics.CargoShip}</li>
 *     <li>dispose of any contaminated {@link logistics.Supply}</li>
 *     <li>and search for any {@link logistics.Supply}</li> by name.
 * </ul>
 * <p>
 * The classes let you unload supplies and immediately dispose of any supply
 * that was contaminated.
 * <pre>
 *     Inventory inventory = new Inventory();
 *     inventory.stopUp(cargoShip.unload());
 *     inventory.disposeContaminatedSupplies();
 *     inventory.getContaminatedSupplies().isEmpty(); // true
 * </pre>
 */
package sageniuz.jbc.g.javadocpackages.after;
