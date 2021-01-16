package pack4;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class class_excel_fetch_test {

	@DataProvider
	public Object[][] getData(){
		
	Object[][] data=new Object[2][2];
	data[0][0]="UserA";
	data[0][1]="passA";
	data[1][0]="UserB";
	data[1][1]="passB";

	return data;
	}

	@Test(dataProvider="getData")
	public void createUser(Object un,Object pwd) {
		
	Reporter.log(un+" "+pwd,true);
	System.out.println(un+" "+pwd);
	}


}
