
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package pscglobalsolutions.api.services.wsdl;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.6.16
 * 2014-11-17T12:05:24.308+05:30
 * Generated source version: 2.6.16
 * 
 */

@javax.jws.WebService(
                      serviceName = "PSCAPIWS",
                      portName = "PSCSOAPPort",
                      targetNamespace = "http://pscglobalsolutions/API/services/wsdl",
                      wsdlLocation = "WEB-INF/pscAPIServices.wsdl",
                      endpointInterface = "pscglobalsolutions.api.services.wsdl.PSCAPIService")
                      
public class PSCAPIServiceImpl implements PSCAPIService {

    private static final Logger LOG = Logger.getLogger(PSCAPIServiceImpl.class.getName());

    /* (non-Javadoc)
     * @see pscglobalsolutions.api.services.wsdl.PSCAPIService#getContacts(pscapp.services.types.UserInfoRequest  userInfo )*
     */
    public pscapp.services.types.ContactInfo getContacts(pscapp.services.types.UserInfoRequest userInfo) { 
        LOG.info("Executing operation getContacts");
        System.out.println(userInfo);
        try {
            pscapp.services.types.ContactInfo _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see pscglobalsolutions.api.services.wsdl.PSCAPIService#loginViaApp(pscapp.services.types.UserInfoRequest2  userInfo2 )*
     */
    public pscapp.services.types.UserInfo loginViaApp(pscapp.services.types.UserInfoRequest userInfo2) { 
        LOG.info("Executing operation loginViaApp");
        System.out.println(userInfo2);
        try {
            pscapp.services.types.UserInfo _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
