package hellocucumber;

import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {
    private int operand1;
    private int operand2;
    private int result;

    @Given("an example scenario")
    public void anExampleScenario() {
        operand1 = 5;
        operand2 = 7;
    }

    @When("the scenario fails")
    public void allStepDefinitionsAreImplemented() {
        Assertions.fail();
    }

    @Then("the scenario is red")
    public void theScenarioPasses() {
        result = operand1 + operand2;
    }

}
