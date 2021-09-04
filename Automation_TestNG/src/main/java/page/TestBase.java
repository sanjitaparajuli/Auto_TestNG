package page;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {

	public int randomGenerator(int randomNumber) {
		Random rnd = new Random();
		int rndNumber = rnd.nextInt(randomNumber);
		return rndNumber;
	}
	
	public void selectDropdown(WebElement Category_Dropdown_Element, String visibleText) {
	Select sel = new Select(Category_Dropdown_Element);
	sel.selectByVisibleText(visibleText);
	}
	
	public void waitForElement(WebDriver driver, int timeInSecond, WebElement element) {
		WebDriverWait wait = new WebDriverWait (driver, timeInSecond);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
}
