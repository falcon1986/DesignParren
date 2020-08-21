package com.wwq.dp.abstractFactory;

public class DellFactory extends AbstractPcFactory {

	@Override
	public Disk getDisk() {
		return new WdDisk();
	}

	@Override
	public Ram getRam() {
		return new ADataRam();
	}

}
