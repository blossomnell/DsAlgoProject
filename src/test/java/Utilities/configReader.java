package Utilities;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configReader {
    Properties prop;

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
