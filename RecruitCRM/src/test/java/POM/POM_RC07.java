package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_RC07 {
	public static WebDriver driver;

	
	public POM_RC07(WebDriver driver) {

	this.driver = driver;
	PageFactory.initElements(driver, this);
			
	}
	@FindBy(xpath="//a[@class='menu-link candidate']")
	private WebElement sideBarCanditateIcon;

	@FindBy(xpath="//td/following::a[@class='media-a is-hidden-mobile']")
	private WebElement canditateName;
	@FindBy(xpath="(//i[@class='material-icons'])[23]")
	private WebElement editIcon;
	@FindBy(id="sTest-candidateQualification")
	private WebElement eduQualification;
	@FindBy(id="sTest-candidateSpecialization")
	private WebElement eduSpecialization;
	@FindBy(id="sTest-candidateOrganisation")
	private WebElement academicOrganization;
	@FindBy(id="sTest-candidateTotalExp")
	private WebElement academictotalExp;
	@FindBy(id="sTest-candidateAnnualSalary")
	private WebElement academicCurrentSalary;
	@FindBy(id="sTest-candidateExpectatedSalary")
	private WebElement academicExpectedSalary;
	@FindBy(xpath="//a[text()='Close']")
	private WebElement exitBtn;


	public WebElement getSideBarCanditateIcon() {
		return sideBarCanditateIcon;
	}
	public WebElement getCanditateName() {
		return canditateName;
	}
	public WebElement getEditIcon() {
		return editIcon;
	}
	public WebElement getEduQualification() {
		return eduQualification;
	}
	public WebElement getEduSpecialization() {
		return eduSpecialization;
	}
	public WebElement getAcademicOrganization() {
		return academicOrganization;
	}
	public WebElement getAcademictotalExp() {
		return academictotalExp;
	}
	public WebElement getAcademicCurrentSalary() {
		return academicCurrentSalary;
	}
	public WebElement getAcademicExpectedSalary() {
		return academicExpectedSalary;
	}
	public WebElement getExitBtn() {
		return exitBtn;
	}
	
}
