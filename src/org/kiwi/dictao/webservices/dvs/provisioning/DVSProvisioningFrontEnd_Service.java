
package org.kiwi.dictao.webservices.dvs.provisioning;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "DVSProvisioningFrontEnd", targetNamespace = "http://www.dictao.com/DVS/FrontEnd/Provisioning", wsdlLocation = "file:/C:/local_projects/java/librairies/dictao/wsdl/DVSProvisioningWithXsd.wsdl")
public class DVSProvisioningFrontEnd_Service
    extends Service
{

    private final static URL DVSPROVISIONINGFRONTEND_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(org.kiwi.dictao.webservices.dvs.provisioning.DVSProvisioningFrontEnd_Service.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = org.kiwi.dictao.webservices.dvs.provisioning.DVSProvisioningFrontEnd_Service.class.getResource(".");
            url = new URL(baseUrl, "file:/C:/local_projects/java/librairies/dictao/wsdl/DVSProvisioningWithXsd.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'file:/C:/local_projects/java/librairies/dictao/wsdl/DVSProvisioningWithXsd.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        DVSPROVISIONINGFRONTEND_WSDL_LOCATION = url;
    }

    public DVSProvisioningFrontEnd_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DVSProvisioningFrontEnd_Service() {
        super(DVSPROVISIONINGFRONTEND_WSDL_LOCATION, new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "DVSProvisioningFrontEnd"));
    }

    /**
     * 
     * @return
     *     returns DVSProvisioningFrontEnd
     */
    @WebEndpoint(name = "DVSProvisioningFrontEndSOAP")
    public DVSProvisioningFrontEnd getDVSProvisioningFrontEndSOAP() {
        return super.getPort(new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "DVSProvisioningFrontEndSOAP"), DVSProvisioningFrontEnd.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DVSProvisioningFrontEnd
     */
    @WebEndpoint(name = "DVSProvisioningFrontEndSOAP")
    public DVSProvisioningFrontEnd getDVSProvisioningFrontEndSOAP(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.dictao.com/DVS/FrontEnd/Provisioning", "DVSProvisioningFrontEndSOAP"), DVSProvisioningFrontEnd.class, features);
    }

}
