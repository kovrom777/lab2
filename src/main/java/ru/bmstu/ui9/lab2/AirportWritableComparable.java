package ru.bmstu.ui9.lab2;

import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;

public class AirportWritableComparable implements WritableComparable {

    int airportId, airportKey;


    public AirportWritableComparable(int airportId, int airportKey){
        this.airportId = airportId;
        this.airportKey = airportKey;
    }

    public int getAirportId() {
        return airportId;
    }

    public int getAirportKey() {
        return airportKey;
    }

    

    @Override
    public void write(DataOutput output){

    }

    @Override
    public void readFields(DataInput input){

    }

    @Override
    public void compareTo(AirportWritableComparable comp){

    }

}
