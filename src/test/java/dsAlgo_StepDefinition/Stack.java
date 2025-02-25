package dsAlgo_StepDefinition;

import java.io.IOException;
import org.testng.Assert;
import dsAlgo_PageFactory.Home_PageFactory;
import dsAlgo_PageFactory.Login_PageFactory;
import dsAlgo_PageFactory.Stack_PageFactory;
import dsAlgo_Reader.LoggerReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stack {


    Home_PageFactory homePage;
    Login_PageFactory loginPage;
    Stack_PageFactory stackPage = new Stack_PageFactory();

	@Given("The user clicks the Sign In Button from the portal")
	public void the_user_clicks_the_sign_in_button_from_the_portal() {
		LoggerReader.info("Logging ::::::User clicks the Sign In Button from the portal");

	}

	@When("User clicks on the Get Started button under Stack section")
	public void user_clicks_on_the_get_started_button_under_stack_section() throws InterruptedException {
		stackPage.StackGetStarted();
		LoggerReader.info("Logging ::::::User clicks on the Get Started button under Stack section");

	}

	@Then("User is navigated to Stack page")
	public void user_is_navigated_to_stack_page() {
		LoggerReader.info("Logging ::::::User is navigated to Stack page");
		Assert.assertEquals(stackPage.OperationsinStacklinkEnabled(), true);

	}

	@Given("The user is in the Stack page after Sign-In")
	public void the_user_is_in_the_stack_page_after_sign_in() {
		stackPage.StackGetStarted();
		LoggerReader.info("Logging ::::::User is in the Stack page after Sign-In");

	}

	@When("The user checks whether the Operations in Stack link is enabled")
	public void the_user_checks_whether_the_operations_in_stack_link_is_enabled() {
		stackPage.OperationsinStacklinkEnabled();
		LoggerReader.info("Logging ::::::User Checks the Operations in Stack link is Enabled");

	}

	@Then("The user should be able to see Operations in Stack link enabled in the Stack page")
	public void the_user_should_be_able_to_see_operations_in_stack_link_enabled_in_the_stack_page() {
		Assert.assertEquals(stackPage.OperationsinStacklinkEnabled(), true);
		LoggerReader.info("Logging ::::::User see Operations in Stack link enabled in the Stack page");

	}

	@When("The user checks whether the Implementation link is enabled")
	public void the_user_checks_whether_the_implementation_link_is_enabled() {
		stackPage.ImplementationLinkEnabled();
		LoggerReader.info("Logging ::::::User see Implementation link is enabled");

	}

	@Then("The user should be able to see Implementation link enabled in the Stack page")
	public void the_user_should_be_able_to_see_implementation_link_enabled_in_the_stack_page() {
		Assert.assertEquals(stackPage.ImplementationLinkEnabled(), true);
		LoggerReader.info("Logging ::::::User able to see Implementation link enabled in the Stack page");

	}

	@When("The user checks whether the Applications link is enabled")
	public void the_user_checks_whether_the_applications_link_is_enabled() {
		stackPage.ApplicationLinkEnabled();
		LoggerReader.info("Logging ::::::User able to see the Applications link is enabled");

	}

	@Then("The user should be able to see Applications link enabled in the Stack page")
	public void the_user_should_be_able_to_see_applications_link_enabled_in_the_stack_page() {
		Assert.assertEquals(stackPage.ApplicationLinkEnabled(), true);
		LoggerReader.info("Logging ::::::User able to see Applications link enabled in the Stack page");

	}

	@When("The user clicks Operations in Stack link in the Stack page")
	public void the_user_clicks_operations_in_stack_link_in_the_stack_page() throws InterruptedException {
		stackPage.Operations_Click();
		LoggerReader.info("Logging ::::::The user clicks Operations in Stack link in the Stack page");

	}

	@Then("The user should be able to navigate to Operations in Stack page")
	public void the_user_should_be_able_to_navigate_to_operations_in_stack_page() {
		Assert.assertEquals(stackPage.OperationsinStacklinkEnabled(), true);
		LoggerReader.info("Logging ::::::User able to navigate to Operations in Stack page");

	}

	@Given("The user is in the Operations in Stack page")
	public void the_user_is_in_the_operations_in_stack_page() {
		stackPage.StackGetStarted();
		stackPage.Operations_Click();
		LoggerReader.info("Logging ::::::User able to see all Operations in Stack page");

	}

	@When("The user clicks Try Here >>> button in the Operations in Stack page")
	public void the_user_clicks_try_here_button_in_the_operations_in_stack_page() {
		stackPage.TryHere_Click();
		LoggerReader.info("Logging ::::::User clicks Try Here >>> button in the Operations in Stack page");

	}

	@Then("The user should be able to navigate to Stack Try Editor page with Run button to test")
	public void the_user_should_be_able_to_navigate_to_stack_try_editor_page_with_run_button_to_test() {
		LoggerReader.info("Logging ::::::User should be able to navigate to Try Editor page with Run button to test");

	}

	@Given("The user is in the Try Editor page for the Operations in Stack page")
	public void the_user_is_in_the_try_editor_page_for_the_operations_in_stack_page() {
		stackPage.StackGetStarted();
		stackPage.Operations_Click();
		stackPage.TryHere_Click();
		LoggerReader.info("Logging ::::::User is in the Try Editor page for the Operations in Stack page");

	}

	@When("User enters valid, invalid and incorrect syntax code from excel sheet {string} and {int} and clicks on Run button for the Operations in Stack page")
	public void user_enters_valid_invalid_and_incorrect_syntax_code_from_excel_sheet_and_and_clicks_on_run_button_for_the_operations_in_stack_page(
			String sheetName, int rowNumber) throws IOException, InterruptedException {
		stackPage.tryEditorWindow(sheetName, rowNumber);
		LoggerReader.info(
				"Logging ::::::User enters valid, invalid and incorrect syntax code from excel sheet {string} and {int} and clicks on Run button for the Operations in Stack page");
	}

	@Then("The user should be able to get an output in the Try Editor screen for the Operations in Stack page")
	public void the_user_should_be_able_to_get_an_output_in_the_try_editor_screen_for_the_operations_in_stack_page() {
		LoggerReader.info(
				"Logging ::::::user should be able to get an output in the Try Editor screen for the Operations in Stack page");

	}

	@When("The user clicks Implementation link in the Stack page")
	public void the_user_clicks_implementation_link_in_the_stack_page() throws InterruptedException {
		stackPage.Implementation_Click();
		LoggerReader.info("Logging ::::::user clicks Implementation link in the Stack page");

	}

	@Then("The user should be able to navigate to Implementation page")
	public void the_user_should_be_able_to_navigate_to_implementation_page() {
		Assert.assertEquals(stackPage.ImplementationLinkEnabled(), true);
		LoggerReader.info("Logging ::::::user should be able to navigate to Implementation page");

	}

	@Given("The user is in the Implementation page")
	public void the_user_is_in_the_implementation_page() {
		stackPage.StackGetStarted();
		stackPage.Implementation_Click();
		LoggerReader.info("Logging ::::::User is in the Implementation page");

	}

	@When("The user clicks Try Here >>> button in the Implementation page")
	public void the_user_clicks_try_here_button_in_the_implementation_page() {
		stackPage.TryHere_Click();
		LoggerReader.info("Logging ::::::user clicks Try Here >>> button in the Implementation page");

	}

	@Given("The user is in the Try Editor page for the Implementation page")
	public void the_user_is_in_the_try_editor_page_for_the_implementation_page() {
		stackPage.StackGetStarted();
		stackPage.Implementation_Click();
		stackPage.TryHere_Click();
		LoggerReader.info("Logging ::::::user is in the Try Editor page for the Implementation page");

	}

	@When("User enters valid, invalid and incorrect syntax code from excel sheet {string} and {int} and clicks on Run button for the Implementation page")
	public void user_enters_valid_invalid_and_incorrect_syntax_code_from_excel_sheet_and_and_clicks_on_run_button_for_the_implementation_page(
			String sheetName, int rowNumber) throws IOException, InterruptedException {
		stackPage.tryEditorWindow(sheetName, rowNumber);
		LoggerReader.info(
				"Logging ::::::User enters valid, invalid and incorrect syntax code from excel sheet {string} and {int} and clicks on Run button for the Implementation page");

	}

	@Then("The user should be able to get an output in the Try Editor screen for the Implementation page")
	public void the_user_should_be_able_to_get_an_output_in_the_try_editor_screen_for_the_implementation_page() {
		LoggerReader.info(
				"Logging ::::::user should be able to get an output in the Try Editor screen for the Implementation page");

	}

	@When("The user clicks Applications link in the Stack page")
	public void the_user_clicks_applications_link_in_the_stack_page() throws InterruptedException {
		stackPage.Stack_Applications_Click();
		LoggerReader.info("Logging ::::::user clicks Applications link in the Stack page");

	}

	@Then("The user should be able to navigate to Applications page")
	public void the_user_should_be_able_to_navigate_to_applications_page() {
		Assert.assertEquals(stackPage.ApplicationLinkEnabled(), true);
		LoggerReader.info("Logging ::::::User should be able to navigate to Applications page");

	}

	@Given("The user is in the Applications page")
	public void the_user_is_in_the_applications_page() {
		stackPage.StackGetStarted();
		stackPage.Stack_Applications_Click();
		LoggerReader.info("Logging ::::::User is in the Applications page");

	}

	@When("The user clicks Try Here >>> button in the Applications page")
	public void the_user_clicks_try_here_button_in_the_applications_page() {
		stackPage.TryHere_Click();
		LoggerReader.info("Logging ::::::User clicks Try Here >>> button in the Applications page");

	}

	@Given("The user is in the Try Editor page for the Applications page")
	public void the_user_is_in_the_try_editor_page_for_the_applications_page() {
		stackPage.StackGetStarted();
		stackPage.Stack_Applications_Click();
		stackPage.TryHere_Click();
		LoggerReader.info("Logging ::::::User is in the Try Editor page for the Applications page");

	}

	@When("User enters valid, invalid and incorrect syntax code from excel sheet {string} and {int} and clicks on Run button for the Applications page")
	public void user_enters_valid_invalid_and_incorrect_syntax_code_from_excel_sheet_and_and_clicks_on_run_button_for_the_applications_page(
			String sheetName, int rowNumber) throws IOException, InterruptedException {
		stackPage.tryEditorWindow(sheetName, rowNumber);
		LoggerReader.info(
				"Logging ::::::User enters valid, invalid and incorrect syntax code from excel sheet {string} and {int} and clicks on Run button for the Applications page");

	}

	@Then("The user should be able to get an output in the Try Editor screen for the Applications page")
	public void the_user_should_be_able_to_get_an_output_in_the_try_editor_screen_for_the_applications_page() {
		LoggerReader.info(
				"Logging ::::::User should be able to get an output in the Try Editor screen for the Applications page");

	}

	@When("The User clicks Practice questions link")
	public void the_user_clicks_practice_questions_link() throws InterruptedException {
		stackPage.Practice_Questions_Click();
		LoggerReader.info("Logging ::::::User clicks Practice questions link");

	}

	@Then("The user should be redirected to Practice page")
	public void the_user_should_be_redirected_to_practice_page() {
		LoggerReader.info("Logging ::::::User should be redirected to Practice page");
	}

}