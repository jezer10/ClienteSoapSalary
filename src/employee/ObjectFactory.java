
package employee;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the employee package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CalcularSalarioPorHoras_QNAME = new QName("http://employee/", "calcularSalarioPorHoras");
    private final static QName _CalcularSalarioPorHorasResponse_QNAME = new QName("http://employee/", "calcularSalarioPorHorasResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: employee
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalcularSalarioPorHorasResponse }
     * 
     */
    public CalcularSalarioPorHorasResponse createCalcularSalarioPorHorasResponse() {
        return new CalcularSalarioPorHorasResponse();
    }

    /**
     * Create an instance of {@link CalcularSalarioPorHoras }
     * 
     */
    public CalcularSalarioPorHoras createCalcularSalarioPorHoras() {
        return new CalcularSalarioPorHoras();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularSalarioPorHoras }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://employee/", name = "calcularSalarioPorHoras")
    public JAXBElement<CalcularSalarioPorHoras> createCalcularSalarioPorHoras(CalcularSalarioPorHoras value) {
        return new JAXBElement<CalcularSalarioPorHoras>(_CalcularSalarioPorHoras_QNAME, CalcularSalarioPorHoras.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularSalarioPorHorasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://employee/", name = "calcularSalarioPorHorasResponse")
    public JAXBElement<CalcularSalarioPorHorasResponse> createCalcularSalarioPorHorasResponse(CalcularSalarioPorHorasResponse value) {
        return new JAXBElement<CalcularSalarioPorHorasResponse>(_CalcularSalarioPorHorasResponse_QNAME, CalcularSalarioPorHorasResponse.class, null, value);
    }

}
