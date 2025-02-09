package SteelXAutomationChallenge.Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightWebAutomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.qantas.com/au/en.html");
		
		WebElement modal = driver.findElement(By.id("react-aria-modal-dialog"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(modal));
		driver.findElement(By.xpath("//button[@class='RedirectPopup-module__linkButton___1OsOn']")).click();
		wait.until(ExpectedConditions.invisibilityOf(modal));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,500)");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'css-shnplr-runway')]")));
		WebElement fromButton = driver.findElement(By.xpath("//div[contains(@class, 'css-shnplr-runway')]"));
		fromButton.click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='css-1ohnuxi-AirportField']"))));
		
		WebElement fromField = driver.findElement(By.xpath("//input[@class='css-1mu1mk2']"));
		fromField.sendKeys("Gold");
		
		WebElement fromResults = driver.findElement(By.xpath("//ul[@id='downshift-0-menu']"));
		wait.until(ExpectedConditions.visibilityOf(fromResults));
		
		fromField.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		
		WebElement toButton = driver.findElement(By.xpath("//div[contains(@class, 'css-kx5i2d-runway')]"));
		toButton.click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='css-1ohnuxi-AirportField']"))));
		
		WebElement toField = driver.findElement(By.xpath("//div[@class='css-1h2x2xs']/input"));
		toField.sendKeys("Manila");

		WebElement toResults = driver.findElement(By.xpath("//div[@class='css-1x4on9t']/ul"));
		wait.until(ExpectedConditions.visibilityOf(toResults));
		
		toField.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		
		WebElement whenButton = driver.findElement(By.xpath("//div[contains(@class, 'css-14qghys')]"));
		whenButton.click();
		
		WebElement calendar = driver.findElement(By.xpath("//div[@class='css-1d3ynpx-Calendar']"));
		wait.until(ExpectedConditions.elementToBeClickable(calendar));
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@data-testid='2025-02-17']")).click();
		driver.findElement(By.xpath("//button[@data-testid='2025-02-21']")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='css-uubvpl-Disclaimer']"))));
		driver.findElement(By.xpath("//div[@class='css-15aj0jj']/button")).click();
		driver.findElement(By.xpath("//button[@data-testid='dialogConfirmation']")).click();

		Thread.sleep(3000);
		WebElement searchFlightsBtn = driver.findElement(By.xpath("//div[@class='submit-btn']/button"));
		js.executeScript("arguments[0].scrollIntoView({block: 'center'});", searchFlightsBtn);
		wait.until(ExpectedConditions.elementToBeClickable(searchFlightsBtn));
		js.executeScript("arguments[0].click();", searchFlightsBtn);
	}

}
