package com.ironhack.w1.d4;

public interface IPlayable {
    public void play();
    public void mute();
    public void pause();
    public void increaseVolume();
    final double MAX_VOLUME =1;
}
