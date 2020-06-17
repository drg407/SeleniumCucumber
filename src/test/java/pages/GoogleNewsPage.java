package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleNewsPage {

    public WebDriver driver;

    public GoogleNewsPage(WebDriver driver) {

        this.driver = driver;

    }

    By searchBox = By.cssSelector("input.Ax4B8.ZAGvjd");
    By searchButton = By.cssSelector("button.gb_Bf");
    By signInBanner = By.cssSelector("div.cTqiYc");
    By followButton = By.xpath("//div[@aria-label='Follow this topic']");

    public WebElement getSearch() {

        return driver.findElement(searchBox);

    }

    public WebElement getSignInBanner() {

        return driver.findElement(signInBanner);

    }

    public WebElement searchButton() {

        return driver.findElement(searchButton);

    }

    public WebElement followButton() {

        return driver.findElement(followButton);

    }

}