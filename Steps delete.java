Package AgeRanger;
Import cucumber.api.java.en.Given;
Import cucumber.api.java.en.When;
Import cucumber.api.java.en.Then;
Public class RunSteps3 ()
{
Webdriver Driver = null;
@Given("^I navigate to AgeRanger home page")
Public void homepage() throws throwable
{
driver = new firefoxdriver();
driver.navigate().to("http://ageranger.azurewebsites.net");
}
@When("^I click on delete symbol navigate")
Public void Delete() throws throwable
{
driver.findelement(By.name("Sara-delete")).click();
}
@Then("^I see the AgeRanger homePage")
Public void BackhomePage() throws throwable
{
Asset.Asserture("driver.gettile()). contains ("AgeRanger");
}
}
