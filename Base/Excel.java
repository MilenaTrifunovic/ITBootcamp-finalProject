package Base;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	
	
File file;
	
    FileInputStream fis;
    XSSFWorkbook wb;
    XSSFSheet sheet;
    XSSFRow row;
    XSSFCell cell;
    
	public Excel(String filePath) throws Exception {
		
		this.file = new File (filePath);
		this.fis = new FileInputStream (file);
		this.wb = new XSSFWorkbook (fis);
	}

   public String getStringValue (String sheetName, int rowNumb, int cellNumb) {
	   
	   this.sheet=wb.getSheet(sheetName);
	   this.row=sheet.getRow(rowNumb);
	   this.cell=row.getCell(cellNumb);
	   return this.cell.getStringCellValue();
	   
	   
	   
   }

public int getIntValue (String sheetName, int rowNumb, int cellNumb) {
	
	this.sheet=wb.getSheet(sheetName);
	this.row=sheet.getRow(rowNumb);
	this.cell=row.getCell(cellNumb);
	return (int)this.cell.getNumericCellValue();
	
	
}


public int getLastRowNumb() {
	
	
	
	return this.sheet.getLastRowNum();
}





}
