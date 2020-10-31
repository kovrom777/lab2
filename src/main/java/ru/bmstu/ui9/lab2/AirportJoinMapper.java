package ru.bmstu.ui9.lab2;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class AirportJoinMapper extends Mapper<LongWritable, Text, AirportWritableComparable, Text> {
    protected void map(LongWritable key, Text value, Mapper.Context context) throws IOException, InterruptedException {
        String lineNumber = value.toString();
        String[] airraceArray = lineNumber.split(",");
        if (key.get() > 0){
            String airportName = "";
            for (int i = 0; i< airraceArray.length; i++){
                airportName += airraceArray[i];
            }
            int airraceId = Integer.parseInt(airraceArray[0].replace("\"", ""));
            context.write(new AirportWritableComparable(airraceId, 0),
                    new Text(airportName.replace("\"", "")));
        }
    }
}
