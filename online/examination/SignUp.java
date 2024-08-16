package online.examination;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
public class SignUp extends javax.swing.JFrame {
    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    public SignUp() {
        initComponents();
        con = connect.dbConnect();
        middle();
    }
    public void middle(){
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        namelbl = new javax.swing.JLabel();
        studentidlbl = new javax.swing.JLabel();
        passwordsignlbl = new javax.swing.JLabel();
        reglbl = new javax.swing.JLabel();
        phonenolbl = new javax.swing.JLabel();
        nametxt = new javax.swing.JTextField();
        studentidinput = new javax.swing.JTextField();
        passwordsigninput = new javax.swing.JPasswordField();
        regnoinput = new javax.swing.JTextField();
        emailinput = new javax.swing.JTextField();
        signinbtn = new javax.swing.JButton();
        loginsngbtn = new javax.swing.JButton();
        exitsngbtn = new javax.swing.JButton();
        emailbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(560, 470));

        jPanel1.setBackground(new java.awt.Color(51, 51, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setPreferredSize(new java.awt.Dimension(550, 450));

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 400));

        namelbl.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        namelbl.setText("NAME");

        studentidlbl.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        studentidlbl.setText("STUDENT ID");

        passwordsignlbl.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        passwordsignlbl.setText("PASSWORD");

        reglbl.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        reglbl.setText("REGISTER NO");

        phonenolbl.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N

        nametxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametxtActionPerformed(evt);
            }
        });

        studentidinput.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        studentidinput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentidinputActionPerformed(evt);
            }
        });

        passwordsigninput.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        passwordsigninput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordsigninputActionPerformed(evt);
            }
        });

        regnoinput.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        emailinput.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        signinbtn.setBackground(new java.awt.Color(204, 255, 153));
        signinbtn.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        signinbtn.setText("SIGN IN");
        signinbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        signinbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinbtnActionPerformed(evt);
            }
        });

        loginsngbtn.setBackground(new java.awt.Color(204, 255, 153));
        loginsngbtn.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        loginsngbtn.setText("LOGIN");
        loginsngbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        loginsngbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginsngbtnActionPerformed(evt);
            }
        });

        exitsngbtn.setBackground(new java.awt.Color(204, 255, 153));
        exitsngbtn.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        exitsngbtn.setText("EXIT");
        exitsngbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        exitsngbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitsngbtnActionPerformed(evt);
            }
        });

        emailbl.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        emailbl.setText("EMAIL");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(studentidlbl)
                            .addComponent(passwordsignlbl)
                            .addComponent(reglbl)
                            .addComponent(phonenolbl)
                            .addComponent(emailbl))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nametxt)
                            .addComponent(studentidinput)
                            .addComponent(passwordsigninput)
                            .addComponent(regnoinput)
                            .addComponent(emailinput, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(loginsngbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(exitsngbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)
                        .addComponent(signinbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namelbl)
                    .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentidlbl)
                    .addComponent(studentidinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordsignlbl)
                    .addComponent(passwordsigninput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reglbl)
                    .addComponent(regnoinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phonenolbl)
                    .addComponent(emailinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailbl))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(signinbtn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(exitsngbtn)
                            .addComponent(loginsngbtn))
                        .addGap(33, 33, 33))))
        );

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 0));
        jLabel1.setText("Registration Form");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nametxtActionPerformed

    private void signinbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinbtnActionPerformed
       try{
           if(nametxt.getText().equals("") || studentidinput.getText().equals("") || passwordsigninput.getText().equals("") || regnoinput.getText().equals("") || emailinput.getText().equals("")){
               JOptionPane.showMessageDialog(null,"Details must not be empty!");
           }else{
               String sql = "select register_no from admin where register_no=?";
               pst = con.prepareStatement(sql);
               pst.setString(1, regnoinput.getText());
               rs = pst.executeQuery();
               if(rs.next()){
                    JOptionPane.showMessageDialog(null, regnoinput.getText()+"  you may have entered wrong resgiter no,it is already exist!");
                }else{
                    String sql1 = "insert into admin(name,student_id,password,register_no,email) values(?,?,?,?,?)";
                    pst = con.prepareStatement(sql1);
                    pst.setString(1,nametxt.getText());
                    pst.setString(2,studentidinput.getText());
                    pst.setString(3, passwordsigninput.getText());
                    pst.setString(4,regnoinput.getText());
                    pst.setString(5,emailinput.getText());
                    pst.execute();
                    JOptionPane.showMessageDialog(null, "Registered successfully!"); 
                }
           }
           
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_signinbtnActionPerformed

    private void exitsngbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitsngbtnActionPerformed
        dispose();
    }//GEN-LAST:event_exitsngbtnActionPerformed

    private void passwordsigninputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordsigninputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordsigninputActionPerformed

    private void loginsngbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginsngbtnActionPerformed
        dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_loginsngbtnActionPerformed

    private void studentidinputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentidinputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentidinputActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel emailbl;
    private javax.swing.JTextField emailinput;
    private javax.swing.JButton exitsngbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginsngbtn;
    private javax.swing.JLabel namelbl;
    private javax.swing.JTextField nametxt;
    private javax.swing.JPasswordField passwordsigninput;
    private javax.swing.JLabel passwordsignlbl;
    private javax.swing.JLabel phonenolbl;
    private javax.swing.JLabel reglbl;
    private javax.swing.JTextField regnoinput;
    private javax.swing.JButton signinbtn;
    private javax.swing.JTextField studentidinput;
    private javax.swing.JLabel studentidlbl;
    // End of variables declaration//GEN-END:variables
}
