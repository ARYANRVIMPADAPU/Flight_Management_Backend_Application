package com.example.flight.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.stereotype.Service;


public class FlightDTO {
    private long id;
    private int flightNo;
    private String carrierName;
    private String flightModel;
    //private int seatCapacity;

    public FlightDTO(){

    }

    public FlightDTO(long id, int flightNo, String carrierName, String flightModel, int seatCapacity) {
        this.id = id;
        this.flightNo = flightNo;
        this.carrierName = carrierName;
        this.flightModel = flightModel;
        //this.seatCapacity = seatCapacity;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(int flightNo) {
        this.flightNo = flightNo;
    }

    public String getCarrierName() {
        return carrierName;
    }

    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    public String getFlightModel() {
        return flightModel;
    }

    public void setFlightModel(String flightModel) {
        this.flightModel = flightModel;
    }

//    public int getSeatCapacity() {
//        return seatCapacity;
//    }
//
//    public void setSeatCapacity(int seatCapacity) {
//        this.seatCapacity = seatCapacity;
//    }
}
