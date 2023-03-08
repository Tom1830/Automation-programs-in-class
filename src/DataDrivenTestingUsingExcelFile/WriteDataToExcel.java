package DataDrivenTestingUsingExcelFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataToExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		 FileInputStream fis = new FileInputStream("./Test Resources/Book1.xlsx");
		 Workbook wb= WorkbookFactory.create(fis);
		 Sheet sh = wb.getSheet("Sheet1");
		 Row r=sh.getRow(4);
		 //Row r= sh.createRow(4);
		 //Cell c=r.createCell(0);
		 Cell c=r.createCell(1);
		 c.setCellValue("chrome");
		 //c.setCellValue("browser");

		 FileOutputStream fos=new FileOutputStream("./Test Resources/Book1.xlsx");
		 wb.write(fos);
		 wb.close();
		 
		 
	}
	

}
