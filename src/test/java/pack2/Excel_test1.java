package pack2;

public class Excel_test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Xls_Reader reader=new Xls_Reader("./Excel_Util/SampleExcel.xlsx");
String sheetname="login";
System.out.println("celldata (0,2)= "+reader.getCellData("login", 0,1));
System.out.println("rowcount= "+reader.getRowCount(sheetname));
reader.setCellData(sheetname, "status",2,"Fail");
reader.setCellData(sheetname, "username", 4, "mast");
System.out.println(reader.getCellData(sheetname, "username", 2));
System.out.println(reader.getCellData(sheetname, 2, 1));
reader.addColumn(sheetname, "testing");
if(!reader.isSheetExist("test123"))
reader.addSheet("test123");





	}

}
