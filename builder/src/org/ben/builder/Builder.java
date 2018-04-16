package org.ben.builder;

import org.ben.builder.production.Production;

public interface Builder {
	
	public void buildPart1();
	
	public void buildPart2();
	
	public Production build();

}
