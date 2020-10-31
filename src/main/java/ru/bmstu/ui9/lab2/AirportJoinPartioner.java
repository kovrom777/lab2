package ru.bmstu.ui9.lab2;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;

public class AirportJoinPartioner extends Partitioner<AirportWritableComparable, Text> {

    @Override
    public int getPartition(AirportWritableComparable key, Text text, int numReduce){
        return (key.getAirportId() & Integer.MAX_VALUE) % numReduce;
    }
}
