package MavenDemo.TestProject;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        Assert.assertTrue( true );
     }
    @Test
    public void testOutput() {
    	System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		WebDriver moz = new ChromeDriver();
		String baseURL="https://jqueryui.com/droppable/";
		moz.get(baseURL);
		moz.close();
    }
}
