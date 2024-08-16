package online.examination;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class question extends javax.swing.JFrame {
    Connection con;
    PreparedStatement pst;
    ResultSet rs = null;
    int count = 0;
    int timeRemaining = 60;
    Timer quizTimer;
    
   
    public question() {
        initComponents();
        con = connect.dbConnect();
        middle();
        StartQuizTimer();
    }
    public void middle(){
        setLocationRelativeTo(null);
    }
    public void StartQuizTimer(){
        quizTimer = new Timer(1000, new ActionListener(){
            public void actionPerformed(ActionEvent avt){
                timeRemaining -- ;
                timerlabel.setText("Time Left :  "+timeRemaining+ "seconds");
                if(timeRemaining <=0){
                    quizTimer.stop();
                    JOptionPane.showMessageDialog(null, "Time is up! YOUR EXAM SUBMITTED!");
                    quizsubmitbtnActionPerformed(null);
                }
            }
        });
        quizTimer.start();
    }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lb = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pl_rbtn = new javax.swing.JRadioButton();
        inrbtn = new javax.swing.JRadioButton();
        clrbtn = new javax.swing.JRadioButton();
        enrbtn = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        flrtbn = new javax.swing.JRadioButton();
        flinrbtn = new javax.swing.JRadioButton();
        inflrbtn = new javax.swing.JRadioButton();
        ininrbtn = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        arrayrbtn = new javax.swing.JRadioButton();
        gotorbtn = new javax.swing.JRadioButton();
        nullrbtn = new javax.swing.JRadioButton();
        classrbtn = new javax.swing.JRadioButton();
        quizsubmitbtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        forlrbtn = new javax.swing.JRadioButton();
        whilelrbtn = new javax.swing.JRadioButton();
        dowhilelrbtn = new javax.swing.JRadioButton();
        nonerbtn = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        merrrbtn = new javax.swing.JRadioButton();
        outrbtn = new javax.swing.JRadioButton();
        memrtbn = new javax.swing.JRadioButton();
        memfullrbtn = new javax.swing.JRadioButton();
        quizhomebtn = new javax.swing.JButton();
        quizexitbrn = new javax.swing.JButton();
        timerlabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Java Quiz", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 18), new java.awt.Color(255, 255, 204))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1100, 700));

        lb.setBackground(new java.awt.Color(255, 255, 153));
        lb.setPreferredSize(new java.awt.Dimension(1000, 600));

        jLabel1.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        jLabel1.setText("1. Which of the following is not an OOPS concept in Java?");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        pl_rbtn.setBackground(new java.awt.Color(255, 255, 153));
        buttonGroup1.add(pl_rbtn);
        pl_rbtn.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        pl_rbtn.setText("Polymorphism");
        pl_rbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pl_rbtnActionPerformed(evt);
            }
        });

        inrbtn.setBackground(new java.awt.Color(255, 255, 153));
        buttonGroup1.add(inrbtn);
        inrbtn.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        inrbtn.setText("Inheritance");

        clrbtn.setBackground(new java.awt.Color(255, 255, 153));
        buttonGroup1.add(clrbtn);
        clrbtn.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        clrbtn.setText("Compilation");

        enrbtn.setBackground(new java.awt.Color(255, 255, 153));
        buttonGroup1.add(enrbtn);
        enrbtn.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        enrbtn.setText("Encapsulation");

        jLabel2.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        jLabel2.setText("2. What is Truncation in Java?");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        flrtbn.setBackground(new java.awt.Color(255, 255, 153));
        buttonGroup2.add(flrtbn);
        flrtbn.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        flrtbn.setText("Floating-point value assigned to a Floating type");

        flinrbtn.setBackground(new java.awt.Color(255, 255, 153));
        buttonGroup2.add(flinrbtn);
        flinrbtn.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        flinrbtn.setText("Floating-point value assigned to an integer type");
        flinrbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flinrbtnActionPerformed(evt);
            }
        });

        inflrbtn.setBackground(new java.awt.Color(255, 255, 153));
        buttonGroup2.add(inflrbtn);
        inflrbtn.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        inflrbtn.setText(" Integer value assigned to floating type");

        ininrbtn.setBackground(new java.awt.Color(255, 255, 153));
        buttonGroup2.add(ininrbtn);
        ininrbtn.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        ininrbtn.setText("Integer value assigned to integer type ");

        jLabel3.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        jLabel3.setText("3. Which of the below are reserved keyword in Java? ");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        arrayrbtn.setBackground(new java.awt.Color(255, 255, 153));
        buttonGroup3.add(arrayrbtn);
        arrayrbtn.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        arrayrbtn.setText("array");
        arrayrbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arrayrbtnActionPerformed(evt);
            }
        });

        gotorbtn.setBackground(new java.awt.Color(255, 255, 153));
        buttonGroup3.add(gotorbtn);
        gotorbtn.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        gotorbtn.setText("goto");

        nullrbtn.setBackground(new java.awt.Color(255, 255, 153));
        buttonGroup3.add(nullrbtn);
        nullrbtn.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        nullrbtn.setText("null");

        classrbtn.setBackground(new java.awt.Color(255, 255, 153));
        buttonGroup3.add(classrbtn);
        classrbtn.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        classrbtn.setText("class");

        quizsubmitbtn.setBackground(new java.awt.Color(204, 204, 0));
        quizsubmitbtn.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        quizsubmitbtn.setForeground(new java.awt.Color(255, 255, 255));
        quizsubmitbtn.setText("SUBMIT");
        quizsubmitbtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        quizsubmitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quizsubmitbtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        jLabel4.setText("4.  Which loop construct in java is best suited when number of iterations is unknown?");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        forlrbtn.setBackground(new java.awt.Color(255, 255, 153));
        buttonGroup4.add(forlrbtn);
        forlrbtn.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        forlrbtn.setText("for loop");

        whilelrbtn.setBackground(new java.awt.Color(255, 255, 153));
        buttonGroup4.add(whilelrbtn);
        whilelrbtn.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        whilelrbtn.setText("while loop");

        dowhilelrbtn.setBackground(new java.awt.Color(255, 255, 153));
        buttonGroup4.add(dowhilelrbtn);
        dowhilelrbtn.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        dowhilelrbtn.setText("do while loop");

        nonerbtn.setBackground(new java.awt.Color(255, 255, 153));
        buttonGroup4.add(nonerbtn);
        nonerbtn.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        nonerbtn.setText("none");

        jLabel5.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        jLabel5.setText("5.  Which exception is thrown when java is out of memory?");
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        merrrbtn.setBackground(new java.awt.Color(255, 255, 153));
        buttonGroup5.add(merrrbtn);
        merrrbtn.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        merrrbtn.setText("MemoryError");

        outrbtn.setBackground(new java.awt.Color(255, 255, 153));
        buttonGroup5.add(outrbtn);
        outrbtn.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        outrbtn.setText("OutOfMemoryError");

        memrtbn.setBackground(new java.awt.Color(255, 255, 153));
        buttonGroup5.add(memrtbn);
        memrtbn.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        memrtbn.setText("MemoryOutOfBoundsException");

        memfullrbtn.setBackground(new java.awt.Color(255, 255, 153));
        buttonGroup5.add(memfullrbtn);
        memfullrbtn.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        memfullrbtn.setText("MemoryFullException");

        quizhomebtn.setBackground(new java.awt.Color(204, 255, 153));
        quizhomebtn.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        quizhomebtn.setText("HOME");
        quizhomebtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        quizhomebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quizhomebtnActionPerformed(evt);
            }
        });

        quizexitbrn.setBackground(new java.awt.Color(204, 255, 153));
        quizexitbrn.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        quizexitbrn.setText("EXIT");
        quizexitbrn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        quizexitbrn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quizexitbrnActionPerformed(evt);
            }
        });

        timerlabel.setBackground(new java.awt.Color(255, 255, 255));
        timerlabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        timerlabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout lbLayout = new javax.swing.GroupLayout(lb);
        lb.setLayout(lbLayout);
        lbLayout.setHorizontalGroup(
            lbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lbLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(quizhomebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(quizexitbrn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(lbLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(lbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lbLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(lbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(lbLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(arrayrbtn)
                                .addGap(53, 53, 53)
                                .addComponent(gotorbtn)
                                .addGap(54, 54, 54)
                                .addComponent(nullrbtn))
                            .addGroup(lbLayout.createSequentialGroup()
                                .addGroup(lbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(lbLayout.createSequentialGroup()
                                        .addComponent(merrrbtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(outrbtn)
                                        .addGap(18, 18, 18)
                                        .addComponent(memrtbn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(memfullrbtn))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, lbLayout.createSequentialGroup()
                                        .addGroup(lbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(flrtbn)
                                            .addComponent(inflrbtn))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(lbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ininrbtn)
                                            .addComponent(flinrbtn))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(quizsubmitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(lbLayout.createSequentialGroup()
                        .addGroup(lbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addGroup(lbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(classrbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addGroup(lbLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(forlrbtn)
                                .addGap(39, 39, 39)
                                .addComponent(whilelrbtn)
                                .addGap(52, 52, 52)
                                .addComponent(dowhilelrbtn)
                                .addGap(68, 68, 68)
                                .addComponent(nonerbtn))
                            .addComponent(jLabel4))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(lbLayout.createSequentialGroup()
                        .addGroup(lbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(lbLayout.createSequentialGroup()
                                .addComponent(pl_rbtn)
                                .addGap(36, 36, 36)
                                .addComponent(inrbtn)
                                .addGap(45, 45, 45)
                                .addComponent(clrbtn)
                                .addGap(40, 40, 40)
                                .addComponent(enrbtn))
                            .addComponent(jLabel1))
                        .addGap(134, 134, 134)
                        .addComponent(timerlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(152, 152, 152))))
        );
        lbLayout.setVerticalGroup(
            lbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lbLayout.createSequentialGroup()
                .addGroup(lbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(lbLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(quizsubmitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(lbLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(lbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(lbLayout.createSequentialGroup()
                                .addGroup(lbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(lbLayout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(lbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(pl_rbtn)
                                            .addComponent(clrbtn)
                                            .addComponent(enrbtn)
                                            .addComponent(inrbtn)))
                                    .addComponent(timerlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(lbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(flrtbn)
                                    .addComponent(flinrbtn))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(lbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(inflrbtn)
                                    .addComponent(ininrbtn))
                                .addGap(7, 7, 7)
                                .addComponent(jLabel3)
                                .addGap(8, 8, 8)
                                .addGroup(lbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(arrayrbtn)
                                    .addComponent(gotorbtn)
                                    .addComponent(nullrbtn)
                                    .addComponent(classrbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(lbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(forlrbtn)
                                    .addComponent(whilelrbtn)
                                    .addComponent(dowhilelrbtn)
                                    .addComponent(nonerbtn))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(lbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(merrrbtn)
                                    .addComponent(outrbtn)
                                    .addComponent(memrtbn)
                                    .addComponent(memfullrbtn)))
                            .addGroup(lbLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addGroup(lbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(quizexitbrn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(quizhomebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lb, javax.swing.GroupLayout.PREFERRED_SIZE, 993, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lb, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
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

    private void flinrbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flinrbtnActionPerformed
       
    }//GEN-LAST:event_flinrbtnActionPerformed

    private void quizexitbrnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quizexitbrnActionPerformed
        dispose();
    }//GEN-LAST:event_quizexitbrnActionPerformed

    private void quizhomebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quizhomebtnActionPerformed
       dispose();
       new Login().setVisible(true);
    }//GEN-LAST:event_quizhomebtnActionPerformed

    private void quizsubmitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quizsubmitbtnActionPerformed
             
       pl_rbtn.setActionCommand("Polymorphism");
       inrbtn.setActionCommand("Inheritance");
       clrbtn.setActionCommand("Compilation");
       enrbtn.setActionCommand("Encapsulation");
       flrtbn.setActionCommand("Floating-point value assigned to a Floating type");
       flinrbtn.setActionCommand("Floating-point value assigned to an integer type");
       inflrbtn.setActionCommand(" Integer value assigned to floating type");
       ininrbtn.setActionCommand(" Integer value assigned to integer type");
       arrayrbtn.setActionCommand("array");
       gotorbtn.setActionCommand("goto");
       nullrbtn.setActionCommand("null");
       classrbtn.setActionCommand("class");
       forlrbtn.setActionCommand("for loop");
       whilelrbtn.setActionCommand("while loop");
       dowhilelrbtn.setActionCommand("do while loop");
       nonerbtn.setActionCommand("none");
       merrrbtn.setActionCommand("MemoryError");
       outrbtn.setActionCommand("OutOfMemoryError");
       memrtbn.setActionCommand("MemoryOutOfBoundsException");
       memfullrbtn.setActionCommand("MemoryFullException");
    try{
        
             String sql = "select * from answers where id=1";
               pst = con.prepareStatement(sql);
               rs = pst.executeQuery();
        if(rs.next()){
            String a1 =  buttonGroup1.getSelection().getActionCommand();
            String a2 =  buttonGroup2.getSelection().getActionCommand();       
            String a3 =  buttonGroup3.getSelection().getActionCommand();      
            String a4 =  buttonGroup4.getSelection().getActionCommand();
            String a5 =  buttonGroup5.getSelection().getActionCommand();
           
              
                   String add1 = rs.getString("ans1");
                   String add2 = rs.getString("ans2");
                   String add3 = rs.getString("ans3");
                   String add4 = rs.getString("ans4");
                   String add5 = rs.getString("ans5");
                   if(a1.equals(add1)){
                       count++;
                   }
                   if(a2.equals(add2)){
                       count++;
                   }
                   if(a3.equals(add3)){
                       count++;
                   }
                   if(a4.equals(add4)){
                       count++;
                   }
                   if(a5.equals(add5)){
                       count++;
                   }else{
                       count = 0;
                   }  
                String sql1= "insert into marks (score) values(?)";
                pst = con.prepareStatement(sql1);
                pst.setString(1, String.valueOf(count));
                pst.execute();
            }
        JOptionPane.showMessageDialog(null, "Quiz submitted, your score is "+count);
        dispose();
        new LogoutPage().setVisible(true);
       }catch(Exception e){
           JOptionPane.showMessageDialog(null,e);
       }finally{
        if(quizTimer != null){
            quizTimer.stop();
        }
        }
    
    }//GEN-LAST:event_quizsubmitbtnActionPerformed

    private void pl_rbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pl_rbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pl_rbtnActionPerformed

    private void arrayrbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arrayrbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arrayrbtnActionPerformed
    
   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new question().setVisible(true);
            }
        });
 }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton arrayrbtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.JRadioButton classrbtn;
    private javax.swing.JRadioButton clrbtn;
    private javax.swing.JRadioButton dowhilelrbtn;
    private javax.swing.JRadioButton enrbtn;
    private javax.swing.JRadioButton flinrbtn;
    private javax.swing.JRadioButton flrtbn;
    private javax.swing.JRadioButton forlrbtn;
    private javax.swing.JRadioButton gotorbtn;
    private javax.swing.JRadioButton inflrbtn;
    private javax.swing.JRadioButton ininrbtn;
    private javax.swing.JRadioButton inrbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel lb;
    private javax.swing.JRadioButton memfullrbtn;
    private javax.swing.JRadioButton memrtbn;
    private javax.swing.JRadioButton merrrbtn;
    private javax.swing.JRadioButton nonerbtn;
    private javax.swing.JRadioButton nullrbtn;
    private javax.swing.JRadioButton outrbtn;
    private javax.swing.JRadioButton pl_rbtn;
    private javax.swing.JButton quizexitbrn;
    private javax.swing.JButton quizhomebtn;
    private javax.swing.JButton quizsubmitbtn;
    private javax.swing.JLabel timerlabel;
    private javax.swing.JRadioButton whilelrbtn;
    // End of variables declaration//GEN-END:variables

    
}
