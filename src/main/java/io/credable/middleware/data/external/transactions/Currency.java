//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.02.17 at 12:29:25 PM EAT 
//


package io.credable.middleware.data.external.transactions;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for currency.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="currency"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TZS"/&gt;
 *     &lt;enumeration value="KES"/&gt;
 *     &lt;enumeration value="UGX"/&gt;
 *     &lt;enumeration value="USD"/&gt;
 *     &lt;enumeration value="GBP"/&gt;
 *     &lt;enumeration value="EURO"/&gt;
 *     &lt;enumeration value="PKR"/&gt;
 *     &lt;enumeration value="NGN"/&gt;
 *     &lt;enumeration value="EGP"/&gt;
 *     &lt;enumeration value="ETB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "currency")
@XmlEnum
public enum Currency {

    TZS,
    KES,
    UGX,
    USD,
    GBP,
    EURO,
    PKR,
    NGN,
    EGP,
    ETB;

    public String value() {
        return name();
    }

    public static Currency fromValue(String v) {
        return valueOf(v);
    }

}
