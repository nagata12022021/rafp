
package com.example.rafp.rafpObjects;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ИдОтпр" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ФИООтв" type="{}ФИОТип"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ДолжОтв">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="45"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="Тлф">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="20"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="E-mail">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="45"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Документ" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="СвРАФП">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="СвИЮЛАкт">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="НаимИЮЛ">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="НаимИЮЛПолн" use="required">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;minLength value="1"/>
 *                                                     &lt;maxLength value="1000"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="НаимИЮЛЛат">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;minLength value="1"/>
 *                                                     &lt;maxLength value="1000"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="НаимИЮЛСокр">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;minLength value="1"/>
 *                                                     &lt;maxLength value="255"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="АдрИЮЛИнк">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="СтрРег" use="required" type="{}ОКСМТип" />
 *                                               &lt;attribute name="НаимСтр" use="required">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;minLength value="1"/>
 *                                                     &lt;maxLength value="255"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="АдрИЮЛРег" use="required">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;minLength value="1"/>
 *                                                     &lt;maxLength value="255"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="РегИЮЛИнк">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="НаимРегОрг" use="required">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;minLength value="1"/>
 *                                                     &lt;maxLength value="255"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="РегНомер" use="required">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;minLength value="1"/>
 *                                                     &lt;maxLength value="70"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="ОсобРежРег">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;minLength value="1"/>
 *                                                     &lt;maxLength value="255"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="КодИЮЛИнк" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="КодНП" use="required">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;minLength value="1"/>
 *                                                     &lt;maxLength value="50"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="УставИЮЛ">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="УстКап" use="required">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                                     &lt;totalDigits value="20"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="КодВалют" use="required" type="{}ОКВТип" />
 *                                               &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="СвАФПАкт">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="НаимАФП">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="НаимАФППолн" use="required">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;minLength value="1"/>
 *                                                     &lt;maxLength value="1000"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="НаимАФПСокр">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;minLength value="1"/>
 *                                                     &lt;maxLength value="1000"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="АдрАФПРФ">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;choice>
 *                                                 &lt;element name="АдрФИАС" type="{}АдрФИАСТип"/>
 *                                                 &lt;element name="АдрКЛАДР" type="{}АдрКЛАДРТип"/>
 *                                               &lt;/choice>
 *                                               &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="СвАк">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="НЗА" use="required">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;length value="11"/>
 *                                                     &lt;pattern value="[0-9]{11}"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="ДатаАк" use="required" type="{}ДатаТип" />
 *                                               &lt;attribute name="КодНОАк" use="required" type="{}СОНОТип" />
 *                                               &lt;attribute name="НаимНО" use="required">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;minLength value="1"/>
 *                                                     &lt;maxLength value="255"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="АдрНО" use="required">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;minLength value="1"/>
 *                                                     &lt;maxLength value="1000"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="СвСостАк" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="СостАк" use="required">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;minLength value="1"/>
 *                                                     &lt;maxLength value="255"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="СвПрекрАк" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="ДатаПрекрАк" use="required" type="{}ДатаТип" />
 *                                               &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="СвУчетНО" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="ИННЮЛ" use="required" type="{}ИННЮЛТип" />
 *                                               &lt;attribute name="КПП" use="required" type="{}КППТип" />
 *                                               &lt;attribute name="ДатаПостУч" use="required" type="{}ДатаТип" />
 *                                               &lt;attribute name="КодНОУч" use="required" type="{}СОНОТип" />
 *                                               &lt;attribute name="НаимНОУч" use="required">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;minLength value="1"/>
 *                                                     &lt;maxLength value="255"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="СвРукАФПАкт">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="ФИОРук" type="{}ФИОТип"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="ИННФЛ" type="{}ИННФЛТип" />
 *                                               &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="СвИнРабАкт" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="ЧислИнГр" use="required">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                                     &lt;totalDigits value="9"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;choice>
 *                                         &lt;element name="СвРазрОткр" minOccurs="0">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;attribute name="ДатаРазрОткр" use="required" type="{}ДатаТип" />
 *                                                 &lt;attribute name="СрокРазрОткр" use="required" type="{}ДатаТип" />
 *                                                 &lt;attribute name="НаимОргСвед" use="required">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="1"/>
 *                                                       &lt;maxLength value="255"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/attribute>
 *                                                 &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="СвРешАк" minOccurs="0">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;attribute name="ДатаРешАк" use="required" type="{}ДатаТип" />
 *                                                 &lt;attribute name="СрокРешАк" type="{}ДатаТип" />
 *                                                 &lt;attribute name="НаимОргСвед" use="required">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="1"/>
 *                                                       &lt;maxLength value="255"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/attribute>
 *                                                 &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="СвПродСрок" minOccurs="0">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;attribute name="ДатаРешПрод" use="required" type="{}ДатаТип" />
 *                                                 &lt;attribute name="СрокПродАк" type="{}ДатаТип" />
 *                                                 &lt;attribute name="НаимОргСвед" use="required">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="1"/>
 *                                                       &lt;maxLength value="255"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/attribute>
 *                                                 &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="СвРешПрекр" minOccurs="0">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;attribute name="ДатаРешПрекр" use="required" type="{}ДатаТип" />
 *                                                 &lt;attribute name="НаимОргСвед" use="required">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="1"/>
 *                                                       &lt;maxLength value="255"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/attribute>
 *                                                 &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                       &lt;/choice>
 *                                       &lt;element name="СвВЭДАкт" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="СвОКВЭДОсн" type="{}СвОКВЭДТип" minOccurs="0"/>
 *                                                 &lt;element name="СвОКВЭДДоп" type="{}СвОКВЭДТип" maxOccurs="unbounded" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="ПризАк" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;length value="1"/>
 *                                           &lt;enumeration value="1"/>
 *                                           &lt;enumeration value="2"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ИдДок" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;maxLength value="36"/>
 *                       &lt;minLength value="1"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="ДатаДок" use="required" type="{}ДатаТип" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ИдФайл" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="150"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ВерсФорм" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="5"/>
 *             &lt;enumeration value="4.04"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ТипИнф" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="50"/>
 *             &lt;enumeration value="ОДРАФП"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ВерсПрог" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="40"/>
 *             &lt;minLength value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="КолДок" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *             &lt;totalDigits value="9"/>
 *             &lt;minInclusive value="1"/>
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
@XmlType(name = "", propOrder = {
    "\u0438\u0434\u041e\u0442\u043f\u0440",
    "\u0434\u043e\u043a\u0443\u043c\u0435\u043d\u0442"
})
@XmlRootElement(name = "\u0424\u0430\u0439\u043b")
public class Файл {

    @XmlElement(name = "\u0418\u0434\u041e\u0442\u043f\u0440")
    protected ИдОтпр идОтпр;
    @XmlElement(name = "\u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442", required = true)
    protected List<Документ> документ;
    @XmlAttribute(name = "\u0418\u0434\u0424\u0430\u0439\u043b", required = true)
    protected String идФайл;
    @XmlAttribute(name = "\u0412\u0435\u0440\u0441\u0424\u043e\u0440\u043c", required = true)
    protected String версФорм;
    @XmlAttribute(name = "\u0422\u0438\u043f\u0418\u043d\u0444", required = true)
    protected String типИнф;
    @XmlAttribute(name = "\u0412\u0435\u0440\u0441\u041f\u0440\u043e\u0433", required = true)
    protected String версПрог;
    @XmlAttribute(name = "\u041a\u043e\u043b\u0414\u043e\u043a", required = true)
    protected BigInteger колДок;

    /**
     * Gets the value of the идОтпр property.
     * 
     * @return
     *     possible object is
     *     {@link ИдОтпр }
     *     
     */
    public ИдОтпр getИдОтпр() {
        return идОтпр;
    }

    /**
     * Sets the value of the идОтпр property.
     * 
     * @param value
     *     allowed object is
     *     {@link ИдОтпр }
     *     
     */
    public void setИдОтпр(ИдОтпр value) {
        this.идОтпр = value;
    }

    /**
     * Gets the value of the документ property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the документ property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getДокумент().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Документ }
     * 
     * 
     */
    public List<Документ> getДокумент() {
        if (документ == null) {
            документ = new ArrayList<Документ>();
        }
        return this.документ;
    }

    /**
     * Gets the value of the идФайл property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getИдФайл() {
        return идФайл;
    }

    /**
     * Sets the value of the идФайл property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setИдФайл(String value) {
        this.идФайл = value;
    }

    /**
     * Gets the value of the версФорм property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getВерсФорм() {
        return версФорм;
    }

    /**
     * Sets the value of the версФорм property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setВерсФорм(String value) {
        this.версФорм = value;
    }

    /**
     * Gets the value of the типИнф property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getТипИнф() {
        return типИнф;
    }

    /**
     * Sets the value of the типИнф property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setТипИнф(String value) {
        this.типИнф = value;
    }

    /**
     * Gets the value of the версПрог property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getВерсПрог() {
        return версПрог;
    }

    /**
     * Sets the value of the версПрог property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setВерсПрог(String value) {
        this.версПрог = value;
    }

    /**
     * Gets the value of the колДок property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getКолДок() {
        return колДок;
    }

    /**
     * Sets the value of the колДок property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setКолДок(BigInteger value) {
        this.колДок = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="СвРАФП">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="СвИЮЛАкт">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="НаимИЮЛ">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="НаимИЮЛПолн" use="required">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;minLength value="1"/>
     *                                           &lt;maxLength value="1000"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="НаимИЮЛЛат">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;minLength value="1"/>
     *                                           &lt;maxLength value="1000"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="НаимИЮЛСокр">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;minLength value="1"/>
     *                                           &lt;maxLength value="255"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="АдрИЮЛИнк">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="СтрРег" use="required" type="{}ОКСМТип" />
     *                                     &lt;attribute name="НаимСтр" use="required">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;minLength value="1"/>
     *                                           &lt;maxLength value="255"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="АдрИЮЛРег" use="required">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;minLength value="1"/>
     *                                           &lt;maxLength value="255"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="РегИЮЛИнк">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="НаимРегОрг" use="required">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;minLength value="1"/>
     *                                           &lt;maxLength value="255"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="РегНомер" use="required">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;minLength value="1"/>
     *                                           &lt;maxLength value="70"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="ОсобРежРег">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;minLength value="1"/>
     *                                           &lt;maxLength value="255"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="КодИЮЛИнк" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="КодНП" use="required">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;minLength value="1"/>
     *                                           &lt;maxLength value="50"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="УставИЮЛ">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="УстКап" use="required">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                           &lt;totalDigits value="20"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="КодВалют" use="required" type="{}ОКВТип" />
     *                                     &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="СвАФПАкт">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="НаимАФП">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="НаимАФППолн" use="required">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;minLength value="1"/>
     *                                           &lt;maxLength value="1000"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="НаимАФПСокр">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;minLength value="1"/>
     *                                           &lt;maxLength value="1000"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="АдрАФПРФ">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;choice>
     *                                       &lt;element name="АдрФИАС" type="{}АдрФИАСТип"/>
     *                                       &lt;element name="АдрКЛАДР" type="{}АдрКЛАДРТип"/>
     *                                     &lt;/choice>
     *                                     &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="СвАк">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="НЗА" use="required">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;length value="11"/>
     *                                           &lt;pattern value="[0-9]{11}"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="ДатаАк" use="required" type="{}ДатаТип" />
     *                                     &lt;attribute name="КодНОАк" use="required" type="{}СОНОТип" />
     *                                     &lt;attribute name="НаимНО" use="required">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;minLength value="1"/>
     *                                           &lt;maxLength value="255"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="АдрНО" use="required">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;minLength value="1"/>
     *                                           &lt;maxLength value="1000"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="СвСостАк" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="СостАк" use="required">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;minLength value="1"/>
     *                                           &lt;maxLength value="255"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="СвПрекрАк" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="ДатаПрекрАк" use="required" type="{}ДатаТип" />
     *                                     &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="СвУчетНО" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="ИННЮЛ" use="required" type="{}ИННЮЛТип" />
     *                                     &lt;attribute name="КПП" use="required" type="{}КППТип" />
     *                                     &lt;attribute name="ДатаПостУч" use="required" type="{}ДатаТип" />
     *                                     &lt;attribute name="КодНОУч" use="required" type="{}СОНОТип" />
     *                                     &lt;attribute name="НаимНОУч" use="required">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;minLength value="1"/>
     *                                           &lt;maxLength value="255"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="СвРукАФПАкт">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="ФИОРук" type="{}ФИОТип"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="ИННФЛ" type="{}ИННФЛТип" />
     *                                     &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="СвИнРабАкт" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="ЧислИнГр" use="required">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                           &lt;totalDigits value="9"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;choice>
     *                               &lt;element name="СвРазрОткр" minOccurs="0">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;attribute name="ДатаРазрОткр" use="required" type="{}ДатаТип" />
     *                                       &lt;attribute name="СрокРазрОткр" use="required" type="{}ДатаТип" />
     *                                       &lt;attribute name="НаимОргСвед" use="required">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;minLength value="1"/>
     *                                             &lt;maxLength value="255"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/attribute>
     *                                       &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="СвРешАк" minOccurs="0">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;attribute name="ДатаРешАк" use="required" type="{}ДатаТип" />
     *                                       &lt;attribute name="СрокРешАк" type="{}ДатаТип" />
     *                                       &lt;attribute name="НаимОргСвед" use="required">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;minLength value="1"/>
     *                                             &lt;maxLength value="255"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/attribute>
     *                                       &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="СвПродСрок" minOccurs="0">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;attribute name="ДатаРешПрод" use="required" type="{}ДатаТип" />
     *                                       &lt;attribute name="СрокПродАк" type="{}ДатаТип" />
     *                                       &lt;attribute name="НаимОргСвед" use="required">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;minLength value="1"/>
     *                                             &lt;maxLength value="255"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/attribute>
     *                                       &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="СвРешПрекр" minOccurs="0">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;attribute name="ДатаРешПрекр" use="required" type="{}ДатаТип" />
     *                                       &lt;attribute name="НаимОргСвед" use="required">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;minLength value="1"/>
     *                                             &lt;maxLength value="255"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/attribute>
     *                                       &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                             &lt;/choice>
     *                             &lt;element name="СвВЭДАкт" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="СвОКВЭДОсн" type="{}СвОКВЭДТип" minOccurs="0"/>
     *                                       &lt;element name="СвОКВЭДДоп" type="{}СвОКВЭДТип" maxOccurs="unbounded" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="ПризАк" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;length value="1"/>
     *                                 &lt;enumeration value="1"/>
     *                                 &lt;enumeration value="2"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="ИдДок" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;maxLength value="36"/>
     *             &lt;minLength value="1"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="ДатаДок" use="required" type="{}ДатаТип" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "\u0441\u0432\u0420\u0410\u0424\u041f"
    })
    public static class Документ {

        @XmlElement(name = "\u0421\u0432\u0420\u0410\u0424\u041f", required = true)
        protected СвРАФП свРАФП;
        @XmlAttribute(name = "\u0418\u0434\u0414\u043e\u043a", required = true)
        protected String идДок;
        @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0414\u043e\u043a", required = true)
        protected String датаДок;

        /**
         * Gets the value of the свРАФП property.
         * 
         * @return
         *     possible object is
         *     {@link СвРАФП }
         *     
         */
        public СвРАФП getСвРАФП() {
            return свРАФП;
        }

        /**
         * Sets the value of the свРАФП property.
         * 
         * @param value
         *     allowed object is
         *     {@link СвРАФП }
         *     
         */
        public void setСвРАФП(СвРАФП value) {
            this.свРАФП = value;
        }

        /**
         * Gets the value of the идДок property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getИдДок() {
            return идДок;
        }

        /**
         * Sets the value of the идДок property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setИдДок(String value) {
            this.идДок = value;
        }

        /**
         * Gets the value of the датаДок property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getДатаДок() {
            return датаДок;
        }

        /**
         * Sets the value of the датаДок property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setДатаДок(String value) {
            this.датаДок = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="СвИЮЛАкт">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="НаимИЮЛ">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="НаимИЮЛПолн" use="required">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;minLength value="1"/>
         *                                 &lt;maxLength value="1000"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="НаимИЮЛЛат">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;minLength value="1"/>
         *                                 &lt;maxLength value="1000"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="НаимИЮЛСокр">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;minLength value="1"/>
         *                                 &lt;maxLength value="255"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="АдрИЮЛИнк">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="СтрРег" use="required" type="{}ОКСМТип" />
         *                           &lt;attribute name="НаимСтр" use="required">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;minLength value="1"/>
         *                                 &lt;maxLength value="255"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="АдрИЮЛРег" use="required">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;minLength value="1"/>
         *                                 &lt;maxLength value="255"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="РегИЮЛИнк">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="НаимРегОрг" use="required">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;minLength value="1"/>
         *                                 &lt;maxLength value="255"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="РегНомер" use="required">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;minLength value="1"/>
         *                                 &lt;maxLength value="70"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="ОсобРежРег">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;minLength value="1"/>
         *                                 &lt;maxLength value="255"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="КодИЮЛИнк" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="КодНП" use="required">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;minLength value="1"/>
         *                                 &lt;maxLength value="50"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="УставИЮЛ">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="УстКап" use="required">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                                 &lt;totalDigits value="20"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="КодВалют" use="required" type="{}ОКВТип" />
         *                           &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="СвАФПАкт">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="НаимАФП">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="НаимАФППолн" use="required">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;minLength value="1"/>
         *                                 &lt;maxLength value="1000"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="НаимАФПСокр">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;minLength value="1"/>
         *                                 &lt;maxLength value="1000"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="АдрАФПРФ">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;choice>
         *                             &lt;element name="АдрФИАС" type="{}АдрФИАСТип"/>
         *                             &lt;element name="АдрКЛАДР" type="{}АдрКЛАДРТип"/>
         *                           &lt;/choice>
         *                           &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="СвАк">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="НЗА" use="required">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;length value="11"/>
         *                                 &lt;pattern value="[0-9]{11}"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="ДатаАк" use="required" type="{}ДатаТип" />
         *                           &lt;attribute name="КодНОАк" use="required" type="{}СОНОТип" />
         *                           &lt;attribute name="НаимНО" use="required">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;minLength value="1"/>
         *                                 &lt;maxLength value="255"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="АдрНО" use="required">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;minLength value="1"/>
         *                                 &lt;maxLength value="1000"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="СвСостАк" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="СостАк" use="required">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;minLength value="1"/>
         *                                 &lt;maxLength value="255"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="СвПрекрАк" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="ДатаПрекрАк" use="required" type="{}ДатаТип" />
         *                           &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="СвУчетНО" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="ИННЮЛ" use="required" type="{}ИННЮЛТип" />
         *                           &lt;attribute name="КПП" use="required" type="{}КППТип" />
         *                           &lt;attribute name="ДатаПостУч" use="required" type="{}ДатаТип" />
         *                           &lt;attribute name="КодНОУч" use="required" type="{}СОНОТип" />
         *                           &lt;attribute name="НаимНОУч" use="required">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;minLength value="1"/>
         *                                 &lt;maxLength value="255"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="СвРукАФПАкт">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="ФИОРук" type="{}ФИОТип"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="ИННФЛ" type="{}ИННФЛТип" />
         *                           &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="СвИнРабАкт" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="ЧислИнГр" use="required">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                                 &lt;totalDigits value="9"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;choice>
         *                     &lt;element name="СвРазрОткр" minOccurs="0">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;attribute name="ДатаРазрОткр" use="required" type="{}ДатаТип" />
         *                             &lt;attribute name="СрокРазрОткр" use="required" type="{}ДатаТип" />
         *                             &lt;attribute name="НаимОргСвед" use="required">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;minLength value="1"/>
         *                                   &lt;maxLength value="255"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/attribute>
         *                             &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="СвРешАк" minOccurs="0">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;attribute name="ДатаРешАк" use="required" type="{}ДатаТип" />
         *                             &lt;attribute name="СрокРешАк" type="{}ДатаТип" />
         *                             &lt;attribute name="НаимОргСвед" use="required">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;minLength value="1"/>
         *                                   &lt;maxLength value="255"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/attribute>
         *                             &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="СвПродСрок" minOccurs="0">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;attribute name="ДатаРешПрод" use="required" type="{}ДатаТип" />
         *                             &lt;attribute name="СрокПродАк" type="{}ДатаТип" />
         *                             &lt;attribute name="НаимОргСвед" use="required">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;minLength value="1"/>
         *                                   &lt;maxLength value="255"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/attribute>
         *                             &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="СвРешПрекр" minOccurs="0">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;attribute name="ДатаРешПрекр" use="required" type="{}ДатаТип" />
         *                             &lt;attribute name="НаимОргСвед" use="required">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;minLength value="1"/>
         *                                   &lt;maxLength value="255"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/attribute>
         *                             &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                   &lt;/choice>
         *                   &lt;element name="СвВЭДАкт" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="СвОКВЭДОсн" type="{}СвОКВЭДТип" minOccurs="0"/>
         *                             &lt;element name="СвОКВЭДДоп" type="{}СвОКВЭДТип" maxOccurs="unbounded" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="ПризАк" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;length value="1"/>
         *                       &lt;enumeration value="1"/>
         *                       &lt;enumeration value="2"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "\u0441\u0432\u0418\u042e\u041b\u0410\u043a\u0442",
            "\u0441\u0432\u0410\u0424\u041f\u0410\u043a\u0442"
        })
        public static class СвРАФП {

            @XmlElement(name = "\u0421\u0432\u0418\u042e\u041b\u0410\u043a\u0442", required = true)
            protected СвИЮЛАкт свИЮЛАкт;
            @XmlElement(name = "\u0421\u0432\u0410\u0424\u041f\u0410\u043a\u0442", required = true)
            protected СвАФПАкт свАФПАкт;

            /**
             * Gets the value of the свИЮЛАкт property.
             * 
             * @return
             *     possible object is
             *     {@link СвИЮЛАкт }
             *     
             */
            public СвИЮЛАкт getСвИЮЛАкт() {
                return свИЮЛАкт;
            }

            /**
             * Sets the value of the свИЮЛАкт property.
             * 
             * @param value
             *     allowed object is
             *     {@link СвИЮЛАкт }
             *     
             */
            public void setСвИЮЛАкт(СвИЮЛАкт value) {
                this.свИЮЛАкт = value;
            }

            /**
             * Gets the value of the свАФПАкт property.
             * 
             * @return
             *     possible object is
             *     {@link СвАФПАкт }
             *     
             */
            public СвАФПАкт getСвАФПАкт() {
                return свАФПАкт;
            }

            /**
             * Sets the value of the свАФПАкт property.
             * 
             * @param value
             *     allowed object is
             *     {@link СвАФПАкт }
             *     
             */
            public void setСвАФПАкт(СвАФПАкт value) {
                this.свАФПАкт = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="НаимАФП">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="НаимАФППолн" use="required">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;minLength value="1"/>
             *                       &lt;maxLength value="1000"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="НаимАФПСокр">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;minLength value="1"/>
             *                       &lt;maxLength value="1000"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="АдрАФПРФ">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;choice>
             *                   &lt;element name="АдрФИАС" type="{}АдрФИАСТип"/>
             *                   &lt;element name="АдрКЛАДР" type="{}АдрКЛАДРТип"/>
             *                 &lt;/choice>
             *                 &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="СвАк">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="НЗА" use="required">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;length value="11"/>
             *                       &lt;pattern value="[0-9]{11}"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="ДатаАк" use="required" type="{}ДатаТип" />
             *                 &lt;attribute name="КодНОАк" use="required" type="{}СОНОТип" />
             *                 &lt;attribute name="НаимНО" use="required">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;minLength value="1"/>
             *                       &lt;maxLength value="255"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="АдрНО" use="required">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;minLength value="1"/>
             *                       &lt;maxLength value="1000"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="СвСостАк" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="СостАк" use="required">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;minLength value="1"/>
             *                       &lt;maxLength value="255"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="СвПрекрАк" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="ДатаПрекрАк" use="required" type="{}ДатаТип" />
             *                 &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="СвУчетНО" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="ИННЮЛ" use="required" type="{}ИННЮЛТип" />
             *                 &lt;attribute name="КПП" use="required" type="{}КППТип" />
             *                 &lt;attribute name="ДатаПостУч" use="required" type="{}ДатаТип" />
             *                 &lt;attribute name="КодНОУч" use="required" type="{}СОНОТип" />
             *                 &lt;attribute name="НаимНОУч" use="required">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;minLength value="1"/>
             *                       &lt;maxLength value="255"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="СвРукАФПАкт">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="ФИОРук" type="{}ФИОТип"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="ИННФЛ" type="{}ИННФЛТип" />
             *                 &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="СвИнРабАкт" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="ЧислИнГр" use="required">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *                       &lt;totalDigits value="9"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;choice>
             *           &lt;element name="СвРазрОткр" minOccurs="0">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;attribute name="ДатаРазрОткр" use="required" type="{}ДатаТип" />
             *                   &lt;attribute name="СрокРазрОткр" use="required" type="{}ДатаТип" />
             *                   &lt;attribute name="НаимОргСвед" use="required">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;minLength value="1"/>
             *                         &lt;maxLength value="255"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/attribute>
             *                   &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *           &lt;element name="СвРешАк" minOccurs="0">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;attribute name="ДатаРешАк" use="required" type="{}ДатаТип" />
             *                   &lt;attribute name="СрокРешАк" type="{}ДатаТип" />
             *                   &lt;attribute name="НаимОргСвед" use="required">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;minLength value="1"/>
             *                         &lt;maxLength value="255"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/attribute>
             *                   &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *           &lt;element name="СвПродСрок" minOccurs="0">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;attribute name="ДатаРешПрод" use="required" type="{}ДатаТип" />
             *                   &lt;attribute name="СрокПродАк" type="{}ДатаТип" />
             *                   &lt;attribute name="НаимОргСвед" use="required">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;minLength value="1"/>
             *                         &lt;maxLength value="255"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/attribute>
             *                   &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *           &lt;element name="СвРешПрекр" minOccurs="0">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;attribute name="ДатаРешПрекр" use="required" type="{}ДатаТип" />
             *                   &lt;attribute name="НаимОргСвед" use="required">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;minLength value="1"/>
             *                         &lt;maxLength value="255"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/attribute>
             *                   &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *         &lt;/choice>
             *         &lt;element name="СвВЭДАкт" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="СвОКВЭДОсн" type="{}СвОКВЭДТип" minOccurs="0"/>
             *                   &lt;element name="СвОКВЭДДоп" type="{}СвОКВЭДТип" maxOccurs="unbounded" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="ПризАк" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;length value="1"/>
             *             &lt;enumeration value="1"/>
             *             &lt;enumeration value="2"/>
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
            @XmlType(name = "", propOrder = {
                "\u043d\u0430\u0438\u043c\u0410\u0424\u041f",
                "\u0430\u0434\u0440\u0410\u0424\u041f\u0420\u0424",
                "\u0441\u0432\u0410\u043a",
                "\u0441\u0432\u0421\u043e\u0441\u0442\u0410\u043a",
                "\u0441\u0432\u041f\u0440\u0435\u043a\u0440\u0410\u043a",
                "\u0441\u0432\u0423\u0447\u0435\u0442\u041d\u041e",
                "\u0441\u0432\u0420\u0443\u043a\u0410\u0424\u041f\u0410\u043a\u0442",
                "\u0441\u0432\u0418\u043d\u0420\u0430\u0431\u0410\u043a\u0442",
                "\u0441\u0432\u0420\u0430\u0437\u0440\u041e\u0442\u043a\u0440",
                "\u0441\u0432\u0420\u0435\u0448\u0410\u043a",
                "\u0441\u0432\u041f\u0440\u043e\u0434\u0421\u0440\u043e\u043a",
                "\u0441\u0432\u0420\u0435\u0448\u041f\u0440\u0435\u043a\u0440",
                "\u0441\u0432\u0412\u042d\u0414\u0410\u043a\u0442"
            })
            public static class СвАФПАкт {

                @XmlElement(name = "\u041d\u0430\u0438\u043c\u0410\u0424\u041f", required = true)
                protected НаимАФП наимАФП;
                @XmlElement(name = "\u0410\u0434\u0440\u0410\u0424\u041f\u0420\u0424", required = true)
                protected АдрАФПРФ адрАФПРФ;
                @XmlElement(name = "\u0421\u0432\u0410\u043a", required = true)
                protected СвАк свАк;
                @XmlElement(name = "\u0421\u0432\u0421\u043e\u0441\u0442\u0410\u043a")
                protected СвСостАк свСостАк;
                @XmlElement(name = "\u0421\u0432\u041f\u0440\u0435\u043a\u0440\u0410\u043a")
                protected СвПрекрАк свПрекрАк;
                @XmlElement(name = "\u0421\u0432\u0423\u0447\u0435\u0442\u041d\u041e")
                protected СвУчетНО свУчетНО;
                @XmlElement(name = "\u0421\u0432\u0420\u0443\u043a\u0410\u0424\u041f\u0410\u043a\u0442", required = true)
                protected СвРукАФПАкт свРукАФПАкт;
                @XmlElement(name = "\u0421\u0432\u0418\u043d\u0420\u0430\u0431\u0410\u043a\u0442")
                protected СвИнРабАкт свИнРабАкт;
                @XmlElement(name = "\u0421\u0432\u0420\u0430\u0437\u0440\u041e\u0442\u043a\u0440")
                protected СвРазрОткр свРазрОткр;
                @XmlElement(name = "\u0421\u0432\u0420\u0435\u0448\u0410\u043a")
                protected СвРешАк свРешАк;
                @XmlElement(name = "\u0421\u0432\u041f\u0440\u043e\u0434\u0421\u0440\u043e\u043a")
                protected СвПродСрок свПродСрок;
                @XmlElement(name = "\u0421\u0432\u0420\u0435\u0448\u041f\u0440\u0435\u043a\u0440")
                protected СвРешПрекр свРешПрекр;
                @XmlElement(name = "\u0421\u0432\u0412\u042d\u0414\u0410\u043a\u0442")
                protected СвВЭДАкт свВЭДАкт;
                @XmlAttribute(name = "\u041f\u0440\u0438\u0437\u0410\u043a", required = true)
                protected String призАк;

                /**
                 * Gets the value of the наимАФП property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link НаимАФП }
                 *     
                 */
                public НаимАФП getНаимАФП() {
                    return наимАФП;
                }

                /**
                 * Sets the value of the наимАФП property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link НаимАФП }
                 *     
                 */
                public void setНаимАФП(НаимАФП value) {
                    this.наимАФП = value;
                }

                /**
                 * Gets the value of the адрАФПРФ property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link АдрАФПРФ }
                 *     
                 */
                public АдрАФПРФ getАдрАФПРФ() {
                    return адрАФПРФ;
                }

                /**
                 * Sets the value of the адрАФПРФ property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link АдрАФПРФ }
                 *     
                 */
                public void setАдрАФПРФ(АдрАФПРФ value) {
                    this.адрАФПРФ = value;
                }

                /**
                 * Gets the value of the свАк property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link СвАк }
                 *     
                 */
                public СвАк getСвАк() {
                    return свАк;
                }

                /**
                 * Sets the value of the свАк property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link СвАк }
                 *     
                 */
                public void setСвАк(СвАк value) {
                    this.свАк = value;
                }

                /**
                 * Gets the value of the свСостАк property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link СвСостАк }
                 *     
                 */
                public СвСостАк getСвСостАк() {
                    return свСостАк;
                }

                /**
                 * Sets the value of the свСостАк property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link СвСостАк }
                 *     
                 */
                public void setСвСостАк(СвСостАк value) {
                    this.свСостАк = value;
                }

                /**
                 * Gets the value of the свПрекрАк property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link СвПрекрАк }
                 *     
                 */
                public СвПрекрАк getСвПрекрАк() {
                    return свПрекрАк;
                }

                /**
                 * Sets the value of the свПрекрАк property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link СвПрекрАк }
                 *     
                 */
                public void setСвПрекрАк(СвПрекрАк value) {
                    this.свПрекрАк = value;
                }

                /**
                 * Gets the value of the свУчетНО property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link СвУчетНО }
                 *     
                 */
                public СвУчетНО getСвУчетНО() {
                    return свУчетНО;
                }

                /**
                 * Sets the value of the свУчетНО property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link СвУчетНО }
                 *     
                 */
                public void setСвУчетНО(СвУчетНО value) {
                    this.свУчетНО = value;
                }

                /**
                 * Gets the value of the свРукАФПАкт property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link СвРукАФПАкт }
                 *     
                 */
                public СвРукАФПАкт getСвРукАФПАкт() {
                    return свРукАФПАкт;
                }

                /**
                 * Sets the value of the свРукАФПАкт property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link СвРукАФПАкт }
                 *     
                 */
                public void setСвРукАФПАкт(СвРукАФПАкт value) {
                    this.свРукАФПАкт = value;
                }

                /**
                 * Gets the value of the свИнРабАкт property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link СвИнРабАкт }
                 *     
                 */
                public СвИнРабАкт getСвИнРабАкт() {
                    return свИнРабАкт;
                }

                /**
                 * Sets the value of the свИнРабАкт property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link СвИнРабАкт }
                 *     
                 */
                public void setСвИнРабАкт(СвИнРабАкт value) {
                    this.свИнРабАкт = value;
                }

                /**
                 * Gets the value of the свРазрОткр property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link СвРазрОткр }
                 *     
                 */
                public СвРазрОткр getСвРазрОткр() {
                    return свРазрОткр;
                }

                /**
                 * Sets the value of the свРазрОткр property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link СвРазрОткр }
                 *     
                 */
                public void setСвРазрОткр(СвРазрОткр value) {
                    this.свРазрОткр = value;
                }

                /**
                 * Gets the value of the свРешАк property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link СвРешАк }
                 *     
                 */
                public СвРешАк getСвРешАк() {
                    return свРешАк;
                }

                /**
                 * Sets the value of the свРешАк property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link СвРешАк }
                 *     
                 */
                public void setСвРешАк(СвРешАк value) {
                    this.свРешАк = value;
                }

                /**
                 * Gets the value of the свПродСрок property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link СвПродСрок }
                 *     
                 */
                public СвПродСрок getСвПродСрок() {
                    return свПродСрок;
                }

                /**
                 * Sets the value of the свПродСрок property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link СвПродСрок }
                 *     
                 */
                public void setСвПродСрок(СвПродСрок value) {
                    this.свПродСрок = value;
                }

                /**
                 * Gets the value of the свРешПрекр property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link СвРешПрекр }
                 *     
                 */
                public СвРешПрекр getСвРешПрекр() {
                    return свРешПрекр;
                }

                /**
                 * Sets the value of the свРешПрекр property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link СвРешПрекр }
                 *     
                 */
                public void setСвРешПрекр(СвРешПрекр value) {
                    this.свРешПрекр = value;
                }

                /**
                 * Gets the value of the свВЭДАкт property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link СвВЭДАкт }
                 *     
                 */
                public СвВЭДАкт getСвВЭДАкт() {
                    return свВЭДАкт;
                }

                /**
                 * Sets the value of the свВЭДАкт property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link СвВЭДАкт }
                 *     
                 */
                public void setСвВЭДАкт(СвВЭДАкт value) {
                    this.свВЭДАкт = value;
                }

                /**
                 * Gets the value of the призАк property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getПризАк() {
                    return призАк;
                }

                /**
                 * Sets the value of the призАк property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setПризАк(String value) {
                    this.призАк = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;choice>
                 *         &lt;element name="АдрФИАС" type="{}АдрФИАСТип"/>
                 *         &lt;element name="АдрКЛАДР" type="{}АдрКЛАДРТип"/>
                 *       &lt;/choice>
                 *       &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "\u0430\u0434\u0440\u0424\u0418\u0410\u0421",
                    "\u0430\u0434\u0440\u041a\u041b\u0410\u0414\u0420"
                })
                public static class АдрАФПРФ {

                    @XmlElement(name = "\u0410\u0434\u0440\u0424\u0418\u0410\u0421")
                    protected АдрФИАСТип адрФИАС;
                    @XmlElement(name = "\u0410\u0434\u0440\u041a\u041b\u0410\u0414\u0420")
                    protected АдрКЛАДРТип адрКЛАДР;
                    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0412\u043d\u0435\u0441\u0420\u0410\u0424\u041f", required = true)
                    protected String датаВнесРАФП;

                    /**
                     * Gets the value of the адрФИАС property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link АдрФИАСТип }
                     *     
                     */
                    public АдрФИАСТип getАдрФИАС() {
                        return адрФИАС;
                    }

                    /**
                     * Sets the value of the адрФИАС property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link АдрФИАСТип }
                     *     
                     */
                    public void setАдрФИАС(АдрФИАСТип value) {
                        this.адрФИАС = value;
                    }

                    /**
                     * Gets the value of the адрКЛАДР property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link АдрКЛАДРТип }
                     *     
                     */
                    public АдрКЛАДРТип getАдрКЛАДР() {
                        return адрКЛАДР;
                    }

                    /**
                     * Sets the value of the адрКЛАДР property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link АдрКЛАДРТип }
                     *     
                     */
                    public void setАдрКЛАДР(АдрКЛАДРТип value) {
                        this.адрКЛАДР = value;
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


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="НаимАФППолн" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;minLength value="1"/>
                 *             &lt;maxLength value="1000"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="НаимАФПСокр">
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
                @XmlType(name = "")
                public static class НаимАФП {

                    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0410\u0424\u041f\u041f\u043e\u043b\u043d", required = true)
                    protected String наимАФППолн;
                    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0410\u0424\u041f\u0421\u043e\u043a\u0440")
                    protected String наимАФПСокр;
                    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0412\u043d\u0435\u0441\u0420\u0410\u0424\u041f", required = true)
                    protected String датаВнесРАФП;

                    /**
                     * Gets the value of the наимАФППолн property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getНаимАФППолн() {
                        return наимАФППолн;
                    }

                    /**
                     * Sets the value of the наимАФППолн property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setНаимАФППолн(String value) {
                        this.наимАФППолн = value;
                    }

                    /**
                     * Gets the value of the наимАФПСокр property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getНаимАФПСокр() {
                        return наимАФПСокр;
                    }

                    /**
                     * Sets the value of the наимАФПСокр property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setНаимАФПСокр(String value) {
                        this.наимАФПСокр = value;
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


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="НЗА" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;length value="11"/>
                 *             &lt;pattern value="[0-9]{11}"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="ДатаАк" use="required" type="{}ДатаТип" />
                 *       &lt;attribute name="КодНОАк" use="required" type="{}СОНОТип" />
                 *       &lt;attribute name="НаимНО" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;minLength value="1"/>
                 *             &lt;maxLength value="255"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="АдрНО" use="required">
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
                @XmlType(name = "")
                public static class СвАк {

                    @XmlAttribute(name = "\u041d\u0417\u0410", required = true)
                    protected String нза;
                    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0410\u043a", required = true)
                    protected String датаАк;
                    @XmlAttribute(name = "\u041a\u043e\u0434\u041d\u041e\u0410\u043a", required = true)
                    protected String кодНОАк;
                    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u041d\u041e", required = true)
                    protected String наимНО;
                    @XmlAttribute(name = "\u0410\u0434\u0440\u041d\u041e", required = true)
                    protected String адрНО;
                    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0412\u043d\u0435\u0441\u0420\u0410\u0424\u041f", required = true)
                    protected String датаВнесРАФП;

                    /**
                     * Gets the value of the нза property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getНЗА() {
                        return нза;
                    }

                    /**
                     * Sets the value of the нза property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setНЗА(String value) {
                        this.нза = value;
                    }

                    /**
                     * Gets the value of the датаАк property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getДатаАк() {
                        return датаАк;
                    }

                    /**
                     * Sets the value of the датаАк property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setДатаАк(String value) {
                        this.датаАк = value;
                    }

                    /**
                     * Gets the value of the кодНОАк property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getКодНОАк() {
                        return кодНОАк;
                    }

                    /**
                     * Sets the value of the кодНОАк property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setКодНОАк(String value) {
                        this.кодНОАк = value;
                    }

                    /**
                     * Gets the value of the наимНО property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getНаимНО() {
                        return наимНО;
                    }

                    /**
                     * Sets the value of the наимНО property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setНаимНО(String value) {
                        this.наимНО = value;
                    }

                    /**
                     * Gets the value of the адрНО property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getАдрНО() {
                        return адрНО;
                    }

                    /**
                     * Sets the value of the адрНО property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setАдрНО(String value) {
                        this.адрНО = value;
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


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="СвОКВЭДОсн" type="{}СвОКВЭДТип" minOccurs="0"/>
                 *         &lt;element name="СвОКВЭДДоп" type="{}СвОКВЭДТип" maxOccurs="unbounded" minOccurs="0"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "\u0441\u0432\u041e\u041a\u0412\u042d\u0414\u041e\u0441\u043d",
                    "\u0441\u0432\u041e\u041a\u0412\u042d\u0414\u0414\u043e\u043f"
                })
                public static class СвВЭДАкт {

                    @XmlElement(name = "\u0421\u0432\u041e\u041a\u0412\u042d\u0414\u041e\u0441\u043d")
                    protected СвОКВЭДТип свОКВЭДОсн;
                    @XmlElement(name = "\u0421\u0432\u041e\u041a\u0412\u042d\u0414\u0414\u043e\u043f")
                    protected List<СвОКВЭДТип> свОКВЭДДоп;

                    /**
                     * Gets the value of the свОКВЭДОсн property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link СвОКВЭДТип }
                     *     
                     */
                    public СвОКВЭДТип getСвОКВЭДОсн() {
                        return свОКВЭДОсн;
                    }

                    /**
                     * Sets the value of the свОКВЭДОсн property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link СвОКВЭДТип }
                     *     
                     */
                    public void setСвОКВЭДОсн(СвОКВЭДТип value) {
                        this.свОКВЭДОсн = value;
                    }

                    /**
                     * Gets the value of the свОКВЭДДоп property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the свОКВЭДДоп property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getСвОКВЭДДоп().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link СвОКВЭДТип }
                     * 
                     * 
                     */
                    public List<СвОКВЭДТип> getСвОКВЭДДоп() {
                        if (свОКВЭДДоп == null) {
                            свОКВЭДДоп = new ArrayList<СвОКВЭДТип>();
                        }
                        return this.свОКВЭДДоп;
                    }

                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="ЧислИнГр" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
                 *             &lt;totalDigits value="9"/>
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
                @XmlType(name = "")
                public static class СвИнРабАкт {

                    @XmlAttribute(name = "\u0427\u0438\u0441\u043b\u0418\u043d\u0413\u0440", required = true)
                    protected BigInteger числИнГр;
                    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0412\u043d\u0435\u0441\u0420\u0410\u0424\u041f", required = true)
                    protected String датаВнесРАФП;

                    /**
                     * Gets the value of the числИнГр property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getЧислИнГр() {
                        return числИнГр;
                    }

                    /**
                     * Sets the value of the числИнГр property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setЧислИнГр(BigInteger value) {
                        this.числИнГр = value;
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


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="ДатаПрекрАк" use="required" type="{}ДатаТип" />
                 *       &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class СвПрекрАк {

                    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041f\u0440\u0435\u043a\u0440\u0410\u043a", required = true)
                    protected String датаПрекрАк;
                    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0412\u043d\u0435\u0441\u0420\u0410\u0424\u041f", required = true)
                    protected String датаВнесРАФП;

                    /**
                     * Gets the value of the датаПрекрАк property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getДатаПрекрАк() {
                        return датаПрекрАк;
                    }

                    /**
                     * Sets the value of the датаПрекрАк property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setДатаПрекрАк(String value) {
                        this.датаПрекрАк = value;
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


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="ДатаРешПрод" use="required" type="{}ДатаТип" />
                 *       &lt;attribute name="СрокПродАк" type="{}ДатаТип" />
                 *       &lt;attribute name="НаимОргСвед" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;minLength value="1"/>
                 *             &lt;maxLength value="255"/>
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
                @XmlType(name = "")
                public static class СвПродСрок {

                    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0420\u0435\u0448\u041f\u0440\u043e\u0434", required = true)
                    protected String датаРешПрод;
                    @XmlAttribute(name = "\u0421\u0440\u043e\u043a\u041f\u0440\u043e\u0434\u0410\u043a")
                    protected String срокПродАк;
                    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u041e\u0440\u0433\u0421\u0432\u0435\u0434", required = true)
                    protected String наимОргСвед;
                    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0412\u043d\u0435\u0441\u0420\u0410\u0424\u041f", required = true)
                    protected String датаВнесРАФП;

                    /**
                     * Gets the value of the датаРешПрод property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getДатаРешПрод() {
                        return датаРешПрод;
                    }

                    /**
                     * Sets the value of the датаРешПрод property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setДатаРешПрод(String value) {
                        this.датаРешПрод = value;
                    }

                    /**
                     * Gets the value of the срокПродАк property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getСрокПродАк() {
                        return срокПродАк;
                    }

                    /**
                     * Sets the value of the срокПродАк property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setСрокПродАк(String value) {
                        this.срокПродАк = value;
                    }

                    /**
                     * Gets the value of the наимОргСвед property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getНаимОргСвед() {
                        return наимОргСвед;
                    }

                    /**
                     * Sets the value of the наимОргСвед property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setНаимОргСвед(String value) {
                        this.наимОргСвед = value;
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


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="ДатаРазрОткр" use="required" type="{}ДатаТип" />
                 *       &lt;attribute name="СрокРазрОткр" use="required" type="{}ДатаТип" />
                 *       &lt;attribute name="НаимОргСвед" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;minLength value="1"/>
                 *             &lt;maxLength value="255"/>
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
                @XmlType(name = "")
                public static class СвРазрОткр {

                    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0420\u0430\u0437\u0440\u041e\u0442\u043a\u0440", required = true)
                    protected String датаРазрОткр;
                    @XmlAttribute(name = "\u0421\u0440\u043e\u043a\u0420\u0430\u0437\u0440\u041e\u0442\u043a\u0440", required = true)
                    protected String срокРазрОткр;
                    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u041e\u0440\u0433\u0421\u0432\u0435\u0434", required = true)
                    protected String наимОргСвед;
                    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0412\u043d\u0435\u0441\u0420\u0410\u0424\u041f", required = true)
                    protected String датаВнесРАФП;

                    /**
                     * Gets the value of the датаРазрОткр property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getДатаРазрОткр() {
                        return датаРазрОткр;
                    }

                    /**
                     * Sets the value of the датаРазрОткр property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setДатаРазрОткр(String value) {
                        this.датаРазрОткр = value;
                    }

                    /**
                     * Gets the value of the срокРазрОткр property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getСрокРазрОткр() {
                        return срокРазрОткр;
                    }

                    /**
                     * Sets the value of the срокРазрОткр property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setСрокРазрОткр(String value) {
                        this.срокРазрОткр = value;
                    }

                    /**
                     * Gets the value of the наимОргСвед property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getНаимОргСвед() {
                        return наимОргСвед;
                    }

                    /**
                     * Sets the value of the наимОргСвед property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setНаимОргСвед(String value) {
                        this.наимОргСвед = value;
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


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="ДатаРешАк" use="required" type="{}ДатаТип" />
                 *       &lt;attribute name="СрокРешАк" type="{}ДатаТип" />
                 *       &lt;attribute name="НаимОргСвед" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;minLength value="1"/>
                 *             &lt;maxLength value="255"/>
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
                @XmlType(name = "")
                public static class СвРешАк {

                    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0420\u0435\u0448\u0410\u043a", required = true)
                    protected String датаРешАк;
                    @XmlAttribute(name = "\u0421\u0440\u043e\u043a\u0420\u0435\u0448\u0410\u043a")
                    protected String срокРешАк;
                    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u041e\u0440\u0433\u0421\u0432\u0435\u0434", required = true)
                    protected String наимОргСвед;
                    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0412\u043d\u0435\u0441\u0420\u0410\u0424\u041f", required = true)
                    protected String датаВнесРАФП;

                    /**
                     * Gets the value of the датаРешАк property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getДатаРешАк() {
                        return датаРешАк;
                    }

                    /**
                     * Sets the value of the датаРешАк property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setДатаРешАк(String value) {
                        this.датаРешАк = value;
                    }

                    /**
                     * Gets the value of the срокРешАк property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getСрокРешАк() {
                        return срокРешАк;
                    }

                    /**
                     * Sets the value of the срокРешАк property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setСрокРешАк(String value) {
                        this.срокРешАк = value;
                    }

                    /**
                     * Gets the value of the наимОргСвед property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getНаимОргСвед() {
                        return наимОргСвед;
                    }

                    /**
                     * Sets the value of the наимОргСвед property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setНаимОргСвед(String value) {
                        this.наимОргСвед = value;
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


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="ДатаРешПрекр" use="required" type="{}ДатаТип" />
                 *       &lt;attribute name="НаимОргСвед" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;minLength value="1"/>
                 *             &lt;maxLength value="255"/>
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
                @XmlType(name = "")
                public static class СвРешПрекр {

                    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0420\u0435\u0448\u041f\u0440\u0435\u043a\u0440", required = true)
                    protected String датаРешПрекр;
                    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u041e\u0440\u0433\u0421\u0432\u0435\u0434", required = true)
                    protected String наимОргСвед;
                    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0412\u043d\u0435\u0441\u0420\u0410\u0424\u041f", required = true)
                    protected String датаВнесРАФП;

                    /**
                     * Gets the value of the датаРешПрекр property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getДатаРешПрекр() {
                        return датаРешПрекр;
                    }

                    /**
                     * Sets the value of the датаРешПрекр property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setДатаРешПрекр(String value) {
                        this.датаРешПрекр = value;
                    }

                    /**
                     * Gets the value of the наимОргСвед property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getНаимОргСвед() {
                        return наимОргСвед;
                    }

                    /**
                     * Sets the value of the наимОргСвед property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setНаимОргСвед(String value) {
                        this.наимОргСвед = value;
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


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="ФИОРук" type="{}ФИОТип"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="ИННФЛ" type="{}ИННФЛТип" />
                 *       &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "\u0444\u0438\u043e\u0420\u0443\u043a"
                })
                public static class СвРукАФПАкт {

                    @XmlElement(name = "\u0424\u0418\u041e\u0420\u0443\u043a", required = true)
                    protected ФИОТип фиоРук;
                    @XmlAttribute(name = "\u0418\u041d\u041d\u0424\u041b")
                    protected String иннфл;
                    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0412\u043d\u0435\u0441\u0420\u0410\u0424\u041f", required = true)
                    protected String датаВнесРАФП;

                    /**
                     * Gets the value of the фиоРук property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ФИОТип }
                     *     
                     */
                    public ФИОТип getФИОРук() {
                        return фиоРук;
                    }

                    /**
                     * Sets the value of the фиоРук property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ФИОТип }
                     *     
                     */
                    public void setФИОРук(ФИОТип value) {
                        this.фиоРук = value;
                    }

                    /**
                     * Gets the value of the иннфл property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getИННФЛ() {
                        return иннфл;
                    }

                    /**
                     * Sets the value of the иннфл property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setИННФЛ(String value) {
                        this.иннфл = value;
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


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="СостАк" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;minLength value="1"/>
                 *             &lt;maxLength value="255"/>
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
                @XmlType(name = "")
                public static class СвСостАк {

                    @XmlAttribute(name = "\u0421\u043e\u0441\u0442\u0410\u043a", required = true)
                    protected String состАк;
                    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0412\u043d\u0435\u0441\u0420\u0410\u0424\u041f", required = true)
                    protected String датаВнесРАФП;

                    /**
                     * Gets the value of the состАк property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getСостАк() {
                        return состАк;
                    }

                    /**
                     * Sets the value of the состАк property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setСостАк(String value) {
                        this.состАк = value;
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


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="ИННЮЛ" use="required" type="{}ИННЮЛТип" />
                 *       &lt;attribute name="КПП" use="required" type="{}КППТип" />
                 *       &lt;attribute name="ДатаПостУч" use="required" type="{}ДатаТип" />
                 *       &lt;attribute name="КодНОУч" use="required" type="{}СОНОТип" />
                 *       &lt;attribute name="НаимНОУч" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;minLength value="1"/>
                 *             &lt;maxLength value="255"/>
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
                @XmlType(name = "")
                public static class СвУчетНО {

                    @XmlAttribute(name = "\u0418\u041d\u041d\u042e\u041b", required = true)
                    protected String иннюл;
                    @XmlAttribute(name = "\u041a\u041f\u041f", required = true)
                    protected String кпп;
                    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041f\u043e\u0441\u0442\u0423\u0447", required = true)
                    protected String датаПостУч;
                    @XmlAttribute(name = "\u041a\u043e\u0434\u041d\u041e\u0423\u0447", required = true)
                    protected String кодНОУч;
                    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u041d\u041e\u0423\u0447", required = true)
                    protected String наимНОУч;
                    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0412\u043d\u0435\u0441\u0420\u0410\u0424\u041f", required = true)
                    protected String датаВнесРАФП;

                    /**
                     * Gets the value of the иннюл property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getИННЮЛ() {
                        return иннюл;
                    }

                    /**
                     * Sets the value of the иннюл property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setИННЮЛ(String value) {
                        this.иннюл = value;
                    }

                    /**
                     * Gets the value of the кпп property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getКПП() {
                        return кпп;
                    }

                    /**
                     * Sets the value of the кпп property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setКПП(String value) {
                        this.кпп = value;
                    }

                    /**
                     * Gets the value of the датаПостУч property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getДатаПостУч() {
                        return датаПостУч;
                    }

                    /**
                     * Sets the value of the датаПостУч property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setДатаПостУч(String value) {
                        this.датаПостУч = value;
                    }

                    /**
                     * Gets the value of the кодНОУч property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getКодНОУч() {
                        return кодНОУч;
                    }

                    /**
                     * Sets the value of the кодНОУч property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setКодНОУч(String value) {
                        this.кодНОУч = value;
                    }

                    /**
                     * Gets the value of the наимНОУч property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getНаимНОУч() {
                        return наимНОУч;
                    }

                    /**
                     * Sets the value of the наимНОУч property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setНаимНОУч(String value) {
                        this.наимНОУч = value;
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

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="НаимИЮЛ">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="НаимИЮЛПолн" use="required">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;minLength value="1"/>
             *                       &lt;maxLength value="1000"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="НаимИЮЛЛат">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;minLength value="1"/>
             *                       &lt;maxLength value="1000"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="НаимИЮЛСокр">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;minLength value="1"/>
             *                       &lt;maxLength value="255"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="АдрИЮЛИнк">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="СтрРег" use="required" type="{}ОКСМТип" />
             *                 &lt;attribute name="НаимСтр" use="required">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;minLength value="1"/>
             *                       &lt;maxLength value="255"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="АдрИЮЛРег" use="required">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;minLength value="1"/>
             *                       &lt;maxLength value="255"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="РегИЮЛИнк">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="НаимРегОрг" use="required">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;minLength value="1"/>
             *                       &lt;maxLength value="255"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="РегНомер" use="required">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;minLength value="1"/>
             *                       &lt;maxLength value="70"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="ОсобРежРег">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;minLength value="1"/>
             *                       &lt;maxLength value="255"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="КодИЮЛИнк" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="КодНП" use="required">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;minLength value="1"/>
             *                       &lt;maxLength value="50"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="УставИЮЛ">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="УстКап" use="required">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *                       &lt;totalDigits value="20"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="КодВалют" use="required" type="{}ОКВТип" />
             *                 &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "\u043d\u0430\u0438\u043c\u0418\u042e\u041b",
                "\u0430\u0434\u0440\u0418\u042e\u041b\u0418\u043d\u043a",
                "\u0440\u0435\u0433\u0418\u042e\u041b\u0418\u043d\u043a",
                "\u043a\u043e\u0434\u0418\u042e\u041b\u0418\u043d\u043a",
                "\u0443\u0441\u0442\u0430\u0432\u0418\u042e\u041b"
            })
            public static class СвИЮЛАкт {

                @XmlElement(name = "\u041d\u0430\u0438\u043c\u0418\u042e\u041b", required = true)
                protected НаимИЮЛ наимИЮЛ;
                @XmlElement(name = "\u0410\u0434\u0440\u0418\u042e\u041b\u0418\u043d\u043a", required = true)
                protected АдрИЮЛИнк адрИЮЛИнк;
                @XmlElement(name = "\u0420\u0435\u0433\u0418\u042e\u041b\u0418\u043d\u043a", required = true)
                protected РегИЮЛИнк регИЮЛИнк;
                @XmlElement(name = "\u041a\u043e\u0434\u0418\u042e\u041b\u0418\u043d\u043a")
                protected КодИЮЛИнк кодИЮЛИнк;
                @XmlElement(name = "\u0423\u0441\u0442\u0430\u0432\u0418\u042e\u041b", required = true)
                protected УставИЮЛ уставИЮЛ;

                /**
                 * Gets the value of the наимИЮЛ property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link НаимИЮЛ }
                 *     
                 */
                public НаимИЮЛ getНаимИЮЛ() {
                    return наимИЮЛ;
                }

                /**
                 * Sets the value of the наимИЮЛ property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link НаимИЮЛ }
                 *     
                 */
                public void setНаимИЮЛ(НаимИЮЛ value) {
                    this.наимИЮЛ = value;
                }

                /**
                 * Gets the value of the адрИЮЛИнк property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link АдрИЮЛИнк }
                 *     
                 */
                public АдрИЮЛИнк getАдрИЮЛИнк() {
                    return адрИЮЛИнк;
                }

                /**
                 * Sets the value of the адрИЮЛИнк property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link АдрИЮЛИнк }
                 *     
                 */
                public void setАдрИЮЛИнк(АдрИЮЛИнк value) {
                    this.адрИЮЛИнк = value;
                }

                /**
                 * Gets the value of the регИЮЛИнк property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link РегИЮЛИнк }
                 *     
                 */
                public РегИЮЛИнк getРегИЮЛИнк() {
                    return регИЮЛИнк;
                }

                /**
                 * Sets the value of the регИЮЛИнк property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link РегИЮЛИнк }
                 *     
                 */
                public void setРегИЮЛИнк(РегИЮЛИнк value) {
                    this.регИЮЛИнк = value;
                }

                /**
                 * Gets the value of the кодИЮЛИнк property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link КодИЮЛИнк }
                 *     
                 */
                public КодИЮЛИнк getКодИЮЛИнк() {
                    return кодИЮЛИнк;
                }

                /**
                 * Sets the value of the кодИЮЛИнк property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link КодИЮЛИнк }
                 *     
                 */
                public void setКодИЮЛИнк(КодИЮЛИнк value) {
                    this.кодИЮЛИнк = value;
                }

                /**
                 * Gets the value of the уставИЮЛ property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link УставИЮЛ }
                 *     
                 */
                public УставИЮЛ getУставИЮЛ() {
                    return уставИЮЛ;
                }

                /**
                 * Sets the value of the уставИЮЛ property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link УставИЮЛ }
                 *     
                 */
                public void setУставИЮЛ(УставИЮЛ value) {
                    this.уставИЮЛ = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="СтрРег" use="required" type="{}ОКСМТип" />
                 *       &lt;attribute name="НаимСтр" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;minLength value="1"/>
                 *             &lt;maxLength value="255"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="АдрИЮЛРег" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;minLength value="1"/>
                 *             &lt;maxLength value="255"/>
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
                @XmlType(name = "")
                public static class АдрИЮЛИнк {

                    @XmlAttribute(name = "\u0421\u0442\u0440\u0420\u0435\u0433", required = true)
                    protected String стрРег;
                    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0421\u0442\u0440", required = true)
                    protected String наимСтр;
                    @XmlAttribute(name = "\u0410\u0434\u0440\u0418\u042e\u041b\u0420\u0435\u0433", required = true)
                    protected String адрИЮЛРег;
                    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0412\u043d\u0435\u0441\u0420\u0410\u0424\u041f", required = true)
                    protected String датаВнесРАФП;

                    /**
                     * Gets the value of the стрРег property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getСтрРег() {
                        return стрРег;
                    }

                    /**
                     * Sets the value of the стрРег property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setСтрРег(String value) {
                        this.стрРег = value;
                    }

                    /**
                     * Gets the value of the наимСтр property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getНаимСтр() {
                        return наимСтр;
                    }

                    /**
                     * Sets the value of the наимСтр property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setНаимСтр(String value) {
                        this.наимСтр = value;
                    }

                    /**
                     * Gets the value of the адрИЮЛРег property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getАдрИЮЛРег() {
                        return адрИЮЛРег;
                    }

                    /**
                     * Sets the value of the адрИЮЛРег property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setАдрИЮЛРег(String value) {
                        this.адрИЮЛРег = value;
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


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="КодНП" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;minLength value="1"/>
                 *             &lt;maxLength value="50"/>
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
                @XmlType(name = "")
                public static class КодИЮЛИнк {

                    @XmlAttribute(name = "\u041a\u043e\u0434\u041d\u041f", required = true)
                    protected String кодНП;
                    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0412\u043d\u0435\u0441\u0420\u0410\u0424\u041f", required = true)
                    protected String датаВнесРАФП;

                    /**
                     * Gets the value of the кодНП property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getКодНП() {
                        return кодНП;
                    }

                    /**
                     * Sets the value of the кодНП property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setКодНП(String value) {
                        this.кодНП = value;
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


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="НаимИЮЛПолн" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;minLength value="1"/>
                 *             &lt;maxLength value="1000"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="НаимИЮЛЛат">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;minLength value="1"/>
                 *             &lt;maxLength value="1000"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="НаимИЮЛСокр">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;minLength value="1"/>
                 *             &lt;maxLength value="255"/>
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
                @XmlType(name = "")
                public static class НаимИЮЛ {

                    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0418\u042e\u041b\u041f\u043e\u043b\u043d", required = true)
                    protected String наимИЮЛПолн;
                    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0418\u042e\u041b\u041b\u0430\u0442")
                    protected String наимИЮЛЛат;
                    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0418\u042e\u041b\u0421\u043e\u043a\u0440")
                    protected String наимИЮЛСокр;
                    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0412\u043d\u0435\u0441\u0420\u0410\u0424\u041f", required = true)
                    protected String датаВнесРАФП;

                    /**
                     * Gets the value of the наимИЮЛПолн property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getНаимИЮЛПолн() {
                        return наимИЮЛПолн;
                    }

                    /**
                     * Sets the value of the наимИЮЛПолн property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setНаимИЮЛПолн(String value) {
                        this.наимИЮЛПолн = value;
                    }

                    /**
                     * Gets the value of the наимИЮЛЛат property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getНаимИЮЛЛат() {
                        return наимИЮЛЛат;
                    }

                    /**
                     * Sets the value of the наимИЮЛЛат property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setНаимИЮЛЛат(String value) {
                        this.наимИЮЛЛат = value;
                    }

                    /**
                     * Gets the value of the наимИЮЛСокр property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getНаимИЮЛСокр() {
                        return наимИЮЛСокр;
                    }

                    /**
                     * Sets the value of the наимИЮЛСокр property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setНаимИЮЛСокр(String value) {
                        this.наимИЮЛСокр = value;
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


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="НаимРегОрг" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;minLength value="1"/>
                 *             &lt;maxLength value="255"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="РегНомер" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;minLength value="1"/>
                 *             &lt;maxLength value="70"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="ОсобРежРег">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;minLength value="1"/>
                 *             &lt;maxLength value="255"/>
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
                @XmlType(name = "")
                public static class РегИЮЛИнк {

                    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0420\u0435\u0433\u041e\u0440\u0433", required = true)
                    protected String наимРегОрг;
                    @XmlAttribute(name = "\u0420\u0435\u0433\u041d\u043e\u043c\u0435\u0440", required = true)
                    protected String регНомер;
                    @XmlAttribute(name = "\u041e\u0441\u043e\u0431\u0420\u0435\u0436\u0420\u0435\u0433")
                    protected String особРежРег;
                    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0412\u043d\u0435\u0441\u0420\u0410\u0424\u041f", required = true)
                    protected String датаВнесРАФП;

                    /**
                     * Gets the value of the наимРегОрг property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getНаимРегОрг() {
                        return наимРегОрг;
                    }

                    /**
                     * Sets the value of the наимРегОрг property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setНаимРегОрг(String value) {
                        this.наимРегОрг = value;
                    }

                    /**
                     * Gets the value of the регНомер property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getРегНомер() {
                        return регНомер;
                    }

                    /**
                     * Sets the value of the регНомер property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setРегНомер(String value) {
                        this.регНомер = value;
                    }

                    /**
                     * Gets the value of the особРежРег property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getОсобРежРег() {
                        return особРежРег;
                    }

                    /**
                     * Sets the value of the особРежРег property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setОсобРежРег(String value) {
                        this.особРежРег = value;
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


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="УстКап" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
                 *             &lt;totalDigits value="20"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="КодВалют" use="required" type="{}ОКВТип" />
                 *       &lt;attribute name="ДатаВнесРАФП" use="required" type="{}ДатаТип" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class УставИЮЛ {

                    @XmlAttribute(name = "\u0423\u0441\u0442\u041a\u0430\u043f", required = true)
                    protected BigInteger устКап;
                    @XmlAttribute(name = "\u041a\u043e\u0434\u0412\u0430\u043b\u044e\u0442", required = true)
                    protected String кодВалют;
                    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0412\u043d\u0435\u0441\u0420\u0410\u0424\u041f", required = true)
                    protected String датаВнесРАФП;

                    /**
                     * Gets the value of the устКап property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getУстКап() {
                        return устКап;
                    }

                    /**
                     * Sets the value of the устКап property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setУстКап(BigInteger value) {
                        this.устКап = value;
                    }

                    /**
                     * Gets the value of the кодВалют property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getКодВалют() {
                        return кодВалют;
                    }

                    /**
                     * Sets the value of the кодВалют property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setКодВалют(String value) {
                        this.кодВалют = value;
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

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ФИООтв" type="{}ФИОТип"/>
     *       &lt;/sequence>
     *       &lt;attribute name="ДолжОтв">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;minLength value="1"/>
     *             &lt;maxLength value="45"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="Тлф">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;minLength value="1"/>
     *             &lt;maxLength value="20"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="E-mail">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;minLength value="1"/>
     *             &lt;maxLength value="45"/>
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
    @XmlType(name = "", propOrder = {
        "\u0444\u0438\u043e\u041e\u0442\u0432"
    })
    public static class ИдОтпр {

        @XmlElement(name = "\u0424\u0418\u041e\u041e\u0442\u0432", required = true)
        protected ФИОТип фиоОтв;
        @XmlAttribute(name = "\u0414\u043e\u043b\u0436\u041e\u0442\u0432")
        protected String должОтв;
        @XmlAttribute(name = "\u0422\u043b\u0444")
        protected String тлф;
        @XmlAttribute(name = "E-mail")
        protected String eMail;

        /**
         * Gets the value of the фиоОтв property.
         * 
         * @return
         *     possible object is
         *     {@link ФИОТип }
         *     
         */
        public ФИОТип getФИООтв() {
            return фиоОтв;
        }

        /**
         * Sets the value of the фиоОтв property.
         * 
         * @param value
         *     allowed object is
         *     {@link ФИОТип }
         *     
         */
        public void setФИООтв(ФИОТип value) {
            this.фиоОтв = value;
        }

        /**
         * Gets the value of the должОтв property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getДолжОтв() {
            return должОтв;
        }

        /**
         * Sets the value of the должОтв property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setДолжОтв(String value) {
            this.должОтв = value;
        }

        /**
         * Gets the value of the тлф property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getТлф() {
            return тлф;
        }

        /**
         * Sets the value of the тлф property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setТлф(String value) {
            this.тлф = value;
        }

        /**
         * Gets the value of the eMail property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEMail() {
            return eMail;
        }

        /**
         * Sets the value of the eMail property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEMail(String value) {
            this.eMail = value;
        }

    }

}
