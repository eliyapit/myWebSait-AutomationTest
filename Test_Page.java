package project_Test_my_site;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Test_Page {

	WebDriver driver;

	Test_Page (WebDriver driver) {
		this.driver = driver;
	}
	//==================================================================
	// First name field
	WebElement firstName() {
		return driver.findElement(By.name("f_name"));
	}
	void typeFirstName(String string) {
		firstName().sendKeys(string);
	}
	String firstNameValue() {
		return firstName().getAttribute("value");
	}
	//====================================================================
	//====================================================================
	// Last name field
	WebElement lastName() {
		return driver.findElement(By.name("l_name"));
	}
	void typelastName(String string) {
		lastName().sendKeys(string);
	}
	String lastNameValue() {
		return lastName().getAttribute("value");
	}
	//======================================================================
	//======================================================================
	//kidomet phone number
	WebElement kidomet() {
		return driver.findElement(By.cssSelector("[name='kidomet']"));
	}
	void choosekidomet(String kid) {
		Select kidometDropDown = new Select(kidomet());
		kidometDropDown.selectByVisibleText(kid);
	}
	String kidometValue() {
		return kidomet().getAttribute("value");
	}
	//=====================================================================
	//=====================================================================
	// phone number field
	WebElement phone() {
		return driver.findElement(By.name("phone"));
	}
	void typephone(String number) {
		phone().sendKeys(number);
	}
	String phoneValue() {
		return phone().getAttribute("value");
	}
	//===================================================================
	//===================================================================
	// email field
	WebElement my_email() {
		return driver.findElement(By.name("email"));
	}
	void typemy_email(String string) {
		my_email().sendKeys(string);
	}
	String my_emailValue() {
		return my_email().getAttribute("value");
	}
	//====================================================================
	//====================================================================
	//Check Boxes:
	// checkbox Bnia
	WebElement checkbox_BNIA() {
		return driver.findElement(By.id("checkboxBNIA"));
	}
	void clickcheckbox_BNIA() {
		checkbox_BNIA().click();
	}
	boolean checkbox_BNIAValue() {
		return checkbox_BNIA().isSelected();
	}
	// checkbox Gel
	WebElement check_box_gel() {
		return driver.findElement(By.id("checkboxGEL"));
	}
	void clickcheck_box_gel() {
		check_box_gel().click();
	}
	// checkbox hishtalmut
	WebElement check_box_hish() {
		return driver.findElement(By.id("checkboxHISH"));
	}
	void clickcheck_box_hish() {
		check_box_hish().click();
	}
	//====================================================================
	//====================================================================
	// radiobuttons:
	//1 year nisaion
	WebElement nisaion() {
		return driver.findElement(By.cssSelector("[value='1year']"));
	}
	void clicknisaion() {
		nisaion().click();
	}
	//noNicaion
	WebElement noNicaion() {
		return driver.findElement(By.cssSelector("[value='noNicaion']"));
	}
	boolean noNicaionValue() {
		return noNicaion().isSelected();
	}
	//====================================================================
	//====================================================================
	// Drop Down kurs morning/evening
	WebElement ADIFUT() {
		return driver.findElement(By.name("ADIFUT"));
	}
	void chooseADIFUT(String adifut2) {
		Select ADIFUTDropDown = new Select(ADIFUT());
		ADIFUTDropDown.selectByVisibleText(adifut2);
	}
	//====================================================================
	//====================================================================
	// message field
	WebElement message() {
		return driver.findElement(By.id("message"));
	}
	void typemessage(String string) {
		message().sendKeys(string);
	}
	String messageValue() {
		return message().getAttribute("value");
	}
	//====================================================================
	//====================================================================
	// Send button
	WebElement send() {
		return driver.findElement(By.cssSelector("[value='Send']"));
	}
	void clicksend() {
		send().click();
	}
	//====================================================================
	//====================================================================
	//a href to Curses page
	WebElement Curses() {
		return driver.findElement(By.cssSelector("[href='Curses.html']"));
	}
	void clickCurses() {
		Curses().click();
	}
	//====================================================================
	//====================================================================
	//'mishpat' on Curses page
	WebElement bdikat_mishpat() {
		return driver.findElement(By.cssSelector("h2[id='mishpat']"));
	}
	String bdikat_mishpatText() {
		return bdikat_mishpat().getText();
	}
	//====================================================================
	//====================================================================
	//find all check boxes 
	int ch_kamut() {
		return driver.findElements(By.cssSelector("input[type='checkbox']")).size();
	}
	//find all radio buttons
	int rdb_kamut() {
		return driver.findElements(By.name("nisaion")).size();
	}

}


