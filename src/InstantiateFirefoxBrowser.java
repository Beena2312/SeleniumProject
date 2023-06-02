import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InstantiateFirefoxBrowser {

	public static void main(String[] args) {
		//set the system property so that chrome driver is located
				System.setProperty("webdriver.FireFox.driver","C:\\Users\\HP\\OneDrive\\Desktop\\Selenium\\Supportingsoftware\\Firefox_Installer.exe");
				
				//Create the object of browser interface
				WebDriver driver = new FirefoxDriver();
				
		        //Launch URL
				driver.get("https://www.naukri.com/");
			}}


