package com.training.encapsulation;

public class DemoTelevison {

	public static void main(String args[]) {

		Television t = new Television(11.5, 7, 9);
		t.powerSwitch();
		t.channelTuning(2);
		t.decreaseVolume();
		t.increaseVolume();
	    t.volume = 15;
	}

}
