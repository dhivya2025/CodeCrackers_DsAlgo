
package dsAlgo_StepDefinition;

import java.io.IOException;
import org.testng.Assert;
import dsAlgo_Reader.LoggerReader;
import dsAlgo_PageFactory.DataStructure_PageFactory;
import dsAlgo_PageFactory.Home_PageFactory;
import dsAlgo_PageFactory.Login_PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataStructure {

	DataStructure_PageFactory dSPage = new DataStructure_PageFactory();
	Home_PageFactory homePage;
	Login_PageFactory loginPage;

	@Then("User should navigate to try editor page")
	public void user_should_navigate_to_try_editor_page() {

		Assert.assertEquals(dSPage.tryeditor_page(), true);

	}

	@Given("User is on home page of dsalgo portal after signin")
	public void user_is_on_home_page_of_dsalgo_portal_after_signin() {
		LoggerReader.info("User is on the Home page of dsalgo portal after signin");
	}

	@When("User clicks on Get Started button under Data Structures Introduction section")
	public void user_clicks_on_get_started_button_under_data_structures_introduction_section()
			throws InterruptedException {
		Thread.sleep(3000);
		dSPage.getStartedDataStructureBtn();

	}

	@Then("User should be navigated to Data Structures Introduction page")
	public void user_should_be_navigated_to_data_structures_introduction_page() {

		Assert.assertEquals(dSPage.datastructureIntropageDisplayed(), true);

	}

	@Given("User is on home page and clicks on Get Started button under Data Structures Introduction section")
	public void user_is_on_home_page_and_clicks_on_Get_Started_button_under_Data_Structures_Introduction_section() {
		dSPage.getStartedDataStructureBtn();

	}

	@When("User checks if Time Complexity link is enabled on data structure introduction page")
	public void user_checks_if_time_complexity_link_is_enabled_on_data_structure_introduction_page() {

		LoggerReader.info(" Time Complexity link is enabled");
	}

	@Then("time complexity link should be enabled")
	public void time_complexit_link_should_be_enabled() {
		Assert.assertEquals(dSPage.timecomplexity_btnEnabled(), true);
	}

	@Then("user click on time complexity link")
	public void user_click_on_try_here_button_on_time_complexity() throws InterruptedException {

		dSPage.timecomplexity_buttonClick();
		Thread.sleep(3000);
	}

	@Given("User is navtigate to time complexity page")
	public void user_is_navigated_to_time_complexity_page() {
		dSPage.timecomplexity_buttonClick();
		LoggerReader.info("User is navigated to Time Complexity page");
	}

	@When("User click on try here>> button on time complexity page")
	public void user_click_on_try_here_button_on_timecomplexity_page() throws InterruptedException {

		dSPage.tryhere_buttonClick();
	}

	@Then("User should navigate to time complexity link")
	public void user_should_navigate_to_time_complexity_link() {
		Assert.assertEquals(dSPage.timecomplexity_page_enable(), true);
	}

	@Given("User clicks on data structure introduction page and navigate to try editor after clicking on try here btn")
	public void User_clicks_on_data_structure_introductio_page_and_navigate_to_try_editor_after_clicking_on_try_here_btn()
			throws InterruptedException {

		dSPage.getStartedDataStructureBtn();
		dSPage.timecomplexity_buttonClick();
		dSPage.tryhere_buttonClick();
	}

	@When("User enters valid code from excel sheet {string} and {int} and clicks on Run  button")
	public void user_enters_valid_code_from_excel_sheet_and_and_clicks_on_run_button(String sheetName,
			Integer rowNumber) throws IOException {

		dSPage.readExcel_fortryhere(sheetName, rowNumber);

	}

	@When("User enters invalid and incorrect syntax code from excel sheet {string} and {int} and clicks on Run  button")
	public void user_enters_invalid_and_incorrect_syntax_code_from_excel_sheet_and_and_clicks_on_run_button(
			String sheetName, Integer rowNumber) throws IOException {
		dSPage.readExcel_fortryhere(sheetName, rowNumber);
	}

	@Then("The user should be able to get an output in the Try Editor screen")
	public void the_user_should_be_able_to_get_an_output_in_the_try_editor_screen() {
		LoggerReader.info("user should be able to get an output in the Try Editor screen");
		Assert.assertEquals(dSPage.tryeditor_page(), true);

	}

	@Given("User is on Time Complexity page")
	public void user_is_on_time_complexity_page() {
		LoggerReader.info("User is on Time Complexity page");

	}

	@Given("The user is on time complexity page")
	public void the_user_is_on_time_complexity_page() {
		LoggerReader.info("User is on Time Complexity page");
	}

	@When("User clicks on Practice Questions link")
	public void user_clicks_on_practice_questions_link() {

		dSPage.practice_que();
	}

	@Then("User should be redirected to Practice Questions page")
	public void user_should_be_redirected_to_practice_questions_page() {

		Assert.assertEquals(dSPage.NavigatePracticeQuePage(), true);

	}

	@Given("User is on home page of dsalgo portal for checking dropdown selection")
	public void user_is_on_home_page_of_dsalgo_portal_for_checking_dropdown_selection() {
		LoggerReader.info("User is on the Home page of dsalgo portal");
	}

	@When("User clicks on Data Structures dropdown name")
	public void user_clicks_on_data_structures_dropdown_name() {

		dSPage.DataStructure_dropdown();
	}

	@Then("User should not be able to click the data structure menu")
	public void user_should_not_be_able_to_click_the_data_structure_menu() {

		LoggerReader.info("unbale to ckick on data structure menu");
	}
}