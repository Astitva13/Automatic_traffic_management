package gui;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;

public class ParkingSys extends javax.swing.JFrame {
    int ctr=0;
    public int s4 = 0, w2 = 0, l4 =0;
    public int c_s4 = 0, c_w2 = 0, c_l4 = 0;
    public int no_1 = 0, no_2 = 0, no_3 =0;
    ArrayList avail_s4 = new ArrayList(101);
    ArrayList avail_w2 = new ArrayList(101);
    ArrayList avail_l4 = new ArrayList();
    public ParkingSys() {
        initComponents();
        neMouseClicked(null);
        update_values();nullify_array();
        cph.setText("Rs. "+c_s4+" /-");
    }
    
    public ParkingSys(String s) {
        initComponents();
        ttt.setText(s);
        neMouseClicked(null);
        update_values();nullify_array();
        cph.setText("Rs. "+c_s4+" /-");
    }
    
    public void update_values(){
        try {
            ResultSet rs_1 = db.DBConnect.GetValues_1.executeQuery();
            if(rs_1.next()){
                c_s4 = rs_1.getInt(1);c_w2 = rs_1.getInt(2);c_l4 = rs_1.getInt(3);
            }
        } catch (SQLException ex) { }
        try {
            ResultSet rs_2 = db.DBConnect.GetValues_2.executeQuery();
            if(rs_2.next()){
                no_1 = rs_2.getInt(1);no_2 = rs_2.getInt(2);no_3 = rs_2.getInt(3);
            }
        } catch (SQLException ex) { }
    }
    
    public void nullify_array(){
        for(int i = 1;i<101;i++)
        {
            avail_s4.add(0);
            avail_w2.add(0);
            avail_l4.add(0);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        ne = new javax.swing.JPanel();
        p1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ev = new javax.swing.JPanel();
        p2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        ar = new javax.swing.JPanel();
        p3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lo = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        ttt = new javax.swing.JLabel();
        sel_mode = new javax.swing.JLabel();
        nre = new javax.swing.JLabel();
        card_panel = new javax.swing.JPanel();
        cl1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        vno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        v1 = new javax.swing.JRadioButton();
        v2 = new javax.swing.JRadioButton();
        v3 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        cph = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cl2 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        exit_vno = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        gnr = new javax.swing.JLabel();
        clr = new javax.swing.JLabel();
        cl3 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        vhno1 = new javax.swing.JTextField();
        vhno2 = new javax.swing.JTextField();
        vhno3 = new javax.swing.JTextField();
        cst1 = new javax.swing.JTextField();
        cst2 = new javax.swing.JTextField();
        cst3 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        ne.setBackground(new java.awt.Color(0, 102, 102));
        ne.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                neMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                neMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                neMouseEntered(evt);
            }
        });

        p1.setBackground(new java.awt.Color(255, 255, 255));
        p1.setPreferredSize(new java.awt.Dimension(5, 63));

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 63, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("New Entry");

        javax.swing.GroupLayout neLayout = new javax.swing.GroupLayout(ne);
        ne.setLayout(neLayout);
        neLayout.setHorizontalGroup(
            neLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(neLayout.createSequentialGroup()
                .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(39, 39, 39))
        );
        neLayout.setVerticalGroup(
            neLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, neLayout.createSequentialGroup()
                .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(neLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        ev.setBackground(new java.awt.Color(0, 102, 102));
        ev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                evMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                evMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                evMouseEntered(evt);
            }
        });

        p2.setBackground(new java.awt.Color(255, 255, 255));
        p2.setPreferredSize(new java.awt.Dimension(5, 63));

        javax.swing.GroupLayout p2Layout = new javax.swing.GroupLayout(p2);
        p2.setLayout(p2Layout);
        p2Layout.setHorizontalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        p2Layout.setVerticalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 63, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Exiting Vehicle");

        javax.swing.GroupLayout evLayout = new javax.swing.GroupLayout(ev);
        ev.setLayout(evLayout);
        evLayout.setHorizontalGroup(
            evLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(evLayout.createSequentialGroup()
                .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                .addGap(39, 39, 39))
        );
        evLayout.setVerticalGroup(
            evLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, evLayout.createSequentialGroup()
                .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(evLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        ar.setBackground(new java.awt.Color(0, 102, 102));
        ar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                arMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                arMouseEntered(evt);
            }
        });

        p3.setBackground(new java.awt.Color(255, 255, 255));
        p3.setPreferredSize(new java.awt.Dimension(5, 63));

        javax.swing.GroupLayout p3Layout = new javax.swing.GroupLayout(p3);
        p3.setLayout(p3Layout);
        p3Layout.setHorizontalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        p3Layout.setVerticalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 63, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Avail. & Rates");

        javax.swing.GroupLayout arLayout = new javax.swing.GroupLayout(ar);
        ar.setLayout(arLayout);
        arLayout.setHorizontalGroup(
            arLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(arLayout.createSequentialGroup()
                .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        arLayout.setVerticalGroup(
            arLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, arLayout.createSequentialGroup()
                .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, arLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        lo.setBackground(new java.awt.Color(0, 75, 75));
        lo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loMouseEntered(evt);
            }
        });

        jPanel11.setBackground(new java.awt.Color(0, 51, 51));
        jPanel11.setPreferredSize(new java.awt.Dimension(5, 63));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 63, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Logout");

        javax.swing.GroupLayout loLayout = new javax.swing.GroupLayout(lo);
        lo.setLayout(loLayout);
        loLayout.setHorizontalGroup(
            loLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loLayout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(34, 34, 34))
        );
        loLayout.setVerticalGroup(
            loLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loLayout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(loLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ev, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(ne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra_files/t-1.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra_files/t2.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel13MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel13MouseEntered(evt);
            }
        });

        ttt.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ttt.setForeground(new java.awt.Color(255, 255, 255));
        ttt.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        ttt.setText("hi");

        sel_mode.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        sel_mode.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sel_mode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra_files/light-1.png"))); // NOI18N
        sel_mode.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        sel_mode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sel_modeMouseClicked(evt);
            }
        });

        nre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        nre.setForeground(new java.awt.Color(255, 255, 255));
        nre.setText("Light Mode");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(sel_mode)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ttt, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ttt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nre)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(sel_mode)
                        .addGap(7, 7, 7))))
        );

        card_panel.setBackground(new java.awt.Color(204, 255, 204));
        card_panel.setLayout(new java.awt.CardLayout());

        cl1.setBackground(new java.awt.Color(255, 255, 255));
        cl1.setName("c1"); // NOI18N

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Vehicle Type :");

        vno.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        vno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        vno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));
        vno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vnoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Vehicle No. :");

        buttonGroup1.add(v1);
        v1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        v1.setForeground(new java.awt.Color(0, 102, 102));
        v1.setSelected(true);
        v1.setText("Car / Small 4 wheeler");
        v1.setOpaque(false);
        v1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                v1ItemStateChanged(evt);
            }
        });

        buttonGroup1.add(v2);
        v2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        v2.setForeground(new java.awt.Color(0, 102, 102));
        v2.setText("Two wheeler");
        v2.setOpaque(false);
        v2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                v2ItemStateChanged(evt);
            }
        });

        buttonGroup1.add(v3);
        v3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        v3.setForeground(new java.awt.Color(0, 102, 102));
        v3.setText("Large 4 wheeler");
        v3.setOpaque(false);
        v3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                v3ItemStateChanged(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("Cost per hour :");

        cph.setEditable(false);
        cph.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cph.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cph.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));

        jLabel8.setBackground(new java.awt.Color(0, 102, 102));
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Accept");
        jLabel8.setOpaque(true);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(0, 102, 102));
        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Clear All");
        jLabel9.setOpaque(true);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout cl1Layout = new javax.swing.GroupLayout(cl1);
        cl1.setLayout(cl1Layout);
        cl1Layout.setHorizontalGroup(
            cl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cl1Layout.createSequentialGroup()
                .addGroup(cl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cl1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(cl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(cl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(v2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(v3, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(v1)
                            .addComponent(vno, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cph, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(cl1Layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(210, Short.MAX_VALUE))
        );
        cl1Layout.setVerticalGroup(
            cl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cl1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(cl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vno, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(cl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(v1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(v2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(v3)
                .addGap(29, 29, 29)
                .addGroup(cl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cph, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(cl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(125, 125, 125))
        );

        card_panel.add(cl1, "c1");

        cl2.setName("c2"); // NOI18N
        cl2.setPreferredSize(new java.awt.Dimension(886, 100));

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));

        exit_vno.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        exit_vno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        exit_vno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 102));
        jLabel11.setText("Vehicle No. :");

        gnr.setBackground(new java.awt.Color(0, 102, 102));
        gnr.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        gnr.setForeground(new java.awt.Color(255, 255, 255));
        gnr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gnr.setText("Generate Reciept");
        gnr.setOpaque(true);
        gnr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gnrMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gnrMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gnrMouseEntered(evt);
            }
        });

        clr.setBackground(new java.awt.Color(0, 102, 102));
        clr.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        clr.setForeground(new java.awt.Color(255, 255, 255));
        clr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clr.setText("Clear All");
        clr.setOpaque(true);
        clr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clrMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clrMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clrMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(exit_vno, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(clr, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(gnr, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(218, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit_vno, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clr, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gnr, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout cl2Layout = new javax.swing.GroupLayout(cl2);
        cl2.setLayout(cl2Layout);
        cl2Layout.setHorizontalGroup(
            cl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 886, Short.MAX_VALUE)
            .addGroup(cl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cl2Layout.setVerticalGroup(
            cl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
            .addGroup(cl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        card_panel.add(cl2, "c2");

        cl3.setName("c3"); // NOI18N

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 102));
        jLabel12.setText("Availabilty :");

        jLabel16.setBackground(new java.awt.Color(0, 102, 102));
        jLabel16.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Change Rates");
        jLabel16.setOpaque(true);
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel16MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel16MouseEntered(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 102));
        jLabel15.setText("Small 4 wheeler :");

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 102, 102));
        jLabel17.setText("Two wheeler :");

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 102, 102));
        jLabel18.setText("Large 4 wheeler :");

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 102, 102));
        jLabel19.setText("Rates (per hr.) :");

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 102, 102));
        jLabel20.setText("Small 4 wheeler :");

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 102, 102));
        jLabel21.setText("Two wheeler :");

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 102, 102));
        jLabel22.setText("Large 4 wheeler :");

        vhno1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        vhno1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        vhno1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));

        vhno2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        vhno2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        vhno2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));

        vhno3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        vhno3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        vhno3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));

        cst1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cst1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cst1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));

        cst2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cst2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cst2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));

        cst3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cst3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cst3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));

        jLabel23.setBackground(new java.awt.Color(0, 102, 102));
        jLabel23.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Cancel");
        jLabel23.setOpaque(true);
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel23MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel23MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cst2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                            .addComponent(vhno3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vhno2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vhno1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cst3)
                            .addComponent(cst1, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addGap(0, 458, Short.MAX_VALUE)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vhno1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vhno2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vhno3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cst1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cst2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cst3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout cl3Layout = new javax.swing.GroupLayout(cl3);
        cl3.setLayout(cl3Layout);
        cl3Layout.setHorizontalGroup(
            cl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 886, Short.MAX_VALUE)
            .addGroup(cl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cl3Layout.setVerticalGroup(
            cl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
            .addGroup(cl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        card_panel.add(cl3, "c3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(card_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 852, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(card_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void neMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_neMouseClicked
        //New entry tab
        CardLayout cd = (CardLayout)card_panel.getLayout();
        cd.show(card_panel,"c1");
        p1.setBackground(new java.awt.Color(255, 255, 255));
        p2.setBackground(new java.awt.Color(0, 102, 102));
        p3.setBackground(new java.awt.Color(0, 102, 102));
        if(v1.isSelected()){cph.setText("Rs. "+c_s4+" /-");}
        if(v2.isSelected()){cph.setText("Rs. "+c_w2+" /-");}
        if(v3.isSelected()){cph.setText("Rs. "+c_l4+" /-");}
    }//GEN-LAST:event_neMouseClicked

    private void evMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_evMouseClicked
        //Exiting tab
        CardLayout cd = (CardLayout)card_panel.getLayout();
        cd.show(card_panel,"c2");
         p2.setBackground(new java.awt.Color(255, 255, 255));
        p1.setBackground(new java.awt.Color(0, 102, 102));
        p3.setBackground(new java.awt.Color(0, 102, 102));
    }//GEN-LAST:event_evMouseClicked

    private void arMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arMouseClicked
        //Rates tab
        CardLayout cd = (CardLayout)card_panel.getLayout();
        cd.show(card_panel,"c3");
         p3.setBackground(new java.awt.Color(255, 255, 255));
        p2.setBackground(new java.awt.Color(0, 102, 102));
        p1.setBackground(new java.awt.Color(0, 102, 102));
        update_values();
        cst1.setText(c_s4+"");
        cst2.setText(c_w2+"");
        cst3.setText(c_l4+"");
        vhno1.setText(no_1+"");
        vhno2.setText(no_2+"");
        vhno3.setText(no_3+"");
    }//GEN-LAST:event_arMouseClicked

    private void neMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_neMouseEntered
        // TODO add your handling code here: 
        ne.setBackground(new java.awt.Color(0, 75, 75));
    }//GEN-LAST:event_neMouseEntered

    private void neMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_neMouseExited
        // TODO add your handling code here:
        ne.setBackground(new java.awt.Color(0, 102, 102));
    }//GEN-LAST:event_neMouseExited

    private void evMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_evMouseEntered
        // TODO add your handling code here:
         ev.setBackground(new java.awt.Color(0, 75, 75));
    }//GEN-LAST:event_evMouseEntered

    private void evMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_evMouseExited
        // TODO add your handling code here:
         ev.setBackground(new java.awt.Color(0, 102, 102));
    }//GEN-LAST:event_evMouseExited

    private void arMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arMouseEntered
        // TODO add your handling code here:
         ar.setBackground(new java.awt.Color(0, 75, 75));
    }//GEN-LAST:event_arMouseEntered

    private void arMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arMouseExited
        // TODO add your handling code here:
         ar.setBackground(new java.awt.Color(0, 102, 102));
    }//GEN-LAST:event_arMouseExited

    private void loMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loMouseClicked
        // TODO add your handling code here:
             int r=JOptionPane.showConfirmDialog(this,"Do u really wanna delete?","Deletion Confirmation", JOptionPane.YES_NO_OPTION);
             if(r==JOptionPane.YES_OPTION){
                dispose();
                new Login().setVisible(true);
            } 
    }//GEN-LAST:event_loMouseClicked

    private void loMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loMouseEntered
        // TODO add your handling code here:
        lo.setBackground(new java.awt.Color(0, 25, 25));
    }//GEN-LAST:event_loMouseEntered

    private void loMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loMouseExited
        // TODO add your handling code here:
        lo.setBackground(new java.awt.Color(0, 51, 51));
    }//GEN-LAST:event_loMouseExited

    private void v1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_v1ItemStateChanged
        // TODO add your handling code here:
        if(v1.isSelected()){cph.setText("Rs. "+c_s4+" /-");}
        if(v2.isSelected()){cph.setText("Rs. "+c_w2+" /-");}
        if(v3.isSelected()){cph.setText("Rs. "+c_l4+" /-");}
    }//GEN-LAST:event_v1ItemStateChanged

    private void v2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_v2ItemStateChanged
        // TODO add your handling code here:
        if(v1.isSelected()){cph.setText("Rs. "+c_s4+" /-");}
        if(v2.isSelected()){cph.setText("Rs. "+c_w2+" /-");}
        if(v3.isSelected()){cph.setText("Rs. "+c_l4+" /-");}
    }//GEN-LAST:event_v2ItemStateChanged

    private void v3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_v3ItemStateChanged
        // TODO add your handling code here:
        if(v1.isSelected()){cph.setText("Rs. "+c_s4+" /-");}
        if(v2.isSelected()){cph.setText("Rs. "+c_w2+" /-");}
        if(v3.isSelected()){cph.setText("Rs. "+c_l4+" /-");}
    }//GEN-LAST:event_v3ItemStateChanged

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
       //Accept btn;
       String num = vno.getText();
       int Cph = 0,vtype=0,idx=0;
       if(v1.isSelected()){Cph = c_s4;vtype = 1;}
       if(v2.isSelected()){Cph = c_w2;vtype = 2;}
       if(v3.isSelected()){Cph = c_l4;vtype = 3;}
       DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH");  
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("mm");  
        LocalDateTime now = LocalDateTime.now();  
        int tm = Integer.parseInt(dtf.format(now))*60+Integer.parseInt(dt.format(now));
        update_values();
       for(int i=1;i<101;i++)
       {
           if(vtype ==1){
               if((int)avail_s4.get(i)==0) {idx = i;avail_s4.set(idx, 1);no_1--;break;}
           }
           if(vtype ==2){
               if((int)avail_w2.get(i)==0) {idx = i;avail_w2.set(idx, 1);no_2--;break;}
           }
           if(vtype ==3){
               if((int)avail_l4.get(i)==0) {idx = i;avail_l4.set(idx, 1);no_3--;break;}
           }
       }
       if(!num.equals(""))
       try{
            db.DBConnect.VehicleDetails.setString(1, num);
            db.DBConnect.VehicleDetails.setInt(2, Cph);
            db.DBConnect.VehicleDetails.setInt(3, vtype);
            db.DBConnect.VehicleDetails.setInt(4, idx);
            db.DBConnect.VehicleDetails.setInt(5, tm);
            db.DBConnect.VehicleDetails.executeUpdate();
            db.DBConnect.EditValues_1.executeUpdate();
            db.DBConnect.EditValues_2.setInt(1,no_1);
            db.DBConnect.EditValues_2.setInt(2,no_2);
            db.DBConnect.EditValues_2.setInt(3,no_3);
            db.DBConnect.EditValues_2.executeUpdate();
            String temps;
            if(vtype==1){temps = "S4/"+idx;}
            else if(vtype==2){temps="W2/"+idx;}
            else temps="L4/"+idx;
            JOptionPane.showMessageDialog(this,"Added, proceed to "+temps);
            jLabel9MouseClicked(null);
       }catch(Exception ex){
           System.out.println(ex);
        }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        //Clear all;
       vno.setText("");
       v1.setSelected(true);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void clrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clrMouseClicked
        // TODO add your handling code here:
        exit_vno.setText("");
    }//GEN-LAST:event_clrMouseClicked

    private void clrMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clrMouseEntered
        // TODO add your handling code here:
        clr.setBackground(new java.awt.Color(0, 75, 75));
    }//GEN-LAST:event_clrMouseEntered

    private void clrMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clrMouseExited
        // TODO add your handling code here:
        clr.setBackground(new java.awt.Color(0, 102, 102));
    }//GEN-LAST:event_clrMouseExited

    private void gnrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gnrMouseClicked
        // Generate receipt:
        String num = exit_vno.getText();
        if(!num.equals(""))
        try {
            db.DBConnect.RecieptDetails.setString(1, num);
            ResultSet rs = db.DBConnect.RecieptDetails.executeQuery();
            if(rs.next())
            {
                if(rs.getInt(3)==1){}
                new Reciept(rs).setVisible(true);
                db.DBConnect.DeleteDetails.setString(1, num);
                db.DBConnect.DeleteDetails.executeUpdate();
                clrMouseClicked(null);
            }
            else{
                 JOptionPane.showMessageDialog(this,"No such vehicle found !!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
        
    }//GEN-LAST:event_gnrMouseClicked

    private void gnrMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gnrMouseEntered
        // TODO add your handling code here:
        gnr.setBackground(new java.awt.Color(0, 75, 75));
    }//GEN-LAST:event_gnrMouseEntered

    private void gnrMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gnrMouseExited
        // TODO add your handling code here:
        gnr.setBackground(new java.awt.Color(0, 102, 102));
    }//GEN-LAST:event_gnrMouseExited

    private void vnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vnoActionPerformed
        // Enter_button_pressed:
        jLabel8MouseClicked(null);
    }//GEN-LAST:event_vnoActionPerformed

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        // TODO add your handling code here:
        jLabel9.setBackground(new java.awt.Color(0, 75, 75));
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        // TODO add your handling code here:
        jLabel9.setBackground(new java.awt.Color(0, 102, 102));
    }//GEN-LAST:event_jLabel9MouseExited

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        // TODO add your handling code here:
        jLabel8.setBackground(new java.awt.Color(0, 75, 75));
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        // TODO add your handling code here:
        jLabel8.setBackground(new java.awt.Color(0, 102, 102));
    }//GEN-LAST:event_jLabel8MouseExited

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        // Cancel_btn:
        update_values();
        cst1.setText(c_s4+"");
        cst2.setText(c_w2+"");
        cst3.setText(c_l4+"");
        vhno1.setText(no_1+"");
        vhno2.setText(no_2+"");
        vhno3.setText(no_3+"");
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel23MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseEntered
        // TODO add your handling code here:
        jLabel23.setBackground(new java.awt.Color(0, 75, 75));
    }//GEN-LAST:event_jLabel23MouseEntered

    private void jLabel23MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseExited
        // TODO add your handling code here:
         jLabel23.setBackground(new java.awt.Color(0, 102, 102));
    }//GEN-LAST:event_jLabel23MouseExited

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // Change rates:
        int i1= Integer.parseInt(cst1.getText());
        int i2= Integer.parseInt(cst2.getText());
        int i3= Integer.parseInt(cst3.getText());
        try{db.DBConnect.EditValues_3.executeUpdate();
        db.DBConnect.EditValues_4.setInt(1,i1);
        db.DBConnect.EditValues_4.setInt(2,i2);
        db.DBConnect.EditValues_4.setInt(3,i3);
        db.DBConnect.EditValues_4.executeUpdate();}catch(Exception ex){}
        update_values();
        arMouseClicked(null);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseEntered
        // TODO add your handling code here:
        jLabel16.setBackground(new java.awt.Color(0, 75, 75));
    }//GEN-LAST:event_jLabel16MouseEntered

    private void jLabel16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseExited
        // TODO add your handling code here:
         jLabel16.setBackground(new java.awt.Color(0, 102, 102));
    }//GEN-LAST:event_jLabel16MouseExited

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        //Close button:
        System.exit(0);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        // TODO add your handling code here:
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra_files/color-t1.png"))); // NOI18N
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
        // TODO add your handling code here:
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra_files/t-1.png"))); // NOI18N
    }//GEN-LAST:event_jLabel10MouseExited

    private void jLabel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseEntered
        // TODO add your handling code here:
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra_files/color-t2.png"))); // NOI18N
    }//GEN-LAST:event_jLabel13MouseEntered

    private void jLabel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseExited
        // TODO add your handling code here:
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra_files/t2.png"))); // NOI18N
    }//GEN-LAST:event_jLabel13MouseExited

    private void sel_modeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sel_modeMouseClicked
        // TODO add your handling code here:
        ctr++;
        if(ctr%2==1) {
            sel_mode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra_files/dark-1.png"))); // NOI18N
            nre.setText("Dark Mode");
            cl1.setBackground(new java.awt.Color(0, 0, 0));
            jPanel16.setBackground(new java.awt.Color(0, 0, 0));
            jPanel17.setBackground(new java.awt.Color(0, 0, 0));
            vno.setBackground(new java.awt.Color(102, 102, 102));
            vno.setForeground(new java.awt.Color(255, 255, 255));
            cph.setBackground(new java.awt.Color(102, 102, 102));
            cph.setForeground(new java.awt.Color(255, 255, 255));
            exit_vno.setBackground(new java.awt.Color(102, 102, 102));
            exit_vno.setForeground(new java.awt.Color(255, 255, 255));
            vhno1.setBackground(new java.awt.Color(102, 102, 102));
            vhno1.setForeground(new java.awt.Color(255, 255, 255));
            vhno2.setBackground(new java.awt.Color(102, 102, 102));
            vhno2.setForeground(new java.awt.Color(255, 255, 255));
            vhno3.setBackground(new java.awt.Color(102, 102, 102));
            vhno3.setForeground(new java.awt.Color(255, 255, 255));
            cst1.setBackground(new java.awt.Color(102, 102, 102));
            cst1.setForeground(new java.awt.Color(255, 255, 255));
            cst2.setBackground(new java.awt.Color(102, 102, 102));
            cst2.setForeground(new java.awt.Color(255, 255, 255));
            cst3.setBackground(new java.awt.Color(102, 102, 102));
            cst3.setForeground(new java.awt.Color(255, 255, 255));
            java.awt.Color c_l = new java.awt.Color(204, 255, 255);
            jLabel12.setForeground(c_l);jLabel15.setForeground(c_l);jLabel16.setForeground(c_l);jLabel17.setForeground(c_l);jLabel18.setForeground(c_l);jLabel19.setForeground(c_l);
            jLabel20.setForeground(c_l);jLabel21.setForeground(c_l);jLabel22.setForeground(c_l);
            jLabel5.setForeground(c_l);jLabel6.setForeground(c_l);jLabel7.setForeground(c_l);jLabel11.setForeground(c_l);
            v1.setForeground(new java.awt.Color(255, 255, 255));v2.setForeground(new java.awt.Color(255, 255, 255));v3.setForeground(new java.awt.Color(255, 255, 255));
        }
        else{
            sel_mode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra_files/light-1.png"))); // NOI18N
            nre.setText("Light Mode");
            cl1.setBackground(new java.awt.Color(255, 255, 255));
            jPanel16.setBackground(new java.awt.Color(255, 255, 255));
            jPanel17.setBackground(new java.awt.Color(255, 255, 255));
            vno.setBackground(new java.awt.Color(255, 255, 255));
            cph.setBackground(new java.awt.Color(255, 255, 255));
            vno.setForeground(new java.awt.Color(51, 51, 51));
            cph.setForeground(new java.awt.Color(51, 51, 51));
            exit_vno.setBackground(new java.awt.Color(255, 255, 255));
            exit_vno.setForeground(new java.awt.Color(51, 51, 51));
            vhno1.setBackground(new java.awt.Color(255, 255, 255));
            vhno1.setForeground(new java.awt.Color(51, 51, 51));
            vhno2.setBackground(new java.awt.Color(255, 255, 255));
            vhno2.setForeground(new java.awt.Color(51, 51, 51));
            vhno3.setBackground(new java.awt.Color(255, 255, 255));
            vhno3.setForeground(new java.awt.Color(51, 51, 51));
            cst1.setBackground(new java.awt.Color(255, 255, 255));
            cst1.setForeground(new java.awt.Color(51, 51, 51));
            cst2.setBackground(new java.awt.Color(255, 255, 255));
            cst2.setForeground(new java.awt.Color(51, 51, 51));
            cst3.setBackground(new java.awt.Color(255, 255, 255));
            cst3.setForeground(new java.awt.Color(51, 51, 51));
            java.awt.Color c_l = new java.awt.Color(0, 102 , 102);
            jLabel12.setForeground(c_l);jLabel15.setForeground(c_l);jLabel16.setForeground(c_l);jLabel17.setForeground(c_l);jLabel18.setForeground(c_l);jLabel19.setForeground(c_l);
            jLabel20.setForeground(c_l);jLabel21.setForeground(c_l);jLabel22.setForeground(c_l);
            jLabel5.setForeground(c_l);jLabel6.setForeground(c_l);jLabel7.setForeground(c_l);jLabel11.setForeground(c_l);
            v1.setForeground(c_l);v2.setForeground(c_l);v3.setForeground(c_l);
        }
    }//GEN-LAST:event_sel_modeMouseClicked

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
            java.util.logging.Logger.getLogger(ParkingSys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParkingSys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParkingSys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParkingSys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParkingSys().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel card_panel;
    private javax.swing.JPanel cl1;
    private javax.swing.JPanel cl2;
    private javax.swing.JPanel cl3;
    private javax.swing.JLabel clr;
    private javax.swing.JTextField cph;
    private javax.swing.JTextField cst1;
    private javax.swing.JTextField cst2;
    private javax.swing.JTextField cst3;
    private javax.swing.JPanel ev;
    private javax.swing.JTextField exit_vno;
    private javax.swing.JLabel gnr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel lo;
    private javax.swing.JPanel ne;
    private javax.swing.JLabel nre;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JPanel p3;
    private javax.swing.JLabel sel_mode;
    private javax.swing.JLabel ttt;
    private javax.swing.JRadioButton v1;
    private javax.swing.JRadioButton v2;
    private javax.swing.JRadioButton v3;
    private javax.swing.JTextField vhno1;
    private javax.swing.JTextField vhno2;
    private javax.swing.JTextField vhno3;
    private javax.swing.JTextField vno;
    // End of variables declaration//GEN-END:variables
}
