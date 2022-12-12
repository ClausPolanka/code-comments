package sageniuz.jbc.i.javadocmethods._before;

import sageniuz.jbc.a.superfluous.Supply;

import java.util.Queue;
import java.util.Stack;

public interface CargoShip {
    Stack<Supply> unload();

    /**
     * Loads {@link Supply}.
     *
     * @param supplies the supplies of type {@link Queue}
     * @return not loaded supplies of type {@link Queue}
     */
    Queue<Supply> load(Queue<Supply> supplies);

    int getRemainingCapacity();

}
