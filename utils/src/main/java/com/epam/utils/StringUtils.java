package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if(org.apache.commons.lang3.StringUtils.isBlank(str))
            return false;
        return org.apache.commons.lang3.StringUtils.isNumeric(str) && Integer.parseInt(str) > 0 && Integer.parseInt(str) % 2 == 0;
    }
}
