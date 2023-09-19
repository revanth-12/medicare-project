package com.simplilearn.TestingMedicareWebApplication;

import org.testng.annotations.Test;

@Test
public class Testcases 
{
	@Test(priority = 1)
	public class testcase001 extends Registrationpage{
		@Test
		public void singup() throws InterruptedException{
			
    	Registrationpage obj = new testcase001();
    	obj.navtosinguppage();   
   }
	
}
	@Test(priority = 2)
	public class testcase002 extends LoginPage{
		@Test
		public void login() throws InterruptedException {
			
		LoginPage obj = new testcase002();
		obj.loginpage();		
		}
		
	}
	@Test(priority = 3)
	public class testcase003 extends Homepage{
		@Test
		public void home() throws InterruptedException {
			
			Homepage obj = new testcase003();
			obj.homepage();
		}
	}
	
	@Test(priority = 4)
	public class testcase004 extends contactpage{
		@Test
		public void contact() throws InterruptedException {
			
			contactpage obj = new testcase004();
			obj.contacts();
		}
		
	}
	
	@Test(priority = 5)
	public class testcase005 extends Aboutpage{
		@Test
		public void about() throws InterruptedException {
			
			Aboutpage obj = new testcase005();
			obj.description();
		}
		
	}
	
	@Test(priority = 6)
	public class testcase006 extends Listproducts{
		
		@Test
		public void product() throws InterruptedException {
			
			Listproducts obj = new testcase006();
			obj.products();
		}
	}
	
	@Test(priority = 7)
	public class testcase007 extends Addtocart{
		
		@Test
		public void cart() throws InterruptedException {
			Addtocart obj = new testcase007();
			obj.add();
		}
	}
	
	
	
}





