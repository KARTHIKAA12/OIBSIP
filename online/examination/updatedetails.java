
package online.examination;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class updatedetails extends javax.swing.JFrame {
    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    public updatedetails() {
        initComponents();
        con = connect.dbConnect();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        yrclslbl = new javax.swing.JLabel();
        subjectnamelbl = new javax.swing.JLabel();
        classinput = new javax.swing.JTextField();
        subnameinput = new javax.swing.JTextField();
        startbtn = new javax.swing.JButton();
        homebtn = new javax.swing.JButton();
        exitbtn = new javax.swing.JButton();
        newpasslbl = new javax.swing.JLabel();
        conpassinput = new javax.swing.JPasswordField();
        classlbl = new javax.swing.JLabel();
        conpasslbl = new javax.swing.JLabel();
        newpassinput = new javax.swing.JPasswordField();
        uprglbl = new javax.swing.JLabel();
        uprginput = new javax.swing.JTextField();
        updatebtn = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(51, 51, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(560, 470));

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "UPDATE PROFILE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 24))); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(470, 380));

        yrclslbl.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N

        subjectnamelbl.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        subjectnamelbl.setText("SUBJECT NAME");

        classinput.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        subnameinput.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        startbtn.setBackground(new java.awt.Color(204, 255, 153));
        startbtn.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        startbtn.setText("Start");
        startbtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        startbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startbtnActionPerformed(evt);
            }
        });

        homebtn.setBackground(new java.awt.Color(204, 255, 153));
        homebtn.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        homebtn.setText("Home");
        homebtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        homebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebtnActionPerformed(evt);
            }
        });

        exitbtn.setBackground(new java.awt.Color(204, 255, 153));
        exitbtn.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        exitbtn.setText("Exit");
        exitbtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });

        newpasslbl.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        newpasslbl.setText("NEW PASSWORD");

        conpassinput.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        conpassinput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conpassinputActionPerformed(evt);
            }
        });

        classlbl.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        classlbl.setText("CLASS");

        conpasslbl.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        conpasslbl.setText("CONFIRM PASSWORD");

        newpassinput.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        uprglbl.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        uprglbl.setText("REGISTER NO");

        uprginput.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        uprginput.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        updatebtn.setBackground(new java.awt.Color(204, 255, 153));
        updatebtn.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        updatebtn.setText("Update");
        updatebtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updatebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(startbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(conpasslbl)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(138, 138, 138)
                                        .addComponent(yrclslbl))
                                    .addComponent(subjectnamelbl)
                                    .addComponent(uprglbl)
                                    .addComponent(newpasslbl)
                                    .addComponent(classlbl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(classinput)
                                    .addComponent(uprginput)
                                    .addComponent(subnameinput)
                                    .addComponent(newpassinput)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addComponent(conpassinput, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)))
                        .addGap(113, 113, 113))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(yrclslbl)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(uprglbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(uprginput))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(classinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(classlbl))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(subjectnamelbl)
                            .addComponent(subnameinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(newpasslbl)
                            .addComponent(newpassinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addComponent(conpasslbl))
                    .addComponent(conpassinput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitbtn)
                    .addComponent(homebtn)
                    .addComponent(startbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatebtn))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startbtnActionPerformed
                    dispose();
                    new question().setVisible(true);        
     
    }//GEN-LAST:event_startbtnActionPerformed

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
       dispose();
    }//GEN-LAST:event_exitbtnActionPerformed

    private void homebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebtnActionPerformed
        dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_homebtnActionPerformed

    private void conpassinputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conpassinputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conpassinputActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        try{
            if(uprginput.getText().equals("") || classinput.getText().equals("") || subnameinput.getText().equals("") || newpassinput.getText().equals("") || conpassinput.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Details must not be empty!");
            }
            else{
                if (newpassinput.getText().equals(conpassinput.getText())){
                     String sql = "insert into updatedetails(register_no,class,sub_name,password,confirmpassword) values(?,?,?,?,?)";
                    pst = con.prepareStatement(sql);
                    pst.setString(1, uprginput.getText());
                    pst.setString(2, classinput.getText());
                    pst.setString(3, subnameinput.getText());
                    pst.setString(4, newpassinput.getText());
                    pst.setString(5, conpassinput.getText());
                    pst.execute();
                    String upsql = "UPDATE admin SET password = ? where register_no = ?";
                    pst = con.prepareStatement(upsql);
                    pst.setString(1, newpassinput.getText());
                    pst.setString(2,uprginput.getText());
                    int rowsUpdated = pst.executeUpdate();
                    if(rowsUpdated > 0 ){
                        JOptionPane.showMessageDialog(null, "Password updated to your Profile!");
                    }else{
                        JOptionPane.showMessageDialog(null,"Regsiter no not found");
                    }
              }else{
                    JOptionPane.showMessageDialog(null,"Password don't match");
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
            
                                

    }//GEN-LAST:event_updatebtnActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updatedetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField classinput;
    private javax.swing.JLabel classlbl;
    private javax.swing.JPasswordField conpassinput;
    private javax.swing.JLabel conpasslbl;
    private javax.swing.JButton exitbtn;
    private javax.swing.JButton homebtn;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField newpassinput;
    private javax.swing.JLabel newpasslbl;
    private javax.swing.JButton startbtn;
    private javax.swing.JLabel subjectnamelbl;
    private javax.swing.JTextField subnameinput;
    private javax.swing.JButton updatebtn;
    private javax.swing.JTextField uprginput;
    private javax.swing.JLabel uprglbl;
    private javax.swing.JLabel yrclslbl;
    // End of variables declaration//GEN-END:variables
}
