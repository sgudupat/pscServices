package pscapp.service;
import java.util.logging.Logger;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import pscapp.services.types.ContactInfo;
import pscapp.services.types.UserInfoRequest;
import pscglobalsolutions.api.services.wsdl.PSCAPIService;
import pscglobalsolutions.api.services.wsdl.PSCAPIServiceImpl;


public class PSCAPIServiceImplTest {

    private static final Logger log = Logger.getLogger(PSCAPIServiceImplTest.class.getName());
      
    @Autowired
	private PSCAPIService apiService;

	@Test
	public void getContacts() {
		 UserInfoRequest userInfoRequest = new UserInfoRequest();
		 assertEquals(userInfoRequest.setEmailAddress("tech.dillip111@gmail.com"));
		 
		 
		//1. Pass UserInfo who have 1 contact
		//2. Pass UserInfo who have more than 1 contact
		//3. Pass UserInfo who do not have any contacts
		ContactInfo contactInfo = apiService.getContacts(userInfo);
		log.info("contactInfo::" + contactInfo.toString());
		
	}
}
