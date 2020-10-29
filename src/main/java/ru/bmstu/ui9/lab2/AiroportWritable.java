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

    DoubleWritable arr_delay, getArr_delay_new, canceled, air_time, distance;

    Text fl_date, unique_carrier, carrier, tail_num, cancelation_code;





    @Override
    public void write(DataOutput output){

    }

    @Override
    public void readFields(DataInput input){

    }
}
