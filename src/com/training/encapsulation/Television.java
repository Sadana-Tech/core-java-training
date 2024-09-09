package com.training.encapsulation;

public class Television {
	private double width;
	private double height;
	private double screensize;
	private int maxVolume;
	int volume;
	private boolean power;

	public Television(double width, double height, double screenSize) {
		this.width = width;
		this.height = height;
		this.screensize = screenSize;
	}

	public double channelTuning(int channel) {
		switch (channel) {
		case 1:
			return 34.56;
		case 2:
			return 54.89;
		case 3:
			return 73.89;
		case 4:
			return 94.98;
		}
		return 0;
	}

	public int decreaseVolume() {
		if (0 < volume)
			volume--;
		System.out.println("Decrese volume");
		return volume;
	}

	public void powerSwitch() {
		System.out.println("powerSwitch");
		this.power = !power;
	}

	public int increaseVolume() {
		if (maxVolume > volume)
			volume++;
		System.out.println("increase volume");
		return volume;
	}
}
