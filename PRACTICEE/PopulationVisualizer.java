package PRACTICEE;

import java.util.*;

    public class PopulationVisualizer {
        public static void main(String[] args) {
            Map<String, Integer> populationData = new HashMap<>();
            populationData.put("India", 1400000000);
            populationData.put("USA", 331000000);
            populationData.put("China", 1440000000);
            populationData.put("Brazil", 213000000);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Available Countries: " + populationData.keySet());
            System.out.print("Enter a country name to view population: ");
            String country = scanner.nextLine();

            if (populationData.containsKey(country)) {
                System.out.println("Population of " + country + ": " + populationData.get(country));
            } else {
                System.out.println("Country not found in the dataset.");
            }
            scanner.close();
        }
    }


