package org.tnsif.acc.c2tc.multi_interface;

public interface MusicPlayer {
	default void turnOn() {
		System.out.println("Music player is on!!!");
	}
	void playMusic();
	void pauseMusic();
}
