package dsAlgo_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsAlgo_Driverfactory.DriverFactory;
import dsAlgo_Utilities.PageUtils;

public class ALandingPage {
	private WebDriver driver=DriverFactory.getDriver();
	
	
	@FindBy(xpath="//button[text()='Get Started']")
	WebElement getStarted_btn;
	
	@FindBy(xpath="//a[text()='NumpyNinja']")
	WebElement getTitle;
	
    public ALandingPage(WebDriver driver)
    {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
    
    public BHomePage click_Btn() throws InterruptedException
    {   PageUtils.implicit_wait(driver, getStarted_btn);
    	getStarted_btn.click();
		return new BHomePage(driver);    	
    }
    
    public String get_Title()
    {    	
    	return getTitle.getText();    			
    }
}
