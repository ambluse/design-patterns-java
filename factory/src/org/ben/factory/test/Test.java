package org.ben.factory.test;

import org.ben.factory.ExportFactory;
import org.ben.factory.export.ExportFile;
import org.ben.factory.impl.PdfExporterFactory;

public class Test {
	
	public static void main(String[] args) {
		ExportFactory factory = new PdfExporterFactory();
		ExportFile exporter = factory.createExporter("");
		exporter.export("123");
	}
}
