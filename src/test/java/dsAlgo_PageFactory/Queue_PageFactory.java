package dsAlgo_PageFactory;


import java.io.IOException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver_Factory.Driver_Factory;
import dsAlgo_Reader.ConfigReader;
import dsAlgo_Reader.TryEditor;


public class Queue_PageFactory {
	
	WebDriver driver= Driver_Factory.getDriver();
	ConfigReader configFileReader=Driver_Factory.configReader();
    TryEditor readTryEditor = new TryEditor();
	
		@FindBy ( linkText = "Implementation of Queue in Python") WebElement ImplementationofQueueinPythonlink;
		@FindBy ( linkText = "Implementation using collections.deque") WebElement Implementationusingcollectionsdequelink;
		@FindBy ( linkText = "Implementation using array") WebElement ImplementationusingarrayLink;
		@FindBy ( linkText = "Queue Operations") WebElement QueueOperationslink;
		@FindBy(xpath="//a[contains(@href,'queue')]/..//a[text()='Get Started']")WebElement QueueGetStarted;
		@FindBy(xpath="//a[text()='Implementation of Queue in Python']")WebElement Implementation_of_Queue_in_Python;		
		@FindBy(xpath="//a[text()='Implementation using collections.deque']")WebElement Queue_Implementation;			
		@FindBy(xpath="//a[text()='Implementation using array']")WebElement Implementation_Using_Array;					
		@FindBy(xpath="//a[text()='Queue Operations']")WebElement Queue_Operations;			
	    @FindBy(xpath="//a[text()='Practice Questions']")WebElement Practice_Questions;
	    @FindBy (xpath ="//a[text()='Try here>>>']") WebElement TryHere;
	    @FindBy (xpath="//form[@id='answer_form']/div/div/div/textarea") WebElement QueueTryEditor;
	    @FindBy (xpath="//button[text()='Run']") WebElement RunButton;
		@FindBy (id="output") WebElement OutputWindow;
		@FindBy (className = "CodeMirror-scroll") WebElement textWindow;
	    @FindBy (xpath="//a[text()='Search the Queue']")WebElement PracticeQuestionsQueue;
		@FindBy (xpath = "//div[contains(@class, 'CodeMirror') and contains(@class, 'cm-s-default')]") WebElement codeMirror;
        @FindBy (xpath = ".//textarea']") WebElement textArea;
		
public Queue_PageFactory() {
    PageFactory.initElements(driver, this);
}
			
	public void QueueGetStarted() {
		QueueGetStarted.click();
	}
	public boolean ImplementationofQueueinPythonlinkEnabled() {
		return ImplementationofQueueinPythonlink.isEnabled();
	}
	public boolean ImplementationusingcollectionsdequelinkEnabled() {
		return Implementationusingcollectionsdequelink.isEnabled();
	}
	public boolean ImplementationusingarrayLinkEnabled() {
		return ImplementationusingarrayLink.isEnabled();
	}
	public boolean QueueOperationslinkEnabled() {
		return QueueOperationslink.isEnabled();
	}
	public boolean Implementation_of_Queue_in_Python_visible(){
		return Implementation_of_Queue_in_Python.isDisplayed();
	}
	public boolean PracticeQuestionsQueueDisplayed() {
		return PracticeQuestionsQueue.isDisplayed();
	}
	public void Implementation_Of_Queue_In_Python_Click() {
		Implementation_of_Queue_in_Python.click();
	}
    public void Implementation_Using_Collection_deque_Click() {
		Queue_Implementation.click();
	}
    public void Implementation_Using_Array_Click() {
		Implementation_Using_Array.click();
	}
    public void Queue_Operations_Click() {
		Queue_Operations.click();
	}
    public void TryHere_Click() {
		TryHere.click();
	}
	public void RunButton_Click() {
		RunButton.click();
	}
	public void Practice_Questions_Click() {
		Practice_Questions.click();
	}
	public void tryEditorWindow(String sheetName, int rowNumber) throws IOException, InterruptedException {
		   String[] editor = readTryEditor.excelTryEditor(sheetName, rowNumber);
		   Actions actions = new Actions(driver);
		   actions.moveToElement(codeMirror).click().perform();
		   WebElement textArea = codeMirror.findElement(By.xpath(".//textarea"));
		   textArea.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		   textArea.sendKeys(editor[0]);
		   RunButton.click();
		   try {
	            Alert alert = driver.switchTo().alert();
	           String get_alert_msg = alert.getText();
	            alert.accept();
	            System.out.println("Alert Is:"+ get_alert_msg);
	        } catch (NoAlertPresentException e) {
	            System.out.println("No alert present: " + e.getMessage());
	        }		
	      }
}
