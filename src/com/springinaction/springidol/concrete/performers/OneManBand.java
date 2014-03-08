package com.springinaction.springidol.concrete.performers;

import java.util.List;
import com.springinaction.springidol.exceptions.PerformanceException;
import com.springinaction.springidol.interfaces.Instrument;
import com.springinaction.springidol.interfaces.Performer;

public class OneManBand implements Performer {

	private List<Instrument> instruments;

	public void setInstruments(List<Instrument> instruments) {
		this.instruments = instruments;
	}

	@Override
	public void perform() throws PerformanceException {
		for (Instrument instrument : instruments)
			instrument.play();
	}

}
