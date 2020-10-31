package ru.bmstu.ui9.lab2;

import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

public class AiroportsComparableClass extends WritableComparator {

    protected AiroportsComparableClass(){}
//        super(AirportWritableComparable.class, true);

        @Override
        public int compare(WritableComparable first, WritableComparable second){
            AirportWritableComparable firstPair = 
        }
    }



}
