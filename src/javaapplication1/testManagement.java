package javaapplication1;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class testManagement extends javax.swing.JFrame {

    private Connection connection;
    public testManagement() {
        initComponents();
        connectToDatabase();
        fetchStudentsData();
       


    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents(){

        jPanel1 = new javax.swing.JPanel();
        id = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        lblage = new javax.swing.JLabel();
        lblfiliere = new javax.swing.JLabel();
        lblnatio = new javax.swing.JLabel();
        lblsex = new javax.swing.JLabel();
        lbladress = new javax.swing.JLabel();
        txtnom = new javax.swing.JTextField();
        IDtxt = new javax.swing.JTextField();
        txtage = new javax.swing.JTextField();
        comboxfiliere = new javax.swing.JComboBox<>();
        comboxnatio = new javax.swing.JComboBox<>();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        txtadress = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableetudiant = new javax.swing.JTable();
        addbtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        showbtn = new javax.swing.JButton();
        Exitbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Management ");
        setBackground(new java.awt.Color(255, 204, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N

         jPanel1.setBackground(new java.awt.Color(249, 237, 209));
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPanel1KeyTyped(evt);
            }
        });

        id.setText("ID");

        lblname.setText("Nom");

        lblage.setText("Age");

        lblfiliere.setText("Filiere");

        lblnatio.setText("Nationalite");

        lblsex.setText("Sexe");

        lbladress.setText("Adress");

        IDtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDtxtActionPerformed(evt);
            }
        });

 comboxfiliere.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IDSD", "GI" }));

        comboxnatio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Marocain", "Sinigalian", "Mauritanian" }));

        jRadioButton1.setText("M");

        jRadioButton2.setText("F");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        tableetudiant.setBackground(new java.awt.Color(237, 238, 194));
        tableetudiant.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nom", "Age", "Filiere", "Nationalite", "Sex", "Adress"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableetudiant);

        addbtn.setText("Add");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        deletebtn.setText("Delete");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        showbtn.setText("Show");
        showbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showbtnActionPerformed(evt);
            }
        });

        Exitbtn.setText("Exit");
        Exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitbtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Gestion des Etudiants");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(addbtn)
                                .addGap(18, 18, 18)
                                .addComponent(deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Update)
                                .addGap(18, 18, 18)
                                .addComponent(showbtn)
                                .addGap(18, 18, 18)
                                .addComponent(Exitbtn))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(id)
                                    .addComponent(lblage)
                                    .addComponent(lblnatio)
                                    .addComponent(lblfiliere)
                                    .addComponent(lblname)
                                    .addComponent(lbladress)
                                    .addComponent(lblsex))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtadress, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtnom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtage, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(comboxfiliere, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(comboxnatio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(IDtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLabel1)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IDtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblname))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblage)
                            .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboxfiliere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblfiliere))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(comboxnatio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblnatio, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton1)
                            .addComponent(lblsex))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtadress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbladress)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Update)
                    .addComponent(showbtn)
                    .addComponent(Exitbtn)
                    .addComponent(deletebtn)
                    .addComponent(addbtn))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </edittor-foldold>                        
    private void IDtxtActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     
    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             
    private void jPanel1KeyTyped(java.awt.event.KeyEvent evt) {                                 
        // TODO add your handling code here:
    }                                
    private void showbtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
       fetchStudentsData();
    }                                       
    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {                                       
      addStudent();
    }                                      
    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {                                          
      deleteStudent();    }   
    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {                                       
           updateStudent();   
    } 
    private void ExitbtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
     System.exit(0);
}
    private void connectToDatabase() {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String DB_URL = "jdbc:mysql://localhost:3306/idsd2";
        String DB_USER = "root";
        String DB_PASSWORD = "";
        connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    } catch (ClassNotFoundException | SQLException ex) {
        Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    private void fetchStudentsData() {
    
    try {
        String query = "SELECT * FROM etudiant";
        PreparedStatement pst = connection.prepareStatement(query);
        ResultSet rs = pst.executeQuery();

        DefaultTableModel model = (DefaultTableModel) tableetudiant.getModel();
        model.setRowCount(0);

        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getInt("ID"),
                rs.getString("Nom"),
                rs.getInt("Age"),
                rs.getString("Filiere"),
                rs.getString("Nationalite"),
                rs.getString("Sex"),
                rs.getString("Adress")
            });
        }
    } catch (SQLException ex) {
        Logger.getLogger(studentManagement.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(this, "Error fetching students' data!");
    }
}
    private void addStudent() {
    // TODO: Implement your addStudent() method
    // This method should add a new student to the database
    try {
        String query = "INSERT INTO etudiant (Nom, Age, filiere, nationalite, Sex, adress) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement pst = connection.prepareStatement(query);

        pst.setString(1, txtnom.getText());
        pst.setInt(2, Integer.parseInt(txtage.getText()));
        pst.setString(3, comboxfiliere.getSelectedItem().toString());
        pst.setString(4, comboxnatio.getSelectedItem().toString());

        if (jRadioButton1.isSelected()) {
            pst.setString(5, "M");
        } else if (jRadioButton2.isSelected()) {
            pst.setString(5, "F");
        }

        pst.setString(6, txtadress.getText());

        pst.executeUpdate();
        JOptionPane.showMessageDialog(this, "etudiant added successfully!");
        fetchStudentsData(); // Refresh the table
    } catch (SQLException ex) {
        Logger.getLogger(studentManagement.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(this, "Error adding student!");
    }
}
    private void deleteStudent() {
    int selectedRow = tableetudiant.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select a student to delete!");
    } else {
        int option = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this student?", "Confirmation", JOptionPane.YES_NO_OPTION);
        
        if (option == JOptionPane.YES_OPTION) {
            int studentID = (int) tableetudiant.getValueAt(selectedRow, 0);
            try {
                String query = "DELETE FROM etudiant WHERE ID=?";
                PreparedStatement pst = connection.prepareStatement(query);
                pst.setInt(1, studentID);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Student deleted successfully!");
                fetchStudentsData(); // Refresh the table
            } catch (SQLException ex) {
                Logger.getLogger(studentManagement.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Error deleting student!");
            }
        }
    }
}
    private void updateStudent() {
    try {
        // Assuming you have a PreparedStatement object (pst) prepared earlier
        String updateQuery = "UPDATE etudiant SET Nom=?, Age=?, Filiere=?, Nationalite=?, Adress=? WHERE ID=?";
        PreparedStatement pst = connection.prepareStatement(updateQuery);

        // Get the values from your UI components
        String newName = txtnom.getText();
        int newAge = Integer.parseInt(txtage.getText());
        String newFiliere = comboxfiliere.getSelectedItem().toString();
        String newNationalite = comboxnatio.getSelectedItem().toString();
        String newAddress = txtadress.getText();

        // Assuming you have a JTable named tableetudiant and you want to update the selected row
        int selectedRow = tableetudiant.getSelectedRow();

        // Check if a row is selected
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a student to update!");
            return;
        }

        int studentID = (int) tableetudiant.getValueAt(selectedRow, 0);

        // Set the parameters in the PreparedStatement
        pst.setString(1, newName);
        pst.setInt(2, newAge);
        pst.setString(3, newFiliere);
        pst.setString(4, newNationalite);
        pst.setString(5, newAddress);
        pst.setInt(6, studentID);

        // Execute the update query
        int rowsUpdated = pst.executeUpdate();

        // Check if the update was successful
        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(this, "Etudiant updated successfully!");
            fetchStudentsData(); // Refresh the table
        } else {
            JOptionPane.showMessageDialog(this, "Update failed. No matching records found.");
        }
    } catch (SQLException | NumberFormatException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error updating etudiant!");
    }
}

    
                       
    private javax.swing.JButton Exitbtn;
    private javax.swing.JTextField IDtxt;
    private javax.swing.JButton Update;
    private javax.swing.JButton addbtn;
    private javax.swing.JComboBox<String> comboxfiliere;
    private javax.swing.JComboBox<String> comboxnatio;
    private javax.swing.JButton deletebtn;
    private javax.swing.JLabel id;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbladress;
    private javax.swing.JLabel lblage;
    private javax.swing.JLabel lblfiliere;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblnatio;
    private javax.swing.JLabel lblsex;
    private javax.swing.JButton showbtn;
    private javax.swing.JTable tableetudiant;
    private javax.swing.JTextField txtadress;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtnom;
    private javax.swing.JLabel jLabel1;
                      
}
