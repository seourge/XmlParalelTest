package ParallelTest;

import org.openqa.selenium.By;

public class Locators extends BaseTest {
    public By loginButtonLocator = By.xpath("//a[@class='button-game button-game--sm me-1']");
    public By cardsButtonLocator = By.xpath("(//a[@class='global-nav__link '])[1]");
    public By decksButtonLocator = By.xpath("(//div[@class='global-nav__item '])[1]");
    public By deckBuilderButtonLocator = By.xpath("(//div[@class='global-nav__item '])[2]");
    public By importDeckButtonLocator = By.xpath("//span[text()='Import Deck Code']");
    public By textAreaLocators = By.xpath("//textarea[@class='form-text form-control']");
    public By importButtonLocator = By.xpath("(//button[@class='button-game button-game--success'])[2]");
}



