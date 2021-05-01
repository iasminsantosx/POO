package com.iasminwinx;

import java.util.Comparator;

public class ComparatorByState implements Comparator<City> {

    @Override
    public int compare(City o1, City o2) {
        return o1.getEstado().compareTo(o2.getEstado());
    }
}
