package generated.authentificationserviceclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour loginAvailableResponse complex type.
 *
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 *
 * <pre>
 * &lt;complexType name="loginAvailableResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loginAvailableResponse", propOrder = {"_return"})
public class LoginAvailableResponse {

  @XmlElement(name = "return")
  protected Boolean _return;

  /**
   * Obtient la valeur de la propriété return.
   *
   * @return possible object is {@link Boolean }
   */
  public Boolean isReturn() {
    return _return;
  }

  /**
   * Définit la valeur de la propriété return.
   *
   * @param value
   *     allowed object is {@link Boolean }
   */
  public void setReturn(Boolean value) {
    this._return = value;
  }

}