//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.06.25 um 05:49:12 AM CEST 
//


package io.spring.guides.gs_producing_web_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="windAndDirection" type="{http://spring.io/guides/gs-producing-web-service}windAndDirection"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "windAndDirection"
})
@XmlRootElement(name = "getWindAndDirectionResponse")
public class GetWindAndDirectionResponse {

    @XmlElement(required = true)
    protected WindAndDirection windAndDirection;

    /**
     * Ruft den Wert der windAndDirection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link WindAndDirection }
     *     
     */
    public WindAndDirection getWindAndDirection() {
        return windAndDirection;
    }

    /**
     * Legt den Wert der windAndDirection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link WindAndDirection }
     *     
     */
    public void setWindAndDirection(WindAndDirection value) {
        this.windAndDirection = value;
    }

}