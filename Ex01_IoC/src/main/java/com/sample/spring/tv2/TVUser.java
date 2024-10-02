package com.sample.spring.tv2;

public class TVUser {
	public static void main(String[] args) {
		Tv tv = new SamsungTv();
		tv.turnOn();
		tv.turnOff();
		tv.soundUp();
		tv.soundDown();
	}
}
