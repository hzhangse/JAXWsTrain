package com.train.jaxws.complex.type.server;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * Java6开发的WebService服务端
 *
 */
@WebService
public class Java6WS {

	 //返回一个List
    public List<UserBean> doSomething1(String username, String address, boolean flag) {
        List<UserBean> listUserBean = new ArrayList<UserBean>();
        for (int i = 0; i < 3; i++) {
            listUserBean.add(new UserBean(username, address, flag));
        }
        return listUserBean;
    }

    //接收一个List
    public String doSomething2(List<Foo> listFoo) {
        StringBuffer sb = new StringBuffer();
        for (Foo foo : listFoo) {
            sb.append(foo.toString()).append("\n");
        }
        return sb.toString();
    }
    
    //返回一个复杂对象
    public UserBean doSomething3(String username, String address, boolean flag) {
        return new UserBean(username, address, flag);
    }

    //接收一个复杂对象
    public String doSomething4(Foo foo) {
        return foo.toString();
    }

    public static void main(String[] args) {
        //发布一个WebService
        Endpoint.publish("http://localhost:9000/java6ws/Java6WS", new Java6WS());
    }
}
