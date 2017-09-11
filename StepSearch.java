
Package AgeRanger;
Import cucumber.api.java.en.Given;
Import cucumber.api.java.en.When;
Import cucumber.api.java.en.Then;

PublicPublic class RunSteps4 ()
{
Webdriver Driver = null;
@Given("^I navigate to AgeRanger home page")
Public void homepage() throws throwable
{
driver = new firefoxdriver();
driver.navigate().to("http://ageranger.azurewebsites.net");
}
@When("^I click on search text box")
Public void Delete() throws throwable
{
driver.findelement(By.name("Search")).sendkeys ("sara").click(by.name (searchsymbol));
}
@Then("^I see the AgeRanger homePage")
Public void BackhomePage() throws throwable
{
Asset.Asserture("driver.gettile()). contains ("AgeRanger");
}
}
