package com.shandilya.populate.flipkart.conversioncommon;

import org.springframework.core.convert.TypeDescriptor;

import java.util.Collection;
import java.util.List;

public interface PopulateConversionService {

    boolean canConvert(Class<?> sourceClass, Class<?> targetClass);
    boolean canConvert(TypeDescriptor sourceType, TypeDescriptor targetType);
    <T> T convert(Object source, Class<T> targetClass);
    <T> List<T> convert(Collection source, Class<T> targetClass);
    <T> List<T> convert(Object[] source, Class<T> targetClass);
    Object convert(Object source, TypeDescriptor sourceType, TypeDescriptor targetType);
    List<Object> convert(Collection source, TypeDescriptor sourceType, TypeDescriptor targetType);
    List<Object> convert(Object[] source, TypeDescriptor sourceType, TypeDescriptor targetType);
}