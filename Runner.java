Package AgeRanger;
Import org.junit.runner.Runwith;
Import cucumber.api.junit.cucumber;

@Runwith(cucumber.class)
@cucumber.option (
Format = {"pretty"' json: target/ }
Feature = "src/ test/resources"
)
Public class Runner {

}
