package com.shandilya.populate.flipkart.conversioncommon.impl;

import com.shandilya.populate.flipkart.conversioncommon.PopulateConversionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PopulateConversionServiceImpl implements PopulateConversionService{

    @Autowired
    private ConversionService conversionService;

    @Override
    public boolean canConvert(Class<?> sourceClass, Class<?> targetClass) {
        return conversionService.canConvert(sourceClass, targetClass);
    }

    @Override
    public boolean canConvert(TypeDescriptor sourceType, TypeDescriptor targetType) {
        return conversionService.canConvert(sourceType, targetType);
    }

    @Override
    public <T> T convert(Object source, Class<T> targetClass) {
        return conversionService.convert(source, targetClass);
    }

    @Override
    public <T> List<T> convert(Collection source, Class<T> targetClass) {
        if (source == null) {
            return Collections.emptyList();
        }
        List<T> result = new ArrayList<T>(source.size());

        for (Object object : source) {
            T obj = conversionService.convert(object, targetClass);
            if (obj != null) {
                result.add(obj);
            }
        }

        return result;
    }

    @Override
    public <T> List<T> convert(Object[] source, Class<T> targetClass) {
        return convert(Arrays.asList(source), targetClass);
    }

    @Override
    public Object convert(Object source, TypeDescriptor sourceType, TypeDescriptor targetType) {
        return conversionService.convert(source, sourceType, targetType);
    }

    @Override
    public List<Object> convert(Collection source, TypeDescriptor sourceType, TypeDescriptor targetType) {
        List<Object> result = new ArrayList<Object>();

        for (Object object : source) {
            result.add(conversionService.convert(object, sourceType, targetType));
        }

        return result;
    }

    @Override
    public List<Object> convert(Object[] source, TypeDescriptor sourceType, TypeDescriptor targetType) {
        return convert(Arrays.asList(source), sourceType, targetType);
    }
}
