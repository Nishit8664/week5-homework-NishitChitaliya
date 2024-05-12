package week5_programme;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 10. Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */
public class Programme10 {
    public static void main(String[] args) {
        linePassesThroughParticularStation();       //Calling method
    }

    public static void linePassesThroughParticularStation() {
        Scanner scanner = new Scanner(System.in);

        //Creating hashmap
        Map<String, String> zone1StationsList = new HashMap<>();
        zone1StationsList.put("Aldgate", "Circle,Metropolitan");                //Adding values
        zone1StationsList.put("Aldgate East", "District,Hammersmith & City");
        zone1StationsList.put("Angel", "Northern");
        zone1StationsList.put("Baker Street", "Bakerloo, Circle, Jubilee, Hammersmith & City,Metropolitan");
        zone1StationsList.put("Kennington", "Circle, Jubilee, Northern, Waterloo & City");
        zone1StationsList.put("Bank", "Bakerloo, Central, Victoria");
        zone1StationsList.put("Waterloo", "Victoria, Hammersmith & City, Metropolitan, Northern, Piccadilly, Victoria");
        zone1StationsList.put("Bond Street", "Central, Circle, District, Hammersmith & City");
        System.out.println("Enter station name:");
        String stationName = scanner.nextLine();

        //If else to check if provided station is within zone 1 or not and print lines accordingly
        if (zone1StationsList.containsKey(stationName)) {
            String lines = zone1StationsList.get(stationName);
            System.out.println("The following lines pass through " + stationName + ": " + lines);
        } else {
            System.out.println(stationName + " is not a Zone 1 station.");

        }
        scanner.close();
    }
}
