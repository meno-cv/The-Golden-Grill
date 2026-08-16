package thegoldengrill.view;

/**
 *
 * @author menob
 */
public class SearchForm extends javax.swing.JFrame {

    public SearchForm() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
                        
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblSearch = new javax.swing.JLabel();
        btnSearchOrder = new javax.swing.JButton();
        btnSearchCustomer = new javax.swing.JButton();
        btnBestCustomer = new javax.swing.JButton();
        btnViewOrders = new javax.swing.JButton();
        btnUpdateOrder = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));

        lblSearch.setBackground(new java.awt.Color(255, 51, 51));
        lblSearch.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblSearch.setForeground(new java.awt.Color(255, 255, 0));
        lblSearch.setText("Search");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(lblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
