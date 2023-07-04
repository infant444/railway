 
import java.text.SimpleDateFormat;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
public class ticket_booking extends javax.swing.JFrame {

    public int i, x, tot = 0, m = 0, tp = 0,p;
    public String a, b, c;
    public String tnam, fonam, tonam;
    SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YY");
    public Date d = new Date();
    public int ms, ps;

    public ticket_booking() {
        initComponents();
        dis();
    }

    private void dis() {
        name.setEnabled(false);
        age.setEnabled(false);
        male.setEnabled(false);
        female.setEnabled(false);
        transgender.setEnabled(false);
        mno.setEnabled(false);
        pno.setEnabled(false);
        pyes.setEnabled(false);
        myes.setEnabled(false);
        choch.setEnabled(false);
        add.setEnabled(false);
        clear.setEnabled(false);
        phoneno.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gender = new javax.swing.ButtonGroup();
        physical = new javax.swing.ButtonGroup();
        medical = new javax.swing.ButtonGroup();
        panel1 = new java.awt.Panel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        day = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        panel2 = new java.awt.Panel();
        panel3 = new java.awt.Panel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        info = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        name = new javax.swing.JTextPane();
        male = new javax.swing.JRadioButton();
        pno = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        pyes = new javax.swing.JRadioButton();
        transgender = new javax.swing.JRadioButton();
        choch = new javax.swing.JComboBox<>();
        myes = new javax.swing.JRadioButton();
        mno = new javax.swing.JRadioButton();
        add = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        phoneno = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        age = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tab1 = new javax.swing.JTable();
        n = new javax.swing.JSpinner();
        ts = new javax.swing.JComboBox<>();
        Tn = new javax.swing.JComboBox<>();
        fs = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setBackground(new java.awt.Color(0, 204, 204));
        panel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jDesktopPane1.setBackground(new java.awt.Color(0, 255, 102));
        jDesktopPane1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        jLabel2.setFont(new java.awt.Font("Wide Latin", 0, 36)); // NOI18N
        jLabel2.setText("Railway ticket booking");

        jLabel14.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 51));
        jLabel14.setText("<--Back");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setLabelFor(fs);
        jLabel1.setText("From Station");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setLabelFor(n);
        jLabel3.setText("Number person to travel");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("To Station");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setLabelFor(Tn);
        jLabel5.setText("Train name");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setLabelFor(day);
        jLabel6.setText("Date");

        day.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("process to next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        panel3.setBackground(new java.awt.Color(0, 153, 153));

        jLabel7.setFont(new java.awt.Font("Wide Latin", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("Preson Detail");

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(50, 50, 50))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Name");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Age");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("Gender");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setText("coach type");
        jLabel11.setToolTipText("");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("Medical issue");
        jLabel12.setToolTipText("");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setText("Physically challange");
        jLabel13.setToolTipText("");

        info.setFont(new java.awt.Font("Verdana", 2, 18)); // NOI18N
        info.setText("");

        name.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jScrollPane4.setViewportView(name);

        gender.add(male);
        male.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        male.setText("Male");
        male.setEnabled(false);
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });

        physical.add(pno);
        pno.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        pno.setText("No");
        pno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnoActionPerformed(evt);
            }
        });

        gender.add(female);
        female.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        female.setText("Female");
        female.setEnabled(false);

        physical.add(pyes);
        pyes.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        pyes.setText("Yes");
        pyes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pyesActionPerformed(evt);
            }
        });

        gender.add(transgender);
        transgender.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        transgender.setText("Transgender");
        transgender.setEnabled(false);

        choch.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        choch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Coach", "AC first class", "AC second  class", "AC three class", "Sleeper class", "Second seater" }));
        choch.setSelectedItem(0);

        medical.add(myes);
        myes.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        myes.setText("Yes");
        myes.setEnabled(false);
        myes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myesActionPerformed(evt);
            }
        });

        medical.add(mno);
        mno.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        mno.setText("No");
        mno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnoActionPerformed(evt);
            }
        });

        add.setBackground(new java.awt.Color(255, 51, 51));
        add.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(255, 51, 51));
        clear.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        clear.setForeground(new java.awt.Color(255, 255, 255));
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel15.setText("mobile no");
        jLabel15.setToolTipText("");

        phoneno.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jScrollPane6.setViewportView(phoneno);

        age.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        age.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ageAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane7.setViewportView(age);

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(info, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(add))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(choch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addComponent(myes)
                                .addGap(18, 18, 18)
                                .addComponent(mno))
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(clear)
                                    .addComponent(pyes))
                                .addGap(18, 18, 18)
                                .addComponent(pno))
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(male)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(female)
                        .addGap(18, 18, 18)
                        .addComponent(transgender)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(info)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(13, 13, 13)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(male)
                            .addComponent(female)
                            .addComponent(transgender))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(choch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(myes)
                            .addComponent(mno))
                        .addGap(18, 18, 18)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pyes)
                            .addComponent(pno)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(add)
                                    .addComponent(clear)))
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 255), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 255, 204), new java.awt.Color(255, 204, 204)), "Passenger-Detail", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Wide Latin", 0, 24))); // NOI18N

        tab1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153)));
        tab1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tab1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Age", "Gender", "Mobile no", "Medical issue", "Physical challange", "Coach type", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tab1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab1MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tab1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        n.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        ts.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        ts.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Station", "Ariyalur", "Arakkonam Junction", "Chengalpattu", "Chennai", "Coimbatore", "Cuddalore", "Erode  Junction", "Karur", "katpadi  Junction", "Jolarpettai  Junction", "Madurai  Junction", "Salem  Junction", "Theni", "Mambalam", "Perambur", "Tiruvallur", "Avadi", "Tiruttani", "Ambur", "Vaniyambadi", "Melmaruvathur", "Tindivanam", " " }));

        Tn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Tn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Train name", "Rajdhani Express. ", "Duronto Express. ", "Shatabdi Express. ", "Jan Shatabdi Express. ", "Sampark Kranti Express. ", "Garib Rath Express. ", "Humsafar Express. ", "Kavi Guru Express" }));

        fs.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        fs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Station", "Ariyalur", "Arakkonam Junction", "Chengalpattu", "Chennai", "Coimbatore", "Cuddalore", "Erode  Junction", "Karur", "katpadi  Junction", "Jolarpettai  Junction", "Madurai  Junction", "Salem  Junction", "Theni", "Mambalam", "Perambur", "Tiruvallur", "Avadi", "Tiruttani", "Ambur", "Vaniyambadi", "Melmaruvathur", "Tindivanam", " " }));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDesktopPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(22, 22, 22))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(day, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(n)
                                    .addComponent(ts, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Tn, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fs, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(192, 192, 192))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(271, 271, 271))))))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(n, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(fs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(ts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Tn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(day, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(jButton1)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        x = (Integer) n.getValue();
        String usname = "^[a-zA-z0-9_\\.\\-]{0,30}$";
        String nam = "[a-zA-z]{0,30}$";
        String number = "[0-9]{0,20}";
        String email = "^[a-zA-z0-9_\\.\\-]{0,30}[@][a-zA-Z]{0,10}[.][a-zA-Z]{0,3}$";
        Pattern pt = Pattern.compile(number);
//        Matcher mach=pt.matcher(.getText());
        tnam = Tn.getSelectedItem().toString();
        fonam = fs.getSelectedItem().toString();
        tonam = ts.getSelectedItem().toString();
        if (x > 0) {
            if (Tn.getSelectedIndex() != 0) {
                if (fs.getSelectedIndex() != 0) {
                    if (ts.getSelectedIndex() != 0) {
                        if(fs.getSelectedIndex()!=ts.getSelectedIndex())
                        {
                        name.setEnabled(true);
                        age.setEnabled(true);
                        male.setEnabled(true);
                        female.setEnabled(true);
                        transgender.setEnabled(true);
                        mno.setEnabled(true);
                        pno.setEnabled(true);
                        pyes.setEnabled(true);
                        myes.setEnabled(true);
                        choch.setEnabled(true);
                        add.setEnabled(true);
                        clear.setEnabled(true);
                        phoneno.setEnabled(true);
                        i = 1;
                        info.setText("The pansnger no " + i);
                        n.setEnabled(false);
                        Tn.setEnabled(false);
                        fs.setEnabled(false);
                        ts.setEnabled(false);
                        day.setEnabled(false);
                        jButton1.setEnabled(false);
                        }
                        else
                        {
                           JOptionPane.showMessageDialog(null, "Don't Select the Same Satation"); 
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Enter the which train you want to travel, It Should not be empty");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Enter the which station you want reach, It Should not be empty");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Enter the which station you want move, It Should not be empty");
            }

        } else {
            JOptionPane.showMessageDialog(null, "pasanger count could not be zero");
        }
        m = 1;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed

        int q = 0;
         String nam = "[a-zA-z]{0,30}$";
        String number = "[0-9]{0,20}";
        Pattern pt1 = Pattern.compile(nam);
        Pattern pt2 = Pattern.compile(number);
        Matcher mach1 = pt1.matcher(name.getText());
        Matcher mach2 = pt2.matcher(age.getText());
        Matcher mach3 = pt2.matcher(phoneno.getText());
        if (i <= x) {
            if (name.getText().length() != 0 && mach1.matches()) {
                if (age.getText().length() != 0 && Integer.parseInt(age.getText()) < 100 && mach2.matches()) {
                    if (male.isSelected() || female.isSelected() || transgender.isSelected()) {
                        if (choch.getSelectedIndex() != 0) {
                            if (pno.isSelected() || pyes.isSelected()) {
                                if (mno.isSelected() || myes.isSelected()) {
                                    if (phoneno.getText().length() == 10 && mach3.matches()) {
                                        if (choch.getSelectedIndex() == 1) {
                                            q = 2499;
                                            p=240;
                                        } else if (choch.getSelectedIndex() == 2) {
                                            q = 1999;
                                            p=199;
                                        } else if (choch.getSelectedIndex() == 3) {
                                            q = 1499;
                                            p=149;
                                        } else if (choch.getSelectedIndex() == 4) {
                                            q = 1199;
                                        } else if (choch.getSelectedIndex() == 4) {
                                            q = 119;
                                        }
                                        tot = tot + q;
                                       if(pyes.isSelected())
                                       {
                                        tp = tp + p;
                                       }
                                        info.setText("The pansnger no " + (i + 1));
                                        if (male.isSelected() && pno.isSelected() && mno.isSelected()) {
                                            String data[] = {name.getText(), age.getText(), "Male", phoneno.getText(), "No", "NO", choch.getSelectedItem().toString(), Integer.toString(q)};

                                            DefaultTableModel t1 = (DefaultTableModel) tab1.getModel();
                                            t1.addRow(data);
                                        } else if (female.isSelected() && pno.isSelected() && mno.isSelected()) {
                                            String data[] = {name.getText(), age.getText(), "Female", phoneno.getText(), "NO", "NO", choch.getSelectedItem().toString(), Integer.toString(q)};
                                            DefaultTableModel t1 = (DefaultTableModel) tab1.getModel();
                                            t1.addRow(data);
                                        } else if (transgender.isSelected() && pno.isSelected() && mno.isSelected()) {
                                            String data[] = {name.getText(), age.getText(), "Transgender", phoneno.getText(), "NO", "NO", choch.getSelectedItem().toString(), Integer.toString(q)};
                                            DefaultTableModel t1 = (DefaultTableModel) tab1.getModel();
                                            t1.addRow(data);
                                        } else if (male.isSelected() && pyes.isSelected() && mno.isSelected()) {
                                            String data[] = {name.getText(), age.getText(), "Male", phoneno.getText(), "No", "YES", choch.getSelectedItem().toString(), Integer.toString(q)};
                                            DefaultTableModel t1 = (DefaultTableModel) tab1.getModel();
                                            t1.addRow(data);
                                        } else if (female.isSelected() && pyes.isSelected() && mno.isSelected()) {
                                            String data[] = {name.getText(), age.getText(), "Female", phoneno.getText(), "NO", "YES", choch.getSelectedItem().toString(), Integer.toString(q)};
                                            DefaultTableModel t1 = (DefaultTableModel) tab1.getModel();
                                            t1.addRow(data);
                                        } else if (transgender.isSelected() && pyes.isSelected() && mno.isSelected()) {
                                            String data[] = {name.getText(), age.getText(), "Transgender", phoneno.getText(), "NO", "YES", choch.getSelectedItem().toString(), Integer.toString(q)};
                                            DefaultTableModel t1 = (DefaultTableModel) tab1.getModel();
                                            t1.addRow(data);
                                        } else if (male.isSelected() && pno.isSelected() && myes.isSelected()) {
                                            String data[] = {name.getText(), age.getText(), "Male", phoneno.getText(), "YES", "NO", choch.getSelectedItem().toString(), Integer.toString(q)};
                                            DefaultTableModel t1 = (DefaultTableModel) tab1.getModel();
                                            t1.addRow(data);
                                        } else if (female.isSelected() && pno.isSelected() && myes.isSelected()) {
                                            String data[] = {name.getText(), age.getText(), "Female", phoneno.getText(), "YES", "NO", choch.getSelectedItem().toString(), Integer.toString(q)};
                                            DefaultTableModel t1 = (DefaultTableModel) tab1.getModel();
                                            t1.addRow(data);
                                        } else if (transgender.isSelected() && pno.isSelected() && myes.isSelected()) {
                                            String data[] = {name.getText(), age.getText(), "Transgender", phoneno.getText(), "YES", "NO", choch.getSelectedItem().toString(), Integer.toString(q)};
                                            DefaultTableModel t1 = (DefaultTableModel) tab1.getModel();
                                            t1.addRow(data);
                                        } else if (male.isSelected() && pyes.isSelected() && myes.isSelected()) {
                                            String data[] = {name.getText(), age.getText(), "Male", phoneno.getText(), "YES", "YES", choch.getSelectedItem().toString(), Integer.toString(q)};
                                            DefaultTableModel t1 = (DefaultTableModel) tab1.getModel();
                                            t1.addRow(data);

                                        } else if (female.isSelected() && pyes.isSelected() && myes.isSelected()) {
                                            String data[] = {name.getText(), age.getText(), "Female", phoneno.getText(), "YES", "YES", choch.getSelectedItem().toString(), Integer.toString(q)};
                                            DefaultTableModel t1 = (DefaultTableModel) tab1.getModel();
                                            t1.addRow(data);
                                        } else if (transgender.isSelected() && pyes.isSelected() && myes.isSelected()) {
                                            String data[] = {name.getText(), age.getText(), "Transgender", phoneno.getText(), "YES", "YES", choch.getSelectedItem().toString(), Integer.toString(q)};
                                            DefaultTableModel t1 = (DefaultTableModel) tab1.getModel();
                                            t1.addRow(data);
                                        }
                                        JOptionPane.showMessageDialog(null, "The detail add successfully");
                                        name.setText(null);
                                        age.setText(null);
                                        gender.clearSelection();
                                        physical.clearSelection();
                                        medical.clearSelection();
                                        choch.setSelectedIndex(0);
                                        phoneno.setText(null);
                                        if (x == i) {

                                            int n = JOptionPane.showConfirmDialog(null, "To order the Food", "Food", JOptionPane.YES_NO_OPTION);
                                            if (n == 0) {
                                                
                                                foodorder f1 = new foodorder(x, tnam, fonam, tonam,2,tot, tp);
                                                f1.setVisible(true);
                                                dispose();
                                            } else if (n == 1) {
                                                payment f1 = new payment(x, tnam, fonam, tonam, 2, tot, 0, tp);
                                                f1.setVisible(true);
                                                dispose();
                                            }
                                        }
                                        i++;
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Enter the proper mobile number");
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "To choice that You are have any medical issue or not");
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "To choice that You are phiysical chalange or not");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "To choice any coach");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "To choice the gender");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "To Enter the propered age");
                }

            } else {
                JOptionPane.showMessageDialog(null, "To name should not be empty");
            }

        } else {
            JOptionPane.showMessageDialog(null, "The limit is exist");
            int n = JOptionPane.showConfirmDialog(null, "Move to a  ", "Payment", JOptionPane.YES_NO_OPTION);
            if (n == 0) {
                foodorder f1 = new foodorder();
                f1.setVisible(true);
                dispose();
            }

        }

    }//GEN-LAST:event_addActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed

        name.setText(null);
        age.setText(null);
        gender.clearSelection();
        physical.clearSelection();
        medical.clearSelection();
        choch.setSelectedIndex(0);
        phoneno.setText(null);
    }//GEN-LAST:event_clearActionPerformed

    private void mnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_mnoActionPerformed

    private void pyesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pyesActionPerformed
        // TODO add your handling code here:
        ps = 10;
    }//GEN-LAST:event_pyesActionPerformed

    private void tab1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab1MouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_tab1MouseClicked

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_maleActionPerformed

    private void ageAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ageAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_ageAncestorAdded

    private void myesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myesActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_myesActionPerformed

    private void pnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnoActionPerformed
        // TODO add your handling code here:
        ps = 0;
    }//GEN-LAST:event_pnoActionPerformed

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
        if (m == 1) {
            int n = JOptionPane.showConfirmDialog(null, "Move to a home page ", "Home Page", JOptionPane.YES_NO_OPTION);
            if (n == 0) {
                mainpage f1 = new mainpage(true);
                f1.setVisible(true);
                dispose();
            }
        } else {
            mainpage f1 = new mainpage(true);
            f1.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jLabel14MouseClicked

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
            java.util.logging.Logger.getLogger(ticket_booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ticket_booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ticket_booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ticket_booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ticket_booking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Tn;
    private javax.swing.JButton add;
    public javax.swing.JTextPane age;
    public javax.swing.JComboBox<String> choch;
    private javax.swing.JButton clear;
    public com.toedter.calendar.JDateChooser day;
    public javax.swing.JRadioButton female;
    private javax.swing.JComboBox<String> fs;
    private javax.swing.ButtonGroup gender;
    private javax.swing.JLabel info;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    public javax.swing.JRadioButton male;
    private javax.swing.ButtonGroup medical;
    public javax.swing.JRadioButton mno;
    public javax.swing.JRadioButton myes;
    public javax.swing.JSpinner n;
    public javax.swing.JTextPane name;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private java.awt.Panel panel3;
    public javax.swing.JTextPane phoneno;
    private javax.swing.ButtonGroup physical;
    public javax.swing.JRadioButton pno;
    public javax.swing.JRadioButton pyes;
    javax.swing.JTable tab1;
    public javax.swing.JRadioButton transgender;
    private javax.swing.JComboBox<String> ts;
    // End of variables declaration//GEN-END:variables
}
