
package com.train.jaxws.complex.type.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.train.jaxws.complex.type.client package. 
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

    private final static QName _DoSomething2Response_QNAME = new QName("http://server.type.complex.jaxws.train.com/", "doSomething2Response");
    private final static QName _DoSomething1Response_QNAME = new QName("http://server.type.complex.jaxws.train.com/", "doSomething1Response");
    private final static QName _DoSomething4_QNAME = new QName("http://server.type.complex.jaxws.train.com/", "doSomething4");
    private final static QName _DoSomething3_QNAME = new QName("http://server.type.complex.jaxws.train.com/", "doSomething3");
    private final static QName _DoSomething2_QNAME = new QName("http://server.type.complex.jaxws.train.com/", "doSomething2");
    private final static QName _DoSomething1_QNAME = new QName("http://server.type.complex.jaxws.train.com/", "doSomething1");
    private final static QName _DoSomething4Response_QNAME = new QName("http://server.type.complex.jaxws.train.com/", "doSomething4Response");
    private final static QName _DoSomething3Response_QNAME = new QName("http://server.type.complex.jaxws.train.com/", "doSomething3Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.train.jaxws.complex.type.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DoSomething3Response }
     * 
     */
    public DoSomething3Response createDoSomething3Response() {
        return new DoSomething3Response();
    }

    /**
     * Create an instance of {@link DoSomething3 }
     * 
     */
    public DoSomething3 createDoSomething3() {
        return new DoSomething3();
    }

    /**
     * Create an instance of {@link DoSomething1Response }
     * 
     */
    public DoSomething1Response createDoSomething1Response() {
        return new DoSomething1Response();
    }

    /**
     * Create an instance of {@link DoSomething4 }
     * 
     */
    public DoSomething4 createDoSomething4() {
        return new DoSomething4();
    }

    /**
     * Create an instance of {@link DoSomething2Response }
     * 
     */
    public DoSomething2Response createDoSomething2Response() {
        return new DoSomething2Response();
    }

    /**
     * Create an instance of {@link DoSomething1 }
     * 
     */
    public DoSomething1 createDoSomething1() {
        return new DoSomething1();
    }

    /**
     * Create an instance of {@link DoSomething4Response }
     * 
     */
    public DoSomething4Response createDoSomething4Response() {
        return new DoSomething4Response();
    }

    /**
     * Create an instance of {@link DoSomething2 }
     * 
     */
    public DoSomething2 createDoSomething2() {
        return new DoSomething2();
    }

    /**
     * Create an instance of {@link Foo }
     * 
     */
    public Foo createFoo() {
        return new Foo();
    }

    /**
     * Create an instance of {@link UserBean }
     * 
     */
    public UserBean createUserBean() {
        return new UserBean();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoSomething2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.type.complex.jaxws.train.com/", name = "doSomething2Response")
    public JAXBElement<DoSomething2Response> createDoSomething2Response(DoSomething2Response value) {
        return new JAXBElement<DoSomething2Response>(_DoSomething2Response_QNAME, DoSomething2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoSomething1Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.type.complex.jaxws.train.com/", name = "doSomething1Response")
    public JAXBElement<DoSomething1Response> createDoSomething1Response(DoSomething1Response value) {
        return new JAXBElement<DoSomething1Response>(_DoSomething1Response_QNAME, DoSomething1Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoSomething4 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.type.complex.jaxws.train.com/", name = "doSomething4")
    public JAXBElement<DoSomething4> createDoSomething4(DoSomething4 value) {
        return new JAXBElement<DoSomething4>(_DoSomething4_QNAME, DoSomething4 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoSomething3 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.type.complex.jaxws.train.com/", name = "doSomething3")
    public JAXBElement<DoSomething3> createDoSomething3(DoSomething3 value) {
        return new JAXBElement<DoSomething3>(_DoSomething3_QNAME, DoSomething3 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoSomething2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.type.complex.jaxws.train.com/", name = "doSomething2")
    public JAXBElement<DoSomething2> createDoSomething2(DoSomething2 value) {
        return new JAXBElement<DoSomething2>(_DoSomething2_QNAME, DoSomething2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoSomething1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.type.complex.jaxws.train.com/", name = "doSomething1")
    public JAXBElement<DoSomething1> createDoSomething1(DoSomething1 value) {
        return new JAXBElement<DoSomething1>(_DoSomething1_QNAME, DoSomething1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoSomething4Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.type.complex.jaxws.train.com/", name = "doSomething4Response")
    public JAXBElement<DoSomething4Response> createDoSomething4Response(DoSomething4Response value) {
        return new JAXBElement<DoSomething4Response>(_DoSomething4Response_QNAME, DoSomething4Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoSomething3Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.type.complex.jaxws.train.com/", name = "doSomething3Response")
    public JAXBElement<DoSomething3Response> createDoSomething3Response(DoSomething3Response value) {
        return new JAXBElement<DoSomething3Response>(_DoSomething3Response_QNAME, DoSomething3Response.class, null, value);
    }

}
