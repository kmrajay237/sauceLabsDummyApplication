package library;

public interface Constants {
	
	String excelPath="./excel/SauceLabs.xlsx";
	String sheetname="loginpage";
	String validAppURL=Excel.readExcelData(excelPath, sheetname, 1, 0);
	String inValidAppURL=Excel.readExcelData(excelPath, sheetname, 1, 1);
	String inventoryURL=Excel.readExcelData(excelPath, sheetname, 2, 0);
	
	String username=Excel.readExcelData(excelPath, sheetname, 1, 2);
	String password=Excel.readExcelData(excelPath, sheetname, 1, 3);
	
	String invalidUsername=Excel.readExcelData(excelPath, sheetname, 2, 2);
	String invalidPassword=Excel.readExcelData(excelPath, sheetname, 2, 3);
	
}
