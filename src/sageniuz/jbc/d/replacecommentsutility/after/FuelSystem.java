package sageniuz.jbc.d.replacecommentsutility.after;

import java.util.ArrayList;

public class FuelSystem {

    ArrayList<Double> tanks = new ArrayList<>();

    int getAverageTankFillingPercent() {
        double sum = 0;
        for (double tankFilling : tanks) {
            sum += tankFilling;
        }
        double averageFuel = sum / tanks.size();
        return roundToIntegerPercent(averageFuel);
    }

    static int roundToIntegerPercent(double value) {
        return Math.toIntExact(Math.round(value * 100));
    }
}
