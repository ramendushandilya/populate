package com.shandilya.populate.flipkart.conversioncommon;

import org.springframework.core.convert.converter.Converter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class ListConverter<S, T> implements Converter<S, T> {

    public List<T> convert(List<S> sourceList) {
        if(sourceList == null) {
            return null;
        }
        List<T> targetList = new ArrayList<T>(sourceList.size());
        for (S source : sourceList) {
            targetList.add(convert(source));
        }
        return targetList;
    }

    public Collection<T> convert(Collection<S> sourceCollection) {
        if(sourceCollection == null) {
            return null;
        }
        List<T> targetList = new ArrayList<T>(sourceCollection.size());
        for(S souceItem : sourceCollection) {
            targetList.add(convert(souceItem));
        }
        return targetList;
    }
}