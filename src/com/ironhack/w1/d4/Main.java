package com.ironhack.w1.d4;

public class Main {

    public static void main(String[] args) {
        WebPlayer webPlayer = new WebPlayer(0.9, 2);
        System.out.println(webPlayer.getVolume());
        System.out.println(webPlayer.getCurrentTrack());
    }
}
