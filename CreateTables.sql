CREATE TABLE Customers (
    CustomerID INT PRIMARY KEY,
    CustomerFirstName VARCHAR(30),
    CustomerLastName VARCHAR(30)
);

CREATE TABLE Weddings (
    WeddingID INT PRIMARY KEY,
    WeddingDate DATE,
    TotalPrice DOUBLE,
    Paid BOOLEAN,
    TotalCost DOUBLE,
    CustomerID INT,
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);

CREATE TABLE Venders (
    VenderID INT PRIMARY KEY,
    VenderName VARCHAR(50),
    VenderState VARCHAR(2)
);

CREATE TABLE Supplies (
    ItemID INT PRIMARY KEY,
    ItemName VARCHAR(50),
    VenderID INT,
    ItemCost DOUBLE,
    Stock INT,
    FOREIGN KEY (VenderID) REFERENCES Venders(VenderID)
);