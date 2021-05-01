package com.iasminwinx;
import java.nio.file.Path;
import java.util.*;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


       CitiesProcessor cp = new CitiesProcessor();
       ComparatorByState c = new ComparatorByState();
       Set<City> set = cp.buildSetOfCities(Path.of("files/cities_duplicatas.txt"),c);

    }
}
