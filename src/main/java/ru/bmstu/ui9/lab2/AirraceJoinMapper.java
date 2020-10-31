package ru.bmstu.ui9.lab2;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class AirraceJoinMapper extends Mapper<LongWritable, Text, AiroportsComparableClass, Text> {

    protected void map (LongWritable key, Text value, Mapper.Context context){
        String lineNumber = value.toString();
        String[] flyInfoArray = lineNumber.split(",");

        if (key.get() > 0){
            if (flyInfoArray[14].equals("") && !flyInfoArray[17].equals("")){
                int airportId = Integer.parseInt(flyInfoArray[14]);
                double delayTime = Double.parseDouble(flyInfoArray[17]);

            }
        }

    }

}
