create table student(
    id varchar (50) primary key ,
    name varchar (50),
    address varchar (255),
    phone varchar (12) CHECK (phone REGEXP '[]0-9]{10, 12}')
)