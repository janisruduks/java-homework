package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FlightPlanner {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/flights.txt";
    private static final List<String> visitedCities = new ArrayList<>();
    private static HashMap<String, List<String>> citiesAndDestinations = new HashMap<>();

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(Objects.requireNonNull(Histogram.class.getResource(file)).toURI());
        List<String> flightList = Files.readAllLines(path, charset);
        citiesAndDestinations = new HashMap<>(convertFlightList(flightList));

        Scanner keyboard = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("*-*".repeat(20));
            System.out.println("What would you like to do:");
            System.out.println("To display list of the cities press 1");
            System.out.println("To exit program press: q");
            switch (keyboard.next()) {
                case "1" -> routeStart(keyboard);
                case "q" -> exit = true;
            }
        }
    }

    private static void routeStart(Scanner keyboard) {
        while (true) {
            visitedCities.clear();
            System.out.println("To select a city from which you would like to start press 1");
            String option = keyboard.next().toLowerCase();
            if (!option.equals("1")) {
                break;
            } else {
                displayCities();
                System.out.println("Select city by typing city number: ");
                int cityIndex = keyboard.nextInt();
                String chosenCity = getCityName(cityIndex);
                List<String> destinations = displayFlightsFromCity(chosenCity);
                countCities(chosenCity);
                routeOrganizer(keyboard, destinations);
            }
        }
    }

    private static void routeOrganizer(Scanner keyboard, List<String> destinations) {
        while (true) {
            System.out.println("Select next city by typing city number: ");
            int cityIndex = keyboard.nextInt();
            String chosenCity = getCityNameFromDestinations(destinations, cityIndex);
            destinations = displayFlightsFromCity(chosenCity);
            countCities(chosenCity);
            if (visitedCities.get(visitedCities.size() - 1).equals(visitedCities.get(0))) {
                displayTravelRoute();
                break;
            }
        }
    }

    private static String getCityNameFromDestinations(List<String> destinations, int cityIndex) {
        return destinations.get(cityIndex - 1);
    }

    private static void countCities(String city) {
        visitedCities.add(city);
        System.out.println(visitedCities);
    }

    private static String getCityName(int cityIndex) {
        return citiesAndDestinations.keySet().toArray()[cityIndex - 1].toString();
    }

    private static void displayCities() {
        int[] counter = {1};
        citiesAndDestinations.forEach((k, v) -> {
            System.out.println(counter[0] + ". " + k);
            counter[0] += 1;
        });
    }

    private static List<String> displayFlightsFromCity(String city) {
        List<String> flightsFromCity = new ArrayList<>(citiesAndDestinations.get(city));
        int[] counter = {1};
        flightsFromCity.forEach(elem -> {
            System.out.println(counter[0] + ". " + elem);
            counter[0] += 1;
        });
        return flightsFromCity;
    }

    private static void displayTravelRoute() {
        System.out.println("This was your travel route");
        for (int i = 0; i < visitedCities.size(); i++) {
            if (i == visitedCities.size() - 1) {
                System.out.println(visitedCities.get(i));
            } else {
                System.out.print(visitedCities.get(i) + " -> ");
            }
        }
    }

    private static HashMap<String, List<String>> convertFlightList(List<String> flightList) {
        HashMap<String, List<String>> cities = new HashMap<>();
        flightList.forEach(element -> {
            String[] elementSplit = element.split(" -> ");
            cities.computeIfAbsent(elementSplit[0], k -> new ArrayList<>()).add(elementSplit[1]);
        });
        return cities;
    }
}
