
package soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the soap package. 
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

    private final static QName _CalcularFactorial_QNAME = new QName("http://soap/", "calcularFactorial");
    private final static QName _CalcularFactorialResponse_QNAME = new QName("http://soap/", "calcularFactorialResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalcularFactorialResponse }
     * 
     */
    public CalcularFactorialResponse createCalcularFactorialResponse() {
        return new CalcularFactorialResponse();
    }

    /**
     * Create an instance of {@link CalcularFactorial }
     * 
     */
    public CalcularFactorial createCalcularFactorial() {
        return new CalcularFactorial();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularFactorial }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "calcularFactorial")
    public JAXBElement<CalcularFactorial> createCalcularFactorial(CalcularFactorial value) {
        return new JAXBElement<CalcularFactorial>(_CalcularFactorial_QNAME, CalcularFactorial.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularFactorialResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "calcularFactorialResponse")
    public JAXBElement<CalcularFactorialResponse> createCalcularFactorialResponse(CalcularFactorialResponse value) {
        return new JAXBElement<CalcularFactorialResponse>(_CalcularFactorialResponse_QNAME, CalcularFactorialResponse.class, null, value);
    }

}
