package Java2.Lab3;

import java.sql.*;

public class Exercises2 {
    public static void main(String[] args) {
        try (

                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        "");


                Statement stmt = conn.createStatement();

        ) {
            //1.Hiển thị dnah sách khách hàng
            String strSelect = "select * from customers";
            System.out.println("1.The SQL statement is: " + strSelect + "\n");

            ResultSet rset = stmt.executeQuery(strSelect);

            System.out.println("The records selected are: ");
            int rowCount = 0;
            while (rset.next()) {
                String CustomerID = rset.getString("CustomerID");
                String CompanyName = rset.getString("CompanyName");
                String ContactName = rset.getString("ContactName");
                String ContactTitle = rset.getString("ContactTitle");
                String Address = rset.getString("Address");
                String City = rset.getString("City");
                String Region = rset.getString("Region");
                String PostalCode = rset.getString("PostalCode");
                String Country = rset.getString("Country");
                String Phone = rset.getString("Phone");
                String Fax = rset.getString("Fax");
                System.out.println(CustomerID + ", " + CompanyName + ", " + ContactName + ", " + ContactTitle + ", " + Address + ", " + City + ", " + Region + ", " + PostalCode + ", " + Country + ", " + Phone + ", " + Fax);
                rowCount++;
            }
            System.out.println("Total number of record = " + rowCount);


////2.Tìm kiếm khách hàng theo tên
            System.out.println("=========================================================================================");
            String strSelect1 = "select * from customers WHERE ContactName LIKE 'Zbyszek Piestrzeniewicz'";
            System.out.println("2.The SQL statement is: " + strSelect1 + "\n");

            ResultSet rset1 = stmt.executeQuery(strSelect1);

            System.out.println("The records selected are: ");
            int rowCount1 = 0;
            while (rset1.next()) {
                String ContactName = rset1.getString("ContactName");
                System.out.println(ContactName);
                rowCount1++;
            }
            System.out.println("Total number of record = " + rowCount1);
            //3.Hiển thị danh sách sản phẩm
            System.out.println("=========================================================================================");
            String strSelect2 = "select * from products ";
            System.out.println("3.The SQL statement is: " + strSelect2 + "\n");

            ResultSet rset2 = stmt.executeQuery(strSelect2);

            System.out.println("The records selected are: ");
            int rowCount2 = 0;
            while (rset2.next()) {
                int ProductID = rset2.getInt("ProductID");
                String ProductName = rset2.getString("ProductName");
                int SupplierID = rset2.getInt("SupplierID");
                int CategoryID = rset2.getInt("CategoryID");
                String QuantityPerUnit = rset2.getString("QuantityPerUnit");
                double UnitPrice = rset2.getDouble("UnitPrice");
                int UnitsInStock = rset2.getInt("UnitsInStock");
                int UnitsOnOrder = rset2.getInt("UnitsOnOrder");
                int ReorderLevel = rset2.getInt("ReorderLevel");
                int Discontinued = rset2.getInt("Discontinued");
                System.out.println(ProductID + ", " + ProductName + ", " + SupplierID + ", " + CategoryID + ", " + QuantityPerUnit + ", " + UnitPrice + ", " + UnitsInStock + ", " + UnitsOnOrder + ", " + ReorderLevel + ", " + Discontinued);
                rowCount2++;
            }
            System.out.println("Total number of record = " + rowCount2);


            //4.Tìm sản phẩm theo giá bán trong khoảng do người dùng nhập vào
            System.out.println("=========================================================================================");

            String strSelect3 = "select * from products WHERE UnitPrice BETWEEN 10 AND 20 ";
            System.out.println("4.The SQL statement is: " + strSelect3 + "\n");

            ResultSet rset3 = stmt.executeQuery(strSelect3);

            System.out.println("The records selected are: ");
            int rowCount3 = 0;
            while (rset3.next()) {
                String ProductName = rset3.getString("ProductName");
                double UnitPrice = rset3.getDouble("UnitPrice");
                System.out.println(ProductName + ", " + UnitPrice);
                rowCount3++;
            }
            System.out.println("Total number of record = " + rowCount3);

            //5.Hiển thị thông tin chi tiết của một đơn hàng
            System.out.println("=========================================================================================");
            String strSelect4 = "select * from orders ";
            System.out.println("5.The SQL statement is: " + strSelect4 + "\n");

            ResultSet rset4 = stmt.executeQuery(strSelect4);

            System.out.println("The records selected are: ");
            int rowCount4 = 0;
            while (rset4.next()) {
                int OrderID = rset4.getInt("OrderID");
                String CustomerID = rset4.getString("CustomerID");
                int EmployeeID = rset4.getInt("EmployeeID");
                String OrderDate = rset4.getString("OrderDate");
                String RequiredDate = rset4.getString("RequiredDate");
                String ShippedDate = rset4.getString("ShippedDate");
                int ShipVia = rset4.getInt("ShipVia");
                double Freight = rset4.getDouble("Freight");
                String ShipName = rset4.getString("ShipName");
                String ShipAddress = rset4.getString("ShipAddress");
                String ShipCity = rset4.getString("ShipCity");
                String ShipRegion = rset4.getString("ShipRegion");
                String ShipPostalCode = rset4.getString("ShipPostalCode");
                String ShipCountry = rset4.getString("ShipCountry");

                System.out.println(OrderID + ", " + CustomerID + ", " + EmployeeID + ", " + OrderDate + ", " + RequiredDate + ", " + ShippedDate + ", " + ShipVia + ", " + Freight + ", " + ShipName + ", " + ShipAddress + ", " + ShipCity + ", " + ShipRegion + ", " + ShipPostalCode + ", " + ShipCountry);
                rowCount4++;
            }
            System.out.println("Total number of record = " + rowCount4);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }//Step5
    }
}
