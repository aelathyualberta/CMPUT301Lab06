package com.example.listycity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * This is a class that keeps track of a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();
    /**
     * This adds a city to the list if the city does not exist
     * @param city
     * This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }
    /**
     * This returns a sorted list of cities
     * @return
     * Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * This checks if a the city list has a city
     * @param city
     * Return the city in the list
     * @return
     * If city exists, return true. If not in list, return false.
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * This deletes the city in the city list
     * @param city
     * This is a candidate city to delete
     */
    public void deleteCity(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }

    /**
     * Return the number of cities in the city list
     * @return
     * This is the number of cities.
     */
    public int cityCount() {
        return cities.size();
    }
}