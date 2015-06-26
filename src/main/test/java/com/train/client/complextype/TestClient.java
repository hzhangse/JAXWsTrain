package com.train.client.complextype;


import java.util.ArrayList;
import java.util.List;

import com.train.jaxws.complex.type.client.Foo;
import com.train.jaxws.complex.type.client.Java6WS;
import com.train.jaxws.complex.type.client.Java6WSService;
import com.train.jaxws.complex.type.client.UserBean;

/**
 * 测试Java6 WS生成的客户端代码
 *
 * 
 */
public class TestClient {
    public static void main(String[] args) {
       
    	  //创建一个客户端服务对象
        Java6WS java6WS = new Java6WSService().getJava6WSPort();
        System.out.println("----------java6WS.doSomething1-------------");
        //调用服务方法，并得到方法返回值
        List<UserBean> listUserBean = java6WS.doSomething1("zhangsan", "华中路", true);
        //打印服务的返回值
        for (UserBean userBean : listUserBean) {
            System.out.println(userBean.getUsername() + " " + userBean.getAddress() + " " + userBean.isFlag());
        }

        System.out.println("----------java6WS.doSomething2-------------");
        List<Foo> listFoo = new ArrayList<Foo>();
        Foo f1 = new Foo();
        f1.setName("张三");
        f1.setSex("Man");
        Foo f2 = new Foo();
        f2.setName("李四");
        f2.setSex("Man");
        listFoo.add(f1);
        listFoo.add(f2);
        String sf = java6WS.doSomething2(listFoo);
        System.out.println(sf);
        
      

        System.out.println("----------java6WS.doSomething3-------------");
        //调用服务方法，并得到方法返回值
        UserBean userBean = java6WS.doSomething3("zhangsan", "华中路", true);
        //打印服务的返回值
        System.out.println(userBean.toString());
        System.out.println(userBean.getUsername() + " " + userBean.getAddress() + " " + userBean.isFlag());

        System.out.println("----------java6WS.doSomething4-------------");
        Foo f = new Foo();
        f.setName("李四");
        f.setSex("Man");
        String sf1 = java6WS.doSomething4(f);
        System.out.println(sf1);
    
    }
}
