package com.ironhack.w1.d4;

public class WebPlayer extends Player implements IPlayable{

    public WebPlayer(double volume, int currentTrack) {
        super(volume, currentTrack);
    }

    @Override
    public void close(){
        System.out.println("Closing WebPlayer Player");
    }

    @Override
    public void play() {

    }

    @Override
    public void mute() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void increaseVolume() {

    }
}
