package sageniuz.jbc.e.docimpldecisions._before;

import sageniuz.jbc.a.superfluous.Supply;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inventory {

    private List<Supply> list = new ArrayList<>();

    void add(Supply supply) {
        list.add(supply);
        Collections.sort(list);
    }

    boolean isInStock(String name) {
        // fast implementation
        return Collections.binarySearch(list, new Supply(name)) != -1;
    }
}
