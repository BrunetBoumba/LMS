/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_lms;
import entite.Books;
import java.util.Date;
import controle.connetion.modele.ModeleBooks;
import controle.connetion.controle.utilitaire.GestionDates;
import controle.connetion.modele.ModeleAdherents;
import entite.adherents;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;



/**
 *
 * @author Princy-Grace
 */

public class Gestion_articles extends javax.swing.JFrame {

    static void setVisible() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Creates new form Gestion_articles
     */
    public Gestion_articles() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public JButton getjButton4() {
        return jBtn_enrg;
    }

    public void setjButton4(JButton jButton4) {
        this.jBtn_enrg = jButton4;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable(leModeleBooks);
        jPanel1 = new javax.swing.JPanel();
        panel2 = new java.awt.Panel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jTxT_ISBN = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTxT_Titre = new javax.swing.JTextField();
        jTxT_auteur = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTxT_Nbre_page = new javax.swing.JTextField();
        jTxT_Date_edition = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jBtn_enrg = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTxT_categorie = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTxt_Nbre_ex = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTxT_Date_enreg = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTxt_rech = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jCmb_rech = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Deconexion = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(57, 105, 138));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setBackground(new java.awt.Color(204, 102, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("GESTION D'ARTICLES");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RessourcesIcones/add_book_96px_1.png"))); // NOI18N
        jButton6.setText("Ajouter Article");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 39, 162, 49));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RessourcesIcones/delete_document_96px_1.png"))); // NOI18N
        jButton2.setText("Suprimer Article");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 100, 162, 34));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RessourcesIcones/todo_list_35px.png"))); // NOI18N
        jButton9.setText("Tout selectionner");
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 140, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RessourcesIcones/refresh_30px.png"))); // NOI18N
        jButton3.setText("Actualiser");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 193, 162, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 133, 171, 545));

        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 133, 895, 429));

        jPanel1.setBackground(new java.awt.Color(57, 105, 138));

        panel2.setBackground(new java.awt.Color(255, 255, 255));
        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("FICHE ARTICLE");
        panel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 14, 201, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        panel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 6, -1, -1));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RessourcesIcones/edit_property_25px.png"))); // NOI18N
        jButton7.setText("Modifier Fiche");
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        panel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, 30));

        jTxT_ISBN.setEditable(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ISBN");

        jTxT_Titre.setEditable(false);

        jTxT_auteur.setEditable(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Auteur");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Nombre de pages");

        jTxT_Nbre_page.setEditable(false);

        jTxT_Date_edition.setEditable(false);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Date d'édition");

        jBtn_enrg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RessourcesIcones/save_25px.png"))); // NOI18N
        jBtn_enrg.setText("Enregistrer les modifications");
        jBtn_enrg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtn_enrg.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBtn_enrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_enrgActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RessourcesIcones/course_50px_1.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Titre");

        jTxT_categorie.setEditable(false);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Nombre d'exemplaires");

        jLabel15.setBackground(new java.awt.Color(57, 105, 138));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Categorie");

        jTxT_Date_enreg.setEditable(false);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Date d'enregistrement");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jTxt_Nbre_ex, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jTxT_Date_enreg, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jTxT_ISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jTxT_auteur, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel11)
                        .addGap(122, 122, 122)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jTxT_Titre, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jTxT_Nbre_page, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel15)
                        .addGap(91, 91, 91)
                        .addComponent(jLabel12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jTxT_categorie, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jTxT_Date_edition, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jBtn_enrg)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(5, 5, 5)
                        .addComponent(jTxT_ISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel7)
                        .addGap(5, 5, 5)
                        .addComponent(jTxT_auteur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxT_Titre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxT_Nbre_page, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel12))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxT_categorie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxT_Date_edition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(5, 5, 5)
                        .addComponent(jTxt_Nbre_ex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(5, 5, 5)
                        .addComponent(jTxT_Date_enreg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addComponent(jBtn_enrg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1078, 133, -1, 409));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jTxt_rech.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RessourcesIcones/search_property_25px.png"))); // NOI18N
        jButton1.setText("Search");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jCmb_rech.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCmb_rech.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "titre", "auteur", "categorie", "ISBN" }));
        jCmb_rech.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jPanel3.setBackground(new java.awt.Color(57, 105, 138));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Liste des Articles de la bibliothèque");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 215, -1));

        jPanel5.setPreferredSize(new java.awt.Dimension(0, 4));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1423, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("BIENVNUE SUR LMS");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 215, -1));

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RessourcesIcones/user_male_skin_type_6_35px.png"))); // NOI18N
        jButton11.setText("Gestion d'adhérents");
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RessourcesIcones/data_transfer_30px.png"))); // NOI18N
        jButton12.setText("Gestion d'emprunts");
        jButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RessourcesIcones/combo_chart_30px.png"))); // NOI18N
        jButton13.setText("Statistiques LMS");
        jButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));

        jLabel6.setBackground(new java.awt.Color(204, 102, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RessourcesIcones/cool.png"))); // NOI18N

        jLabel17.setBackground(new java.awt.Color(204, 102, 255));
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("LOGICIEL DE GESTION LMS");

        jLabel18.setBackground(new java.awt.Color(204, 102, 255));
        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setText("Université Inter-Etats Congo Cameroun");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel14)
                .addGap(6, 6, 6)
                .addComponent(jLabel6)
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addGap(182, 182, 182)
                .addComponent(jButton11)
                .addGap(2, 2, 2)
                .addComponent(jButton12)
                .addGap(10, 10, 10)
                .addComponent(jButton13)
                .addGap(26, 26, 26)
                .addComponent(jCmb_rech, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jTxt_rech, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCmb_rech, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxt_rech, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 680));

        jMenu1.setText("Mon Profil");

        Deconexion.setText("Deconexion...");
        Deconexion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeconexionMouseClicked(evt);
            }
        });
        Deconexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeconexionActionPerformed(evt);
            }
        });
        jMenu1.add(Deconexion);

        jMenuItem2.setText("Modifier compte");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Paramètres du logiciel");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("?");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DeconexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeconexionActionPerformed
       System.out.println("Deconnxion en cours...");
        System.exit(0);
   
    }//GEN-LAST:event_DeconexionActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
           
        EnregistrementArticles l_EnregistrementArticle = new EnregistrementArticles(leModeleBooks);
        l_EnregistrementArticle.setVisible(true);
      
        l_EnregistrementArticle.getjTxT_Date_edition().requestFocus(true);
        Date dtDate = new Date();
        String strDate = GestionDates.dateEnChaineFR(dtDate);
        l_EnregistrementArticle.getjTxT_Date_edition().setText(strDate);
        l_EnregistrementArticle.getjTxT_Date_edition().setEditable(true);
         l_EnregistrementArticle.getjTxt_dat_enreg().setText(strDate);
        l_EnregistrementArticle.getjTxt_dat_enreg().setEditable(false);
        l_EnregistrementArticle.setVisible(true);
         jBtn_enrg.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void DeconexionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeconexionMouseClicked
       
    }//GEN-LAST:event_DeconexionMouseClicked

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
             Gestion_Abonnes g = new Gestion_Abonnes();
             g.setVisible(true);
             dispose();
            g.jButton4.setVisible(false);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        EmpruntArticles l_EmpruntArticles = new EmpruntArticles(leModeleBooks);
        l_EmpruntArticles.setVisible(true);
         Date dtDate = new Date();
        String strDate = GestionDates.dateEnChaineFR(dtDate);
        l_EmpruntArticles.getjTxt_Date_emprunt().setText(strDate);
         l_EmpruntArticles.getjTxt_Date_remise().setText(strDate);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int NumLigne;
        NumLigne = jTable1.getSelectedRow();
        jTxT_Titre.setText(String.valueOf(jTable1.getValueAt(NumLigne, 0)));
         jTxT_auteur.setText(String.valueOf(jTable1.getValueAt(NumLigne, 1)));
          jTxT_categorie.setText(String.valueOf(jTable1.getValueAt(NumLigne, 2)));
           jTxT_ISBN.setText(String.valueOf(jTable1.getValueAt(NumLigne, 3)));
            jTxT_Nbre_page.setText(String.valueOf(jTable1.getValueAt(NumLigne, 4)));
             jTxT_Date_edition.setText(String.valueOf(jTable1.getValueAt(NumLigne, 5)));
              jTxt_Nbre_ex.setText(String.valueOf(jTable1.getValueAt(NumLigne, 7)));
              jTxT_Date_enreg.setText(String.valueOf(jTable1.getValueAt(NumLigne, 6)));
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jTable1.revalidate();
        jTable1.repaint();
         
          Gestion_articles g = new Gestion_articles();           
             dispose();
              g.setVisible(true);
            g.jBtn_enrg.setVisible(false); 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
       int numLigne = jTable1.getSelectedRow();
       if (numLigne == -1) {
           JOptionPane.showMessageDialog(null, "Vous devez selectionnez " + "une ligne pour la supprimer", "Avertissement", JOptionPane.WARNING_MESSAGE);
            jBtn_enrg.setVisible(false);
       }else{
           int valid = JOptionPane.showConfirmDialog(null, "Êtes-vous sur de vouloir supprimer" + " l'article selectionner ?"
				, "Supprimer", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
               if (valid == 0 ){
                   String ISBN = jTable1.getValueAt(numLigne, 3).toString();
                   Books unBooks = new Books(ISBN);
                   unBooks.supprimerCRUD(ISBN);
                   leModeleBooks.supprimerMOD(numLigne);
               }
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
         int numLigne = jTable1.getSelectedRow();
         
       if (numLigne == -1) {
           JOptionPane.showMessageDialog(null, "Vous devez selectionnez " + "une ligne pour la modifier", "Avertissement", JOptionPane.WARNING_MESSAGE);
           
       }else{
           JOptionPane.showMessageDialog(null, "Vous pouvez modifier les informations ");
          jTxT_auteur.setEditable(true); 
          jTxT_Titre.setEditable(true); 
          jTxT_categorie.setEditable(true); 
          jTxT_ISBN.setEditable(true); 
          jTxT_Date_edition.setEditable(true); 
          jTxT_ISBN.setEditable(true);
          jTxT_Nbre_page.setEditable(true);
          jBtn_enrg.setVisible(true);
       }
           
         
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jBtn_enrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_enrgActionPerformed
        // TODO add your handling code here:
         int numLigne = jTable1.getSelectedRow();
         String titrej = jTxT_Titre.getText();
        String auteurj = jTxT_auteur.getText();
        String categoriej = jTxT_categorie.getText();
        String ISBNj = jTxT_ISBN.getText();
        String strDate = jTxT_Date_edition.getText();
         String strDate1 = jTxT_Date_enreg.getText();
        String nbre_pagej = jTxT_Nbre_page.getText();
          String nbre_ex = jTxt_Nbre_ex.getText();
        int nb = Integer.parseUnsignedInt(nbre_pagej);
        int nbre = Integer.parseUnsignedInt(nbre_ex);
             Books unBooks = new Books(titrej, auteurj, categoriej, ISBNj,nb, strDate, strDate1,nbre);
        //  strDate = GestionDates.chaineDateFRversEN(strDate);
        boolean bCreation = false;
        bCreation = unBooks.modifierCRUD(titrej, auteurj, categoriej, ISBNj, nb, strDate,strDate1, nbre);
        if (bCreation) {
            leModeleBooks.setValueAt(titrej, numLigne, 0);
            leModeleBooks.setValueAt(auteurj, numLigne, 1);
            leModeleBooks.setValueAt(categoriej, numLigne, 2);
            leModeleBooks.setValueAt(ISBNj, numLigne, 3);
            leModeleBooks.setValueAt(nb, numLigne, 4);
            leModeleBooks.setValueAt(strDate, numLigne, 5);
            leModeleBooks.setValueAt(strDate1, numLigne, 6);
            leModeleBooks.setValueAt(nbre_ex, numLigne, 7);

            leModeleBooks.modifieMOD(numLigne, numLigne, unBooks);
             jTxT_auteur.setEditable(false); 
          jTxT_Titre.setEditable(false); 
          jTxT_categorie.setEditable(false); 
          jTxT_ISBN.setEditable(false); 
          jTxT_Date_edition.setEditable(false); 
           jTxT_Date_enreg.setEditable(false); 
          jTxT_ISBN.setEditable(false);
          jTxT_Nbre_page.setEditable(false);
          jBtn_enrg.setVisible(false);
        }

    }//GEN-LAST:event_jBtn_enrgActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          String ISBNj = jTxt_rech.getText();
          String cmb = jCmb_rech.getSelectedItem().toString();
        entite.Books l_Books = new entite.Books(ISBNj);
        ArrayList<Books> nouvelleListe = 
                l_Books.chercherCRUD(cmb,ISBNj);
        leModeleBooks.lireRecupMOD(nouvelleListe);
         jTable1.revalidate();
        jTable1.repaint();
         jBtn_enrg.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
         Statistiques l_Statistiques = new Statistiques();
       l_Statistiques.setVisible(true);
        ModeleAdherents test = new ModeleAdherents();
        int val = test.getRowCount();
        String txt = String.valueOf(val);
        ModeleBooks test1 = new ModeleBooks();
        int val1 = test1.getRowCount();
        String txt1 = String.valueOf(val1);
         l_Statistiques.jLbl_article.setText(txt1);
      l_Statistiques.jLbl_adherent.setText(txt);
    }//GEN-LAST:event_jButton13ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    private  ModeleBooks leModeleBooks = new ModeleBooks();
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
            java.util.logging.Logger.getLogger(Gestion_articles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gestion_articles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gestion_articles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gestion_articles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gestion_articles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Deconexion;
    public javax.swing.JButton jBtn_enrg;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jCmb_rech;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTxT_Date_edition;
    private javax.swing.JTextField jTxT_Date_enreg;
    private javax.swing.JTextField jTxT_ISBN;
    private javax.swing.JTextField jTxT_Nbre_page;
    private javax.swing.JTextField jTxT_Titre;
    private javax.swing.JTextField jTxT_auteur;
    private javax.swing.JTextField jTxT_categorie;
    private javax.swing.JTextField jTxt_Nbre_ex;
    private javax.swing.JTextField jTxt_rech;
    private java.awt.Panel panel2;
    // End of variables declaration//GEN-END:variables
}
