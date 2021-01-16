package pack3;

import java.util.ArrayList;

import pack2.Xls_Reader;

public class Yahoo_data_util {
	
	static Xls_Reader reader;

public static ArrayList<Object[]> getdata_excel(){

ArrayList<Object[]>	mydata=new ArrayList<Object[]>();

reader= new Xls_Reader("./Util_excel2/Yahoo_Util.xlsx");

String wksheet="Yahoo_Util";
for(int rownum=2;rownum<=reader.getRowCount(wksheet);rownum++) {
	
	String fname=reader.getCellData(wksheet, "Firstname",rownum);
	String lname=reader.getCellData(wksheet, "Lastname", rownum);
	String email=reader.getCellData(wksheet,"Email", rownum);
	String pwd=reader.getCellData(wksheet, "Password", rownum);
	String phone=reader.getCellData(wksheet, "Phone", rownum);
	String month=reader.getCellData(wksheet,"Month", rownum);
	Object[] arr= {fname,lname,email,pwd,phone,month};
	mydata.add(arr);
	
	
}

return mydata;

	
	
	


}


}