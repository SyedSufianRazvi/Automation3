package Logic;

import static Logic.LaunchBrowsers.driver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Pages.HomePages;

public class VootHomePageLogic {
	// constructor
	public static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

	/**
	 * 1. Method to verify user navigated to voot home page by fetching current url
	 * & comparing with actual url.
	 */
	public static void verifyHomePageNavigation() {
		String homePageUrl = driver.getCurrentUrl();
		Assert.assertEquals(homePageUrl, "http://automationpractice.com/index.php", "Not navigated to Voot home page");
		System.out.println("Home page url is: " + homePageUrl);
	}

	/**
	 * 2. method to verify voot logo by presence of element and comparing fetched
	 * logo text with actual text.
	 */
	public static void verifyVootLogo() {
		WebElement vootlogo = driver.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[1]/a[1]/img[1]"));
		// WebElement vootlogo = driver.findElement(HomePages.objSignin);
		String logoText = vootlogo.getAttribute("title");
		String title = driver.getTitle();
		System.out.println("Title is: " + title);
		System.out.println("Text of voot logo is: " + logoText);
		Assert.assertEquals(logoText, "Voot", "Failed to fetch voot logo");
		Assert.assertTrue(vootlogo.isDisplayed(), "Voot logo not displayed");

	}

	public static void navigateToPremiumpage() throws Exception {
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(HomePages.objSignin).click();
		// Thread.sleep(5000);
		driver.findElement(HomePages.objEmail).sendKeys("syedsufian123@gmail.com");
		driver.findElement(HomePages.objCreateBtn).click();
		driver.findElement(By.cssSelector("#id_gender1")).click();
		driver.findElement(HomePages.objFrstName).sendKeys("Syed Sufian");
		driver.findElement(HomePages.objLstName).sendKeys("Razvi");
		driver.findElement(HomePages.objMail).sendKeys("syedsufian123@gmail.com");
		driver.findElement(HomePages.objPass).sendKeys("syed$123");
		driver.findElement(HomePages.objDrop1).sendKeys("13");
		driver.findElement(HomePages.objDrop2).sendKeys("December");
		driver.findElement(HomePages.objDrop3).sendKeys("1993");
		Thread.sleep(5000);
		driver.findElement(HomePages.objCheck1).click();
		driver.findElement(HomePages.objCheck2).click();
		driver.findElement(HomePages.objFName).sendKeys("Syed Sufian");
		driver.findElement(HomePages.objLName).sendKeys("Razvi");
		driver.findElement(HomePages.objComp).sendKeys("IGS");
		driver.findElement(HomePages.objAddress).sendKeys("qwertyuiopasdfghjklzxcvbnm");
		driver.findElement(HomePages.objAddressL2).sendKeys("poiuytrewqlkjhgfdsamnbvcxz");
		// Thread.sleep(5000);
		driver.findElement(HomePages.objCity).sendKeys("Bangalore");
		driver.findElement(HomePages.objDrop4).sendKeys("Indiana");
		driver.findElement(HomePages.objPIN).sendKeys("560076");
		driver.findElement(HomePages.objDrop5).sendKeys("United States");
		driver.findElement(HomePages.objAddInfo).sendKeys("Hello World!!!!!..........");
		driver.findElement(HomePages.objHomePh).sendKeys("123456789");
		driver.findElement(HomePages.objMobile).sendKeys("9874563216");
		driver.findElement(HomePages.objFutureRefe).sendKeys("Kutty123@gmail.com");
		driver.findElement(HomePages.objRegButton).click();
		Thread.sleep(5000);
		// wait.until(ExpectedConditions.presenceOfElementLocated(HomePages.objCarouselCardOnPremiumTab));

	}

}
