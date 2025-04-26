package utilities;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		XSSFWorkbook wbook=new XSSFWorkbook("./data/Testdata.xlsx");
		XSSFSheet sheet=wbook.getSheetAt(0);
		
		int rowCount = sheet.getLastRowNum();
		int colCount=sheet.getRow(0).getLastCellNum();
		
//		for(int i=1;i<rowCount;i++) {
//			
//			for(int j=0;j<colCount;j++) {
//				XSSFRow row=sheet.getRow(i);
//				
//			
//				if(Integer.valueOf(row.getCell(2).getStringCellValue())>10000) {
//					String data=sheet.getRow(i).getCell(j).getStringCellValue();
//					System.out.println(data + "");
//					
//					
//					
//				}
//				i++;
//				
//				
//			}
//			
//			
//		}
		//System.out.println();
		
		
		for(int i=1;i<=rowCount;i++) {
			XSSFRow row=sheet.getRow(i);
			
			Cell cell=row.getCell(2);
			
			if(Integer.valueOf(cell.getStringCellValue())>10000){

				
				for(int j=0;j<=cell.getRow().getLastCellNum()-1;j++) {
					
                    System.out.print(cell.getRow().getCell(j) +" "+" ");
                    
                }
				
				
			}
			System.out.println("");
			
			
		}
		
		
		
		
		

	}

}
