package Testbase;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Testbase {
	public static Properties repository = new Properties();
	public File f;
	public FileInputStream fi;
	public WebDriver driver;

	public void initialisation() throws IOException {
		loadpropertiesfile();
		selectbrowser(repository.getProperty("browser"));
		driver.get(repository.getProperty("url"));
	}

	public void loadpropertiesfile() throws IOException {
		f = new File(System.getProperty("user.dir") + "\\src/test/java\\ConfigFile\\Config.properties");
		// FileReader reader= new FileReader(f);
		fi = new FileInputStream(f);
		repository.load(fi);

	}

	public WebDriver selectbrowser(String browser) {
		if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			System.out.println("firefox browser launched");
			driver.manage().window().maximize();
			return driver;

		} else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\automation\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("chromebrowser launched");
			driver.manage().window().maximize();
			return driver;
		}

		else if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "E:\\automation\\IE Driver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			System.out.println("IE browser launched");
			driver.manage().window().maximize();

		}

	return null;
	}

	public void closebrowser() {
		driver.close();
	}

}
