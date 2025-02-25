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
import org.testng.Assert;
import driver_Factory.Driver_Factory;
import dsAlgo_Reader.ConfigReader;
import dsAlgo_Reader.TryEditor;

public class Array_PageFactory {

	WebDriver driver = Driver_Factory.getDriver();
	ConfigReader configFileReader = Driver_Factory.configReader();
	TryEditor tryeditor_array = new TryEditor();
	String Url = "https://dsportalapp.herokuapp.com/home";
	String ExpectedFromTestcaseOne;
	String output;
	@FindBy(xpath = "//h4[text()='Array']")
	WebElement array_displayTitle;
	@FindBy(xpath = "//h5[text()='Array']/..//a[text()='Get Started']")
	WebElement arrayGetStartedBtn;
	@FindBy(xpath = "//div[@class='navbar-nav']/div/a")
	WebElement dropdown_selection;
	@FindBy(xpath = "//div[@class='navbar-nav']/div/div/a[1]")
	WebElement dropdown_selectArray;
	@FindBy(xpath = "//a[text()='Arrays in Python']")
	WebElement array_in_python;
	@FindBy(xpath = "//p[text()='Arrays in Python']")
	WebElement arrayInPythonPage;

	@FindBy(xpath = "//a[text()= 'Try here>>>']")
	WebElement try_here_arrayInPython;

	@FindBy(xpath = "//button[text()='Run']")
	WebElement Run_btn_array;
	@FindBy(id = "output")
	WebElement ArrayInPythonOutput;
	@FindBy(xpath = "//a[text()='Arrays Using List']")
	WebElement array_using_list;
	@FindBy(xpath = "//p[text()='Arrays Using List']")
	WebElement arrayUsingListNmeDisplay;
	@FindBy(xpath = "//a[text()='Basic Operations in Lists']")
	WebElement basic_opr_list;
	@FindBy(xpath = "//a[text()='Basic Operations in Lists']")
	WebElement basicOprlist_page;
	@FindBy(xpath = "//p[text()='Applications of Array']")
	WebElement applOfArrayDisplay;
	@FindBy(xpath = "//a[text()='Applications of Array']")
	WebElement applOfArrayLink;
	@FindBy(xpath = "//a[text()='Practice Questions']")
	WebElement practice_que_page;
	@FindBy(xpath = "//a[text()='Search the array']")
	WebElement search_array;
	@FindBy(id = "Element Found")
	WebElement searchArray_output;
	@FindBy(className = "question")
	WebElement search_array_page_display;
	@FindBy(xpath = "//a[text()='Max Consecutive Ones']")
	WebElement max_cons_one;
	@FindBy(xpath = "//a[@href='/question/3']")
	WebElement even_num_find;
	@FindBy(xpath = "//a[text()='Squares of  a Sorted Array']")
	WebElement square_array;
	@FindBy(xpath = "//input[@value='Submit']")
	WebElement submit_btn;
	@FindBy(xpath = "//*[@id=\"answer_form\"]/div/div/div[6]/div[1]/div/div")
	WebElement text_area;
	@FindBy(xpath = "('.//textarea')")
	WebElement textArea;
	@FindBy(className = "cm-def")
	WebElement codeText_line;

	public Array_PageFactory() {

		PageFactory.initElements(driver, this);
	}

	public void arrayGetStartedBtn() {
		arrayGetStartedBtn.click();
	}

	public boolean array_displayTitle() {

		return array_displayTitle.isDisplayed();
	}

	public void array_dropdown_Selection() {

		driver.navigate().to(Url);
		dropdown_selection.click();
		dropdown_selectArray.click();
	}

	public boolean arrayInPythinLink() {

		return array_in_python.isEnabled();

	}

	public void arrayInPythonClicked() {

		array_in_python.click();
	}

	public boolean navigateToarrayInPythonPage() {

		return arrayInPythonPage.isDisplayed();

	}

	public void tryHereBtnarrayInPython() {
		try_here_arrayInPython.click();
	}

	public void NavigateToTryHereInArrayInPython() {
		driver.navigate().to("https://dsportalapp.herokuapp.com/tryEditor");

	}

	public boolean NavigateToTryHereBtn() {
		return Run_btn_array.isDisplayed();
	}

	public void readExcel_forTryHereArray(String sheetName, int rowNumber) throws IOException, InterruptedException {

		try {
			String[] editor = tryeditor_array.excelTryEditor(sheetName, rowNumber);
			output = editor[1];
			WebElement codeMirror = driver.findElement(
					By.xpath("//div[contains(@class, 'CodeMirror') and contains(@class, 'cm-s-default')]"));
			Actions actions = new Actions(driver);
			actions.moveToElement(codeMirror).click().perform();
			WebElement textArea = codeMirror.findElement(By.xpath(".//textarea"));
			enterCodePractice(editor[0], textArea);
			Run_btn_array.click();

			try {
				Alert alert = driver.switchTo().alert();
				String get_alert_msg = alert.getText();
				alert.accept();
				System.out.println("Alert Is:" + get_alert_msg);
			} catch (NoAlertPresentException e) {
				System.out.println("No alert present:");
			} catch (UnhandledAlertException e) {

				System.out.println("Unhandled alert exception: " + e.getMessage());
			}
		} finally {
			System.out.println("ALert handled###");
		}
	}

	public void enterCodePractice(String code, WebElement textArea) {
		new Actions(driver).keyDown(Keys.CONTROL).sendKeys("a").sendKeys(Keys.DELETE).keyUp(Keys.CONTROL).perform();
		String[] str1 = code.split("\n");
		for (int i = 0; i < str1.length; i++) {
			if (str1[i].equalsIgnoreCase("\\b")) {
				textArea.sendKeys(Keys.BACK_SPACE);
			} else {
				textArea.sendKeys(str1[i]);
				textArea.sendKeys(Keys.RETURN);
			}
		}
	}

	public void output() {

		String expectedResullt = ArrayInPythonOutput.getText();
		Assert.assertEquals(output, expectedResullt);

	}

	public void arrayUsingListlink() {

		array_using_list.click();

	}

	public void BasicOperationListLink() {

		basic_opr_list.click();
	}

	public boolean InBasicOprPage() {
		return basicOprlist_page.isDisplayed();
	}

	public boolean arrayUsingListDisplay() {

		return arrayUsingListNmeDisplay.isDisplayed();
	}

	public boolean applcationOfArrayDisplay() {

		return applOfArrayDisplay.isDisplayed();
	}

	public void ApplicationOfArrayClick() {
		applOfArrayLink.click();

	}

	public boolean InPracticeQuePage() {
		return square_array.isDisplayed();
	}

	public void PracticeQuePage() {
		practice_que_page.click();
	}

	public void SearchArrayClick() {
		search_array.click();
	}

	public boolean displayTryHereText() {
		return search_array_page_display.isDisplayed();
	}

	public void clickOnMaxConsecutive() {

		max_cons_one.click();
	}

	public void MaxConsPageClickRunBtnforNoCode() {
		new Actions(driver).keyDown(Keys.CONTROL).sendKeys("a").sendKeys(Keys.DELETE).keyUp(Keys.CONTROL).perform();
		Run_btn_array.click();

	}

	public void errorMessageForMaxCons() {
		Alert alert = driver.switchTo().alert();
		alert.getText();
		alert.accept();
	}

	public void FindEvenNumber() {

		even_num_find.click();
	}

	public void submitclick_evenNumber() {
		codeText_line.clear();
		submit_btn.click();
		String error_msg = ArrayInPythonOutput.getText();
		System.out.println("error msg" + error_msg);
	}

	public void NavigateToSortedArray() {

		square_array.click();
	}

	public void Tryheresortedarray() {
		square_array.click();
	}
}
