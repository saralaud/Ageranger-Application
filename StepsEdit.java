Package AgeRanger;
Import cucumber.api.java.en.Given;
Import cucumber.api.java.en.When;
Import cucumber.api.java.en.Then;
Public class RunSteps2 {
Webdriver Driver = null;
@Given("^I navigate to AgeRanger home page")
Public void homepage() throws throwable
{
driver = new firefoxdriver();
driver.navigate().to("http://ageranger.azurewebsites.net");
}
@When("^I click on edit symbol navigate")
Public void EditFirstName() throws throwable
{
driver.findelement(By.name("First Name")).sendkeys("update");
driver.findelement(By.name("Submit")).Click();
}
@When("^I click on edit symbol navigate")
Public void EditLastNamt() throws throwable
{
driver.findelement(By.name("Last Name")).sendkeys("Modified");
driver.findelement(By.name("Submit")).Click();
}
@When("^I click on edit symbol navigate")
Public void EditAge() throws throwable
{
driver.findelement(By.name("Age")).sendkeys("23");
driver.findelement(By.name("Submit")).Click();
}
@Then("^I see the AgeRanger homePage")
Public void BackhomePage() throws throwable
{
Asset.Asserture("driver.gettile()). contains ("AgeRanger");
Asset.Asserture("driver.gettext()). Contains ("update modified");
}
