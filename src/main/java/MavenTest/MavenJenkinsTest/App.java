package MavenTest.MavenJenkinsTest;

import java.io.IOException;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class App 
{
    public static String takeProperty( String key ) throws IOException
    {
    	Properties prop = new Properties();
    	//prop.load(new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/Credent.properties"));
    	prop.load(App.class.getClassLoader().getResourceAsStream("Credent.properties"));
    	return prop.getProperty(key);
    }
}
