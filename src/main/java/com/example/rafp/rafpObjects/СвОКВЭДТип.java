
package com.example.rafp.rafpObjects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Сведения о видах экономической деятельности
 * 
 * <p>Java class for СвОКВЭДТип complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="СвОКВЭДТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="КодОКВЭД" use="required" type="{}ОКВЭДТип" />
 *       &lt;attribute name="НаимОКВЭД" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="1000"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u0421\u0432\u041e\u041a\u0412\u042d\u0414\u0422\u0438\u043f")
public class СвОКВЭДТип {

    @XmlAttribute(name = "\u041a\u043e\u0434\u041e\u041a\u0412\u042d\u0414", required = true)
    protected String кодОКВЭД;
    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u041e\u041a\u0412\u042d\u0414", required = true)
    protected String наимОКВЭД;
    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0412\u043d\u0435\u0441\u0420\u0410\u0424\u041f", required = true)
    protected String датаВнесРАФП;

    /**
     * Gets the value of the кодОКВЭД property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getКодОКВЭД() {
        return кодОКВЭД;
    }

    /**
     * Sets the value of the кодОКВЭД property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setКодОКВЭД(String value) {
        this.кодОКВЭД = value;
    }

    /**
     * Gets the value of the наимОКВЭД property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getНаимОКВЭД() {
        return наимОКВЭД;
    }

    /**
     * Sets the value of the наимОКВЭД property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setНаимОКВЭД(String value) {
        this.наимОКВЭД = value;
    }

    /**
     * Gets the value of the датаВнесРАФП property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getДатаВнесРАФП() {
        return датаВнесРАФП;
    }

    /**
     * Sets the value of the датаВнесРАФП property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setДатаВнесРАФП(String value) {
        this.датаВнесРАФП = value;
    }

}
