
package dbgui;

import java.awt.Toolkit;
import java.sql.*;
import java.util.Vector;
import java.util.logging.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class DatabaseGUI extends javax.swing.JFrame {
    
    Connection conn;

    public DatabaseGUI() {
        try {
            Class.forName("org.hsqldb.jdbc.JDBCDriver");
        }
        catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Driver could not be loaded.", "Driver Error", JOptionPane.ERROR_MESSAGE);
            System.err.println("Driver could not be loaded.");
            System.exit(0);
        }
        
        try {
            conn = DriverManager.getConnection("jdbc:hsqldb:file:DatabaseProject", "pwrigley", "weddings");
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Could not connect to database.", "Connection Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(DatabaseGUI.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(0);
        }
        
        initComponents();
        this.setTitle("P. Wrigley Custom Weddings");
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/cake.png")));
        
        popupAddFrame.setTitle("Add A Record");
        popupAddFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/cake.png")));
        
        popupRemoveFrame.setTitle("Remove A Record");
        popupRemoveFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/cake.png")));
        
        resetAddPopup();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupAddFrame = new javax.swing.JFrame();
        tabPane = new javax.swing.JTabbedPane();
        customerTab = new javax.swing.JPanel();
        addCustomerButton = new javax.swing.JButton();
        customerRequiredLabel = new javax.swing.JLabel();
        customerFirstNameLabel = new javax.swing.JLabel();
        customerFirstName = new javax.swing.JTextField();
        customerLastNameLabel = new javax.swing.JLabel();
        customerLastName = new javax.swing.JTextField();
        employeeTab = new javax.swing.JPanel();
        addEmployeeButton = new javax.swing.JButton();
        employeeFirstNameLabel = new javax.swing.JLabel();
        employeeFirstName = new javax.swing.JTextField();
        employeeLastNameLabel = new javax.swing.JLabel();
        employeeLastName = new javax.swing.JTextField();
        employeeSalaryLabel = new javax.swing.JLabel();
        employeeSalary = new javax.swing.JSpinner();
        employeeRequiredLabel = new javax.swing.JLabel();
        weddingTab = new javax.swing.JPanel();
        addWeddingButton = new javax.swing.JButton();
        weddingDateLabel = new javax.swing.JLabel();
        weddingRequiredLabel = new javax.swing.JLabel();
        weddingPriceLabel = new javax.swing.JLabel();
        weddingPrice = new javax.swing.JSpinner();
        weddingPaidLabel = new javax.swing.JLabel();
        weddingPaidYesButton = new javax.swing.JRadioButton();
        weddingPaidNoButton = new javax.swing.JRadioButton();
        weddingCustomerIDLabel = new javax.swing.JLabel();
        weddingCustomerID = new javax.swing.JSpinner();
        weddingDate = new javax.swing.JTextField();
        vendorTab = new javax.swing.JPanel();
        addVendorButton = new javax.swing.JButton();
        vendorRequiredLabel = new javax.swing.JLabel();
        venderNameLabel = new javax.swing.JLabel();
        vendorName = new javax.swing.JTextField();
        venderStateLabel = new javax.swing.JLabel();
        vendorState = new javax.swing.JComboBox<>();
        suppliesTab = new javax.swing.JPanel();
        addSuppliesButton = new javax.swing.JButton();
        suppliesRequiredLabel = new javax.swing.JLabel();
        itemNameLabel = new javax.swing.JLabel();
        itemName = new javax.swing.JTextField();
        vendorSuppliesTab = new javax.swing.JPanel();
        addVendorSuppliesButton = new javax.swing.JButton();
        vendorSuppliesRequiredLabel = new javax.swing.JLabel();
        vendorSuppliesItemIDLabel = new javax.swing.JLabel();
        vendorSuppliesItemID = new javax.swing.JSpinner();
        vendorSuppliesVendorIDLabel = new javax.swing.JLabel();
        vendorSuppliesVendorID = new javax.swing.JSpinner();
        vendorSuppliesItemCostLabel = new javax.swing.JLabel();
        vendorSuppliesItemCost = new javax.swing.JSpinner();
        vendorSuppliesItemStock = new javax.swing.JSpinner();
        vendorSuppliesItemStockLabel = new javax.swing.JLabel();
        weddingSuppliesTab = new javax.swing.JPanel();
        addWeddingSuppliesButton = new javax.swing.JButton();
        weddingSuppliesRequiredLabel = new javax.swing.JLabel();
        weddingSuppliesWeddingIDLabel = new javax.swing.JLabel();
        weddingSuppliesWeddingID = new javax.swing.JSpinner();
        weddingSuppliesVendorSupplyIDLabel = new javax.swing.JLabel();
        weddingSuppliesVendorSupplyID = new javax.swing.JSpinner();
        weddingSuppliesQuantityLabel = new javax.swing.JLabel();
        weddingSuppliesQuantity = new javax.swing.JSpinner();
        weddingButtonGroup = new javax.swing.ButtonGroup();
        popupRemoveFrame = new javax.swing.JFrame();
        removeRecordTypeLabel = new javax.swing.JLabel();
        removeRecordType = new javax.swing.JComboBox<>();
        removeRecordIDLabel = new javax.swing.JLabel();
        removeRecordID = new javax.swing.JSpinner();
        removeRemoveButton = new javax.swing.JButton();
        scrollPaneOne = new javax.swing.JScrollPane();
        tableOne = new javax.swing.JTable();
        tablePicker = new javax.swing.JComboBox<>();
        addButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();

        popupAddFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        popupAddFrame.setSize(400,600);
        popupAddFrame.setResizable(false);

        addCustomerButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        addCustomerButton.setText("Add");
        addCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomerButtonActionPerformed(evt);
            }
        });

        customerRequiredLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        customerRequiredLabel.setText("All Fields Required");

        customerFirstNameLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        customerFirstNameLabel.setText("First Name");

        customerLastNameLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        customerLastNameLabel.setText("Last Name");

        javax.swing.GroupLayout customerTabLayout = new javax.swing.GroupLayout(customerTab);
        customerTab.setLayout(customerTabLayout);
        customerTabLayout.setHorizontalGroup(
            customerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(customerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customerTabLayout.createSequentialGroup()
                        .addComponent(customerRequiredLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                        .addComponent(addCustomerButton))
                    .addComponent(customerFirstName)
                    .addGroup(customerTabLayout.createSequentialGroup()
                        .addGroup(customerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(customerFirstNameLabel)
                            .addComponent(customerLastNameLabel))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(customerLastName))
                .addContainerGap())
        );
        customerTabLayout.setVerticalGroup(
            customerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customerTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(customerFirstNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customerFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(customerLastNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customerLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 374, Short.MAX_VALUE)
                .addGroup(customerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(customerRequiredLabel)
                    .addComponent(addCustomerButton))
                .addContainerGap())
        );

        tabPane.addTab("Customer", customerTab);

        addEmployeeButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        addEmployeeButton.setText("Add");
        addEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmployeeButtonActionPerformed(evt);
            }
        });

        employeeFirstNameLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        employeeFirstNameLabel.setText("First Name");

        employeeLastNameLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        employeeLastNameLabel.setText("Last Name");

        employeeSalaryLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        employeeSalaryLabel.setText("Salary");

        employeeSalary.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        employeeRequiredLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        employeeRequiredLabel.setText("All Fields Required");

        javax.swing.GroupLayout employeeTabLayout = new javax.swing.GroupLayout(employeeTab);
        employeeTab.setLayout(employeeTabLayout);
        employeeTabLayout.setHorizontalGroup(
            employeeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(employeeTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(employeeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, employeeTabLayout.createSequentialGroup()
                        .addComponent(employeeRequiredLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                        .addComponent(addEmployeeButton))
                    .addComponent(employeeFirstName)
                    .addComponent(employeeLastName)
                    .addGroup(employeeTabLayout.createSequentialGroup()
                        .addGroup(employeeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(employeeFirstNameLabel)
                            .addComponent(employeeLastNameLabel)
                            .addComponent(employeeSalaryLabel))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(employeeSalary))
                .addContainerGap())
        );
        employeeTabLayout.setVerticalGroup(
            employeeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, employeeTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(employeeFirstNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(employeeFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(employeeLastNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(employeeLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(employeeSalaryLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(employeeSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 302, Short.MAX_VALUE)
                .addGroup(employeeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addEmployeeButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(employeeRequiredLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        tabPane.addTab("Employee", employeeTab);

        addWeddingButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        addWeddingButton.setText("Add");
        addWeddingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addWeddingButtonActionPerformed(evt);
            }
        });

        weddingDateLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        weddingDateLabel.setText("Wedding Date");

        weddingRequiredLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        weddingRequiredLabel.setText("All Fields Required");

        weddingPriceLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        weddingPriceLabel.setText("Wedding Price");

        weddingPrice.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));

        weddingPaidLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        weddingPaidLabel.setText("Paid");

        weddingButtonGroup.add(weddingPaidYesButton);
        weddingPaidYesButton.setSelected(true);
        weddingPaidYesButton.setText("Yes");

        weddingButtonGroup.add(weddingPaidNoButton);
        weddingPaidNoButton.setText("No");

        weddingCustomerIDLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        weddingCustomerIDLabel.setText("Customer ID");

        weddingCustomerID.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        weddingDate.setText("YYYY-MM-DD");
        weddingDate.setToolTipText("");

        javax.swing.GroupLayout weddingTabLayout = new javax.swing.GroupLayout(weddingTab);
        weddingTab.setLayout(weddingTabLayout);
        weddingTabLayout.setHorizontalGroup(
            weddingTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(weddingTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(weddingTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, weddingTabLayout.createSequentialGroup()
                        .addComponent(weddingRequiredLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                        .addComponent(addWeddingButton))
                    .addComponent(weddingPrice)
                    .addComponent(weddingCustomerID)
                    .addGroup(weddingTabLayout.createSequentialGroup()
                        .addGroup(weddingTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(weddingDateLabel)
                            .addComponent(weddingPriceLabel)
                            .addComponent(weddingPaidLabel)
                            .addComponent(weddingCustomerIDLabel)
                            .addGroup(weddingTabLayout.createSequentialGroup()
                                .addComponent(weddingPaidYesButton)
                                .addGap(18, 18, 18)
                                .addComponent(weddingPaidNoButton)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(weddingDate))
                .addContainerGap())
        );
        weddingTabLayout.setVerticalGroup(
            weddingTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, weddingTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(weddingDateLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(weddingDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(weddingPriceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(weddingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(weddingPaidLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(weddingTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weddingPaidYesButton)
                    .addComponent(weddingPaidNoButton))
                .addGap(18, 18, 18)
                .addComponent(weddingCustomerIDLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(weddingCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 226, Short.MAX_VALUE)
                .addGroup(weddingTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addWeddingButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(weddingRequiredLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        tabPane.addTab("Wedding", weddingTab);

        addVendorButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        addVendorButton.setText("Add");
        addVendorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVendorButtonActionPerformed(evt);
            }
        });

        vendorRequiredLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        vendorRequiredLabel.setText("All Fields Required");

        venderNameLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        venderNameLabel.setText("Vendor Name");

        venderStateLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        venderStateLabel.setText("Vendor State");

        vendorState.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        vendorState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "FL", "GA", "HI", "ID", "IL", "IN", "IA", "KS", "KY", "LA", "ME", "MD", "MA", "MI", "MN", "MS", "MO", "MT", "NE", "NV", "NH", "NJ", "NM", "NY", "NC", "ND", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VT", "VA", "WA", "WV", "WI", "WY", "DC" }));

        javax.swing.GroupLayout vendorTabLayout = new javax.swing.GroupLayout(vendorTab);
        vendorTab.setLayout(vendorTabLayout);
        vendorTabLayout.setHorizontalGroup(
            vendorTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vendorTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(vendorTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vendorTabLayout.createSequentialGroup()
                        .addComponent(vendorRequiredLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                        .addComponent(addVendorButton))
                    .addComponent(vendorName)
                    .addGroup(vendorTabLayout.createSequentialGroup()
                        .addGroup(vendorTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(venderNameLabel)
                            .addComponent(venderStateLabel))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(vendorState, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        vendorTabLayout.setVerticalGroup(
            vendorTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vendorTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(venderNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vendorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(venderStateLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vendorState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 373, Short.MAX_VALUE)
                .addGroup(vendorTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(vendorRequiredLabel)
                    .addComponent(addVendorButton))
                .addContainerGap())
        );

        tabPane.addTab("Vendor", vendorTab);

        addSuppliesButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        addSuppliesButton.setText("Add");
        addSuppliesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSuppliesButtonActionPerformed(evt);
            }
        });

        suppliesRequiredLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        suppliesRequiredLabel.setText("All Fields Required");

        itemNameLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        itemNameLabel.setText("Item Name");

        javax.swing.GroupLayout suppliesTabLayout = new javax.swing.GroupLayout(suppliesTab);
        suppliesTab.setLayout(suppliesTabLayout);
        suppliesTabLayout.setHorizontalGroup(
            suppliesTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(suppliesTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(suppliesTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, suppliesTabLayout.createSequentialGroup()
                        .addComponent(suppliesRequiredLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                        .addComponent(addSuppliesButton))
                    .addComponent(itemName)
                    .addGroup(suppliesTabLayout.createSequentialGroup()
                        .addComponent(itemNameLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        suppliesTabLayout.setVerticalGroup(
            suppliesTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, suppliesTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(itemNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(itemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 467, Short.MAX_VALUE)
                .addGroup(suppliesTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(suppliesRequiredLabel)
                    .addComponent(addSuppliesButton))
                .addContainerGap())
        );

        tabPane.addTab("Item", suppliesTab);

        addVendorSuppliesButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        addVendorSuppliesButton.setText("Add");
        addVendorSuppliesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVendorSuppliesButtonActionPerformed(evt);
            }
        });

        vendorSuppliesRequiredLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        vendorSuppliesRequiredLabel.setText("All Fields Required");

        vendorSuppliesItemIDLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        vendorSuppliesItemIDLabel.setText("Item ID");

        vendorSuppliesItemID.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        vendorSuppliesVendorIDLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        vendorSuppliesVendorIDLabel.setText("Vendor ID");

        vendorSuppliesVendorID.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        vendorSuppliesItemCostLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        vendorSuppliesItemCostLabel.setText("Item Cost");

        vendorSuppliesItemCost.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));

        vendorSuppliesItemStockLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        vendorSuppliesItemStockLabel.setText("Stock");

        javax.swing.GroupLayout vendorSuppliesTabLayout = new javax.swing.GroupLayout(vendorSuppliesTab);
        vendorSuppliesTab.setLayout(vendorSuppliesTabLayout);
        vendorSuppliesTabLayout.setHorizontalGroup(
            vendorSuppliesTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vendorSuppliesTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(vendorSuppliesTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vendorSuppliesTabLayout.createSequentialGroup()
                        .addComponent(vendorSuppliesRequiredLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                        .addComponent(addVendorSuppliesButton))
                    .addComponent(vendorSuppliesItemID)
                    .addComponent(vendorSuppliesVendorID)
                    .addComponent(vendorSuppliesItemCost)
                    .addGroup(vendorSuppliesTabLayout.createSequentialGroup()
                        .addGroup(vendorSuppliesTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vendorSuppliesItemIDLabel)
                            .addComponent(vendorSuppliesVendorIDLabel)
                            .addComponent(vendorSuppliesItemCostLabel)
                            .addComponent(vendorSuppliesItemStockLabel))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(vendorSuppliesItemStock))
                .addContainerGap())
        );
        vendorSuppliesTabLayout.setVerticalGroup(
            vendorSuppliesTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vendorSuppliesTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(vendorSuppliesItemIDLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vendorSuppliesItemID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(vendorSuppliesVendorIDLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vendorSuppliesVendorID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(vendorSuppliesItemCostLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vendorSuppliesItemCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(vendorSuppliesItemStockLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vendorSuppliesItemStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 251, Short.MAX_VALUE)
                .addGroup(vendorSuppliesTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(vendorSuppliesRequiredLabel)
                    .addComponent(addVendorSuppliesButton))
                .addContainerGap())
        );

        tabPane.addTab("Vendor Supplies", vendorSuppliesTab);

        addWeddingSuppliesButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        addWeddingSuppliesButton.setText("Add");
        addWeddingSuppliesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addWeddingSuppliesButtonActionPerformed(evt);
            }
        });

        weddingSuppliesRequiredLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        weddingSuppliesRequiredLabel.setText("All Fields Required");

        weddingSuppliesWeddingIDLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        weddingSuppliesWeddingIDLabel.setText("Wedding ID");

        weddingSuppliesWeddingID.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        weddingSuppliesVendorSupplyIDLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        weddingSuppliesVendorSupplyIDLabel.setText("Vendor Supply ID");

        weddingSuppliesVendorSupplyID.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        weddingSuppliesQuantityLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        weddingSuppliesQuantityLabel.setText("Quantity");

        weddingSuppliesQuantity.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        javax.swing.GroupLayout weddingSuppliesTabLayout = new javax.swing.GroupLayout(weddingSuppliesTab);
        weddingSuppliesTab.setLayout(weddingSuppliesTabLayout);
        weddingSuppliesTabLayout.setHorizontalGroup(
            weddingSuppliesTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(weddingSuppliesTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(weddingSuppliesTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, weddingSuppliesTabLayout.createSequentialGroup()
                        .addComponent(weddingSuppliesRequiredLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                        .addComponent(addWeddingSuppliesButton))
                    .addComponent(weddingSuppliesWeddingID)
                    .addComponent(weddingSuppliesVendorSupplyID)
                    .addGroup(weddingSuppliesTabLayout.createSequentialGroup()
                        .addGroup(weddingSuppliesTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(weddingSuppliesWeddingIDLabel)
                            .addComponent(weddingSuppliesVendorSupplyIDLabel)
                            .addComponent(weddingSuppliesQuantityLabel))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(weddingSuppliesQuantity))
                .addContainerGap())
        );
        weddingSuppliesTabLayout.setVerticalGroup(
            weddingSuppliesTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, weddingSuppliesTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(weddingSuppliesWeddingIDLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(weddingSuppliesWeddingID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(weddingSuppliesVendorSupplyIDLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(weddingSuppliesVendorSupplyID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(weddingSuppliesQuantityLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(weddingSuppliesQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 298, Short.MAX_VALUE)
                .addGroup(weddingSuppliesTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(weddingSuppliesRequiredLabel)
                    .addComponent(addWeddingSuppliesButton))
                .addContainerGap())
        );

        tabPane.addTab("Wedding Supplies", weddingSuppliesTab);

        javax.swing.GroupLayout popupAddFrameLayout = new javax.swing.GroupLayout(popupAddFrame.getContentPane());
        popupAddFrame.getContentPane().setLayout(popupAddFrameLayout);
        popupAddFrameLayout.setHorizontalGroup(
            popupAddFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(popupAddFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabPane)
                .addContainerGap())
        );
        popupAddFrameLayout.setVerticalGroup(
            popupAddFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(popupAddFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabPane)
                .addContainerGap())
        );

        popupRemoveFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        popupRemoveFrame.setSize(400,200);
        popupRemoveFrame.setResizable(false);

        removeRecordTypeLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        removeRecordTypeLabel.setText("Record Type");

        removeRecordType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer", "Employee", "Wedding", "Vendor", "Item", "Vendor Supplies", "Wedding Supplies" }));

        removeRecordIDLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        removeRecordIDLabel.setText("Record ID");

        removeRecordID.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        removeRemoveButton.setText("Remove");
        removeRemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeRemoveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout popupRemoveFrameLayout = new javax.swing.GroupLayout(popupRemoveFrame.getContentPane());
        popupRemoveFrame.getContentPane().setLayout(popupRemoveFrameLayout);
        popupRemoveFrameLayout.setHorizontalGroup(
            popupRemoveFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(popupRemoveFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(popupRemoveFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(removeRecordType, 0, 388, Short.MAX_VALUE)
                    .addGroup(popupRemoveFrameLayout.createSequentialGroup()
                        .addGroup(popupRemoveFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(removeRecordTypeLabel)
                            .addComponent(removeRecordIDLabel))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(removeRecordID)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, popupRemoveFrameLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(removeRemoveButton)))
                .addContainerGap())
        );
        popupRemoveFrameLayout.setVerticalGroup(
            popupRemoveFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(popupRemoveFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(removeRecordTypeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeRecordType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(removeRecordIDLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeRecordID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(removeRemoveButton)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        tableOne.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scrollPaneOne.setViewportView(tableOne);

        String[] tableChoices = {"Price Comparisons", "Unpaid Weddings", "Wedding Profit/Loss", "Unfinished Weddings", "Customers", "Employees", "Weddings", "Vendors", "Items", "Vendor Supplies", "Wedding Supplies"};
        tablePicker.setModel(new javax.swing.DefaultComboBoxModel<>(tableChoices));
        tablePicker.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tablePickerItemStateChanged(evt);
            }
        });

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        removeButton.setText("Remove");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPaneOne, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tablePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPaneOne, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tablePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton)
                    .addComponent(removeButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablePickerItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tablePickerItemStateChanged
        try {
            loadTable();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tablePickerItemStateChanged

    private void addCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustomerButtonActionPerformed
        if (customerFirstName.getText().length() > 0 && customerLastName.getText().length() > 0) {
            try {
                String statement = "INSERT INTO Customers (CustomerFirstName, CustomerLastName) VALUES (?,?);";
                PreparedStatement prepst = conn.prepareStatement(statement);
                prepst.setString(1, customerFirstName.getText());
                prepst.setString(2, customerLastName.getText());
                prepst.executeUpdate();
            }
            catch (SQLException ex) {
                Logger.getLogger(DatabaseGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        resetAddPopup();
    }//GEN-LAST:event_addCustomerButtonActionPerformed

    private void addEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmployeeButtonActionPerformed
        if (employeeFirstName.getText().length() > 0 && employeeLastName.getText().length() > 0) {
            try {
                String statement = "INSERT INTO Employees (EmployeeFirstName, EmployeeLastName, EmployeeSalary) VALUES (?,?,?);";
                PreparedStatement prepst = conn.prepareStatement(statement);
                prepst.setString(1, employeeFirstName.getText());
                prepst.setString(2, employeeLastName.getText());
                prepst.setInt(3, (int) employeeSalary.getValue());
                prepst.executeUpdate();
            }
            catch (SQLException ex) {
                Logger.getLogger(DatabaseGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        resetAddPopup();
    }//GEN-LAST:event_addEmployeeButtonActionPerformed

    private void addWeddingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addWeddingButtonActionPerformed
        try {
            String statement = "INSERT INTO Weddings (WeddingDate, TotalPrice, Paid, CustomerID) VALUES (?,?,?,?);";
            PreparedStatement prepst = conn.prepareStatement(statement);
            prepst.setDate(1, Date.valueOf(weddingDate.getText()));
            prepst.setDouble(2, (double) weddingPrice.getValue());
            if(weddingPaidYesButton.isSelected()) {
                prepst.setBoolean(3, true);
            }
            else {
                prepst.setBoolean(3, false);
            }
            prepst.setInt(4, (int) weddingCustomerID.getValue());
            prepst.executeUpdate();
        }
        catch (SQLException ex) {
            Logger.getLogger(DatabaseGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        resetAddPopup();
    }//GEN-LAST:event_addWeddingButtonActionPerformed

    private void addVendorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVendorButtonActionPerformed
        if (vendorName.getText().length() > 0) {
            try {
                String statement = "INSERT INTO Vendors (VendorName, VendorState) VALUES (?,?);";
                PreparedStatement prepst = conn.prepareStatement(statement);
                prepst.setString(1, vendorName.getText());
                prepst.setString(2, (String) vendorState.getSelectedItem());
                prepst.executeUpdate();
            }
            catch (SQLException ex) {
                Logger.getLogger(DatabaseGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        resetAddPopup();
    }//GEN-LAST:event_addVendorButtonActionPerformed

    private void addSuppliesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSuppliesButtonActionPerformed
        if (itemName.getText().length() > 0) {
            try {
                String statement = "INSERT INTO Items (ItemName) VALUES (?);";
                PreparedStatement prepst = conn.prepareStatement(statement);
                prepst.setString(1, itemName.getText());
                prepst.executeUpdate();
            }
            catch (SQLException ex) {
                Logger.getLogger(DatabaseGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        resetAddPopup();
    }//GEN-LAST:event_addSuppliesButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        popupAddFrame.setVisible(true);
    }//GEN-LAST:event_addButtonActionPerformed

    private void removeRemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeRemoveButtonActionPerformed
        String type = (String) removeRecordType.getSelectedItem();
        String statement;
        PreparedStatement prepst;
        try {
            switch(type) {
                case "Customer":        statement = "DELETE FROM Customers WHERE CustomerID = ?";
                                        prepst = conn.prepareStatement(statement);
                                        prepst.setInt(1, (int) removeRecordID.getValue());
                                        prepst.executeUpdate();
                    break;
                case "Employee":        statement = "DELETE FROM Employees WHERE EmployeeID = ?";
                                        prepst = conn.prepareStatement(statement);
                                        prepst.setInt(1, (int) removeRecordID.getValue());
                                        prepst.executeUpdate();
                    break;
                case "Wedding":         statement = "DELETE FROM Weddings WHERE WeddingID = ?";
                                        prepst = conn.prepareStatement(statement);
                                        prepst.setInt(1, (int) removeRecordID.getValue());
                                        prepst.executeUpdate();
                    break;
                case "Vendor":          statement = "DELETE FROM Vendors WHERE VendorID = ?";
                                        prepst = conn.prepareStatement(statement);
                                        prepst.setInt(1, (int) removeRecordID.getValue());
                                        prepst.executeUpdate();
                    break;
                case "Item":            statement = "DELETE FROM Items WHERE ItemID = ?";
                                        prepst = conn.prepareStatement(statement);
                                        prepst.setInt(1, (int) removeRecordID.getValue());
                                        prepst.executeUpdate();
                    break;
                case "Vendor Supplies": statement = "DELETE FROM VendorSupplies WHERE VendorSupplyID = ?";
                                        prepst = conn.prepareStatement(statement);
                                        prepst.setInt(1, (int) removeRecordID.getValue());
                                        prepst.executeUpdate();
                    break;
                case "Wedding Supplies":statement = "DELETE FROM WeddingSupplies WHERE WeddingSuppliesID = ?";
                                        prepst = conn.prepareStatement(statement);
                                        prepst.setInt(1, (int) removeRecordID.getValue());
                                        prepst.executeUpdate();
                    break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        resetRemovePopup();
    }//GEN-LAST:event_removeRemoveButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        popupRemoveFrame.setVisible(true);
    }//GEN-LAST:event_removeButtonActionPerformed

    private void addVendorSuppliesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVendorSuppliesButtonActionPerformed
        try {
            String statement = "INSERT INTO VendorSupplies (ItemID, VendorID, ItemCost, ItemStock) VALUES (?,?,?,?);";
            PreparedStatement prepst = conn.prepareStatement(statement);
            prepst.setInt(1, (int) vendorSuppliesItemID.getValue());
            prepst.setInt(2, (int) vendorSuppliesVendorID.getValue());
            prepst.setDouble(3, (double) vendorSuppliesItemCost.getValue());
            prepst.setInt(4, (int) vendorSuppliesItemStock.getValue());
            prepst.executeUpdate();
        }
        catch (SQLException ex) {
            Logger.getLogger(DatabaseGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        resetAddPopup();
    }//GEN-LAST:event_addVendorSuppliesButtonActionPerformed

    private void addWeddingSuppliesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addWeddingSuppliesButtonActionPerformed
        try {
            String statement = "INSERT INTO WeddingSupplies (WeddingID, VendorSupplyID, Quantity) VALUES (?,?,?);";
            PreparedStatement prepst = conn.prepareStatement(statement);
            prepst.setInt(1, (int) weddingSuppliesWeddingID.getValue());
            prepst.setInt(2, (int) weddingSuppliesVendorSupplyID.getValue());
            prepst.setInt(3, (int) weddingSuppliesQuantity.getValue());
            prepst.executeUpdate();
        }
        catch (SQLException ex) {
            Logger.getLogger(DatabaseGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        resetAddPopup();
    }//GEN-LAST:event_addWeddingSuppliesButtonActionPerformed

    private void loadTable() throws SQLException {
        Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs;
        String table = (String) tablePicker.getSelectedItem();
        switch(table){
                case "Price Comparisons":   rs = st.executeQuery("SELECT i.ItemName, v.VendorName, vs.ItemCost "
                                                                + "FROM Items as i, Vendors as v, VendorSupplies as vs "
                                                                + "WHERE v.VendorID = vs.VendorID AND i.ItemID = vs.ItemID "
                                                                + "ORDER BY i.ItemName, vs.ItemCost");
                                            tableOne.setModel(buildTableModel(rs));
                    break;
                case "Unpaid Weddings":     rs = st.executeQuery("SELECT * FROM Weddings WHERE Paid = false");
                                            tableOne.setModel(buildTableModel(rs));
                    break;
                case "Wedding Profit/Loss": rs = st.executeQuery("SELECT w.WeddingID, w.TotalPrice - SUM(vs.ItemCost * ws.Quantity) as NetIncome "
                                                                + "FROM Weddings as w, WeddingSupplies as ws, VendorSupplies as vs "
                                                                + "WHERE w.WeddingID = ws.WeddingID AND vs.VendorSupplyID = ws.VendorSupplyID "
                                                                + "GROUP BY w.WeddingID, w.TotalPrice");
                                            tableOne.setModel(buildTableModel(rs));
                    break;
                case "Unfinished Weddings": rs = st.executeQuery("SELECT * FROM Weddings as w Where w.WeddingDate >= CURDATE()");
                                            tableOne.setModel(buildTableModel(rs));
                    break;
                case "Customers":           rs = st.executeQuery("SELECT * FROM Customers");
                                            tableOne.setModel(buildTableModel(rs));
                    break;
                case "Employees":           rs = st.executeQuery("SELECT * FROM Employees");
                                            tableOne.setModel(buildTableModel(rs));
                    break;
                case "Weddings":            rs = st.executeQuery("SELECT * FROM Weddings");
                                            tableOne.setModel(buildTableModel(rs));
                    break;
                case "Vendors":             rs = st.executeQuery("SELECT * FROM Vendors");
                                            tableOne.setModel(buildTableModel(rs));
                    break;
                case "Items":               rs = st.executeQuery("SELECT * FROM Items");
                                            tableOne.setModel(buildTableModel(rs));
                    break;
                case "Vendor Supplies":     rs = st.executeQuery("SELECT * FROM VendorSupplies");
                                            tableOne.setModel(buildTableModel(rs));
                    break;
                case "Wedding Supplies":    rs = st.executeQuery("SELECT * FROM WeddingSupplies");
                                            tableOne.setModel(buildTableModel(rs));
                    break;
                default:                    rs = st.executeQuery("SELECT i.ItemName, v.VendorName, vs.ItemCost "
                                                                + "FROM Items as i, Vendors as v, VednorSupplies as vs "
                                                                + "WHERE v.VendorID = vs.VendorID AND i.ItemID = vs.ItemID "
                                                                + "ORDER BY ItemName, VendorName, ItemCost;");
                                            tableOne.setModel(buildTableModel(rs));
                    break;
        }
    }
    
    private void resetRemovePopup() {
        popupRemoveFrame.dispose();
        removeRecordType.setSelectedIndex(0);
        removeRecordID.setValue(0);
        try {
            loadTable();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void resetAddPopup() {
        popupAddFrame.dispose();
        clearInputs();
        try {
            loadTable();
        }
        catch (SQLException ex) {
            Logger.getLogger(DatabaseGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void clearInputs() {
        customerFirstName.setText("");
        customerLastName.setText("");
        employeeFirstName.setText("");
        employeeLastName.setText("");
        employeeSalary.setValue(0);
        weddingDate.setText("YYYY-MM-DD");
        weddingPrice.setValue(0);
        weddingPaidYesButton.setSelected(true);
        weddingCustomerID.setValue(0);
        vendorName.setText("");
        vendorState.setSelectedIndex(0);
        itemName.setText("");
        vendorSuppliesItemStock.setValue(0);
        vendorSuppliesItemID.setValue(0);
        vendorSuppliesItemCost.setValue(0);
        weddingSuppliesWeddingID.setValue(0);
        weddingSuppliesVendorSupplyID.setValue(0);
        weddingSuppliesQuantity.setValue(0);
    }
    
    public static DefaultTableModel buildTableModel(ResultSet rs) throws SQLException {

        ResultSetMetaData metaData = rs.getMetaData();

        Vector<String> columnNames = new Vector<String>();
        int columnCount = metaData.getColumnCount();
        for (int column = 1; column <= columnCount; column++) {
            columnNames.add(metaData.getColumnName(column));
        }

        Vector<Vector<Object>> data = new Vector<Vector<Object>>();
        while (rs.next()) {
            Vector<Object> vector = new Vector<Object>();
            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                vector.add(rs.getObject(columnIndex));
            }
            data.add(vector);
        }

        return new DefaultTableModel(data, columnNames);
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DatabaseGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatabaseGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatabaseGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatabaseGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatabaseGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton addCustomerButton;
    private javax.swing.JButton addEmployeeButton;
    private javax.swing.JButton addSuppliesButton;
    private javax.swing.JButton addVendorButton;
    private javax.swing.JButton addVendorSuppliesButton;
    private javax.swing.JButton addWeddingButton;
    private javax.swing.JButton addWeddingSuppliesButton;
    private javax.swing.JTextField customerFirstName;
    private javax.swing.JLabel customerFirstNameLabel;
    private javax.swing.JTextField customerLastName;
    private javax.swing.JLabel customerLastNameLabel;
    private javax.swing.JLabel customerRequiredLabel;
    private javax.swing.JPanel customerTab;
    private javax.swing.JTextField employeeFirstName;
    private javax.swing.JLabel employeeFirstNameLabel;
    private javax.swing.JTextField employeeLastName;
    private javax.swing.JLabel employeeLastNameLabel;
    private javax.swing.JLabel employeeRequiredLabel;
    private javax.swing.JSpinner employeeSalary;
    private javax.swing.JLabel employeeSalaryLabel;
    private javax.swing.JPanel employeeTab;
    private javax.swing.JTextField itemName;
    private javax.swing.JLabel itemNameLabel;
    private javax.swing.JFrame popupAddFrame;
    private javax.swing.JFrame popupRemoveFrame;
    private javax.swing.JButton removeButton;
    private javax.swing.JSpinner removeRecordID;
    private javax.swing.JLabel removeRecordIDLabel;
    private javax.swing.JComboBox<String> removeRecordType;
    private javax.swing.JLabel removeRecordTypeLabel;
    private javax.swing.JButton removeRemoveButton;
    private javax.swing.JScrollPane scrollPaneOne;
    private javax.swing.JLabel suppliesRequiredLabel;
    private javax.swing.JPanel suppliesTab;
    private javax.swing.JTabbedPane tabPane;
    private javax.swing.JTable tableOne;
    private javax.swing.JComboBox<String> tablePicker;
    private javax.swing.JLabel venderNameLabel;
    private javax.swing.JLabel venderStateLabel;
    private javax.swing.JTextField vendorName;
    private javax.swing.JLabel vendorRequiredLabel;
    private javax.swing.JComboBox<String> vendorState;
    private javax.swing.JSpinner vendorSuppliesItemCost;
    private javax.swing.JLabel vendorSuppliesItemCostLabel;
    private javax.swing.JSpinner vendorSuppliesItemID;
    private javax.swing.JLabel vendorSuppliesItemIDLabel;
    private javax.swing.JSpinner vendorSuppliesItemStock;
    private javax.swing.JLabel vendorSuppliesItemStockLabel;
    private javax.swing.JLabel vendorSuppliesRequiredLabel;
    private javax.swing.JPanel vendorSuppliesTab;
    private javax.swing.JSpinner vendorSuppliesVendorID;
    private javax.swing.JLabel vendorSuppliesVendorIDLabel;
    private javax.swing.JPanel vendorTab;
    private javax.swing.ButtonGroup weddingButtonGroup;
    private javax.swing.JSpinner weddingCustomerID;
    private javax.swing.JLabel weddingCustomerIDLabel;
    private javax.swing.JTextField weddingDate;
    private javax.swing.JLabel weddingDateLabel;
    private javax.swing.JLabel weddingPaidLabel;
    private javax.swing.JRadioButton weddingPaidNoButton;
    private javax.swing.JRadioButton weddingPaidYesButton;
    private javax.swing.JSpinner weddingPrice;
    private javax.swing.JLabel weddingPriceLabel;
    private javax.swing.JLabel weddingRequiredLabel;
    private javax.swing.JSpinner weddingSuppliesQuantity;
    private javax.swing.JLabel weddingSuppliesQuantityLabel;
    private javax.swing.JLabel weddingSuppliesRequiredLabel;
    private javax.swing.JPanel weddingSuppliesTab;
    private javax.swing.JSpinner weddingSuppliesVendorSupplyID;
    private javax.swing.JLabel weddingSuppliesVendorSupplyIDLabel;
    private javax.swing.JSpinner weddingSuppliesWeddingID;
    private javax.swing.JLabel weddingSuppliesWeddingIDLabel;
    private javax.swing.JPanel weddingTab;
    // End of variables declaration//GEN-END:variables
}
