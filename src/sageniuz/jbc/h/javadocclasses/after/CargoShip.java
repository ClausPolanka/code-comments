package sageniuz.jbc.h.javadocclasses.after;

import sageniuz.jbc.a.superfluous.Supply;

import java.util.Queue;
import java.util.Stack;

/**
 * A cargo ship can load and unload supplies according to its capacity.
 * <p>
 * Supplies are loaded sequentially and can be unloaded in LIFO
 * (last-in-first-out) order. The cargo ship can only store supplies up to its
 * capacity. Its capacity is never negative.
 */
public interface CargoShip {
    Stack<Supply> unload();

    Queue<Supply> load(Queue<Supply> supplies);

    int getRemainingCapacity();
}
