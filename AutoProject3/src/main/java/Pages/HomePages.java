package Pages;

import org.openqa.selenium.By;

public class HomePages {

	public static By objSignin = By.xpath("//a[contains(text(),'Sign in')]");
	public static By objEmail = By.xpath("//input[@id='email_create']");
	public static By objCreateBtn = By.xpath(
			"//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]/span[1]");
	public static By objFrstName = By.xpath("//input[@id='customer_firstname']");
	public static By objLstName = By.xpath("//input[@id='customer_lastname']");
	public static By objMail = By.xpath("//input[@id='email']");
	public static By objPass = By.xpath("//input[@id='passwd']");
	public static By objDrop1 = By.xpath("//select[@id='days']");
	public static By objDrop2 = By.xpath("//select[@id='months']");
	public static By objDrop3 = By.xpath("//select[@id='years']");
	public static By objCheck1 = By.xpath("//input[@id='newsletter']");
	public static By objCheck2 = By.xpath("//input[@id='optin']");
	public static By objFName = By.xpath("//input[@id='firstname']");
	public static By objLName = By.xpath("//input[@id='lastname']");
	public static By objComp = By.xpath("//input[@id='company']");
	public static By objAddress = By.xpath("//input[@id='address1']");
	public static By objAddressL2 = By.xpath("//input[@id='address2']");
	public static By objCity = By.xpath("//input[@id='city']");
	public static By objDrop4 = By.xpath("//select[@id='id_state']");
	public static By objPIN = By.xpath("//input[@id='postcode']");
	public static By objDrop5 = By.xpath("//select[@id='id_country']");
	public static By objAddInfo = By.xpath("//textarea[@id='other']");
	public static By objHomePh = By.xpath("//input[@id='phone']");
	public static By objMobile = By.xpath("//input[@id='phone_mobile']");
	public static By objFutureRefe = By.xpath("//input[@id='alias']");
	public static By objRegButton = By
			.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[4]/button[1]/span[1]");
}
