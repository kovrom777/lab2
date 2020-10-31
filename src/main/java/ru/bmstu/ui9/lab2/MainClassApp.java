package ru.bmstu.ui9.lab2;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.MultipleInputs;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class MainClassApp {

    public static void main(String[] args) throws Exception {
        if (args.length < 3) {
            System.err.println("Usage: WordCountApp <Airoports> <Airrace> <output path>");
            System.exit(-1);
        }
        Job job = Job.getInstance();
        job.setJarByClass(MainClassApp.class);
        job.setJobName("Sort Job");
        MultipleInputs.addInputPath(job, new Path(args[0]), TextInputFormat.class, AirraceJoinMapper.class);
        MultipleInputs.addInputPath(job, new Path(args[1]), TextInputFormat.class, AirportJoinMapper.class);
        FileOutputFormat.setOutputPath(job, new Path(args[2]));

        job.setMapperClass(AirportJoinMapper.class);
        job.setPartitionerClass(AirportJoinPartioner.class);
        job.setMapOutputKeyClass(AirportWritableComparable.class);
        job.setReducerClass(AirportJoinReducer.class);
        job.setGroupingComparatorClass(AiroportsComparableClass.class);


        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(Text.class);
        job.setNumReduceTasks(2);
        System.exit(job.waitForCompletion(true) ? 0 : 1);
    }
}

