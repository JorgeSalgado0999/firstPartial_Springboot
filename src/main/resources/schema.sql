DROP TABLE PRODUCTS;
DROP TABLE USERS;
DROP TABLE CARTS;

CREATE TABLE Products (
    product_id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name varchar(255),
    description varchar(255),
    price float
);

CREATE TABLE Users (
    user_id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name varchar(255),
    items int
);

CREATE TABLE Carts (
    cart_id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    product_ref int,
    user_ref int
);
ATLTER TABLE CARTS
    ADD FOREIGN KEY (user_ref) REFERENCES USERS(user_id),
    ADD FOREIGN KEY (product_ref) REFERENCES PRODUCTS(product_id);