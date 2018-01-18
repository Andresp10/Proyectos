
package webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para poliza complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="poliza"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="afiliado" type="{http://WebServices/}afiliado" minOccurs="0"/&gt;
 *         &lt;element name="idPoliza" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "poliza", propOrder = {
    "afiliado",
    "idPoliza",
    "tipo",
    "valor"
})
public class Poliza {

    protected Afiliado afiliado;
    protected int idPoliza;
    protected String tipo;
    protected double valor;

    /**
     * Obtiene el valor de la propiedad afiliado.
     * 
     * @return
     *     possible object is
     *     {@link Afiliado }
     *     
     */
    public Afiliado getAfiliado() {
        return afiliado;
    }

    /**
     * Define el valor de la propiedad afiliado.
     * 
     * @param value
     *     allowed object is
     *     {@link Afiliado }
     *     
     */
    public void setAfiliado(Afiliado value) {
        this.afiliado = value;
    }

    /**
     * Obtiene el valor de la propiedad idPoliza.
     * 
     */
    public int getIdPoliza() {
        return idPoliza;
    }

    /**
     * Define el valor de la propiedad idPoliza.
     * 
     */
    public void setIdPoliza(int value) {
        this.idPoliza = value;
    }

    /**
     * Obtiene el valor de la propiedad tipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Define el valor de la propiedad tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

    /**
     * Obtiene el valor de la propiedad valor.
     * 
     */
    public double getValor() {
        return valor;
    }

    /**
     * Define el valor de la propiedad valor.
     * 
     */
    public void setValor(double value) {
        this.valor = value;
    }

}
