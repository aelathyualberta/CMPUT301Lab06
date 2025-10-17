package com.example.listycity;
/**
 * This is a class that defines a City.
 */
public class City implements Comparable<City>{
    private String city;
    private String province;
    City(String city, String province){
        this.city = city;
        this.province = province;
    }
    String getCityName(){
        return this.city;
    }
    String getProvinceName(){
        return this.province;
    }
    @Override
    public int compareTo(City o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName()); // this.city refers to the city name
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        City testCity = (City) o;
        return city.equals(testCity.city) && province.equals(testCity.province);
    }

    @Override
    public int hashCode() {
        int result = city.hashCode();
        result *= 31;
        result += province.hashCode();
        return result;
    }
 }
