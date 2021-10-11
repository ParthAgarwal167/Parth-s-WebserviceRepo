package com.java8.streams;
import java.util.stream.Stream;

public class Loopdemo 
{
    public static void main(String ar[]) 
    {
        //multplciation of file
        Stream.iterate(1,ankittable->ankittable +1).filter(ankittable->ankittable%5==0).limit(10).forEach(System.out::println);
    }
}