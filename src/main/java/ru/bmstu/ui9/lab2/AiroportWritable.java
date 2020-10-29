package ru.bmstu.ui9.lab2;

import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;

import java.io.DataInput;
import java.io.DataOutput;

public class AiroportWritable implements Writable {


    IntWritable year, quarter, month, day_of_month, day_of_week, airline_ID, fl_num, origin_airport_id, origin_airport_seq_id, origin_city_market_id,
    dest_airport_id, wheels_on, arr_time;

    DoubleWritable arr_delay, arr_delay_new, canceled, air_time, distance;

    Text fl_date, unique_carrier, carrier, tail_num, cancelation_code;



    public AiroportWritable(IntWritable year, IntWritable quarter, IntWritable month,
                            IntWritable day_of_month, IntWritable day_of_week, IntWritable airline_id,
                            IntWritable fl_num, IntWritable origin_airport_id, IntWritable origin_airport_seq_id,
                            IntWritable origin_city_market_id, IntWritable dest_airport_id, IntWritable wheels_on,
                            IntWritable arr_time, DoubleWritable arr_delay, DoubleWritable arr_delay_new, DoubleWritable canceled,
                            DoubleWritable air_time, DoubleWritable distance, Text fl_date, Text unique_carrier, Text carrier,
                            Text tail_num, Text cancelation_code){
        
    }

    @Override
    public void write(DataOutput output){

    }

    @Override
    public void readFields(DataInput input){

    }
}
