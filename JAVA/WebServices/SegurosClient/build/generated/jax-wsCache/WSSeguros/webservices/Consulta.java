
package webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Consulta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Consulta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idAfiliado" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Consulta", propOrder = {
    "idAfiliado"
})
public class Consulta {

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
