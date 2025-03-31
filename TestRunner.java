import java.util.ArrayList;

public class TestRunner {
    public static void main(String[] args) {
        // Sample Data for Gas Stations, this should be replaced with the data in gasStationInfo.csv
        ArrayList<GasStation> stations = new ArrayList<>();
        stations.add(new GasStation("Test A", 3.31, 1, 2, 3));
        stations.add(new GasStation("Test B", 3.69, 4, 4, 50));
        stations.add(new GasStation("Test C", 3.29, 3, 2, 10));
        stations.add(new GasStation("Test D", 3.98, 1, 4, 115));
        

        // Create a RoadTrip instance
        RoadTrip trip = new RoadTrip(stations, 25); // Example with an average MPG of 25

        // Test Part (a)
        GasStation testStation = stations.get(0);  // Take the first station for testing
        double desirability = trip.calculateDesirability(testStation);
        System.out.println("Desirability of " + testStation.getAddress() + ": " + desirability);

        // Test Part (b) – Filter and sort stations
        ArrayList<GasStation> filteredStations = trip.filterAndSortStations(10, 50);
        System.out.println("Filtered and Sorted Stations:");
        for (GasStation station : filteredStations) {
            System.out.println(station.getAddress() + " - Desirability: " + trip.calculateDesirability(station));
        }
    }
}
