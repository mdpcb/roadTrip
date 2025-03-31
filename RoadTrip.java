import java.util.ArrayList;

public class RoadTrip {
    private ArrayList<GasStation> gasStations; // List of gas stations along the route
    private double averageMPG; // Vehicle's average miles per gallon (MPG)

    public RoadTrip(ArrayList<GasStation> stations, double averageMPG) {
        gasStations = stations;
        this.averageMPG = averageMPG;
    }

    /**
     * Part (a) - calculateDesirability
     * Calculates the desirability score for a single gas station. The desirability function
     * combines the price per gallon, bathroom quality, snack quality, and distance to provide a score.
     * 
     * Desirability = (Bathroom Quality * 0.2) + (Snack Quality * 0.2) - (Price per Gallon * 0.4) - (Distance * 0.2)
     * 
     * The score is scaled to 100.
     * 
     * @param station the gas station for which desirability needs to be calculated
     * @return the desirability score for the given gas station
     */
    public double calculateDesirability(GasStation station) {
        return 0;
    }

    /**
     * Part (b) - filterAndSortStations
     * Returns a list of gas stations ordered by their desirability score, starting with the most desirable.
     * Removes stations that are beyond the given range or have a desirability below the given threshold.
     * 
     * The method should filter and sort the gas stations based on:
     * 1. Desirability (calculated using the calculateDesirability method)
     * 2. Only includes stations within the range of the car's current fuel range (calculated by miles left)
     * 3. Only includes stations with a desirability score greater than or equal to the given minimum desirability
     * 
     * @param remainingFuel the remaining fuel in gallons
     * @param minDesirability the minimum desirability score to include in the list
     * @return an ArrayList of the gas stations, sorted by desirability, within range and above the minimum desirability
     */
    public ArrayList<GasStation> filterAndSortStations(double remainingFuel, double minDesirability) {
        return {};
    }
}
