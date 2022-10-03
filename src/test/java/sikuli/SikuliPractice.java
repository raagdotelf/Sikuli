package sikuli;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class SikuliPractice {
	
	    public static void main(String[] args) throws FindFailed {

	        System.setProperty("webdriver.chrome.driver", "D:\\Users\\Temp\\eclipse-workspace\\sikuli\\src\\test\\resources\\WebDrivers\\chromedriver.exe");
	    	
	        WebDriver driver;
	    	driver = new ChromeDriver();
	    	driver.get("https://demo.automationtesting.in/Register.html");    
driver.manage().window().maximize();

Screen s= new Screen();
Pattern name = new Pattern("D:\\Users\\Temp\\eclipse-workspace\\sikuli\\src\\test\\resources\\pictures\\Name_AutoDemo.PNG");
//Pattern pwd = new Pattern("D:\\Users\\Temp\\Pictures\\password.PNG");
//Pattern login_button = new Pattern("D:\\Users\\Temp\\Pictures\\login_button.PNG");
s.type(name,"ragini");
s.type(name,"londhe");
//s.click(un);
	    }}
