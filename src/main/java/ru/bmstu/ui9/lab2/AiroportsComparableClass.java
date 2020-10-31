package ru.bmstu.ui9.lab2;

import org.apache.hadoop.io.WritableComparable;

public class AiroportsComparableClass extends WritableComparable {

    protected AiroportsComparableClass(){
        super(AirportWritableComparable.class, true);
    }

}
