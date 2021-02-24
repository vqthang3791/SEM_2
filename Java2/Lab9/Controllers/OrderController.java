package Java2.Lab9.Controllers;

import Java2.Lab9.Models.Order;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OrderController {
    String url = "jdbc:mysql://192.168.64.3:3306/ebookstore";
    String username = "root";
    String password = "";
    List<Order> orderList = new ArrayList<>();
    public List<Order> loading(){
        try (
                Connection conn = DriverManager.getConnection(url, username,password);
                Statement stmt = conn.createStatement();
        ) {
            String select = "Select * from orders";
            ResultSet rset = stmt.executeQuery(select);
            while(rset.next()){
                int Oid = rset.getInt("orderID");
                int Cid = rset.getInt("customerID");
                int discount = rset.getInt("discount");
                double price = rset.getDouble("total");
                String orderdate = rset.getString("orderdate");
                int status = rset.getInt("status");
                String createddate = rset.getString("createddate");
                String updateddate = rset.getString("updateddate");
                Order obj = new Order(Oid,Cid,discount,price,orderdate,status,createddate,updateddate);
                orderList.add(obj);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return orderList;
    }
}
