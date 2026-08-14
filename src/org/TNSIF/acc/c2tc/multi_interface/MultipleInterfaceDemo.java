package org.tnsif.acc.c2tc.multi_interface;

class Phone implements Camera,MusicPlayer{
	@Override
	public void turnOn() {
		System.out.println("Device is turned ON");
	}
	@Override
	public void clickPicture() {
		turnOn(); // Camera turn on
		System.out.println("Photo Captured!");
	}
	@Override
	public void playMusic() {
		turnOn(); // Music Player turn on
		System.out.println("Music is playing!!!");
	}
	@Override
	public void pauseMusic() {
		System.out.println("Music is paused!!!");
	}
}

public class MultipleInterfaceDemo {
	public static void main(String[] args) {
		Phone __ = new Phone();
		__.turnOn();
		__.clickPicture();
		__.playMusic();
		__.pauseMusic();
		
	}
}
