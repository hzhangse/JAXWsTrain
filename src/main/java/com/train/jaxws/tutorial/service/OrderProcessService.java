package com.train.jaxws.tutorial.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Endpoint;

import com.train.jaxws.tutorial.service.bean.OrderBean;

//JWS annotation that specifies that the porType name of the 
//Web Service is "OrderProcessPort", the service name 
//is "OrderProcess", and the targetNamespace used in the generated
//WSDL is "http://jawxs.tutorial/jaxws/orderprocess"

@WebService(serviceName = "OrderProcess", portName = "OrderProcessPort", targetNamespace = "http://jawxs.tutorial/jaxws/orderprocess")
// JWS annotation that specifies the mapping of the service onto the
// SOAP message protocol.In particular, it specifies that the SOAP messages
// are document-literal.
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public class OrderProcessService {

	@WebMethod
	public OrderBean processOrder(OrderBean orderBean) {

		// Do processing...
		System.out.println("processOrder called for customer"
				+ orderBean.getCustomer().getCustomerId());

		// Items ordered are
		if (orderBean.getOrderItems() != null) {
			System.out.println("Number of items is "
					+ orderBean.getOrderItems().length);
		}

		// Process Order.

		// Set the Order Id.
		orderBean.setOrderId("A1234");

		return orderBean;
	}

	public static void main(String[] args) {

		Endpoint.publish("http://localhost:8080/OrderProcessWeb/orderprocess",
				new OrderProcessService());
		
		System.out.println("The web service is published at http://localhost:8080/OrderProcessWeb/orderprocess");
		
		System.out.println("To stop running the web service , terminate the java process");
		

	}
}
