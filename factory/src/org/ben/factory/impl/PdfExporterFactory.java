package org.ben.factory.impl;

import org.ben.factory.ExportFactory;
import org.ben.factory.export.ExportFile;
import org.ben.factory.export.impl.PdfExportFile;

public class PdfExporterFactory implements ExportFactory{

	@Override
	public ExportFile createExporter(String type) {
			return new PdfExportFile();
	}

}
