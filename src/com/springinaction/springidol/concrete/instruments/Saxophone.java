package com.springinaction.springidol.concrete.instruments;

import com.springinaction.springidol.interfaces.Instrument;

public class Saxophone implements Instrument {

	public Saxophone() {
	}

	@Override
	public void play() {
		System.out.println("TOOT TOOT TOOT");
	}

}
