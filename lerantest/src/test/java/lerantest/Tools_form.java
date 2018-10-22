package lerantest;

import org.baseclass.Baseclass;
import org.pages.Tools_formpage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tools_form extends Baseclass {
	Tools_formpage form;
	
	
	@BeforeTest
	public void setup() {
		
		driver=launchbrowser("chrome");
		driver.get("http://toolsqa.com/automation-practice-form/");	
		form=new Tools_formpage();
	}
	@Test
	public void form_fill() {
	form.getFirstname().sendKeys("shalini");
	form.getLastname().sendKeys("chandran");
	form.getGender().click();
	form.getExperience().click();
	form.getDate().sendKeys("03/09/1989");
	form.getTesting_type().click();
	form.getAutomation_tool().click();
	form.select_contient();
	form.noofoptions_seleniumcommands();
	form.select_selneniumcommand();
	form.selected_seleniumcommand();
	
	}
	@AfterTest
	public void teardown() {
	driver.quit();
	}
	
}
