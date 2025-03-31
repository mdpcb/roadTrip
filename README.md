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
**Bathroom Quality**:  
   - Bathroom quality is rated on a scale from 1 to 5. The higher the number, the better the bathroom. The bathroom quality contributes 2 points per rating (e.g., if the bathroom quality is 4, it contributes 8 points).

**Snack Quality**:  
   - Snack quality is rated on a scale from 1 to 5. The higher the number, the better the snacks. The snack quality contributes 2 points per rating.

**Price Per Gallon**:  
   - The price per gallon of gas is factored in such that cheaper gas is better. The price factor is calculated as `(Minimum Price per Gallon) / (Price per Gallon)` and is multiplied by 40. This means a lower price per gallon results in a higher desirability score.

**Distance**:  
   - Distance is calculated based on how far the gas station is from your current location. If the distance to the gas station exceeds the vehicle’s range (calculated as `remaining fuel * average mpg`), the desirability score is adjusted to `-1` (indicating the station is out of range).  
   - If the gas station is within range, the desirability score is reduced by a penalty based on distance. The formula for the penalty is `(Distance / (average MPG * remaining fuel)) * 40`.


### Formula for Desirability:
The formula to calculate the desirability score is:
```Desirability = (Bathroom Quality * 2) + (Snack Quality * 2) + ((Minimum Price per Gallon) / (Price per Gallon) * 40) - (Distance / (average MPG * remaining fuel)) * 40```


### Requirements:
1. Implement the `calculateDesirability` method to compute the desirability score for a given gas station.
2. The desirability score should be **scaled to a value between 0 and 100**. 
3. The final desirability score should be rounded to two decimal places.
4. The method should return the desirability score as a **double**.

### Expected Output:
For a gas station with the following data:
- Price per Gallon: $3.31
- Bathroom Quality: 3
- Snack Quality: 4
- Distance: 10 miles
- Remaining Fuel: 5 gallons
- Average MPG: 25 miles/gallon
- Minimum Price per Gallon: $2.50
  
The desirability score would be calculated and returned.
The final desirability score for this gas station would be 40.92. If the distance had been greater than the vehicle's remaining range (e.g., if the distance was 200 miles and the vehicle's range was 125 miles), the desirability would be -1, indicating that the gas station is out of range.
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
Let's assume the minimum desirability threshold for Part B is set to 10. Based on this:

- Gas Station C: Desirability = 37.17 
- Gas Station A: Desirability = 35.16 
- Gas Station B: Desirability = 27.03 
- Gas Station D: Desirability = -1 

Final Result for Part B:
After sorting and filtering, the remaining gas stations are:
```Test C, Test A, Test B```

These are the gas stations that are within range and meet the minimum desirability threshold.



