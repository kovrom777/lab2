package ru.bmstu.ui9.lab2;

import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Objects;

public class AirportWritableComparable implements WritableComparable<AirportWritableComparable> {

    int airportId, airportKey;

    public AirportWritableComparable(){
        airportId = 0;
        airportKey = 0;
    }

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
    public void write(DataOutput output) throws IOException {
        output.writeInt(airportKey);
        output.writeInt(airportId);
    }

    @Override
    public void readFields(DataInput input) throws IOException{
        airportKey = input.readInt();
        airportId = input.readInt();
    }

    @Override
    public int compareTo(AirportWritableComparable comp){

        if (this.airportKey > airportKey){
            return 1;
        }else if (this.airportKey != airportKey){
            return -1;
        }

        if (this.airportId > comp.airportId){
            return 1;
        }else if (this.airportId != comp.airportId){
            return -1;
        }
        return 0;
    }

    public int compareAirportId(AirportWritableComparable obj){
        if (this.airportId == obj.airportId) return 1;
        else if (this.airportId != obj.airportId) return -1;
        return 0;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (getClass() != obj.getClass()|| obj == null) return false;
        AirportWritableComparable that = (AirportWritableComparable) obj;
        return airportId == that.airportId && airportKey == airportKey;
    }

    public int hashCode(){
        return Objects.hash(airportKey, airportId);
    }
}
