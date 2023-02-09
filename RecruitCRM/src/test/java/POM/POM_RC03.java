package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_RC03 {
	public WebDriver driver;

	

	public POM_RC03(WebDriver driver2) {

		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getSideBarJobsIcon() {
		return sideBarJobsIcon;
	}

	public void setSideBarJobsIcon(WebElement sideBarJobsIcon) {
		this.sideBarJobsIcon = sideBarJobsIcon;
	}

	public WebElement getEditIcon() {
		return editIcon;
	}

	public void setEditIcon(WebElement editIcon) {
		this.editIcon = editIcon;
	}

	public WebElement getCheckBoxID() {
		return checkBoxID;
	}

	public void setCheckBoxID(WebElement checkBoxID) {
		this.checkBoxID = checkBoxID;
	}

	public WebElement getCheckBoxSpecialization() {
		return checkBoxSpecialization;
	}

	public void setCheckBoxSpecialization(WebElement checkBoxSpecialization) {
		this.checkBoxSpecialization = checkBoxSpecialization;
	}

	public WebElement getCheckBoxCollaborator() {
		return checkBoxCollaborator;
	}

	public void setCheckBoxCollaborator(WebElement checkBoxCollaborator) {
		this.checkBoxCollaborator = checkBoxCollaborator;
	}

	public WebElement getSearchBar() {
		return searchBar;
	}

	public void setSearchBar(WebElement searchBar) {
		this.searchBar = searchBar;
	}

	public WebElement getCheckBoxCity() {
		return checkBoxCity;
	}

	public void setCheckBoxCity(WebElement checkBoxCity) {
		this.checkBoxCity = checkBoxCity;
	}

	public WebElement getExitBtn() {
		return exitBtn;
	}

	public void setExitBtn(WebElement exitBtn) {
		this.exitBtn = exitBtn;
	}

	@FindBy(xpath = "//a[@class='menu-link job']")
	private WebElement sideBarJobsIcon;
	@FindBy(xpath = "//i[@class='mdi mdi-pencil']")
	private WebElement editIcon;
	@FindBy(xpath = "(//p[contains(text(),'ID')]/following::span[@class='check'])[1]")
	private WebElement checkBoxID;

	@FindBy(xpath = "(//p[contains(text(),'Specialization')]/following::span[@class='check'])[1]")
	private WebElement checkBoxSpecialization;

	@FindBy(xpath = "(//p[contains(text(),'Collaborator')]/following::span[@class='check'])[1]")
	private WebElement checkBoxCollaborator;
	@FindBy(xpath = "//input[@*='sTest-searchFields']")
	private WebElement searchBar;
	@FindBy(xpath = "(//p[contains(text(),'City')]/following::span[@class='check'])[1]")
	private WebElement checkBoxCity;

	@FindBy(xpath = "//button[@class='modal-close is-large']")
	private WebElement exitBtn;

}
