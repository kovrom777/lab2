package ru.bmstu.ui9.lab2;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;
import java.util.Iterator;


public class AirportJoinReducer extends Reducer<AirportWritableComparable, Text, Text, Text> {

    @Override
    protected void reduce(AirportWritableComparable key, Iterable<Text> values, Context context) throws IOException, InterruptedException {
        Iterator<Text> iterator = values.iterator();
        Text airport = new Text(iterator.next());
        if (iterator.hasNext()){
            Text airraceDelay = iterator.next();
            int count = 1;
            double delay = Double.parseDouble(String.valueOf(airraceDelay));
            double maxDelay = Double.parseDouble(String.valueOf(airraceDelay));
            double minDelay = Double.parseDouble(String.valueOf(airraceDelay));

            while (iterator.hasNext()){
                airraceDelay = iterator.next();
                double dopNewDelay = Double.parseDouble(String.valueOf(airraceDelay));
                delay += dopNewDelay;
                if (maxDelay < dopNewDelay) {
                    delay = dopNewDelay;
                }
                if (minDelay < dopNewDelay){
                    minDelay = dopNewDelay;
                }
                count++;
            }
            System.out.println("Minimum delay:" + minDelay + " MaximumDelay: " + maxDelay + " Delay: " + delay/count);
            context.write(airport, new Text("Minimum delay:" + minDelay + " MaximumDelay: " + maxDelay + " Delay: " + delay/count));

        }
    }

}
