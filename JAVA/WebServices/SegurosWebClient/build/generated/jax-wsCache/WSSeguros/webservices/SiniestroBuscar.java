
package webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SiniestroBuscar complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SiniestroBuscar"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idAfiliado" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiniestroBuscar", propOrder = {
    "idAfiliado"
})
public class SiniestroBuscar {

    protected int idAfiliado;

    /**
     * Obtiene el valor de la propiedad idAfiliado.
     * 
     */
    public int getIdAfiliado() {
        return idAfiliado;
    }

    /**
     * Define el valor de la propiedad idAfiliado.
     * 
     */
    public void setIdAfiliado(int value) {
        this.idAfiliado = value;
    }

}
