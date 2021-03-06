
package org.kiwi.dictao.webservices.dtss;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPluginResponseStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPluginResponseStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PluginResponseStruct" type="{http://www.dictao.com/DTSS/Interface}PluginResponseStruct" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPluginResponseStruct", propOrder = {
    "pluginResponseStruct"
})
public class ArrayOfPluginResponseStruct {

    @XmlElement(name = "PluginResponseStruct", nillable = true)
    protected List<PluginResponseStruct> pluginResponseStruct;

    /**
     * Gets the value of the pluginResponseStruct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pluginResponseStruct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPluginResponseStruct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PluginResponseStruct }
     * 
     * 
     */
    public List<PluginResponseStruct> getPluginResponseStruct() {
        if (pluginResponseStruct == null) {
            pluginResponseStruct = new ArrayList<PluginResponseStruct>();
        }
        return this.pluginResponseStruct;
    }

}
