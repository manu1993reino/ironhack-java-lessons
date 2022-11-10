package com.ironhack.w1.d4;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

    public static void main(String[] args) {
//        WebPlayer webPlayer = new WebPlayer(0.9, 2);
//        System.out.println(webPlayer.getVolume());
//        System.out.println(webPlayer.getCurrentTrack());

        System.out.println(1.2-1.0);

        BigDecimal bd1 = new BigDecimal("1.2985214585");
        BigDecimal bd2 = new BigDecimal("1.0342635485");

        System.out.println(bd1.add(bd2));
        System.out.println(bd1.subtract(bd2));
        System.out.println(bd1.multiply(bd2));
        System.out.println(bd1.divide(bd2, RoundingMode.HALF_EVEN));
        System.out.println(bd1.setScale(2, RoundingMode.HALF_EVEN));
        System.out.println(bd1.compareTo(bd2));

        System.out.println("Que pasa big decimal");

    }
}
