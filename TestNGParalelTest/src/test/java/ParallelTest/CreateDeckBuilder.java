package ParallelTest;
import org.testng.annotations.Test;

public class CreateDeckBuilder extends BaseTest {

    @Test
    public void createDiscardDeck(){
        Locators locators = new Locators();
        Buttons buttons = new Buttons(driver);

        buttons.click(locators.loginButtonLocator);
        buttons.click(locators.cardsButtonLocator);
        buttons.click(locators.decksButtonLocator);
        buttons.click(locators.deckBuilderButtonLocator);
        buttons.click(locators.importDeckButtonLocator);
        buttons.type(locators.textAreaLocators,
                "eyJOYW1lIjoiYmVzdCB2YXJpYW50cyIsIkNhcmRzIjpbeyJDYXJkRGVmSWQiOiJIdWxrIn0seyJDYX" +
                        "JkRGVmSWQiOiJLaWxsbW9uZ2VyIn0seyJDYXJkRGVmSWQiOiJNYWduZXRvIn0seyJDYXJkRGVmSW" +
                        "QiOiJNYXhpbXVzIn0seyJDYXJkRGVmSWQiOiJTY2FybGV0V2l0Y2gifSx7IkNhcmREZWZJZCI6IkRl" +
                        "YXRoIn0seyJDYXJkRGVmSWQiOiJEckRvb20ifSx7IkNhcmREZWZJZCI6IlNoYW5nQ2hpIn0seyJDYX" +
                        "JkRGVmSWQiOiJTaGVIdWxrIn0seyJDYXJkRGVmSWQiOiJTaHVyaSJ9LHsiQ2FyZERlZklkIjoiVmlzaW9uIn1dfQ==");
        buttons.click(locators.importButtonLocator);
    }
}
