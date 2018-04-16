package org.ben.factory.impl;

import org.ben.factory.ExportFactory;
import org.ben.factory.export.ExportFile;
import org.ben.factory.export.impl.HtmlExportFile;
import org.ben.factory.export.impl.HtmlExportFinancialFile;

public class HtmlExporterFactory implements ExportFactory{

	@Override
	public ExportFile createExporter(String type) {
		if(type.equals("financial")) {
			return new HtmlExportFinancialFile();
		}else {
			return new HtmlExportFile();
		}
	}

}
