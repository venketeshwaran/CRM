package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_RC06 {
	public static WebDriver driver;

public POM_RC06(WebDriver driver) {

	this.driver=driver;
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//a[@class='menu-link mailbox']")
private WebElement sideBarMailBoxIcon;

@FindBy(xpath="//button[contains(text(),'Opened')]")
private WebElement openedMailLink;

@FindBy(xpath="//button[contains(text(),'Failed')]")
private WebElement failedMailLink;

@FindBy(xpath="(//a[contains(text(),'Email Templates')])[1]")
private WebElement templatesMailLink;

@FindBy(xpath="(//a[contains(text(),'Email Templates')])[2]")
private WebElement standardMailLink;

public WebElement getSideBarMailBoxIcon() {
	return sideBarMailBoxIcon;
}

public WebElement getOpenedMailLink() {
	return openedMailLink;
}

public WebElement getFailedMailLink() {
	return failedMailLink;
}

public WebElement getTemplatesMailLink() {
	return templatesMailLink;
}

public WebElement getStandardMailLink() {
	return standardMailLink;
}

}
