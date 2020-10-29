package ru.bmstu.ui9.lab2;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class AiroportIdWritable implements Writable  {

    Text description;

    public AiroportIdWritable(Text description){
        this.description = description;
    }

    public Text getDescription() {
        return description;
    }



    @Override
    public void write(DataOutput output) throws IOException {
        description.write(output);
    }

    @Override
    public void readFields(DataInput input) throws IOException{
        description.readFields(input);
    }
}
