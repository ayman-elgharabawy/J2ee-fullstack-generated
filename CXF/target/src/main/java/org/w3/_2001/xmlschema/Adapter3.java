
package org.w3._2001.xmlschema;

import java.util.Date;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter3
    extends XmlAdapter<String, Date>
{


    public Date unmarshal(String value) {
        return (org.apache.cxf.tools.common.DataTypeAdapter.parseTime(value));
    }

    public String marshal(Date value) {
        return (org.apache.cxf.tools.common.DataTypeAdapter.printTime(value));
    }

}
