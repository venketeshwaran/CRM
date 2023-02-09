package POM;

import org.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_RC02{

	public static WebDriver driver;

	
	
	public POM_RC02(WebDriver driver2) {

		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getEditIcon() {
		return editIcon;
	}

	public WebElement getTxtBoxCurrentOrganization() {
		return txtBoxCurrentOrganization;
	}

	@FindBy(xpath="(//span[@class='text-truncate inline-link'])[1]")
	private WebElement editIcon;
	
	@FindBy(xpath="//input[@*='Current Organization']")
	private WebElement txtBoxCurrentOrganization;
	
	
	
}
