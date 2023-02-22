package com.Actitime.GenericLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.imageio.stream.FileImageInputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//file library is a generic package and generic class which we can write once and use it multiple time in a project 
//generic class has generic method which we can write once and use it multiple time in a project
//generic method for file library is excel and property file 
//.comes to current project 
/// slash comes in the project 
public class FileLibrary {
	 String path="./TestData/Commondata.property";
	public String readDataFromProprtyFile(String key) throws IOException {
		FileInputStream fis=new FileInputStream(path);
		Properties p=new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
			
		}
		public String readDataFromExcelFile(String sheetname,int row, int cell) throws EncryptedDocumentException, IOException{
			FileInputStream fis=new FileInputStream("TestData/TestData.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			String value = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
			return value;
	}

}

	