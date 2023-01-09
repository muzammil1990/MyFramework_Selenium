/**
 * 
 */
package com.learnautomation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * 
 */
public class ReadPropertiesFile {

    String data = "";

    public String readDataFromPropertiesFile(String filePath, String key) {

        try {
            File file = new File(filePath);
            FileInputStream fis = new FileInputStream(file);
            Properties prop = new Properties();
            prop.load(fis);
            data = prop.get(key).toString();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;

    }
}
