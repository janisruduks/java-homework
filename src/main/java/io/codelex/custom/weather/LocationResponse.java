package io.codelex.custom.weather;

public class LocationResponse {
    private String city;
    private String lat;
    private String lon;

    public LocationResponse(String location, String latitude, String longitude) {
        this.city = location;
        this.lat = latitude;
        this.lon = longitude;
    }

    public LocationResponse() {}

    public String getCity() {
        return city;
    }

    public String getLat() {
        return lat;
    }

    public String getLon() {
        return lon;
    }
}
