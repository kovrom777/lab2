package ru.bmstu.ui9.lab2;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.util.Iterator;


public class AirportJoinReducer extends Reducer<AirportWritableComparable, Text, Text, Text> {

    @Override
    protected void reduce(AirportWritableComparable key, Iterable<Text> values, Context contex){
        Iterator<Text> iterator = values.iterator();
        Text airport = new Text(iterator.next());
        if (iterator.hasNext()){
            
        }
    }

}
