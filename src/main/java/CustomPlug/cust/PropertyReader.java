package CustomPlug.cust;
import org.apache.commons.lang.StringUtils;
import org.apache.jmeter.config.ConfigTestElement;
import org.apache.jmeter.services.FileServer;
import org.apache.jmeter.testbeans.TestBean;
import org.apache.jmeter.testelement.TestStateListener;
import org.apache.jmeter.util.JMeterUtils;
import org.apache.jorphan.logging.LoggingManager;
import org.apache.log.Logger;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//1. TestBean is a marker interface to tell JMeter to make a Test Bean Gui for the class.
//2. We need to read the property file before the test plan gets executed.
//        So we need to implement the corresponding interface – TestStateListener.
public class PropertyReader  extends ConfigTestElement implements TestBean, TestStateListener{


    private static final Logger log = LoggingManager.getLoggerForClass();
    private String propFilePath;

    public PropertyReader() {
        super();
    }

    public void testStarted() {

    }

    public void testStarted(String s) {

        if (StringUtils.isNotEmpty(getPropFilePath())) {
//            try {
//                Path path = Paths.get(getPropFilePath());
//                if (!path.isAbsolute())
//                    path = Paths.get(FileServer.getFileServer().getBaseDir(), path.toString());
//                JMeterUtils.getJMeterProperties().load(new FileInputStream(path.toString()));
//                log.info("Property file reader - loading the properties from " + path);
//
//            } catch (FileNotFoundException e) {
//                log.error(e.getMessage());
//            } catch (IOException e) {
//                log.error(e.getMessage());
//            }
        }

    }

    public void testEnded() {

    }

    public void testEnded(String s) {

    }

    /**
     * @return the file path
     */
    public String getPropFilePath() {
        return this.propFilePath;
    }

    /**
     * @param propFilePath the file path to read
     */
    public void setPropFilePath(String propFilePath) {
        this.propFilePath = propFilePath;
    }
}


/*
Export:
Now export this package as a jar file or mvn clean package command will create the jar file.
Place the jar in JMETER_HOME/lib/ext folder
Restart JMeter
You should be able to see the custom plugin we had created – Property File Reader – under Test Plan -> Config Element
Add the config element into the test plan & It will look as shown below.
 */