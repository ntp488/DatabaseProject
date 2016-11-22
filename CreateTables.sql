CREATE TABLE Customer (
    CustomerID INT IDENTITY PRIMARY KEY,
    CustomerFirstName VARCHAR(30) NOT NULL,
    CustomerLastName VARCHAR(30) NOT NULL
);

CREATE TABLE Employee (
    EmployeeID INT IDENTITY PRIMARY KEY,
    EmployeeFirstName VARCHAR(30) NOT NULL,
    EmployeeLastName VARCHAR(30) NOT NULL,
    EmployeeSalary INT NOT NULL
);

CREATE TABLE Wedding (
    WeddingID INT IDENTITY PRIMARY KEY,
    WeddingDate DATE NOT NULL,
    TotalPrice DOUBLE NOT NULL,
    Paid BOOLEAN NOT NULL,
    TotalCost DOUBLE NOT NULL,
    CustomerID INT NOT NULL,
    FOREIGN KEY (CustomerID) REFERENCES Customer(CustomerID)
);

CREATE TABLE Vender (
    VenderID INT IDENTITY PRIMARY KEY,
    VenderName VARCHAR(50) NOT NULL,
    VenderState VARCHAR(2) NOT NULL
);

CREATE TABLE Supplies (
    ItemID INT IDENTITY PRIMARY KEY,
    ItemName VARCHAR(50) NOT NULL,
    VenderID INT NOT NULL,
    ItemCost DOUBLE NOT NULL,
    Stock INT NOT NULL,
    FOREIGN KEY (VenderID) REFERENCES Vender(VenderID)
);