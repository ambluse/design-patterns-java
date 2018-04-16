package org.ben.builder.test;

import org.ben.builder.Builder;
import org.ben.builder.Director;
import org.ben.builder.impl.ProductionBuilder;
import org.ben.builder.production.Production;

public class Test {

	public static void main(String[] args) {
		Builder builder = new ProductionBuilder();
		Director director = new Director(builder);
		
		director.construct();
		
		Production product = builder.build();
		
		System.out.println(product.getPart1());
		System.out.println(product.getPart2());
	}
	
}
