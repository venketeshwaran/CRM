package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_RC08 {
	
	public static WebDriver driver;


	public POM_RC08(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@class='menu-link taskandmeeting']")
	private WebElement sideBarTaskandMeetings;

	public WebElement getSideBarTaskandMeetings() {
		return sideBarTaskandMeetings;
	}
	public WebElement getCheckBoxOfMeeting01() {
		return checkBoxOfMeeting01;
	}
	public WebElement getAlertMsg() {
		return alertMsg;
	}
	@FindBy(xpath="(//td//input[@type='checkbox']/following-sibling::span[@class='check'])[1]")
	private WebElement checkBoxOfMeeting01;
	@FindBy(xpath="//div[text()='Field Updated Successfully']")
	private WebElement alertMsg;
		
}
