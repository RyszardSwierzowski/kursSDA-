package com.swierzowski.aspekty.annotation;


import java.lang.annotation.*;
import java.lang.reflect.*;





@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD) //can use in method only.
public @interface Aspectable {

}