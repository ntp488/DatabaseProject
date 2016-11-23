CREATE TABLE Customers (
    CustomerID INT IDENTITY PRIMARY KEY,
    CustomerFirstName VARCHAR(30) NOT NULL,
    CustomerLastName VARCHAR(30) NOT NULL
);

CREATE TABLE Employees (
    EmployeeID INT IDENTITY PRIMARY KEY,
    EmployeeFirstName VARCHAR(30) NOT NULL,
    EmployeeLastName VARCHAR(30) NOT NULL,
    EmployeeSalary INT NOT NULL
);

CREATE TABLE Weddings (
    WeddingID INT IDENTITY PRIMARY KEY,
    WeddingDate DATE NOT NULL,
    TotalPrice DOUBLE NOT NULL,
    Paid BOOLEAN NOT NULL,
    CustomerID INT NOT NULL,
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);

CREATE TABLE Vendors (
    VendorID INT IDENTITY PRIMARY KEY,
    VendorName VARCHAR(50) NOT NULL,
    VendorState VARCHAR(2) NOT NULL
);

CREATE TABLE Items (
    ItemID INT IDENTITY PRIMARY KEY,
    ItemName VARCHAR(50) NOT NULL,
    ItemStock INT NOT NULL,
);

CREATE TABLE VendorSupplies (
    VendorSupplyID INT IDENTITY PRIMARY KEY,
    ItemID INT NOT NULL,
    VendorID INT NOT NULL,
    ItemCost DOUBLE NOT NULL,
    FOREIGN KEY (ItemID) REFERENCES Items(ItemID),
    FOREIGN KEY (VendorID) REFERENCES Vendors(VendorID)
);

CREATE TABLE WeddingSupplies (
    WeddingSuppliesID INT IDENTITY PRIMARY KEY,
    WeddingID INT NOT NULL,
    VendorSupplyID INT NOT NULL,
    Quantity INT NOT NULL,
    FOREIGN KEY (WeddingID) REFERENCES Weddings(WeddingID),
    FOREIGN KEY (VendorSupplyID) REFERENCES VendorSupplies(VendorSupplyID)
);