package com.epam.demo;

import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.stream.Collectors;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        int isAll = 0;
        for (String s : args) {
            if(StringUtils.isBlank(s) || !org.apache.commons.lang3.StringUtils.isNumeric(s)) {
                return false;
            }
        }
        try {
            List<Integer> integerArgs = args.stream().map(Integer::parseInt).collect(Collectors.toList());
            for (int i : integerArgs) {
                if (i < 0) {
                    isAll += 1;
                }
            }
            return isAll == 0;
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Given String is incompatible with Integer");
        }
    }
}
