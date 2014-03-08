package com.springinaction.springidol.concrete.instruments;

import com.springinaction.springidol.interfaces.Instrument;

public class Piano implements Instrument {

	public Piano() {
	}

	@Override
	public void play() {
		System.out.println("PLINK PLINK PLINK");
	}

}
