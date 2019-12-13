package test;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;
import org.junit.Test;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test2 {
    @Test
    public void demo1(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/tt?characterEncoding=utf-8&useSSL=true",
                    "root","123456");
            System.out.println(connection);
            Statement statement=connection.createStatement();
            ResultSet rs=statement.executeQuery("select * from product");
            while (rs.next()){

                System.out.println(rs.getString("product_name"));
            }
            rs.close();
            statement.close();
            connection.close();
        }
        catch (Exception e){
            throw new RuntimeException(e);
        }

    }
    @Test
    public void demo2(){

    }

}
