package dsAlgo_StepDefinition;

import java.io.IOException;
import org.testng.Assert;
import dsAlgo_PageFactory.Home_PageFactory;
import dsAlgo_PageFactory.Login_PageFactory;
import dsAlgo_PageFactory.Queue_PageFactory;
import dsAlgo_Reader.LoggerReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Queue {
	

    Home_PageFactory homePage;
    Login_PageFactory loginPage;
    Queue_PageFactory queuePage = new Queue_PageFactory();

    @When("User clicks on the Get Started button under Queue section")
    public void user_clicks_on_the_get_started_button_under_queue_section() throws InterruptedException {
    	queuePage.QueueGetStarted();
    	LoggerReader.info("Logging ::::::User clicks on the Get Started button under Queue section");
        
    }
    
    @Then("User is navigated to Queue page")
    public void user_is_navigated_to_queue_page() {
    	Assert.assertEquals(queuePage.QueueOperationslinkEnabled(),true);
    	LoggerReader.info("Logging ::::::User is navigated to Queue page");
    }

    @Given("The user is in the Queue page after Sign-In")
    public void the_user_is_in_the_queue_page_after_sign_in() {
    	queuePage.QueueGetStarted();
    	LoggerReader.info("Logging ::::::The user is in the Queue page after Sign-In");
        
    }

    @When("The user checks whether the Implementation of Queue in Python link is enabled")
    public void the_user_checks_whether_the_implementation_of_queue_in_python_link_is_enabled() {
    	queuePage.ImplementationofQueueinPythonlinkEnabled();
    	LoggerReader.info("Logging ::::::The user checks whether the Implementation of Queue in Python link is enabled");
        
    }

    @Then("The user should be able to see Implementation of Queue in Python link enabled in the Queue page")
    public void the_user_should_be_able_to_see_implementation_of_queue_in_python_link_enabled_in_the_queue_page() {
    	Assert.assertEquals(queuePage.ImplementationofQueueinPythonlinkEnabled(),true);
    	LoggerReader.info("Logging ::::::The user should be able to see Implementation of Queue in Python link enabled in the Queue page");
        
    }

    @When("The user checks whether the Implementation using collections.deque link is enabled")
    public void the_user_checks_whether_the_implementation_using_collections_deque_link_is_enabled() {
    	queuePage.ImplementationusingcollectionsdequelinkEnabled();
    	LoggerReader.info("Logging ::::::The user checks whether the Implementation using collections.deque link is enabled");
        
    }

    @Then("The user should be able to see Implementation using collections.deque link enabled in the Queue page")
    public void the_user_should_be_able_to_see_implementation_using_collections_deque_link_enabled_in_the_queue_page() {
    	Assert.assertEquals(queuePage.ImplementationusingcollectionsdequelinkEnabled(),true);
    	LoggerReader.info("Logging ::::::The user should be able to see Implementation using collections.deque link enabled in the Queue page");
        
    }

    @When("The user checks whether the Implementation using Array link is enabled")
    public void the_user_checks_whether_the_implementation_using_array_link_is_enabled() {
    	queuePage.ImplementationusingarrayLinkEnabled();
    	LoggerReader.info("Logging ::::::The user checks whether the Implementation using Array link is enabled");
        
    }

    @Then("The user should be able to see Implementation using Array link enabled in the Queue page")
    public void the_user_should_be_able_to_see_implementation_using_array_link_enabled_in_the_queue_page() {
    	Assert.assertEquals(queuePage.ImplementationusingarrayLinkEnabled(),true);
    	LoggerReader.info("Logging ::::::The user should be able to see Implementation using Array link enabled in the Queue page");
        
    }

    @When("The user checks whether the Queue Operations link is enabled")
    public void the_user_checks_whether_the_queue_operations_link_is_enabled() {
    	queuePage.QueueOperationslinkEnabled();
    	LoggerReader.info("Logging ::::::The user checks whether the Queue Operations link is enabled");
        
    }

    @Then("The user should be able to see Queue Operations link enabled in the Queue page")
    public void the_user_should_be_able_to_see_queue_operations_link_enabled_in_the_queue_page() {
    	Assert.assertEquals(queuePage.QueueOperationslinkEnabled(),true);
    	LoggerReader.info("Logging ::::::The user should be able to see Queue Operations link enabled in the Queue page");
        
    }

    @When("The user clicks Implementation of Queue in Python link in the Queue page")
    public void the_user_clicks_implementation_of_queue_in_python_link_in_the_queue_page() throws InterruptedException {
    	queuePage.Implementation_Of_Queue_In_Python_Click();
        LoggerReader.info("Logging ::::::The user clicks Implementation of Queue in Python link in the Queue page");
        
    }

    @Then("The user should be able to navigate to Implementation of Queue in Python page")
    public void the_user_should_be_able_to_navigate_to_implementation_of_queue_in_python_page() {
    	Assert.assertEquals(queuePage.Implementation_of_Queue_in_Python_visible(),true);    	
    	LoggerReader.info("Logging ::::::The user should be able to navigate to Implementation of Queue in Python page");
        
    }

    @Given("The user is in the Implementation of Queue in Python page")
    public void the_user_is_in_the_implementation_of_queue_in_python_page() {
    	queuePage.QueueGetStarted();
    	queuePage.Implementation_Of_Queue_In_Python_Click();
    	LoggerReader.info("Logging ::::::The user is in the Implementation of Queue in Python page");
        
    }

    @When("The user clicks Try Here >>> button in the Implementation of Queue in Python page")
    public void the_user_clicks_try_here_button_in_the_implementation_of_queue_in_python_page() {
    	queuePage.TryHere_Click();
    	LoggerReader.info("Logging ::::::The user clicks Try Here >>> button in the Implementation of Queue in Python page");
        
    }

    @Given("The user is in the Try Editor page for the Implementation of Queue in Python page")
    public void the_user_is_in_the_try_editor_page_for_the_implementation_of_queue_in_python_page() {
    	queuePage.QueueGetStarted();
    	queuePage.Implementation_Of_Queue_In_Python_Click();
    	queuePage.TryHere_Click();
    	LoggerReader.info("Logging ::::::The user is in the Try Editor page for the Implementation of Queue in Python page");
        
    }

    @When("User enters valid, invalid and incorrect syntax code from excel sheet {string} and {int} and clicks on Run button for the Implementation of Queue in Python page")
    public void user_enters_valid_invalid_and_incorrect_syntax_code_from_excel_sheet_and_and_clicks_on_run_button_for_the_implementation_of_queue_in_python_page(String sheetName, int rowNumber) throws IOException, InterruptedException {
    	queuePage.tryEditorWindow(sheetName, rowNumber);
    	LoggerReader.info("Logging ::::::User enters valid, invalid and incorrect syntax code from excel sheet {string} and {int} and clicks on Run button for the Implementation of Queue in Python page");
        
    }

    @Then("The user should be able to get an output in the Try Editor screen for the Implementation of Queue in Python page")
    public void the_user_should_be_able_to_get_an_output_in_the_try_editor_screen_for_the_implementation_of_queue_in_python_page() {
    	LoggerReader.info("Logging ::::::The user should be able to get an output in the Try Editor screen for the Implementation of Queue in Python page");
        
    }

    @When("The user clicks Implementation using collections.deque link in the Queue page")
    public void the_user_clicks_implementation_using_collections_deque_link_in_the_queue_page() throws InterruptedException {
    	queuePage.Implementation_Using_Collection_deque_Click();
    	LoggerReader.info("Logging ::::::The user clicks Implementation using collections.deque link in the Queue page");
        
    }

    @Then("The user should be able to navigate to Implementation using collections.deque page")
    public void the_user_should_be_able_to_navigate_to_implementation_using_collections_deque_page() {
    	Assert.assertEquals(queuePage.ImplementationusingcollectionsdequelinkEnabled(),true);
    	LoggerReader.info("Logging ::::::The user should be able to navigate to Implementation using collections.deque page");
        
    }

    @Given("The user is in the Implementation using collections.deque page")
    public void the_user_is_in_the_implementation_using_collections_deque_page() {
    	queuePage.QueueGetStarted();
    	queuePage.Implementation_Using_Collection_deque_Click();
    	LoggerReader.info("Logging ::::::The user is in the Implementation using collections.deque page");
        
    }

    @When("The user clicks Try Here >>> button in the Implementation using collections.deque page")
    public void the_user_clicks_try_here_button_in_the_implementation_using_collections_deque_page() {
    	queuePage.TryHere_Click();
    	LoggerReader.info("Logging ::::::The user clicks Try Here >>> button in the Implementation using collections.deque page");
        
    }

    @Given("The user is in the Try Editor page for the Implementation using collections.deque page")
    public void the_user_is_in_the_try_editor_page_for_the_implementation_using_collections_deque_page() {
    	queuePage.QueueGetStarted();
    	queuePage.Implementation_Using_Collection_deque_Click();
    	queuePage.TryHere_Click();
    	LoggerReader.info("Logging ::::::The user is in the Try Editor page for the Implementation using collections.deque page");
        
    }

    @When("User enters valid, invalid and incorrect syntax code from excel sheet {string} and {int} and clicks on Run button for the Implementation using collections.deque page")
    public void user_enters_valid_invalid_and_incorrect_syntax_code_from_excel_sheet_and_and_clicks_on_run_button_for_the_implementation_using_collections_deque_page(String sheetName, int rowNumber) throws IOException, InterruptedException {
    	queuePage.tryEditorWindow(sheetName, rowNumber);
    	LoggerReader.info("Logging ::::::User enters valid, invalid and incorrect syntax code from excel sheet {string} and {int} and clicks on Run button for the Implementation using collections.deque page");
        
    }

    @When("The user clicks Implementation using Array link in the Queue page")
    public void the_user_clicks_implementation_using_array_link_in_the_queue_page() throws InterruptedException {
    	queuePage.Implementation_Using_Array_Click();
    	LoggerReader.info("Logging ::::::The user clicks Implementation using Array link in the Queue page");
        
    }

    @Then("The user should be able to navigate to Implementation using Array page")
    public void the_user_should_be_able_to_navigate_to_implementation_using_array_page() {
    	Assert.assertEquals(queuePage.ImplementationusingarrayLinkEnabled(),true);
    	LoggerReader.info("Logging ::::::The user should be able to navigate to Implementation using Array page");
        
    }

    @Given("The user is in the Implementation using Array page")
    public void the_user_is_in_the_implementation_using_array_page() {
    	queuePage.QueueGetStarted();
    	queuePage.Implementation_Using_Array_Click();
    	LoggerReader.info("Logging ::::::The user is in the Implementation using Array page");
        
    }

    @When("The user clicks Try Here >>> button in the Implementation using Array page")
    public void the_user_clicks_try_here_button_in_the_implementation_using_array_page() {
    	queuePage.TryHere_Click();
    	LoggerReader.info("Logging ::::::The user clicks Try Here >>> button in the Implementation using Array page");
        
    }

    
	@Then("The user should be able to navigate to Try Editor page with Run button")
	public void the_user_should_be_able_to_navigate_to_try_editor_page_with_run_button() {
		LoggerReader.info("Logging ::::::The user should be able to navigate to Try Editor page with Run button");
	}
    
    
    @Given("The user is in the Try Editor page for the Implementation using Array page")
    public void the_user_is_in_the_try_editor_page_for_the_implementation_using_array_page() {
    	queuePage.QueueGetStarted();
    	queuePage.Implementation_Using_Array_Click();
    	queuePage.TryHere_Click();
    	LoggerReader.info("Logging ::::::The user is in the Try Editor page for the Implementation using Array page");
        
    }

    @When("User enters valid, invalid and incorrect syntax code from excel sheet {string} and {int} and clicks on Run button for the Implementation using Array page")
    public void user_enters_valid_invalid_and_incorrect_syntax_code_from_excel_sheet_and_and_clicks_on_run_button_for_the_implementation_using_array_page(String sheetName, int rowNumber) throws IOException, InterruptedException {
    	queuePage.tryEditorWindow(sheetName, rowNumber);
    	LoggerReader.info("Logging ::::::User enters valid, invalid and incorrect syntax code from excel sheet {string} and {int} and clicks on Run button for the Implementation using Array page");
        
    }

    @When("The user clicks Queue Operations link in the Queue page")
    public void the_user_clicks_queue_operations_link_in_the_queue_page() throws InterruptedException {
    	queuePage.Queue_Operations_Click();
    	LoggerReader.info("Logging ::::::The user clicks Queue Operations link in the Queue page");
        
    }

    @Then("The user should be able to navigate to Queue Operations page")
    public void the_user_should_be_able_to_navigate_to_queue_operations_page() {
    	Assert.assertEquals(queuePage.QueueOperationslinkEnabled(),true);
    	LoggerReader.info("Logging ::::::The user should be able to navigate to Queue Operations page");
        
    }

    @Given("The user is in the Queue Operations page")
    public void the_user_is_in_the_queue_operations_page() {
    	queuePage.QueueGetStarted();
    	queuePage.Queue_Operations_Click();
    	LoggerReader.info("Logging ::::::The user is in the Queue Operations page");
        
    }

    @When("The user clicks Try Here >>> button in the Queue Operations page")
    public void the_user_clicks_try_here_button_in_the_queue_operations_page() {
    	queuePage.TryHere_Click();
    	LoggerReader.info("Logging ::::::The user clicks Try Here >>> button in the Queue Operations page");
        
    }

    @Given("The user is in the Try Editor page for the Queue Operations page")
    public void the_user_is_in_the_try_editor_page_for_the_queue_operations_page() {
    	queuePage.QueueGetStarted();
    	queuePage.Queue_Operations_Click();
    	queuePage.TryHere_Click();
    	LoggerReader.info("Logging ::::::The user is in the Try Editor page for the Queue Operations page");
        
    }

    @When("User enters valid, invalid and incorrect syntax code from excel sheet {string} and {int} and clicks on Run button for the Queue Operations page")
    public void user_enters_valid_invalid_and_incorrect_syntax_code_from_excel_sheet_and_and_clicks_on_run_button_for_the_queue_operations_page(String sheetName, int rowNumber ) throws IOException, InterruptedException {
    	queuePage.tryEditorWindow(sheetName, rowNumber);
    	LoggerReader.info("Logging ::::::User enters valid, invalid and incorrect syntax code from excel sheet {string} and {int} and clicks on Run button for the Queue Operations page");
        
    }
    
    @When("The User clicks Practice questions link in Queue page")
    public void the_user_clicks_practice_questions_link_in_queue_page() throws InterruptedException {
    	queuePage.Practice_Questions_Click();
       LoggerReader.info("Logging ::::::User clicks Practice questions link in Queue page");
    }
    
    @Then("The user should be redirected to Practice page of Queue")
    public void the_user_should_be_redirected_to_practice_page_of_queue() {
    	LoggerReader.info("Logging ::::::User should be redirected to Practice page of Queue");   
    }
  
}