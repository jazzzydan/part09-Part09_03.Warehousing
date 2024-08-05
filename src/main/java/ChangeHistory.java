import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> readings;

    public ChangeHistory() {
        this.readings = new ArrayList<>();
    }

    public void add(double status) {
        this.readings.add(status);
    }

    public void clear() {
        this.readings.clear();
    }

    public double maxValue() {
        double maxValue = 0;
        if (readings.isEmpty()) {
            return maxValue;
        }
        for (double reading : readings) {
            maxValue = Math.max(reading, maxValue);
        }
        return maxValue;
    }

    public double minValue() {
        if (readings.isEmpty()) {
            return 0;
        }
        double minValue = Double.MAX_VALUE;
        for (double reading : readings) {
            minValue = Math.min(reading, minValue);
        }
        return minValue;
    }

    public double average() {
        if (readings.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (double reading : readings) {
            sum += reading;
        }

        return sum / readings.size();
    }

    @Override
    public String toString() {
        return this.readings.toString();
    }
}
