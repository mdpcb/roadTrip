Road Trip

## Background

You are planning a long road trip and want to determine the best places to stop for gas. You have a list of gas stations along your route, each with several attributes: price per gallon, address, bathroom quality, snack quality, and distance from your current location. The vehicle also has a limited fuel range, which is determined by the remaining fuel and the average miles per gallon (MPG) of the vehicle. Your goal is to write methods that help determine the best places to stop based on **price**, **bathroom quality**, **snack quality**, **distance**, and **desirability**.

## Instructions

1. Ensure you have all of the following Java classes in your project:
    - `GasStation.java` (Contains the attributes and methods for gas station data)
    - `RoadTrip.java` (Contains methods for calculating and filtering stations)
    - `TestRunner.java` (A test class to test your solution)

## File References

- **`GasStation.java`**: Contains the `GasStation` class to represent each gas station's attributes.
- **`RoadTrip.java`**: Contains the `RoadTrip` class where you will implement the methods for desirability and filtering/sorting stations.
- **`TestRunner.java`**: Contains the test class to help you verify your solution.
- **`gas_station_data.csv`**: Sample gas station data with attributes for price, bathroom quality, snack quality, and distance.

## Helpful Notes

- Be sure to test the methods with different gas station data to ensure your code works for all cases.
- Ensure that your `calculateDesirability` method returns a value between 0 and 100. 

## Part (a): Calculate Desirability of a Single Gas Station

### Task:
Implement the `calculateDesirability` method in the `RoadTrip.java` file. This method will calculate a desirability score for a given gas station based on the following factors:
- **Bathroom Quality**: Rating from 1 to 5, where 1 is poor and 5 is excellent. This factor contributes **0.2** to the desirability score.
- **Snack Quality**: Rating from 1 to 5, where 1 is poor and 5 is excellent. This factor contributes **0.2** to the desirability score.
- **Price per Gallon**: The price per gallon of gas. This factor contributes **-0.4** to the desirability score (higher prices are less desirable).
- **Distance**: The distance from the current location to the gas station. This factor contributes **-0.2** to the desirability score (greater distances make a station less desirable).

### Formula for Desirability:
The formula to calculate the desirability score is:
```Desirability = (Bathroom Quality * 0.2) + (Snack Quality * 0.2) - (Price per Gallon * 0.4) - (Distance * 0.2)```

### Requirements:
1. Implement the `calculateDesirability` method to compute the desirability score for a given gas station.
2. The desirability score should be **scaled to a value between 0 and 100**. 
3. The final desirability score should be rounded to two decimal places.
4. The method should return the desirability score as a **double**.

### Expected Output:
For a gas station with the following data:
- Bathroom Quality: 4
- Snack Quality: 3
- Price per Gallon: 3.69
- Distance: 10 miles

The desirability score would be calculated and returned.

---

## Part (b): Filter and Sort Gas Stations Based on Desirability

### Task:
Implement the `filterAndSortStations` method in the `RoadTrip.java` file. This method should filter and sort the list of gas stations based on the following criteria:
1. **Distance**: Only include gas stations within the vehicle's range, which is calculated as:
```maxRange = remainingFuel * averageMPG```
where `remainingFuel` is the amount of fuel remaining in gallons and `averageMPG` is the vehicle's average miles per gallon.

2. **Desirability**: Only include gas stations with a desirability score greater than or equal to the specified minimum desirability score.

3. **Sorting**: The gas stations should be sorted in **descending order of desirability**.

### Requirements:
1. Use the `calculateDesirability` method to compute the desirability score for each gas station.
2. Filter out gas stations that are either:
- Beyond the vehicle’s maximum range (calculated using `remainingFuel` and `averageMPG`).
- Below the minimum desirability score.
3. Sort the remaining gas stations by desirability, with the most desirable station at the top of the list.
4. The method should return an `ArrayList<GasStation>` of the filtered and sorted gas stations.

### Input Parameters:
- `remainingFuel`: The amount of fuel left in the vehicle, in gallons.
- `minDesirability`: The minimum desirability score that a gas station must have to be included in the list.

### Expected Output:
The method should return a list of gas stations that are within the car’s range and meet the minimum desirability requirement. The stations should be sorted in descending order of desirability.

Example:
For a car with `remainingFuel = 5` gallons, `averageMPG = 25`, and a `minDesirability = 50`, only the stations that fall within the maximum range (which is `remainingFuel * averageMPG = 125 miles`) and have a desirability score of 50 or greater should be included.



