package Utilities;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configReader {
    static Properties prop;

    public Properties init_prop() {
        prop = new Properties();
        try {
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/config/config.properties");
            prop.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Could not load config.properties file.");
        }
        return prop;
    }

//	public static String gettestUrl() {
//		String login=prop.getProperty("testurl");
//		if(login!=null)
//			return login;
//		else
//			throw new RuntimeException("Please specify  testuRL in the config.properties file.");
//	
//	
//	}
//
//		
	
}
//     FileInputStream ip = new FileInputStream("./src/test/resources/config/config.properties");				
			//prop.load(ip);
//		}catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}catch (IOException e) {
//			e.printStackTrace();
//		}
//
//		return prop;
//	
//}
//}
