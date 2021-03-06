/**
 * Copyright 2015-2020 JENIA Software
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package org.sinekarta.ingestionservice.commons.services;


import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import org.sinekarta.ingestionservice.commons.mets.Mets;
import org.sinekarta.ingestionservice.commons.service.response.TransmissionResponse;



/**
 * This class was generated by Apache CXF 3.0.3
 * 2015-02-25T16:04:06.949+01:00
 * Generated source version: 3.0.3
 * 
 */

@WebService(targetNamespace = "http://ws.service.sinekarta.org/", name = "ServiceIngestTransmit")
@XmlSeeAlso({ObjectFactory.class})
public interface ServiceIngestTransmit {
	
	@WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "transmitSip", targetNamespace = "http://ws.service.sinekarta.org/", className = "org.sinekarta.ingestionservice.commons.metadata.service.request.TransmitSip")
    @WebMethod(action = "urn:TransmitSip")
    @ResponseWrapper(localName = "transmitSipResponse", targetNamespace = "http://ws.service.sinekarta.org/", className = "org.sinekarta.ingestionservice.commons.metadata.service.response.TransmitSipResponse")
    public TransmissionResponse transmitSip(
    	@WebParam(name = "responseEndpointAddress", targetNamespace = "")
    	java.lang.String responseEndpointAddress,
    	@WebParam(name = "sip", targetNamespace = "")
        Mets sip
    );

	@WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "transmitLinkToSip", targetNamespace = "http://ws.service.sinekarta.org/", className = "org.sinekarta.ingestionservice.commons.metadata.service.request.TransmitLinkToSip")
    @WebMethod(action = "urn:TransmitLinkToSip")
    @ResponseWrapper(localName = "transmitLinkToSipResponse", targetNamespace = "http://ws.service.sinekarta.org/", className = "org.sinekarta.ingestionservice.commons.metadata.service.response.TransmitLinkToSipResponse")
    public TransmissionResponse transmitLinkToSip(
    	@WebParam(name = "responseEndpointAddress", targetNamespace = "")
    	java.lang.String responseEndpointAddress,
    	@WebParam(name = "sipAddress", targetNamespace = "")
    	java.lang.String sipAddress
    );
	
}
