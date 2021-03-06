// Copyright 2018 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.


package com.google.api.ads.adwords.jaxws.v201802.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceExtensionPriceQualifier.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PriceExtensionPriceQualifier">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="FROM"/>
 *     &lt;enumeration value="UP_TO"/>
 *     &lt;enumeration value="AVERAGE"/>
 *     &lt;enumeration value="NONE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PriceExtensionPriceQualifier")
@XmlEnum
public enum PriceExtensionPriceQualifier {


    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 'From' qualifier for the price.
     *               
     * 
     */
    FROM,

    /**
     * 
     *                 'Up to' qualifier for the price.
     *               
     * 
     */
    UP_TO,

    /**
     * 
     *                 'Average' qualifier for the price.
     *               
     * 
     */
    AVERAGE,

    /**
     * 
     *                 None is used for clearing the qualifier.
     *               
     * 
     */
    NONE;

    public String value() {
        return name();
    }

    public static PriceExtensionPriceQualifier fromValue(String v) {
        return valueOf(v);
    }

}
