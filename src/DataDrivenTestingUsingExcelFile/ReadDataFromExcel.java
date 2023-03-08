package DataDrivenTestingUsingExcelFile;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		//step 1 : convert physical file to java readable object
		FileInputStream fis = new FileInputStream("./Test Resources/Book1.xlsx");
		
		//Step 2:open workbook
		//this throws EncryptedDocumentException and IOException
		//import WorkbookFactory,Workbook,sheet,cell from org.apache.poi.ss.usermodel
		 Workbook wb= WorkbookFactory.create(fis);
		
		//step 3: get control over sheet
		 Sheet sheet=wb.getSheet("Sheet1");
		
		//step4: get control over row
		 Row row = sheet.getRow(1);
		
		//step5: get control over cell
		 Cell cell=row.getCell(1);
		
		//step6: readdata from cell
	     System.out.println(cell.getStringCellValue());
	     
	     
		//using single statement we use method chaining process
		//String data=wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		//System.out.println(data);
		
		
		//step7:close window
		//throws IOException
		 wb.close();
		
				

	}

}
