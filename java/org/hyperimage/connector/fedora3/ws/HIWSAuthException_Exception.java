
package org.hyperimage.connector.fedora3.ws;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.3.1-hudson-749-SNAPSHOT
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "HIWSAuthException", targetNamespace = "http://fedora3.connector.hyperimage.org/")
public class HIWSAuthException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private HIWSAuthException faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public HIWSAuthException_Exception(String message, HIWSAuthException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public HIWSAuthException_Exception(String message, HIWSAuthException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: org.hyperimage.connector.fedora3.ws.HIWSAuthException
     */
    public HIWSAuthException getFaultInfo() {
        return faultInfo;
    }

}