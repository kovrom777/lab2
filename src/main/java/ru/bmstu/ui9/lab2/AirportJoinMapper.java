package ru.bmstu.ui9.lab2;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class AirportJoinMapper extends Mapper<LongWritable, Text, AirportWritableComparable, Text> {
    protected void map(LongWritable key, Text value, Mapper.Context contex){
        String lineNumber = value.toString();
        String[] airraceArray = lineNumber.
    }
}
