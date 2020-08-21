package com.wwq.dp.abstractFactory;

public class LenovoFactory extends AbstractPcFactory {

	@Override
	public Disk getDisk() {
		return new SamsungDisk();
	}

	@Override
	public Ram getRam() {
		return new KingstonRam();
	}

}
