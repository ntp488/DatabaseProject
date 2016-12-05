
INSERT INTO Items (ItemID, ItemName)
VALUES
    (1, 'Coral Coast Arch'),
    (2, 'White Rose Metal Arch'),
    (3, 'Birch Pole Arch'),
    (4, 'Lacy Crystal Serving Set'),
    (5, 'Personalized Silver Serving Set'),
    (6, 'Personalized Serving Set'),
    (7, 'Always And Forever Aisle Runner'),
    (8, 'Lace And Rayon Aisle Runenr'),
    (9, 'Two Become One Aisle Runner'),
    (10, '100 Ct. Peruvian Lily'),
    (11, '12 Ct. Red Roses'),
    (12, '12 Ct. Multicolor Roses'),
    (13, '12 Ct. Red Roses'),
    (14, 'Trumpet Mermaid Bead/Lace Dress with Train'),
    (15, 'Gauze Scoop Mermaid with Train'),
    (16, 'Vera Wang Embroidered Wedding Gown'),
    (17, 'Amateur Officiant'),
    (18, 'Part-time Officiant'),
    (19, 'Professional Officiant'),
    (20, 'Senior Officiant'),
    (21, 'Senior Officiant Plus'),
    (22, 'Basic Engagement Shoot'),
    (23, 'Basic Engagement Shoot and Wedding Shoot'),
    (24, 'Wedding Photo Shoot Plus'),
    (25, 'Advanced Wedding Photo Shoot'),
    (26, 'Advanced Wedding Photo Shoot Plus'),
    (27, 'Two Teir Cake'),
    (28, 'Three Teir Cake'),
    (29, 'Three Teir Cake Customized'),
    (30, 'Four Teir Cake'),
    (31, 'Cutom Four Teir Cake');

INSERT INTO Vendors (VendorID, VendorName, VendorState)
VALUES
    (1, 'Knuk L. Wedding Supplies', 'AL'),
    (2, 'Narwhal Professional Wedding Planners', 'AL'),
    (3, 'Acme Supply Corp.', 'GA');
	
	
INSERT INTO VendorSupplies (VendorSupplyID, ItemID, VendorID, ItemCost, ItemStock)
VALUES
    (1, 27, 1, 275, 50),
    (2, 28, 1, 450, 35),
    (3, 29, 1, 500, 20),
    (4, 30, 1, 600, 10),
    (5, 31, 1, 1000, 3),
    (6, 17, 2, 200, 15),
    (7, 18, 2, 250, 5),
    (8, 19, 2, 500, 10),
    (9, 20, 2, 700, 3),
    (10, 21, 2, 800, 3),
    (11, 22, 2, 500, 30),
    (12, 23, 2, 2500, 10),
    (13, 24, 2, 4000, 8),
    (14, 25, 2, 7500, 5),
    (15, 26, 2, 9000, 2),
    (16, 27, 3, 250, 200),
    (17, 28, 3, 400, 100),
    (18, 29, 3, 420, 100),
    (19, 30, 3, 550, 50);