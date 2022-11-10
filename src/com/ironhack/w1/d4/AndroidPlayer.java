package com.ironhack.w1.d4;

public class AndroidPlayer extends Player implements IPlayable, IShareable{

    public AndroidPlayer(double volume, int currentTrack) {

        super(volume, currentTrack);
    }

    @Override
    public void close() {
        System.out.println("Closing Android Player");
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
        setVolume(getVolume()+0.1);
        if (getVolume()>MAX_VOLUME) setVolume(1);
    }

    @Override
    public void share() {
        System.out.println("Sharing");
    }
}
