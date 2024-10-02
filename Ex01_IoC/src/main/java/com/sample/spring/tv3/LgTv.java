package com.sample.spring.tv3;

public class LgTv implements Tv {
	public LgTv() {
		System.out.println("===>LgTV");
	}

	@Override
	public void turnOn() {
		System.out.println("LgTv 전원켠다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("LgTv 전원끈다");
		
	}

	@Override
	public void soundUp() {
		System.out.println("LgTv 소리켠다");
		
	}

	@Override
	public void soundDown() {
		System.out.println("LgTv 소리끈다");
		
	}
}
