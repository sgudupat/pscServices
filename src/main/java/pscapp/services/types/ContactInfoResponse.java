package pscapp.services.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ContactInfoResponse")
public class ContactInfoResponse {

    @XmlElement(required = true)
    private ContactInfo[] contactInfo;

	public ContactInfo[] getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(ContactInfo[] contactInfo) {
		this.contactInfo = contactInfo;
	}

}
