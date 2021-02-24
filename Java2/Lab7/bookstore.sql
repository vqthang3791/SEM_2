CREATE TABLE IF NOT EXISTS Users (
    username varchar (50),
    password varchar (31),
    role varchar (3)
);

CREATE TABLE IF NOT EXISTS Books (
    ISBN int PRIMARY KEY ,
    Book_Name varchar (50),
    Title varchar (50),
    Author varchar (50),
    Qty int,
    Price double
);

CREATE TABLE IF NOT EXISTS Customers (
    Customer_ID int PRIMARY KEY ,
    Customer_Name varchar (50),
    Email varchar (50),
    Phone char(12) ,
    Address varchar (50),
    lever char(20)
);

CREATE TABLE IF NOT EXISTS Orders (
    Orders_ID int PRIMARY KEY ,
    ISBN int ,
    Customer_ID int,
    Customer_Name varchar (50),
    Book_Name varchar (50),
    Date timestamp,
    Qty int ,
    Price double,
    FOREIGN KEY (ISBN) REFERENCES Books(ISBN),
    FOREIGN KEY (Customer_ID) REFERENCES Customers(Customer_ID)
);

CREATE TABLE IF NOT EXISTS Orders_details (
    Orders_ID int,
    Customer_Name varchar (50),
    Phone char (50),
    Book_Name varchar (50),
    Qty int,
    Price double ,
    Amount double ,
    Ship_Address varchar (50),
    Ship_city varchar (15),
    FOREIGN KEY (Orders_ID) REFERENCES Orders(Orders_ID)
);

CREATE TABLE IF NOT EXISTS Instocks (
    ISBN int ,
    Book_Name varchar (50),
    Qty int
);