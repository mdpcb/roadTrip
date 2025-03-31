public class GasStation {
    private String address;
    private double pricePerGallon;
    private int bathroomQuality; // 1 to 5 scale, where 1 is poor and 5 is excellent
    private int snackQuality; // 1 to 5 scale, where 1 is poor and 5 is excellent
    private double distanceFromCurrentLocation; // Distance in miles

    public GasStation(String address, double pricePerGallon, int bathroomQuality, int snackQuality, double distanceFromCurrentLocation) {
        this.address = address;
        this.pricePerGallon = pricePerGallon;
        this.bathroomQuality = bathroomQuality;
        this.snackQuality = snackQuality;
        this.distanceFromCurrentLocation = distanceFromCurrentLocation;
    }

    public double getPricePerGallon() {
        return pricePerGallon;
    }

    public int getBathroomQuality() {
        return bathroomQuality;
    }

    public int getSnackQuality() {
        return snackQuality;
    }

    public double getDistanceFromCurrentLocation() {
        return distanceFromCurrentLocation;
    }

    public String getAddress() {
        return address;
    }
}
