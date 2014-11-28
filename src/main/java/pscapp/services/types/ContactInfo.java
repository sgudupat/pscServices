package pscapp.services.types;

import javax.xml.bind.annotation.*;

import org.codehaus.jackson.annotate.JsonProperty;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"contactFirstName", "contactLastName", "contactEmailAddress"})
@XmlRootElement(name = "ContactInfo")
public class ContactInfo {

    @XmlElement(required = true)
    @JsonProperty(value = "contactFirstName")
    protected String contactFirstName;

    @XmlElement(required = true)
    @JsonProperty(value = "contactLastName")
    protected String contactLastName;

    @XmlElement(required = true)
    @JsonProperty(value = "contactEmailAddress")
    protected String contactEmailAddress;

    public String getContactFirstName() {
        return contactFirstName;
    }

    public void setContactFirstName(String value) {
        this.contactFirstName = value;
    }

    public String getContactLastName() {
        return contactLastName;
    }

    public void setContactLastName(String value) {
        this.contactLastName = value;
    }

    public String getContactEmailAddress() {
        return contactEmailAddress;
    }

    public void setContactEmailAddress(String value) {
        this.contactEmailAddress = value;
    }

}
