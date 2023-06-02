import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstantiateChromeBrowser {

	public static void main(String[] args) {
	//set the system property so that chrome driver is located
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\OneDrive\\Desktop\\Selenium\\Supportingsoftware\\chromedriver_win32\\chromedriver.exe");
		
		//Create the object of browser interface
		WebDriver driver = new ChromeDriver();
		
        //Launch URL
		driver.get("https://www.myntra.com/");
	}

}
