package ash;

//import org.openqa.selenium.firefox.FirefoxDriver;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class Pcki {

	public static void main(String[] args) throws FindFailed {
		System.setProperty("webdriver.chrome.driver", "C:\\testing1\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
		Screen s=new Screen();
		s.click("Capture");
		//s.doubleClick("typing");
	//	s.rightClick("right");
		s.type("textbox","alia bhatt");
		
		

	}

}
