package com.scale.assignment.utils;

public class StringUtils {

    public String concat(String[] args) {
        StringBuilder result = new StringBuilder();
        for (String arg : args) {
            result.append(" ").append(arg);
        }
        return result.toString();
    }

}
