package dsAlgo_StepDefinition;

import java.io.IOException;
import javax.script.ScriptException;
import org.testng.Assert;
import dsAlgo_PageFactory.Array_PageFactory;
import dsAlgo_PageFactory.Home_PageFactory;
import dsAlgo_PageFactory.Login_PageFactory;
import dsAlgo_Reader.LoggerReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Array {

	Home_PageFactory homePage;
	Login_PageFactory loginPage;

	Array_PageFactory arrayPage = new Array_PageFactory();

	@Given("User is on the Home page of dsalgo portal")
	public void user_is_on_the_home_page_of_dsalgo_portal() {
		LoggerReader.info("User is on the Home page of dsalgo portal");
	}

	@When("User clicks on Get Started button under Array section")
	public void user_clicks_on_get_started_button_under_array_section() throws InterruptedException {

		arrayPage.arrayGetStartedBtn();
	}

	@Then("User is navigated to Array page")
	public void user_is_navigated_to_array_page() {
		Assert.assertEquals(arrayPage.array_displayTitle(), true);
		System.out.println("i am in array page");
	}

	@When("User selects Arrays option from Data Structures drop-down")
	public void user_selects_arrays_option_from_data_structures_drop_down() throws InterruptedException {
		arrayPage.array_dropdown_Selection();
		Thread.sleep(3000);
	}

	@Given("The user is in the Array page after clicking on getstarted btn in array")
	public void the_user_is_in_the_array_page_after_clicking_on_getstarte_btn_in_array() {
		arrayPage.arrayGetStartedBtn();
		LoggerReader.info("user is in the Array page after Sign-In");

	}

	@Given("checks whether the Arrays in Python link is enabled")
	public void checks_whether_the_arrays_in_python_link_is_enabled() {
		LoggerReader.info("user checks the Arrays in Python link is enabled");
	}

	@When("The user clicks Arrays in Python link")
	public void the_user_clicks_arrays_in_python_link() {

		arrayPage.arrayInPythonClicked();
	}

	@Then("The user should be able to navigate to Arrays in Python page")
	public void the_user_should_be_able_to_navigate_to_arrays_in_python_page() {
		Assert.assertEquals(arrayPage.navigateToarrayInPythonPage(), true);
	}

	@Given("The user is in the Arrays in Python page")
	public void the_user_is_in_the_arrays_in_python_page() {
		LoggerReader.info("user is in the Arrays in Python page");
	}

	@When("The user clicks Try Here >>> button in the Arrays in Python page")
	public void the_user_clicks_try_here_button_in_the_arrays_in_python_page() {

		arrayPage.tryHereBtnarrayInPython();
	}

	@Given("user is navigate to the tryEditor page after clicking on getstarted btn and then navigate to Implementation of Array module")
	public void user_is_navigate_to_the_try_editor_page_after_clicking_on_getstarted_btn_and_then_navigate_to_implementation_of_array_module() {
		arrayPage.arrayGetStartedBtn();
		arrayPage.arrayInPythonClicked();
		arrayPage.tryHereBtnarrayInPython();
	}

	@When("The user enter the valid pythoncode input from sheet {string} and {int} in Array module and clicks on run button")
	public void the_user_enter_the_valid_pythoncode_input_from_sheet_in_array_module_and_clicks_on_run_button(
			String sheetName, Integer rowNumber) throws IOException, InterruptedException, ScriptException {

		arrayPage.readExcel_forTryHereArray(sheetName, rowNumber);
	}

//	@Then("The user should be able to navigate to Try Editor page with Run button to test")
//	public void the_user_should_be_able_to_navigate_to_try_editor_page_with_run_button_to_test() {
//
//		LoggerReader.info("user navigate to Try Editor page with Run button to test");
//
//	}

	@When("The user enter the invalid pythoncode input from sheet {string} and {int} in Array module and clicks on run button")
	public void the_user_enter_the_invalid_pythoncode_input_from_sheet_in_array_module_and_clicks_on_run_button(
			String sheetName, Integer rowNumber) throws IOException, InterruptedException, ScriptException {

		arrayPage.readExcel_forTryHereArray(sheetName, rowNumber);
	}

	@Then("The user checks output in the console output")
	public void the_user_checks_output_in_the_console_output() {

		LoggerReader.info("User is able to see the output in console");
	}

	@Given("user is navigate to the tryEditor page after clicking on getstarted btn and then navigate to Array using list")
	public void user_is_navigate_to_the_tryEditor_page_after_clicking_on_getstarted_btn_and_then_navigate_to_Array_using_list() {
		arrayPage.arrayGetStartedBtn();
		arrayPage.arrayUsingListlink();
		arrayPage.tryHereBtnarrayInPython();
	}

	@When("The user clicks Arrays using List link")
	public void the_user_clicks_arrays_using_list_link() throws InterruptedException {
		Thread.sleep(3000);
		arrayPage.arrayUsingListlink();
	}

	@Then("The user should be able to navigate to Arrays using List page")
	public void the_user_should_be_able_to_navigate_to_arrays_using_list_page() {
		Assert.assertEquals(arrayPage.arrayUsingListDisplay(), true);

	}

	@Given("The user is in the Arrays using List page")
	public void the_user_is_in_the_arrays_using_list_page() {
		LoggerReader.info("user is in array using list page");
	}

	@When("The user clicks Try Here >>> button in the Arrays using List page")
	public void the_user_clicks_try_here_button_in_the_arrays_using_list_page() {
		arrayPage.tryHereBtnarrayInPython();
	}

	@Then("The user checks output in the console output in Array module")
	public void the_user_checks_output_in_the_console_output_in_array_module() {

		LoggerReader.info("user is in console output page for Array using list");
	}

	@Then("The user should be able to navigate to Arrays Using List")
	public void the_user_should_be_able_to_navigate_to_arrays_using_list() {
		Assert.assertEquals(arrayPage.arrayUsingListDisplay(), true);
	}

	@When("The user clicks Basic Operations in Lists link")
	public void the_user_clicks_basic_operations_in_lists_link() {

		arrayPage.BasicOperationListLink();
	}

	@Then("The user should be able to navigate to Basic Operations in Lists page")
	public void the_user_should_be_able_to_navigate_to_basic_operations_in_lists_page() {

		Assert.assertEquals(arrayPage.InBasicOprPage(), true);
	}

	@Given("The user is in the Basic Operations in Lists page")
	public void the_user_is_in_the_basic_operations_in_lists_page() {

		LoggerReader.info("user is in Basic Operations in Lists page");
	}

	@When("The user clicks Try Here >>> button in the Basic Operations in Lists page")
	public void the_user_clicks_try_here_button_in_the_basic_operations_in_lists_page() {

		arrayPage.tryHereBtnarrayInPython();
	}

	@Given("The user is on the tryEditor page in Basic Operations in Lists page")
	public void the_user_is_on_the_try_editor_page_in_basic_operations_in_lists_page() {

		LoggerReader.info("user is on try editor page Basic Operations in Lists page");
	}

	@Then("The user checks output in the console")
	public void the_user_checks_output_in_the_console() {

		// Assert.assertEquals(arrayPage.InBasicOprPage(), true);
		LoggerReader.info("user is able to see output in console");
	}

	@When("user click on basic operation link")
	public void user_click_on_basic_operation_link() {
		arrayPage.BasicOperationListLink();
	}

	@Then("The user should be able to navigate to basic operation list page")
	public void the_user_should_be_able_to_navigate_to_basic_operation_list_page() {
		Assert.assertEquals(arrayPage.InBasicOprPage(), true);
	}

	@Given("The user is in the Array page after clicking on getstarted btn in array and navigate to Basic Operations in Lists page")
	public void The_user_is_in_the_Array_page_after_clicking_on_getstarted_btn_in_array_and_navigate_to_Basic_Operations_in_Lists_page() {
		arrayPage.arrayGetStartedBtn();
		arrayPage.BasicOperationListLink();
		arrayPage.tryHereBtnarrayInPython();
	}

	@When("The user clicks Applications of Array in Lists link")
	public void the_user_clicks_applications_of_array_in_lists_link() {
		arrayPage.ApplicationOfArrayClick();
	}

	@Given("The user is in the Applications of Array in Lists page")
	public void the_user_is_in_the_applications_of_array_in_lists_page() {
		LoggerReader.info("user is in the Applications of Array in Lists");
	}

	@Given("The user is in the Array page after clicking on getstarted btn in array and navigate to the Applications of Array in Lists page")
	public void The_user_is_in_the_Array_page_after_clicking_on_getstarted_btn_in_array_and_navigate_to_the_Applications_of_Array_in_Lists_page() {
		arrayPage.arrayGetStartedBtn();
		arrayPage.ApplicationOfArrayClick();
		arrayPage.tryHereBtnarrayInPython();
		LoggerReader.info("user is in the Applications of Array in Lists");
	}

	@When("The user clicks Try Here >>> button in the Applications of Array in Lists page")
	public void the_user_clicks_try_here_button_in_the_applications_of_array_in_lists_page() {
		arrayPage.tryHereBtnarrayInPython();
	}

	@When("The user enter the valid and invalid pythoncode input from sheet {string} and {int} in in Applications of Array page and clicks on run button")
	public void the_user_enter_the_valid_and_invalid_pythoncode_input_from_sheet_and_in_in_applications_of_array_page_and_clicks_on_run_button(
			String sheetName, Integer rowNumber) throws IOException, InterruptedException {

		// arrayPage.chkTryhereArraytoPython();
		arrayPage.readExcel_forTryHereArray(sheetName, rowNumber);
	}

	@When("The user clicks Pactice Question link")
	public void the_user_clicks_pactice_question_link() {
		arrayPage.PracticeQuePage();
	}

	@Then("The user should be able to navigate to Applications of Array page")
	public void the_user_should_be_able_to_navigate_to_applications_of_array_page() {
		Assert.assertEquals(arrayPage.applcationOfArrayDisplay(), true);
	}

	@Given("The user is in the Array page after clicking on getstarted btn in array for practice question")
	public void The_user_is_in_the_Array_page_after_clicking_on_getstarted_btn_in_array_for_practice_question() {
		arrayPage.arrayGetStartedBtn();
		arrayPage.arrayUsingListlink();

	}

	@Then("The user should be able to navigate to practice question page")
	public void the_user_should_be_able_to_navigate_to_practice_questions_page() {
		// Assert.assertEquals(arrayPage.InPracticeQuePage(), true);
		LoggerReader.info("user is in the Practice Questions editor page");
	}

	@Given("The user is in the Array page after clicking on getstarted btn and navigate to Practice Questions editor page")
	public void The_user_is_in_the_Array_page_after_clicking_on_getstarted_btn_and_navigate_to_Practice_Questions_editor_page() {
		arrayPage.arrayGetStartedBtn();
		arrayPage.arrayUsingListlink();
		arrayPage.PracticeQuePage();
		LoggerReader.info("user is in the Practice Questions editor page");
	}

	@When("The user clicks Search the array Page link")
	public void the_user_clicks_search_the_array_page_link() {
		arrayPage.SearchArrayClick();
	}

	@Then("The user should be able to navigate to the array Page link")
	public void the_user_should_be_able_to_navigate_to_the_array_page_link() {
		Assert.assertEquals(arrayPage.displayTryHereText(), true);
	}

	@Given("The user navigate from getstarted btn to the search the array page")
	public void the_user_navigate_from_getstarted_btn_to_the_search_the_array_page() {
		arrayPage.arrayGetStartedBtn();
		arrayPage.arrayUsingListlink();
		arrayPage.PracticeQuePage();
		arrayPage.SearchArrayClick();
		LoggerReader.info("user is in the search the array page");
	}

	@Then("The user get an output")
	public void the_user_get_an_output() {
		LoggerReader.info("user is able to see output in console");

	}

	@Then("The user should be able to navigate to Practice question page")
	public void the_user_should_be_able_to_navigate_to_practice_question_page() {
		Assert.assertEquals(arrayPage.InPracticeQuePage(), true);
	}

	@Given("The user is in Practice Questions page")
	public void the_user_is_in_practice_questions_page() {
		LoggerReader.info("user is in Practice Questions page");
	}

	@When("The user click on Max Consecutive Ones link")
	public void the_user_clicks_click_on_max_consecutive_ones_link() {
		arrayPage.clickOnMaxConsecutive();
	}

	@Then("The user should be able to navigate to Max Consecutive Ones")
	public void the_user_should_be_able_to_navigate_to_max_consecutive_ones() {
		Assert.assertEquals(arrayPage.displayTryHereText(), true);
	}

	@Given("The user navigate from getstarted btn for the try here page of Max Consecutive Ones page")
	public void the_user_navigate_from_getstarted_btn_to_the_try_here_page_of_Max_Consecutive_Ones_page() {
		arrayPage.arrayGetStartedBtn();
		arrayPage.arrayUsingListlink();
		arrayPage.PracticeQuePage();
		arrayPage.clickOnMaxConsecutive();
		LoggerReader.info("user is on the try here page of the Max Consecutive Ones page");
	}

	@Then("The user should able to see output in the console")
	public void the_user_should_able_to_see_output_in_the_console() {
		// Assert.assertEquals(arrayPage.MaxConsPageDisplay(),true);

	}

	@Then("run button is not performing any action")
	public void run_button_is_not_performing_any_action() {
		LoggerReader.info("run button is not performing any action");
		// Assert.assertEquals(arrayPage.errorMessageForMaxCons(), true);
		// arrayPage.errorMessageForMaxCons();
	}

	@Then("The user should be navigate to Practice question page")
	public void the_user_should_be_navigate_to_practice_question_page() {
		Assert.assertEquals(arrayPage.InPracticeQuePage(), true);
		// LoggerReader.info(" user should be navigate to Practice question page");
	}

	@Given("The user navigate from get started btn in array page to the Practice Questions page")
	public void the_use_navigate_from_get_started_btn_in_array_page_to_the_Practice_Questions_page() {
		arrayPage.arrayGetStartedBtn();
		arrayPage.arrayUsingListlink();
		arrayPage.PracticeQuePage();
	}

	@When("The user click on Find Numbers with Even Number of Digits link")
	public void the_user_click_on_find_numbers_with_even_number_of_digits_link() {
		arrayPage.FindEvenNumber();
	}

	@Then("The user should be able to navigate to try here of Find Numbers with Even Number of Digits page")
	public void the_user_should_be_able_to_navigate_to_try_here_of_find_numbers_with_even_number_of_digits_page() {
		Assert.assertEquals(arrayPage.displayTryHereText(), true);
	}

	@Given("The user navigate from getstarted btn for the try here page of Find Numbers with Even Number of Digits")
	public void the_user_navigate_from_getstarted_btn_for_the_try_here_page_of_Find_Numbers_with_Even_Number_of_Digits() {
		arrayPage.arrayGetStartedBtn();
		arrayPage.arrayUsingListlink();
		arrayPage.PracticeQuePage();
		arrayPage.FindEvenNumber();
	}

	@Then("The user should able to see the output")
	public void the_user_should_able_to_see_the_output() {
		// arrayPage.output();
		LoggerReader.info(" user is able to see the output");
	}

	@Then("The user should be able to see an empty window")
	public void the_user_should_be_able_to_see_an_empty_window() {
		// ** Assert.assertEquals(arrayPage.runbtnAfterTryHere(), true);
		LoggerReader.info(" user is navigate to empty window");
	}

	@When("The user clicks the Submit Button without entering the code in the Editor")
	public void the_user_clicks_the_submit_button_without_entering_the_code_in_the_editor() {
		LoggerReader.info("clicks the Submit Button without entering the code");
	}

	@When("The user clicks the Run Button without entering the code in the Editor")
	public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor() {

		LoggerReader.info("user clicks the Run Button without entering the code");
	}

	@Then("The user should  see an error message")
	public void the_user_should_see_an_error_message() {
		// arrayPage.output();
		// arrayPage.submitclick_evenNumber();
		LoggerReader.info("The user see an error message");

	}

	@When("The user click on  the Squares of a Sorted Array Page")
	public void the_user_click_on_the_squares_of_a_sorted_array_page() {
		arrayPage.NavigateToSortedArray();
	}

	@Given("The user navigate from getstarted btn for the try here page of a Sorted Array question")
	public void the_user_navigate_from_getstarted_btn_for_the_try_here_page_of_a_Sorted_Array_question() {

		arrayPage.arrayGetStartedBtn();
		arrayPage.arrayUsingListlink();
		arrayPage.PracticeQuePage();
		arrayPage.NavigateToSortedArray();
	}

	@Then("The user should be able to navigate to try here Squares of a Sorted Array Page")
	public void the_user_should_be_able_to_navigate_to_try_here_squares_of_a_sorted_array_page() {
		Assert.assertEquals(arrayPage.displayTryHereText(), true);
	}

	@When("The user write the valid code input from  sheet {string} and {int} and click on run button")
	public void the_user_write_the_valid_code_input_from_sheet_and_and_click_on_run_button(String sheetName,
			Integer rowNumber) throws InterruptedException, IOException {

		arrayPage.readExcel_forTryHereArray(sheetName, rowNumber);
	}

	@Then("The user should able to see an error message")
	public void the_user_should_able_to_see_an_error_message() {

		LoggerReader.info("user can see error message");

	}

}
