Package AgeRanger;
Import cucumber.api.java.en.Given;
Import cucumber.api.java.en.When;
Import cucumber.api.java.en.Then;
Public class RunSteps1 {
Webdriver Driver = null;
@Given("^I navigate to AgeRanger home page")
Public void homepage() throws throwable
{
driver = new firefoxdriver();
driver.navigate().to("http://ageranger.azurewebsites.net");
}
@When("^I click on + symbol navigate")
Public void AddpersonPage() throws throwable
{
driver.findelement(By.name("First Name")).sendkeys("Sara");
driver.findelement(By.name("Last Name")).sendkeys("Test");
driver.findelement(By.name("Age")).sendkeys("3");
driver.findelement(By.name("Submit")).Click();
}
@Then("^I see the AgeRanger homePage")
Public void BackhomePage() throws throwable
{
Asset.Asserture("driver.gettile()). contains ("AgeRanger");
}
