package com.train.servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.xml.ws.Endpoint;

import com.train.jaxws.complex.type.server.Java6WS;

/**
 * Servlet implementation class WSServletDemo
 */
@WebServlet(name = "WSServlet", urlPatterns = { "/WSServlet" }, loadOnStartup=1)
public class WSServletDemo extends GenericServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see GenericServlet#GenericServlet()
	 */
	public WSServletDemo() {
		super();
		System.out
				.println("准备启动WebService服务：http://locahost:9000/java6ws/Java6WS");
		// 发布一个WebService
		 Endpoint.publish("http://localhost:9000/java6ws/Java6WS", new Java6WS());
		System.out
				.println("已成功启动WebService服务：http://localhost:9000/java6ws/Java6WS");
	}

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		System.out
		.println("此Servlet不处理任何业务逻辑，仅仅发布一个Web服务：http://localhost:9000/java6ws/Java6WS");
	}

}
