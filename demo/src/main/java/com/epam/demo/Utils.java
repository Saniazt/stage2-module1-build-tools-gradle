package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        return args.stream().mapToInt(Integer::parseInt).filter(x->x<0).findAny().isPresent();
    }
}