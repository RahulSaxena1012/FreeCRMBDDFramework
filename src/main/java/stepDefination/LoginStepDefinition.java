//package stepDefination;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Point;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import junit.framework.Assert;
//
//public class LoginStepDefinition{
//
//	WebDriver driver;
//
//
//	@Given("^user is already on Login Page$")
//	public void user_already_on_login_page(){
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Autobots\\Desktop\\Study\\Selenium Material\\Drivers\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get("https://www.freecrm.com/index.html");
//		driver.manage().window().maximize();
//	}
//
//
//	@When("^title of login page is Free CRM$")
//	public void title_of_login_page_is_free_CRM(){
//		String title = driver.getTitle();
//		System.out.println(title);
//		Assert.assertEquals("Free CRM software in the cloud powers sales and customer service", title);
//	}
//
//	//Reg Exp:
//	//1. \"([^\"]*)\"
//	//2. \"(.*)\"
//
//	@Then("^user enters \"(.*)\" and \"(.*)\"$")
//	public void user_enters_username_and_password(String username,String password){
//		driver.findElement(By.name("username")).sendKeys(username);
//		driver.findElement(By.name("password")).sendKeys(password);
//	}
//
//	@Then("^user clicks on login button$")
//	public void user_clicks_on_login_button() {
//		WebElement loginBtn =
//				driver.findElement(By.xpath("//input[@type='submit']"));
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click();", loginBtn);
//	}
//
//
//	@Then("^user is on home page$")
//	public void user_is_on_hopme_page(){
//		String title = driver.getTitle();
//		System.out.println("Home Page title ::"+ title);
//		Assert.assertEquals("CRMPRO", title);
//	}
//
////	@Then("^user moves to new contact page$")
////	public void user_moves_to_new_contact_page() {
////		driver.switchTo().frame("mainpanel");
////		Actions action = new Actions(driver);
////		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
////		driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
//
////	}
//
//
////	@Then("^user enters contact details \"(.*)\" and \"(.*)\" and \"(.*)\"$")
////	public void user_enters_contacts_details(String firstname, String lastname, String position){
////		driver.findElement(By.id("first_name")).sendKeys(firstname);
////		driver.findElement(By.id("surname")).sendKeys(lastname);
////		driver.findElement(By.id("company_position")).sendKeys(position);
////		driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
////	}
//	
//	@Then("^user moves to the contact page$")
//	public void user_moves_to_the_contact_page() {
//		driver.switchTo().frame("mainpanel");
//		Actions action = new Actions(driver);
//		WebElement contacts = driver.findElement(By.xpath("//a[text()='Contacts']"));
//		action.moveToElement(contacts).build().perform();
//		WebElement newContact = driver.findElement(By.xpath("//a[text()='New Contact']"));
//		action.moveToElement(newContact).click().build().perform();
//	   
//	}
//
//	@Then("^user enters contact details \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void user_enters_contact_details_and_and(String firstname, String lastname, String position) {
//		
//		WebElement firstName = driver.findElement(By.id("first_name"));
//		WebElement lastName = driver.findElement(By.id("surname"));
//		WebElement companyPosition = driver.findElement(By.id("company_position"));
//		firstName.sendKeys(firstname);
//		lastName.sendKeys(lastname);
//		companyPosition.sendKeys(position);
//			
//		//System.out.println("hello" +firstname+ " " +lastname+ "is a " +position);	    
//	}
//	
//	@Then("^clicks on save button$")
//	public void clicks_on_save_button() {
//	    WebElement savebtn = driver.findElement(By.xpath("//input[@class='button' and @value='Save']"));
//	    savebtn.click();
//	}
//
//
//
//	@Then("^Close the browser$")
//	public void close_the_browser(){
//		driver.quit();	
//	}
//}
//
//
//
