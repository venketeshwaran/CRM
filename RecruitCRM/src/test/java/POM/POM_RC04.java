package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_RC04 {
	
	public static WebDriver driver;


	@FindBy(xpath = "//a[@class='menu-link candidate']")
	private WebElement sideBarCanditateIcon;

	@FindBy(xpath = "//td/following::a[@class='media-a is-hidden-mobile']")
	private WebElement candtitateName;

	@FindBy(xpath = "(//i[@class='material-icons'])[23]")
	private WebElement editIcon;

	@FindBy(id = "sTest-candidateMobile")
	private WebElement txtBoxCanditateMob;

	@FindBy(id = "sTest-candidateCity")
	private WebElement txtBoxCity;

	@FindBy(xpath = "(//div[@class='dropdown-trigger'])[8]")
	private WebElement dropDownYearOfExp;

	@FindBy(xpath = "(//a[@class='button'])[3]/following::div[@class='dropdown-menu'][1]/child::div/child::a[contains(text(),'5')][1]")
	private WebElement dropDownYear_5;

	public POM_RC04(WebDriver driver2) {

		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	public WebElement getSideBarCanditateIcon() {
		return sideBarCanditateIcon;
	}
	public WebElement getCandtitateName() {
		return candtitateName;
	}
	public WebElement getEditIcon() {
		return editIcon;
	}
	public WebElement getTxtBoxCanditateMob() {
		return txtBoxCanditateMob;
	}
	public WebElement getTxtBoxCity() {
		return txtBoxCity;
	}
	public WebElement getDropDownYearOfExp() {
		return dropDownYearOfExp;
	}
	public WebElement getDropDownYear_5() {
		return dropDownYear_5;
	}
	public WebElement getAddLanguageBtn() {
		return addLanguageBtn;
	}
	public WebElement getDropDownLanguage() {
		return dropDownLanguage;
	}
	public WebElement getDropDoenLanguageProficiency() {
		return dropDoenLanguageProficiency;
	}
	public WebElement getDropDownLevelNative() {
		return dropDownLevelNative;
	}
	public WebElement getBtnSubmit() {
		return btnSubmit;
	}
	@FindBy(id = "sTest-candidateLangRowAddBtn")
	private WebElement addLanguageBtn;
	@FindBy(id = "sTest-candidateLanguage")
	private WebElement dropDownLanguage;
	@FindBy(id = "sTest-candidateProficiencyLevel")
	private WebElement dropDoenLanguageProficiency;

	@FindBy(xpath = "//div[@class='collapse card card-accordian resume-collapse']//ancestor::a/child::span[contains(text(),'Native')]")
	private WebElement dropDownLevelNative;
	@FindBy(id = "sTest-candidateAddBtn")
	private WebElement btnSubmit;
}
