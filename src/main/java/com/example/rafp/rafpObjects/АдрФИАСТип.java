
package com.example.rafp.rafpObjects;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * Адрес по ФИАС
 * 
 * <p>Java class for АдрФИАСТип complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="АдрФИАСТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Регион" type="{}CCРФТип"/>
 *         &lt;element name="МуниципРайон" type="{}ВидНаимКодТип" minOccurs="0"/>
 *         &lt;element name="ГородСелПоселен" type="{}ВидНаимКодТип" minOccurs="0"/>
 *         &lt;element name="НаселенПункт" type="{}ВидНаимТип" minOccurs="0"/>
 *         &lt;element name="ЭлПланСтруктур" type="{}ТипНаимТип" minOccurs="0"/>
 *         &lt;element name="ЭлУлДорСети" type="{}ТипНаимТип" minOccurs="0"/>
 *         &lt;element name="Здание" type="{}НомерТип" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ПомещЗдания" type="{}НомерТип" minOccurs="0"/>
 *         &lt;element name="ПомещКвартиры" type="{}НомерТип" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ИдНом">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="36"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Индекс">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;length value="6"/>
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
@XmlType(name = "\u0410\u0434\u0440\u0424\u0418\u0410\u0421\u0422\u0438\u043f", propOrder = {
    "\u0440\u0435\u0433\u0438\u043e\u043d",
    "\u043c\u0443\u043d\u0438\u0446\u0438\u043f\u0420\u0430\u0439\u043e\u043d",
    "\u0433\u043e\u0440\u043e\u0434\u0421\u0435\u043b\u041f\u043e\u0441\u0435\u043b\u0435\u043d",
    "\u043d\u0430\u0441\u0435\u043b\u0435\u043d\u041f\u0443\u043d\u043a\u0442",
    "\u044d\u043b\u041f\u043b\u0430\u043d\u0421\u0442\u0440\u0443\u043a\u0442\u0443\u0440",
    "\u044d\u043b\u0423\u043b\u0414\u043e\u0440\u0421\u0435\u0442\u0438",
    "\u0437\u0434\u0430\u043d\u0438\u0435",
    "\u043f\u043e\u043c\u0435\u0449\u0417\u0434\u0430\u043d\u0438\u044f",
    "\u043f\u043e\u043c\u0435\u0449\u041a\u0432\u0430\u0440\u0442\u0438\u0440\u044b"
})
public class АдрФИАСТип {

    @XmlElement(name = "\u0420\u0435\u0433\u0438\u043e\u043d", required = true)
    protected String регион;
    @XmlElement(name = "\u041c\u0443\u043d\u0438\u0446\u0438\u043f\u0420\u0430\u0439\u043e\u043d")
    protected ВидНаимКодТип муниципРайон;
    @XmlElement(name = "\u0413\u043e\u0440\u043e\u0434\u0421\u0435\u043b\u041f\u043e\u0441\u0435\u043b\u0435\u043d")
    protected ВидНаимКодТип городСелПоселен;
    @XmlElement(name = "\u041d\u0430\u0441\u0435\u043b\u0435\u043d\u041f\u0443\u043d\u043a\u0442")
    protected ВидНаимТип населенПункт;
    @XmlElement(name = "\u042d\u043b\u041f\u043b\u0430\u043d\u0421\u0442\u0440\u0443\u043a\u0442\u0443\u0440")
    protected ТипНаимТип элПланСтруктур;
    @XmlElement(name = "\u042d\u043b\u0423\u043b\u0414\u043e\u0440\u0421\u0435\u0442\u0438")
    protected ТипНаимТип элУлДорСети;
    @XmlElement(name = "\u0417\u0434\u0430\u043d\u0438\u0435")
    protected List<НомерТип> здание;
    @XmlElement(name = "\u041f\u043e\u043c\u0435\u0449\u0417\u0434\u0430\u043d\u0438\u044f")
    protected НомерТип помещЗдания;
    @XmlElement(name = "\u041f\u043e\u043c\u0435\u0449\u041a\u0432\u0430\u0440\u0442\u0438\u0440\u044b")
    protected НомерТип помещКвартиры;
    @XmlAttribute(name = "\u0418\u0434\u041d\u043e\u043c")
    protected String идНом;
    @XmlAttribute(name = "\u0418\u043d\u0434\u0435\u043a\u0441")
    protected String индекс;

    /**
     * Gets the value of the регион property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getРегион() {
        return регион;
    }

    /**
     * Sets the value of the регион property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setРегион(String value) {
        this.регион = value;
    }

    /**
     * Gets the value of the муниципРайон property.
     * 
     * @return
     *     possible object is
     *     {@link ВидНаимКодТип }
     *     
     */
    public ВидНаимКодТип getМуниципРайон() {
        return муниципРайон;
    }

    /**
     * Sets the value of the муниципРайон property.
     * 
     * @param value
     *     allowed object is
     *     {@link ВидНаимКодТип }
     *     
     */
    public void setМуниципРайон(ВидНаимКодТип value) {
        this.муниципРайон = value;
    }

    /**
     * Gets the value of the городСелПоселен property.
     * 
     * @return
     *     possible object is
     *     {@link ВидНаимКодТип }
     *     
     */
    public ВидНаимКодТип getГородСелПоселен() {
        return городСелПоселен;
    }

    /**
     * Sets the value of the городСелПоселен property.
     * 
     * @param value
     *     allowed object is
     *     {@link ВидНаимКодТип }
     *     
     */
    public void setГородСелПоселен(ВидНаимКодТип value) {
        this.городСелПоселен = value;
    }

    /**
     * Gets the value of the населенПункт property.
     * 
     * @return
     *     possible object is
     *     {@link ВидНаимТип }
     *     
     */
    public ВидНаимТип getНаселенПункт() {
        return населенПункт;
    }

    /**
     * Sets the value of the населенПункт property.
     * 
     * @param value
     *     allowed object is
     *     {@link ВидНаимТип }
     *     
     */
    public void setНаселенПункт(ВидНаимТип value) {
        this.населенПункт = value;
    }

    /**
     * Gets the value of the элПланСтруктур property.
     * 
     * @return
     *     possible object is
     *     {@link ТипНаимТип }
     *     
     */
    public ТипНаимТип getЭлПланСтруктур() {
        return элПланСтруктур;
    }

    /**
     * Sets the value of the элПланСтруктур property.
     * 
     * @param value
     *     allowed object is
     *     {@link ТипНаимТип }
     *     
     */
    public void setЭлПланСтруктур(ТипНаимТип value) {
        this.элПланСтруктур = value;
    }

    /**
     * Gets the value of the элУлДорСети property.
     * 
     * @return
     *     possible object is
     *     {@link ТипНаимТип }
     *     
     */
    public ТипНаимТип getЭлУлДорСети() {
        return элУлДорСети;
    }

    /**
     * Sets the value of the элУлДорСети property.
     * 
     * @param value
     *     allowed object is
     *     {@link ТипНаимТип }
     *     
     */
    public void setЭлУлДорСети(ТипНаимТип value) {
        this.элУлДорСети = value;
    }

    /**
     * Gets the value of the здание property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the здание property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getЗдание().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link НомерТип }
     * 
     * 
     */
    public List<НомерТип> getЗдание() {
        if (здание == null) {
            здание = new ArrayList<НомерТип>();
        }
        return this.здание;
    }

    /**
     * Gets the value of the помещЗдания property.
     * 
     * @return
     *     possible object is
     *     {@link НомерТип }
     *     
     */
    public НомерТип getПомещЗдания() {
        return помещЗдания;
    }

    /**
     * Sets the value of the помещЗдания property.
     * 
     * @param value
     *     allowed object is
     *     {@link НомерТип }
     *     
     */
    public void setПомещЗдания(НомерТип value) {
        this.помещЗдания = value;
    }

    /**
     * Gets the value of the помещКвартиры property.
     * 
     * @return
     *     possible object is
     *     {@link НомерТип }
     *     
     */
    public НомерТип getПомещКвартиры() {
        return помещКвартиры;
    }

    /**
     * Sets the value of the помещКвартиры property.
     * 
     * @param value
     *     allowed object is
     *     {@link НомерТип }
     *     
     */
    public void setПомещКвартиры(НомерТип value) {
        this.помещКвартиры = value;
    }

    /**
     * Gets the value of the идНом property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getИдНом() {
        return идНом;
    }

    /**
     * Sets the value of the идНом property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setИдНом(String value) {
        this.идНом = value;
    }

    /**
     * Gets the value of the индекс property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getИндекс() {
        return индекс;
    }

    /**
     * Sets the value of the индекс property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setИндекс(String value) {
        this.индекс = value;
    }

}
