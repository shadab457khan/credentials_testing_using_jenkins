package MavenTest.MavenJenkinsTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     * @throws IOException 
     * @throws FileNotFoundException 
     */
	@Test
    public void config() throws FileNotFoundException, IOException
    {
    	    	String username= App.takeProperty("Uname");
    	String password= App.takeProperty("Passw");
    	System.out.println(username);
    	System.out.println(password);
    }
}
