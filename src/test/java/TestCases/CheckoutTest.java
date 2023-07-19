package TestCases;


	
	import io.cucumber.java.en.And;
	import io.cucumber.java.en.But;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;

	public class CheckoutTest {

		@Given("open browser")
		public void openBrowser() {
			System.out.println("-------browser opened successfully-----");
		}

		@When("enter url")
		public void enterUrl() {
			System.out.println("-----url entered successufly---");
		}

		@And("enter user name")
		public void enterUserName() {
			System.out.println("-----password entered successufly---");
		}

		@And("enter password")
		public void enterPassword() {
			System.out.println("-----user name entered successufly---");
		}

		@When("click login button")
		public void clickLogin() {
			System.out.println("-----login button successufly---");
		}

		@But("dont click remember password")
		public void clickRemember() {
			System.out.println("-----click remeber canceled---");
		}

		@Then("verify welcome page")
		public void verifyWelcomePage() {
			System.out.println("-----welcome page verified successufly---");
		}
	}




