package ru.bmstu.ui9.lab2;

import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class AiroportWritable implements Writable {


    //variables

    IntWritable year, quarter, month, day_of_month, day_of_week, airline_ID, fl_num, origin_airport_id, origin_airport_seq_id, origin_city_market_id,
    dest_airport_id, wheels_on, arr_time;

    DoubleWritable arr_delay, arr_delay_new, canceled, air_time, distance;

    Text fl_date, unique_carrier, carrier, tail_num, cancelation_code;



    //Init

    public AiroportWritable(IntWritable year, IntWritable quarter, IntWritable month, IntWritable day_of_month, IntWritable day_of_week, IntWritable airline_id,
                            IntWritable fl_num, IntWritable origin_airport_id, IntWritable origin_airport_seq_id, IntWritable origin_city_market_id, IntWritable dest_airport_id,
                            IntWritable wheels_on, IntWritable arr_time, DoubleWritable arr_delay, DoubleWritable arr_delay_new, DoubleWritable canceled, DoubleWritable air_time,
                            DoubleWritable distance, Text fl_date, Text unique_carrier, Text carrier, Text tail_num, Text cancelation_code){

        this.year = year;
        this.quarter = quarter;
        this.month = month;
        this.day_of_month = day_of_month;
        this.day_of_week = day_of_week;
        this.airline_ID = airline_id;
        this.fl_num = fl_num;
        this.origin_airport_id = origin_airport_id;
        this.origin_airport_seq_id = origin_airport_seq_id;
        this.origin_city_market_id = origin_city_market_id;
        this.dest_airport_id = dest_airport_id;
        this.wheels_on = wheels_on;
        this.arr_time = arr_time;

        this.arr_delay = arr_delay;
        this.arr_delay_new = arr_delay_new;
        this.canceled = canceled;
        this.air_time = air_time;
        this.distance = distance;

        this.fl_date = fl_date;
        this.unique_carrier = unique_carrier;
        this.carrier = carrier;
        this.tail_num = tail_num;
        this.cancelation_code = cancelation_code;
    }
    
    @Override
    public void write(DataOutput output) throws IOException {

        year.write(output);
        quarter.write(output);
        month.write(output);
        day_of_month.write(output);
        day_of_week.write(output);
        airline_ID.write(output);
        fl_num.write(output);
        origin_airport_id.write(output);
        origin_airport_seq_id.write(output);
        origin_city_market_id.write(output);
        dest_airport_id.write(output);
        wheels_on.write(output);
        arr_time.write(output);

        arr_delay.write(output);
        arr_delay_new.write(output);
        canceled.write(output);
        air_time.write(output);
        distance.write(output);

        fl_date.write(output);
        unique_carrier.write(output);
        carrier.write(output);
        tail_num.write(output);
        cancelation_code.write(output);
    }

    @Override
    public void readFields(DataInput input) throws IOException{
        year.readFields(input);
        quarter.readFields(input);
        month.readFields(input);
        day_of_month.readFields(input);
        day_of_week.readFields(input);
        airline_ID.readFields(input);
        fl_num.readFields(input);
        origin_airport_id.readFields(input);
        origin_airport_seq_id.readFields(input);
        origin_city_market_id.readFields(input);
        dest_airport_id.readFields(input);
        wheels_on.readFields(input);
        arr_time.readFields(input);

        arr_delay.readFields(input);
        arr_delay_new.readFields(input);
        canceled.readFields(input);
        air_time.readFields(input);
        distance.readFields(input);

        fl_date.readFields(input);
        unique_carrier.readFields(input);
        carrier.readFields(input);
        tail_num.readFields(input);
        cancelation_code.readFields(input);
    }
}
