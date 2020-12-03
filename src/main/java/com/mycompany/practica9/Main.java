/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica9;

import java.awt.GridLayout;
import static java.awt.image.ImageObserver.WIDTH;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author charl
 */
public class Main extends javax.swing.JFrame {

    DefaultListModel model = new DefaultListModel();
    DefaultListModel model2 = new DefaultListModel();
    int[] index;
    ArrayList<String> tableName = new ArrayList<>();
    ArrayList<String> fieldName = new ArrayList<>();
    HashMap<String, ArrayList<String>> map = new HashMap<>();
    int i = 0;
    int j = 0;
    JTextField text1;
    JPasswordField text2;

    public Main() {
        initComponents();

        list.setModel(model);
        list2.setModel(model2);

        visible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        list2 = new javax.swing.JList<>();
        tableNameLabel = new javax.swing.JLabel();
        fieldNameLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        singleButton = new javax.swing.JToggleButton();
        singleIntervalButton = new javax.swing.JToggleButton();
        multipleIntervalButton = new javax.swing.JToggleButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        login = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        exit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        about = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        list.setEnabled(false);
        jScrollPane1.setViewportView(list);

        jScrollPane2.setViewportView(list2);

        tableNameLabel.setText("Table Name:");

        fieldNameLabel.setText("Filed Name:");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Selection Option"));

        buttonGroup.add(singleButton);
        singleButton.setText("Single");
        singleButton.setMaximumSize(new java.awt.Dimension(109, 23));
        singleButton.setMinimumSize(new java.awt.Dimension(109, 23));
        singleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singleButtonActionPerformed(evt);
            }
        });

        buttonGroup.add(singleIntervalButton);
        singleIntervalButton.setText("Single Interval");
        singleIntervalButton.setMaximumSize(new java.awt.Dimension(109, 23));
        singleIntervalButton.setMinimumSize(new java.awt.Dimension(109, 23));
        singleIntervalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singleIntervalButtonActionPerformed(evt);
            }
        });

        buttonGroup.add(multipleIntervalButton);
        multipleIntervalButton.setText("Multiple Interval");
        multipleIntervalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multipleIntervalButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(singleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(41, 41, 41)
                .addComponent(singleIntervalButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(multipleIntervalButton)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(singleButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(singleIntervalButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(multipleIntervalButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Open");

        login.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        login.setText("Access DB");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jMenu1.add(login);
        jMenu1.add(jSeparator1);

        exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jMenu1.add(exit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");

        about.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        about.setText("About");
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });
        jMenu2.add(about);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tableNameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldNameLabel))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tableNameLabel)
                    .addComponent(fieldNameLabel))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed

        JPanel panel = new JPanel(new GridLayout(5, 3));
        JTextField text1 = new JTextField(8);
        JPasswordField text2 = new JPasswordField(8);
        panel.add(new JLabel("User:"));
        panel.add(text1);
        panel.add(new JLabel("Password:"));
        panel.add(text2);

        JOptionPane.showMessageDialog(null, panel, "Login", 1);
        char[] passwd = text2.getPassword();
        index = list.getSelectedIndices();

        try {
            accessToDataBase(text1.getText(), String.valueOf(passwd));
            JOptionPane.showMessageDialog(rootPane, "Loading Data Base...", "Login Succesfull", JOptionPane.INFORMATION_MESSAGE);
            visible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Incorrect user or password", "Login Error", JOptionPane.ERROR_MESSAGE);
        }


        model.removeAllElements();
        for (String tableName : getTableName()) {
            model.addElement(tableName);
        }

        list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                boolean flag = e.getValueIsAdjusting();
                index = list.getSelectedIndices();
                j = 0;

                if (index.length > 0 && flag) {
                    model2.removeAllElements();
                    while (j < index.length) {
                        String name = list.getModel().getElementAt(index[j]);

                        for (HashMap.Entry<String, ArrayList<String>> entry : map.entrySet()) {
                            //System.out.println(entry.getValue());
                            if (name.equals(entry.getKey())) {

                                for (String s : entry.getValue()) {
                                    model2.addElement(name + "." + s);
                                }
                            }
                        }
                        j++;
                    }
                }
            }

        });

    }//GEN-LAST:event_loginActionPerformed

    private void singleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singleButtonActionPerformed
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.setEnabled(true);
    }//GEN-LAST:event_singleButtonActionPerformed

    private void singleIntervalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singleIntervalButtonActionPerformed
        list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        list.setEnabled(true);
    }//GEN-LAST:event_singleIntervalButtonActionPerformed

    private void multipleIntervalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multipleIntervalButtonActionPerformed
        list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        list.setEnabled(true);
    }//GEN-LAST:event_multipleIntervalButtonActionPerformed

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
        JOptionPane.showMessageDialog(rootPane,
                "This app allows to connect to data base 'mysql://mozart.dis.ulpgc.es/DIU_BD' and see the table´s fields"
                + "\nHow to use it:\n"
                + "\t 1- Using the menu Open (Alt+O) click on Access DB (Ctrl+A) to see the login´s form and load the DB."
                + "\n \n"
                + "\t 2- Select one of diferents selection options and click in Table Name."
                + "\n \t \t \t You could see the fields of the table in the other list."
                + "\n \n"
                + "\t 3- You can exit the program by using the menu Open (Alt+O) and the option Exit (ESC)."
                + "\n \n"
                + "\t You can view more info. on the link: " + "https://github.com/ancabdia/Practica_9_DIU.git",
                "Help information", JOptionPane.INFORMATION_MESSAGE
        );
    }//GEN-LAST:event_aboutActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "Would you like to close the app?", "Close application", JOptionPane.YES_NO_OPTION) == 0)
            System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    public void accessToDataBase(String user, String passwd) throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://mozart.dis.ulpgc.es/DIU_BD?useSSL=true",
                    user,
                    passwd);
            DatabaseMetaData md = con.getMetaData();
            String[] types = {"TABLE"};
            ResultSet rs = md.getTables(null, null, "%", types);

            while (rs.next()) {
                tableName.add(rs.getString("TABLE_NAME"));
                ResultSet rs2 = md.getColumns(null, null, tableName.get(i), null);
                fieldName = new ArrayList<>();

                while (rs2.next()) {
                    fieldName.add(rs2.getString("COLUMN_NAME"));
                }
                map.put(tableName.get(i), fieldName);
                i++;
            }

            i = 0;
            con.close();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(rootPane, "Incorrect user or password", "Login Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public ArrayList<String> getTableName() {
        return tableName;
    }

    private void visible(boolean select) {
        list.setVisible(select);
        list2.setVisible(select);
        singleButton.setVisible(select);
        singleIntervalButton.setVisible(select);
        multipleIntervalButton.setVisible(select);
    }

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem about;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JMenuItem exit;
    private javax.swing.JLabel fieldNameLabel;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JList<String> list;
    private javax.swing.JList<String> list2;
    private javax.swing.JMenuItem login;
    private javax.swing.JToggleButton multipleIntervalButton;
    private javax.swing.JToggleButton singleButton;
    private javax.swing.JToggleButton singleIntervalButton;
    private javax.swing.JLabel tableNameLabel;
    // End of variables declaration//GEN-END:variables
}
