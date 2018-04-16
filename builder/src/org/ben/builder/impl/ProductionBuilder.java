package org.ben.builder.impl;

import org.ben.builder.Builder;
import org.ben.builder.production.Production;

public class ProductionBuilder implements Builder{
	
	private Production production = new Production();

	@Override
	public void buildPart1() {
		production.setPart1("零件1");
	}

	@Override
	public void buildPart2() {
		production.setPart2("零件2");
	}

	@Override
	public Production build() {
		return production;
	}

}
