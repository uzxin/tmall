package test;


import com.xq.tmall.entity.Product;
import com.xq.tmall.service.ProductService;
import com.xq.tmall.service.impl.ProductServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import javax.annotation.Resources;


@RunWith(SpringJUnit4ClassRunner.class)  //使用junit4进行测试
@ContextConfiguration({"classpath:spring/spring-servlet.xml","classpath:spring/spring-context-service.xml","classpath:spring/spring-context-dao.xml"})
public class Test1 {

   /* @Resource(name = "productService")*/
    @Autowired
    private ProductService p;


    @Test
    public void demo1(){
        ProductService p=new ProductServiceImpl();
        Integer i=3;
        Product p1=p.get(i);
        System.out.println("11"+p1.getProduct_name());
    }
    @Test
    public void demo2(){
        System.out.println("test2");
        System.out.println(p);
    }
}
