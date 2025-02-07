package com.example.flight.pojo;


public class AirportDTO {
    private long id;
    private String code;
    private String name;
    private String city;
    private String country;
//    private double latitude;
//    private double longitude;

    public AirportDTO() {
    }

    public AirportDTO(long id, String code, String name, String city, String country, double latitude, double longitude) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.city = city;
        this.country = country;
//        this.latitude = latitude;
//        this.longitude = longitude;
    }

    // Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

//    public double getLatitude() {
//        return latitude;
//    }
//
//    public void setLatitude(double latitude) {
//        this.latitude = latitude;
//    }
//
//    public double getLongitude() {
//        return longitude;
//    }
//
//    public void setLongitude(double longitude) {
//        this.longitude = longitude;
//    }


}

