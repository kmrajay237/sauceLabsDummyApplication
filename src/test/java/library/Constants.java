package library;

public interface Constants {
	
	String excelPath="./excel/SauceLabs.xlsx";
	String sheetname="loginpage";
	String validAppURL=Excel.readExcelData(excelPath, sheetname, 1, 0);
	String inValidAppURL=Excel.readExcelData(excelPath, sheetname, 1, 1);
	
}
