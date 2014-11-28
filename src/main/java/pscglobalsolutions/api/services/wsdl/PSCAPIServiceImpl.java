
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package pscglobalsolutions.api.services.wsdl;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;

import pscapp.services.service.ContactsService;
import pscapp.services.types.ContactInfo;
import pscapp.services.types.ContactInfoResponse;

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

    @Autowired
    private ContactsService contactsService;

    public ContactInfoResponse getContacts(pscapp.services.types.UserInfoRequest userInfo) {
        LOG.info("Inside getContacts() methods");
    	try {
            LOG.info("userInfo::" + userInfo);
            List<ContactInfo> contacts = contactsService.getContacts(userInfo.getEmailAddress(), userInfo.getPassword());
            LOG.info("contacts::" + contacts);
/*
    		pscapp.services.types.ContactInfo[] contactInfoList = new pscapp.services.types.ContactInfo[4];
            String email = userInfo.getEmailAddress();
            String password = userInfo.getPassword();
            if(email.equalsIgnoreCase("tech.dillip111@gmail.com") && password.equalsIgnoreCase("dillip")){
            	contactInfoList[0] = new ContactInfo();
            	contactInfoList[0].setContactFirstName("Dillip");
            	contactInfoList[0].setContactLastName("Das");
            	contactInfoList[0].setContactEmailAddress("tech.dillip@yahoo.com");
            }
            if(email.equalsIgnoreCase("tech.dillip111@gmail.com") && password.equalsIgnoreCase("dillip")){
            	contactInfoList[1] = new ContactInfo();
            	contactInfoList[1].setContactFirstName("Sai");
            	contactInfoList[1].setContactLastName("Teja");
            	contactInfoList[1].setContactEmailAddress("saiteja@yahoo.com");
            }
            if(email.equalsIgnoreCase("tech.dillip111@gmail.com") && password.equalsIgnoreCase("dillip")){
            	contactInfoList[2] = new ContactInfo();
            	contactInfoList[2].setContactFirstName("Anil");
            	contactInfoList[2].setContactLastName("Kumar");
            	contactInfoList[2].setContactEmailAddress("anilkumar@yahoo.com");
            }
            if(email.equalsIgnoreCase("tech.dillip111@gmail.com") && password.equalsIgnoreCase("dillip")){
            	contactInfoList[3] = new ContactInfo();
            	contactInfoList[3].setContactFirstName("Murali");
            	contactInfoList[3].setContactLastName("Kumar");
            	contactInfoList[3].setContactEmailAddress("murali333@gmail.com");
            }
            ContactInfoResponse response = new ContactInfoResponse();
            response.setContactInfo(contactInfoList);
            return response;
*/
            return null;
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
        LOG.info("userInfo2::" + userInfo2);
        try {
            pscapp.services.types.UserInfo _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
