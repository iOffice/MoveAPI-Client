
package jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "handleRequestNotification", namespace = "http://api.iofficeconnect.com")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "handleRequestNotification", namespace = "http://api.iofficeconnect.com", propOrder = {
    "type",
    "id"
})
public class HandleRequestNotification {

    @XmlElement(name = "type", namespace = "")
    private String type;
    @XmlElement(name = "id", namespace = "")
    private Integer id;

    /**
     * 
     * @return
     *     returns String
     */
    public String getType() {
        return this.type;
    }

    /**
     * 
     * @param type
     *     the value for the type property
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     returns Integer
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * 
     * @param id
     *     the value for the id property
     */
    public void setId(Integer id) {
        this.id = id;
    }

}
