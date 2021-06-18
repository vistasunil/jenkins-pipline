package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Selenium {

    public static void main(String[] args) {
        //declare the chrome driver from the local machine location
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
       
        //create object of chrome options
        //ChromeOptions options = new ChromeOptions();
        
        //add the headless argument
        //options.addArguments("headless");
        
        //pass the options parameter in the Chrome driver declaration
        WebDriver driver = new ChromeDriver();
        
        //Navigate to toolsQA site url
        driver.get("https://www.thecloudtrain.com");
        
        //Print the Title of the Page
        System.out.println("Title of the page is -> " + driver.getTitle());
        
        //Close the driver
        driver.close();
    }
}

/*

package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

   public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");	// <-- Change this path
       WebDriver driver = new ChromeDriver();
       String baseUrl = "http://104.154.106.116:82/devopsIQ/";
       String expectedTitle = "Jenkins Webhook Website";
       String actualTitle = "";
       driver.get(baseUrl);
       actualTitle = driver.getTitle();
       if (actualTitle.contentEquals(expectedTitle)){
           System.out.println("TEST PASSED!");
       } else {
           System.out.println("TEST FAILED");
       }
       driver.close();
   }
}
*/
