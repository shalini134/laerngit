package org.pages;

import java.util.List;

import org.baseclass.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Tools_formpage extends Baseclass {
 @FindBy(name="firstname")
 private WebElement firstname;
 @FindBy(name="lastname")
 private WebElement lastname;
 @FindBy(id="sex-1")
 private WebElement gender;
 @FindBy(id="exp-4")
 private WebElement experience;
 @FindBy(id="datepicker")
 private WebElement date ;
 @FindBy(xpath="//label[text()=' Automation Tester']")
 private WebElement testing_type;
 @FindBy(id="tool-2")
 private WebElement automation_tool;
 @FindBy(id="continents")
 WebElement continenet;
 @FindBy(id="selenium_commands")
 private WebElement selenium_commands;
 
 public WebElement getFirstname() {
	return firstname;
}

public void setFirstname(WebElement firstname) {
	this.firstname = firstname;
}

public WebElement getLastname() {
	return lastname;
}

public void setLastname(WebElement lastname) {
	this.lastname = lastname;
}

public WebElement getGender() {
	return gender;
}

public void setGender(WebElement gender) {
	this.gender = gender;
}

public WebElement getExperience() {
	return experience;
}

public void setExperience(WebElement experience) {
	this.experience = experience;
}

public WebElement getDate() {
	return date;
}

public void setDate(WebElement date) {
	this.date = date;
}

public WebElement getTesting_type() {
	return testing_type;
}

public void setTesting_type(WebElement testing_type) {
	this.testing_type = testing_type;
}

public WebElement getAutomation_tool() {
	return automation_tool;
}

public void setAutomation_tool(WebElement automation_tool) {
	this.automation_tool = automation_tool;
}

public WebElement getContinenet() {
	return continenet;
}

public void setContinenet(WebElement continenet) {
	this.continenet = continenet;
}

public WebElement getSelenium_commands() {
	return selenium_commands;
}

public void setSelenium_commands(WebElement selenium_commands) {
	this.selenium_commands = selenium_commands;
}

public Tools_formpage() {
	 PageFactory.initElements(driver,this);
 }
 
 public void select_contient() {
	 Select sel=new Select(continenet);
	 sel.selectByIndex(0);
	 System.out.println("contient selected:"+sel.getFirstSelectedOption().getText());
	 }
 public void select_selneniumcommand() {
	 Select sel=new Select(selenium_commands);
	 sel.selectByVisibleText("Wait Commands");
	 sel.selectByIndex(0);
	 sel.selectByIndex(1);
 }
 public void noofoptions_seleniumcommands() {
	 Select sel=new Select(selenium_commands);
	 List<WebElement> options = sel.getOptions();
	 for(WebElement alloptions:options) 
		 System.out.println("Avaiable options:"+alloptions.getText());
	 }
public void selected_seleniumcommand() {
	Select sel=new Select(selenium_commands);
	List<WebElement> selectedoptions = sel.getAllSelectedOptions();
	for(WebElement allselected:selectedoptions) {
		System.out.println("selected options are:"+allselected.getText());
	}
		
 }
 
}
