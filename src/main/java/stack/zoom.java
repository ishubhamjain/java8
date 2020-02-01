package stack;

import java.awt.geom.FlatteningPathIterator;
import java.io.File;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class zoom {
	static String OSNAMES = System.getProperty("os.name").toLowerCase();
    static String OS = OSNAMES.split(" ")[0];
    
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"F:\\workspace\\java8\\src\\test\\resources\\libs\\chromedriver.exe");
		/*
		 * WebDriver driver = new ChromeDriver(); driver.get("https://google.com");
		 * JavascriptExecutor executor = (JavascriptExecutor)driver;
		 * executor.executeScript("document.body.style.zoom = '0.65'"); // 65% Zoom
		 * 
		 * System.out.println("65% zoom done");
		 * 
		 * 
		 * 
		 * 
		 * driver.switchTo().alert(); driver.findElement(By.xpath("")).click();
		 * 
		 * Thread.sleep(5000);
		 * 
		 * executor.executeScript("document.body.style.zoom = '1.00'"); // 100% Zoom
		 * 
		 * System.out.println("100% zoom done");
		 */

/*		WebDriver driver = new ChromeDriver();
		;
		driver.get("https://www.aliexpress.com/item/32212764152.html");

		Thread.sleep(10000);*/

		/*
		 * System.out.println("Page Title is : "+driver.getTitle()); String
		 * parent_window = driver.getWindowHandle(); ((JavascriptExecutor)
		 * driver).executeScript("window.open('http://facebook.com/');"); new
		 * WebDriverWait(driver,5).until(ExpectedConditions.numberOfWindowsToBe(2));
		 * Set<String> allWindows_1 = driver.getWindowHandles();
		 */
		// Now you can initiate switching through windowHandles

	/*	String script = driver.findElement(By.xpath("//script[contains(.,'descriptionModule')]")).getText();

		System.out.println(script);

		System.out.println("********************");

		String header = driver.findElement(By.tagName("script")).getText();
		System.out.println(header);*/

	/*	WebElement element = driver.findElement(By.xpath("//script[contains(.,'descriptionModule')]"));
		String htmlCode = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerHTML;", element);
		
		System.out.println(htmlCode);
		
		String dewcription = htmlCode.split("descriptionUrl")[1];
		String URL = dewcription.split(",")[0];
		
		String MainURL = URL.replace("\"", "").split(":")[1];
		
		System.out.println("*********dewcription***********");
		
		System.out.println(dewcription);
		
		System.out.println("*********URL***********");
		
		System.out.println(MainURL);
		
		Pattern p = Pattern.compile("descriptionUrl");//. represents single character  
*/		
		
		/*       List<WebElement> list=driver.findElements(By.xpath("//*[@href]"));

	       for(WebElement e : list){
	           String link = e.getAttribute("href");

	          if(link.contains("requireURL")) {
	        	  System.out.println("URL Found");
	          }
	          else {
	        	  System.out.println("not an required URL");
	          }
	       }
	       
	       WebDriverWait wait = new WebDriverWait(driver,30);
	       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//xpath of the element related to records")));
	       
	       wait.wait(60);
	       
	       wait.pollingEvery(Duration.ofSeconds(60));*/
/*		WebDriver driver = new ChromeDriver();
		driver.get("https://forsikringsguiden.dk/#!/bilforsikring/manuel");

		Thread.sleep(5000);

		WebElement e1= driver.findElement(By.xpath("//*[@id='s2id_carSelectedMake']/a"));
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView();", e1);

		e1.click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id='s2id_autogen1_search']")).sendKeys("Hyundai");
		
		driver.findElement(By.xpath("//*[@id='s2id_autogen1_search']")).sendKeys(Keys.ENTER);

		jse.executeScript("arguments[0].scrollIntoView();", e1);
		
		WebElement e2= driver.findElement(By.xpath("//*[@id='s2id_autogen2']"));
		
		jse.executeScript("arguments[0].scrollIntoView();", e2);

		e2.click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id='s2id_autogen3_search']")).sendKeys("i30");
		
		driver.findElement(By.xpath("//*[@id='s2id_autogen3_search']")).sendKeys(Keys.ENTER);*/
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.indeed.com");
/*		WebDriverWait waiter = new WebDriverWait(driver, 60);
		waiter.until(ExpectedConditions.visibilityOfElementLocated(By.id("text-input-where")));
		WebElement element = driver.findElement(By.id("text-input-where"));*/
	
	//	((JavascriptExecutor) driver).executeScript("arguments[0].value ='';", element);
		
		/*	waiter.until(ExpectedConditions.elementToBeClickable(By.xpath("")));*/
		
		
		//nameSelection("Spark1");
		
		
/*		
	    
	    if(OS.equalsIgnoreCase("windows")) {
	      // flagtest test = new flagtest
	    	//Status
	    	
	    }else {
	    	System.out.println("enableFlag remain true");
	    }*/
		
	}
	
	
	public static boolean nameSelection(String name) {
		boolean isTrue = false;
		String[] allNames = {"Remi","Peter","Jones","Spark"};

		for(int i=0;i<allNames.length;i++) {   // iterating over array
		     if(i<(allNames.length-1)) {      // last index is ignored
		         if(allNames[i].equals(name)) {   // matching the name = Remi
		           System.out.println(allNames[i+1]); // print the next Item = Peter
		           isTrue = true;
		           break;
		           }
		          }
		         else if(i>=allNames.length-1) {  // last index execution
		            if(allNames[i].equals(name)) { // matching the name
		              System.out.println(allNames[i-i]); // matching to first element
		              isTrue = true;
		          }
		       }
		    }
		        return isTrue;
		}

}
