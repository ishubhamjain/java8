package reviseJan2025;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Properties {

    public static void main(String[] args) throws FileNotFoundException {
        FileReader reader = new FileReader("Config.properties");
        Properties prop = new Properties();
        //prop.load(reader);
    }
}
