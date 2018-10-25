package CustomPlug.cust;

import org.apache.jmeter.testbeans.BeanInfoSupport;
import java.beans.PropertyDescriptor;


/*

Create the GUI class for our plugin.
Name of this GUI class should be [ComponentName]BeanInfo.java  in the same package.
We are going to have only one field in the GUI – File Path – which should contain actual file path of the Property file to be read.
File Path – is basically a display name in the GUI.
By default – the field should be blank if it is not set already.

 */

public class PropertyReaderBeanInfo extends BeanInfoSupport {

    //create a variable for each field
    private static final String FIELD_PROPERTY_FILE_PATH = "propFilePath";

    //create a zero-parameter constructor
    public PropertyReaderBeanInfo() {

        //call super(the class implementing the logic for prop file reader)
        super(PropertyReader.class);

        //add the new field in the GUI & its default settings
        PropertyDescriptor p = property(FIELD_PROPERTY_FILE_PATH);
        p.setValue(NOT_UNDEFINED, Boolean.TRUE);
        p.setValue(DEFAULT, "");
    }
}