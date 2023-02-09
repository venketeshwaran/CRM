package POM;

import org.openqa.selenium.WebDriver;

public class Page_Object_Manager {
	
	public static WebDriver driver;
	
	private LoginPage l;
	
	private POM_RC01 rc1;
	
	private POM_RC02 rc2 ;
	
	private POM_RC03 rc3;
	
	private POM_RC04 rc4;

	private POM_RC05 rc5;

	private POM_RC06 rc6;

	private POM_RC07 rc7;

	private POM_RC08 rc8;

	private POM_RC09 rc9;

	private POM_RC10 rc10;

	
	
	
	
	public Page_Object_Manager(WebDriver driver2) {

		this.driver=driver2;
	}

	public LoginPage getLoginPage() {
		
		 l = new LoginPage(driver);
		 return l;
		 
	}
	
	public POM_RC01 get_POM_RC01() {
		
		 rc1 = new POM_RC01(driver);
		 return rc1;
	}
	
	public POM_RC02 get_POM_RC02() {
		
		 rc2 = new POM_RC02(driver);
		 return rc2;
	}
	
	public POM_RC03 get_POM_RC03() {
		
		 rc3 = new POM_RC03(driver);
		 return rc3;

	}
	
	public POM_RC04 get_POM_RC04() {
		
		 rc4 = new POM_RC04(driver);
		 return rc4;

	}
	
	public POM_RC05 get_POM_RC05() {
		
		 rc5 = new POM_RC05(driver);
		 
		 return rc5;

	}
	
	public POM_RC06 get_POM_RC06() {
		
		 rc6 = new POM_RC06(driver);
		 return rc6;

	}
	
	public POM_RC07 get_POM_RC07() {
		
		 rc7 = new POM_RC07(driver);
		 return rc7;

	}
	
	public POM_RC08 get_POM_RC08() {
		
		 rc8 = new POM_RC08(driver);
		 return rc8;

	}
	
	public POM_RC09 get_POM_RC09() {
		
		 rc9 = new POM_RC09(driver);
		 return rc9;

	}
	
	public POM_RC10 get_POM_RC10() {
		
		 rc10 = new POM_RC10(driver);
		 return rc10;

	}
	
	

}
