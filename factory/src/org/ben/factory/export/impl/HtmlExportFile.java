package org.ben.factory.export.impl;

import org.ben.factory.export.ExportFile;

public class HtmlExportFile implements ExportFile{

	@Override
	public boolean export(String data) {

		System.out.println("导出html文件");

		return false;
	}

}
