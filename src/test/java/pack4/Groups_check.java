package pack4;

import org.testng.annotations.Test;

public class Groups_check {

@Test(groups= {"sanity","smoke"})
public void test1()
{
System.out.println("This is test1");
}

@Test(groups= {"regression"})
public void test2()
{
System.out.println("This is test2");
}

public void testm() {
	System.out.println("This is testm");
}

@Test(groups= {"smoke"})
public void test3()
{
System.out.println("This is test3");
}

@Test(groups= {"sanity","smoke"})
public void test4()
{
System.out.println("This is test4");
}

@Test(groups= {"isolated"})
public void test5()
{
System.out.println("This is test5");
}

}
