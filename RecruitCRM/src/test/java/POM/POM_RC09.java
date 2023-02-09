package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_RC09 {
	
	public static WebDriver driver;

	
	public POM_RC09(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSideBarDashBoardIcon() {
		return sideBarDashBoardIcon;
	}

	public WebElement getExportToSpreadSheetBtn() {
		return exportToSpreadSheetBtn;
	}

	@FindBy(xpath="//a[@class='menu-link dashboard']")
	private WebElement sideBarDashBoardIcon;

	@FindBy(xpath="(//a[@class='button is-link is-success is-small'])[3]")
	private WebElement exportToSpreadSheetBtn;
	
}
