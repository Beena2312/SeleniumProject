import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class InstantiateMicrosoftEdgeBrowser {

	public static void main(String[] args) {
		//set the system property so that chrome driver is located
		System.setProperty("webdriver.MicrosoftEdge.driver","C:\\Users\\HP\\OneDrive\\Desktop\\Selenium\\Supportingsoftware\\edgedriver_win32\\msedgedriver.exe");
		
		//Create the object of browser interface
		WebDriver driver = new EdgeDriver();
		
        //Launch URL
		driver.get("https://www.jenkins.io/");
	

	}

}
