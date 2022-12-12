package sageniuz.jbc.h.javadocclasses._before;

import sageniuz.jbc.a.superfluous.Supply;

import java.util.Queue;
import java.util.Stack;

/**
 * This class represents a cargo ship. It can unload a {@link Stack} of
 * supplies, load {@link Queue} of supplies, and it can show the
 * remainingCapacity as a long.
 */
public interface CargoShip {
    Stack<Supply> unload();

    Queue<Supply> load(Queue<Supply> supplies);

    int getRemainingCapacity();
}
