package dsAlgo_PageFactory;

import java.io.IOException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver_Factory.Driver_Factory;
import dsAlgo_Reader.ConfigReader;
import dsAlgo_Reader.TryEditor;

public class DataStructure_PageFactory{
	
	WebDriver driver= Driver_Factory.getDriver();
	ConfigReader configFileReader=Driver_Factory.configReader();


	String Url = "https://dsportalapp.herokuapp.com/Home";
	@FindBy (xpath = "//a[@href='data-structures-introduction']") WebElement Getstarted_ds; 
	@FindBy(xpath = "//h4[text()='Data Structures-Introduction']") WebElement datastructureInrodisplay; 
	@FindBy (xpath = "//a[text()='Data Structures']") WebElement Datatructure_dropdown;
	@FindBy(xpath = "//a[@href='time-complexity']") WebElement timecomplexity_btn;
	@FindBy (xpath ="//p[text()='Time Complexity']") WebElement timecomplexity_page;
	@FindBy (xpath = "//a[text()='Try here>>>']") WebElement tryhere_btn_ds;
	@FindBy (xpath = "//div[@class='CodeMirror-scroll']") WebElement tryhere_area_ds;
	@FindBy(className = "CodeMirror-scroll") WebElement tryherearea_enabled;
	@FindBy (xpath = "//button[text()='Run']") WebElement Run_btn_ds;
	@FindBy (xpath = "//a[@href='/data-structures-introduction/practice']") WebElement practice_que_ds;
	@FindBy(xpath = "//pre[@id='output']") WebElement text_output;

	TryEditor tryeditor_ds = new TryEditor();
	
	public DataStructure_PageFactory ()
	{	
		PageFactory.initElements(driver,this);
	
	}
	
	public void getStartedDataStructureBtn() {
		Getstarted_ds.click();
	}
	
	
	public void DataStructure_dropdown() {
		Datatructure_dropdown.click();
		
	}
	public boolean  datastructureIntropageDisplayed() {
		
		return datastructureInrodisplay.isDisplayed();
	}
public boolean  timecomplexity_page_enable() {
		
		return timecomplexity_page.isDisplayed();
	}
	public boolean timecomplexity_btnEnabled() {
		
	return	timecomplexity_btn.isEnabled();
		 
	}
	public void timecomplexity_buttonClick() {
		
		timecomplexity_btn.click();
	}
	
	public void tryhere_buttonClick() throws InterruptedException {
		
		tryhere_btn_ds.click();
	
	}
	public boolean tryeditor_page() {
	
		return tryherearea_enabled.isDisplayed();
	}
	public void tryeditor_box() {
		tryhere_area_ds.click();
	}
	public void readExcel_fortryhere(String sheetName, int rowNumber) throws IOException {
	
		try {
		String[] editor = tryeditor_ds.excelTryEditor(sheetName, rowNumber); 
		tryhere_area_ds.sendKeys(editor[0]);
		WebElement codeMirror = driver.findElement(
				By.xpath("//div[contains(@class, 'CodeMirror') and contains(@class, 'cm-s-default')]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(codeMirror).click().perform();
		WebElement textArea = codeMirror.findElement(By.xpath(".//textarea"));
		//textArea.clear();
		textArea.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		textArea.sendKeys(editor[0]);		
		Run_btn_ds.click(); 
		
		 try {
	            Alert alert = driver.switchTo().alert();
	           String get_alert_msg = alert.getText();
	            alert.accept(); 
	            System.out.println("Alert Is:"+ get_alert_msg);
	        } catch (NoAlertPresentException e) {
	            System.out.println("No alert present:");
	        } catch (UnhandledAlertException e) {
	           
	            System.out.println("Unhandled alert exception: " + e.getMessage());
	        } 
			} finally {
	        	System.out.println("Alert Handled");
	}
	}

	public void practice_que() {
		
		practice_que_ds.click();
	}
	public boolean NavigatePracticeQuePage() {
	String	url= "https://dsportalapp.herokuapp.com/data-structures-introduction/practice";
	
		return true;
	}
}


