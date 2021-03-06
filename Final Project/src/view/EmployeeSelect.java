/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.AccessUser;
import controller.SaveFile;
import controller.Tools;
import controller.User;
import java.awt.List;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractListModel;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import static javax.swing.ListSelectionModel.SINGLE_SELECTION;

/**
 *
 * @author kelsey
 */
public class EmployeeSelect extends javax.swing.JFrame {
    private DefaultListModel model = new DefaultListModel();
    private ArrayList<User> users = new ArrayList<>();
    private ButtonGroup access = new ButtonGroup();
    private User currUser;
    private int thisUser;
    
    /**
     * Creates new form EmployeeSelect
     */
    public EmployeeSelect() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        employeeList = new javax.swing.JList<>();
        loadfile = new javax.swing.JButton();
        fileName = new javax.swing.JTextField();
        firstName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lastName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        employeeID = new javax.swing.JTextField();
        idLabel = new javax.swing.JLabel();
        lastFour = new javax.swing.JTextField();
        lastLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        saveFile = new javax.swing.JButton();
        newEmployee = new javax.swing.JButton();
        saveUser = new javax.swing.JButton();
        deleteUser = new javax.swing.JButton();
        accessLevel = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(null);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        employeeList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeeListMouseClicked(evt);
            }
        });
        employeeList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                employeeListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(employeeList);

        loadfile.setText("load file");
        loadfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadfileActionPerformed(evt);
            }
        });

        fileName.setText("employees.txt");

        firstName.setMinimumSize(null);

        jLabel1.setText("First Name:");

        lastName.setMinimumSize(null);

        jLabel2.setText("Last Name:");

        employeeID.setMinimumSize(null);

        idLabel.setText("Employee ID:");

        lastFour.setMinimumSize(null);

        lastLabel.setText("Last 4:");

        jLabel5.setText("Access Level:");

        saveFile.setText("Save To File");
        saveFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveFileActionPerformed(evt);
            }
        });

        newEmployee.setText("New Employee");
        newEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newEmployeeActionPerformed(evt);
            }
        });

        saveUser.setText("Save Changes");
        saveUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveUserActionPerformed(evt);
            }
        });

        deleteUser.setText("Delete User");
        deleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserActionPerformed(evt);
            }
        });

        accessLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Read", "Read/Write", "No Access" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(loadfile, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fileName, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lastLabel)
                                    .addComponent(idLabel)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lastFour, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                    .addComponent(firstName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lastName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(employeeID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(accessLevel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(deleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(saveUser, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(newEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loadfile)
                            .addComponent(fileName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(employeeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lastLabel)
                            .addComponent(lastFour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(accessLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newEmployee)
                    .addComponent(saveUser)
                    .addComponent(saveFile)
                    .addComponent(deleteUser))
                .addGap(16, 16, 16))
        );

        employeeList.setSelectionMode(SINGLE_SELECTION);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void setRead()
    {
        deleteUser.setEnabled(false);
        saveUser.setEnabled(false);
        newEmployee.setEnabled(false);
        saveFile.setEnabled(false);
    }
    private void setDisable()
    {
        setRead();
        loadfile.setEnabled(false);
        employeeList.setEnabled(false);
        model.removeAllElements();
        employeeList.updateUI();
        JOptionPane.showMessageDialog(null, "You do not have access to this database.", "Access Failure", JOptionPane.ERROR_MESSAGE);
        
    }
    public void setUser(int userID)
    {
        thisUser = userID;
    }
    private void loadfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadfileActionPerformed
        
        try {
            model.clear();
            users = AccessUser.getEmployees("src/data/" + fileName.getText());
            for (User u : users)
            {
                model.addElement(u);
                if (u.getUID() == thisUser)
                {
                    
                    if (u.getAccessLevel() == 0)
                    {
                        setRead();
                    } else if (u.getAccessLevel() == 2)
                    {
                        setDisable();
                    }
                    else if (u.getAccessLevel() == 1)
                    {
                        //placeholder
                    }
                    else
                    {
                        setDisable();
                    }
                }
            }
            employeeList.setModel(model);
            
        } catch (IOException ex) {
            Logger.getLogger(EmployeeSelect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_loadfileActionPerformed

    private void employeeListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeeListMouseClicked
        
    }//GEN-LAST:event_employeeListMouseClicked
    
    private void employeeListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_employeeListValueChanged
        idLabel.setText("Employee ID:");
        lastLabel.setText("Last 4:");
        
        if (!employeeList.isSelectionEmpty())
        {
            User selUser = selUser();
            currUser = selUser();
            firstName.setText(selUser.getFirstName());
            lastName.setText(selUser.getLastName());
            employeeID.setText(String.valueOf(selUser.getUID()));
            lastFour.setText(String.valueOf(selUser.getLastFour()));
            accessLevel.setSelectedIndex(selUser.getAccessLevel());
            accessLevel.updateUI();
            System.out.println(selUser.getAccessLevel());
        }

        
            
    }//GEN-LAST:event_employeeListValueChanged
    private User selUser()
    {
        return users.get(employeeList.getSelectedIndex());
    }
    private void deleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserActionPerformed
        
        users.remove(currUser);
        model.removeElement(currUser);
        employeeList.clearSelection();
        employeeList.updateUI();
        System.out.println("test");
    }//GEN-LAST:event_deleteUserActionPerformed

    private void saveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveFileActionPerformed
        int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to overwrite your previous file?","Warning", JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION)
        {
            System.out.println("Saving to file...");
            try {
                SaveFile.saveUsers(users, fileName.getText());
            } catch (IOException ex) {
                Logger.getLogger(EmployeeSelect.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_saveFileActionPerformed

    private void saveUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveUserActionPerformed
        if (Tools.isInteger(employeeID.getText()) && Tools.isInteger(lastFour.getText()))
        {
            currUser.setFirstName(firstName.getText());
            currUser.setLastName(lastName.getText());
            currUser.setUID(Integer.parseInt(employeeID.getText()));
            currUser.setLastFour(Integer.parseInt(lastFour.getText()));
            currUser.setAccessLevel(accessLevel.getSelectedIndex());
            employeeList.updateUI();
        }
        else
        {
            if (!Tools.isInteger(employeeID.getText()))
            {
                idLabel.setText("Employee ID (INT):*");
            }
            if (!Tools.isInteger(lastFour.getText()))
            {
                lastLabel.setText("Last 4 (INT):*");
            }
        }
    }//GEN-LAST:event_saveUserActionPerformed

    private void newEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newEmployeeActionPerformed
        User newUser = new User("default", "user", getHighestID()+1, 0, 0000);
        users.add(newUser);
        model.addElement(newUser);
        employeeList.updateUI();
        employeeList.clearSelection();
        
    }//GEN-LAST:event_newEmployeeActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setResizable(false);
    }//GEN-LAST:event_formWindowOpened
    private void setDisplayUser()
    {
        
    }
    /**
     * @param args the command line arguments
     */
    private int getHighestID()
    {
        int max= 0;
        for (User u : users)
        {
            if (u.getUID() > max)
            {
                max = u.getUID();
            }
        }
        return max;
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
            java.util.logging.Logger.getLogger(EmployeeSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeSelect().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> accessLevel;
    private javax.swing.JButton deleteUser;
    private javax.swing.JTextField employeeID;
    private javax.swing.JList<String> employeeList;
    private javax.swing.JTextField fileName;
    private javax.swing.JTextField firstName;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastFour;
    private javax.swing.JLabel lastLabel;
    private javax.swing.JTextField lastName;
    private javax.swing.JButton loadfile;
    private javax.swing.JButton newEmployee;
    private javax.swing.JButton saveFile;
    private javax.swing.JButton saveUser;
    // End of variables declaration//GEN-END:variables
}
