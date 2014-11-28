package pscglobalsolutions.api.rest.service;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;

import pscapp.services.service.ContactsService;
import pscapp.services.types.ContactInfo;
import pscapp.services.types.ContactInfoResponse;
import pscapp.services.types.UserInfoRequest;


public class RESTServiceImpl implements RESTService {

    private static final Logger logger = Logger.getLogger(RESTServiceImpl.class.getName());

    @Autowired
    private ContactsService contactsService;

    public ContactInfoResponse getContacts(final UserInfoRequest userInfo) {

        try {
            logger.info("userInfo::" + userInfo);
            List<ContactInfo> contacts = contactsService.getContacts(userInfo.getEmailAddress(), userInfo.getPassword());
            logger.info("contacts::" + contacts);
            return null;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }

    }

    /*public UserInfo loginViaApp(UserInfoRequest userInfo2) {
         return null;
     }*/


}
