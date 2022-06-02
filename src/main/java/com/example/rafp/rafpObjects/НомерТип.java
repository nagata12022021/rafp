
package com.example.rafp.rafpObjects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Сведения о номере адресного элемента
 * 
 * <p>Java class for НомерТип complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="НомерТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Тип" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="50"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Номер" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="255"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u041d\u043e\u043c\u0435\u0440\u0422\u0438\u043f")
public class НомерТип {

    @XmlAttribute(name = "\u0422\u0438\u043f", required = true)
    protected String тип;
    @XmlAttribute(name = "\u041d\u043e\u043c\u0435\u0440", required = true)
    protected String номер;

    /**
     * Gets the value of the тип property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getТип() {
        return тип;
    }

    /**
     * Sets the value of the тип property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setТип(String value) {
        this.тип = value;
    }

    /**
     * Gets the value of the номер property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getНомер() {
        return номер;
    }

    /**
     * Sets the value of the номер property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setНомер(String value) {
        this.номер = value;
    }

}
