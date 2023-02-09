package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_RC05 {
	
	public static WebDriver driver;


	public POM_RC05(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSideBarContactsIcon() {
		return sideBarContactsIcon;
	}

	public WebElement getContactName() {
		return contactName;
	}

	public WebElement getProfilePic() {
		return profilePic;
	}

	public WebElement getChangeBtn() {
		return changeBtn;
	}

	@FindBy(xpath="//a[@class='menu-link contact']")
	private WebElement sideBarContactsIcon;
	
	@FindBy(xpath="//td/following::a[@class='media-a is-hidden-mobile']")
	private WebElement contactName;
	
	@FindBy(xpath="//a[@class='change-profile-picture']")
	private WebElement profilePic;
	
	@FindBy(xpath="//a[text()='Change']")
	private WebElement changeBtn;
	
}
