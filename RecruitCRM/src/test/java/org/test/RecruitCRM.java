package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.base.BaseClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM.POM_RC03;
import POM.Page_Object_Manager;
import io.github.bonigarcia.wdm.WebDriverManager;


public class RecruitCRM extends BaseClass {

	Page_Object_Manager pom;

	@BeforeTest
	private void beforeTest() throws InterruptedException {
		browserLaunch("chrome");

		urlLaunch("https://neo-mr.recruitcrm.io/");
		pom = new Page_Object_Manager(driver);

		implicitWait(20);

		sendKeys(pom.getLoginPage().getTxtBoxMail(), "ponnagarajchitrambalam@gmail.com");

		sendKeys(pom.getLoginPage().getTxtBoxPass(), "Naren0150");
		click(pom.getLoginPage().getBtnLogin());

		sleep(8000);
	}

	@AfterTest
	private void afterTest() {
		browserQuit();

	}

	@Test
	private void testCase01() throws InterruptedException, AWTException {

		click(pom.get_POM_RC01().getSideBarCanditateIcon());

		javascriptClick(pom.get_POM_RC01().getCanditateName());

		sleep(3000);
		click(pom.get_POM_RC01().getEditIcon());
		sleep(8000);

		sendKeysAfterDeletingExistingText(pom.get_POM_RC01().getTxtBoxCanditateMob(), "1234567890");

		sendKeysAfterDeletingExistingText(pom.get_POM_RC01().getTxtBoxCanditateCity(), "Madurai");

		javascriptScrollDownTo(pom.get_POM_RC01().getDropDownYearOfExp());
		actionsClick(pom.get_POM_RC01().getDropDownYearOfExp());

		sleep(3000);
		javascriptClick(pom.get_POM_RC01().getDropDownYear_5());

		click(pom.get_POM_RC01().getSubmitBtn());
		sleep(5000);

	}

	@Test(enabled = true)
	private void testCase02() throws InterruptedException, AWTException {

		click(pom.get_POM_RC02().getEditIcon());

		sendKeysAfterDeletingExistingText(pom.get_POM_RC02().getTxtBoxCurrentOrganization(), "Sinapse Software");

		sleep(2000);
		btnEnter();

	}

	@Test
	private void testCase03() throws InterruptedException, AWTException {

		sleep(2000);
		click(pom.get_POM_RC03().getSideBarJobsIcon());
		sleep(2000);

		click(pom.get_POM_RC02().getEditIcon());
		sleep(2000);

		boolean actualId = isSelected(pom.get_POM_RC03().getCheckBoxID());
		if (actualId == false) {
			javascriptClick(pom.get_POM_RC03().getCheckBoxID());

		}

		boolean actualSpec = isSelected(pom.get_POM_RC03().getCheckBoxSpecialization());

		if (actualSpec == false) {
			javascriptClick(pom.get_POM_RC03().getCheckBoxSpecialization());

		}

		boolean actualColl = isSelected(pom.get_POM_RC03().getCheckBoxCollaborator());

		if (actualColl == false) {
			javascriptClick(pom.get_POM_RC03().getCheckBoxCollaborator());
		}
		boolean actualCity = isSelected(pom.get_POM_RC03().getCheckBoxCity());

		if (actualCity == false) {
			javascriptClick(pom.get_POM_RC03().getCheckBoxCity());

		}
		javascriptClick(pom.get_POM_RC03().getExitBtn());
		List<String> li = new ArrayList<String>();
		List<WebElement> tableHeadings = driver.findElements(By.tagName("th"));
		for (int i = 0; i < tableHeadings.size(); i++) {
			li.add(tableHeadings.get(i).getText());
		}
		softAssertEquals(li.contains("ID"), true, "ID is not Found in heading");
		softAssertEquals(li.contains("SPECIALIZATION"), true, "Specialization is not Found in heading");
		softAssertEquals(li.contains("COLLABORATOR"), true, "Collaborator is not Found in heading");
		softAssertEquals(li.contains("CITY"), true, "City is not Found in heading");

	}

	@Test(parameters = { "number", "city", "language" })
	private void testCase04(String number, String city, String language) throws InterruptedException, AWTException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions a = new Actions(driver);
		Robot key = new Robot();
		click(pom.get_POM_RC04().getSideBarCanditateIcon());
		javascriptClick(pom.get_POM_RC04().getCandtitateName());
		click(pom.get_POM_RC04().getEditIcon());
		sleep(8000);
		sendKeysAfterDeletingExistingText(pom.get_POM_RC04().getTxtBoxCanditateMob(), number);

		sendKeysAfterDeletingExistingText(pom.get_POM_RC04().getTxtBoxCity(), city);

		javascriptScrollDownTo(pom.get_POM_RC04().getDropDownYearOfExp());
		actionsClick(pom.get_POM_RC04().getDropDownYearOfExp());
		sleep(3000);

		javascriptClick(pom.get_POM_RC04().getDropDownYear_5());

		click(pom.get_POM_RC04().getAddLanguageBtn());
		sendKeysAfterDeletingExistingText(pom.get_POM_RC04().getDropDownLanguage(), language);// 
		click(pom.get_POM_RC04().getDropDoenLanguageProficiency());
		javascriptScrollDownTo(pom.get_POM_RC04().getDropDownLevelNative());
		javascriptClick(pom.get_POM_RC04().getDropDownLevelNative());
		click(pom.get_POM_RC04().getAddLanguageBtn());

	}

	@Test
	private void testCase05() throws InterruptedException, AWTException {

		click(pom.get_POM_RC05().getSideBarContactsIcon());
		sleep(3000);

		click(pom.get_POM_RC05().getContactName());
		sleep(3000);

		javascriptClick(pom.get_POM_RC05().getProfilePic());
		sleep(3000);

		click(pom.get_POM_RC05().getChangeBtn());

		btnEsc();

		sleep(3000);
	}

	@Test
	private void testCase06() throws InterruptedException, AWTException {

		click(pom.get_POM_RC06().getSideBarMailBoxIcon());
		sleep(3000);

		urlCheck("https://neo-mr.recruitcrm.io/folder");
		click(pom.get_POM_RC06().getOpenedMailLink());
		urlCheck("opened");

		click(pom.get_POM_RC06().getFailedMailLink());
		urlCheck("failed");

		click(pom.get_POM_RC06().getTemplatesMailLink());
		urlCheck("templates");

		click(pom.get_POM_RC06().getStandardMailLink());
		urlCheck("standard");

		sleep(3000);
	}

	@Test
	private void testCase07() throws InterruptedException, AWTException {

		click(pom.get_POM_RC07().getSideBarCanditateIcon());
		sleep(3000);

		javascriptClick(pom.get_POM_RC07().getCanditateName());
		sleep(3000);

		click(pom.get_POM_RC07().getEditIcon());
		sleep(8000);

		javascriptScrollDownTo(pom.get_POM_RC07().getEduQualification());
		String eduQualification = getAttribute(pom.get_POM_RC07().getEduQualification(), "value");
		softAssertContains(eduQualification, "Bachelor's Degree", "Mismatch Found in Educational Qualification");

		String eduSpecialization = getAttribute(pom.get_POM_RC07().getEduSpecialization(), "value");
		softAssertContains(eduSpecialization, "MBA Marketing", "Mismatch Found in Educational Specialization");

		String academicOrganisation = getAttribute(pom.get_POM_RC07().getAcademicOrganization(), "value");
		softAssertContains(academicOrganisation, "Sinapse Software", "Mismatch Found in Organisation Name");

		String currentSalary = getAttribute(pom.get_POM_RC07().getAcademicCurrentSalary(), "value");
		softAssertContains(currentSalary, "800000.00", "Mismatch Found in Current Salary");

		String expectedSalary = getAttribute(pom.get_POM_RC07().getAcademicExpectedSalary(), "value");
		softAssertContains(expectedSalary, "1000000.00", "Mismatch Found in Expected Salary");

		click(pom.get_POM_RC07().getExitBtn());

	}

	@Test
	private void testCase08() throws InterruptedException, AWTException {

		sleep(3000);
		click(pom.get_POM_RC08().getSideBarTaskandMeetings());
		sleep(3000);

		click(pom.get_POM_RC08().getCheckBoxOfMeeting01());

		String alertMsg = getText(pom.get_POM_RC08().getAlertMsg());
		softAssertContains(alertMsg, "Field Updated Successfully", "Found Mismatch in Alert Message");

		sleep(3000);
		click(pom.get_POM_RC08().getCheckBoxOfMeeting01());
		driver.findElement(By.xpath("(//td//input[@type='checkbox']/following-sibling::span[@class='check'])[1]"))
				.click();
		String alertMsg1 = getText(pom.get_POM_RC08().getAlertMsg());
		softAssertContains(alertMsg1, "Field Updated Successfully", "Found Mismatch in Alert Message");

		sleep(3000);
	}

	@Test
	private void testCase09() throws InterruptedException, AWTException {

		click(pom.get_POM_RC09().getSideBarDashBoardIcon());
		sleep(3000);

		click(pom.get_POM_RC09().getExportToSpreadSheetBtn());

		boolean fileDownloaded = isFileDownloaded("C:\\Users\\mages\\Downloads",
				"Candidate Pipeline Of Ponnagaraj Chitrambalam's Recruiter.csv");
		softAssertEquals(fileDownloaded, true, "Error in File Downloading");

	}

	@Test
	private void testCase10(Method m) throws InterruptedException, AWTException, IOException {
		click(pom.get_POM_RC10().getSideBarReportsIcon());
		click(pom.get_POM_RC10().getClientPerformanceReportLink());
		click(pom.get_POM_RC10().getDropDownDuration());
		sendKeys(pom.get_POM_RC10().getDropDownDuration(), "This year");
		btnEnter();

		takeScrnsht(m.getName());
		


	}
}