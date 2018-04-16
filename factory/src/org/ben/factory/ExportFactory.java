package org.ben.factory;

import org.ben.factory.export.ExportFile;

public interface ExportFactory {

	public ExportFile createExporter(String type);
	
}
