package Excel;

import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LoginData {
	public static String [][] readExcel(int sheet)  {
		String[][] testData = null;
		try
		{
		
		String filePath = System.getProperty("user.dir") +"\\src\\test\\resources\\Login_TestData.xlsx";
		FileInputStream file = new FileInputStream(filePath);
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet ws = wb.getSheetAt(sheet); 
		testData = new String[1][3];
		for (int i = 0; i <= ws.getLastRowNum(); i++) {
			Row r=ws.getRow(i);
			for (int j = 0; j < r.getLastCellNum(); j++) {
				testData[i][j] = String.valueOf(ws.getRow(i).getCell(j));
				System.out.println(testData[i][j]);
			}
		}
		wb.close();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("eeror while reading: "+e);
		}
		return testData;
		
		
		
	}

	
}
