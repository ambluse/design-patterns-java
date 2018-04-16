package org.ben.factory.export.impl;

import org.ben.factory.export.ExportFile;

public class HtmlExportFinancialFile implements ExportFile{

	@Override
	public boolean export(String data) {

		System.out.println("导出html财务类型文件");

		return false;
	}

}
