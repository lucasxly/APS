/*
 * View horta ou jardim
 * View usada para direcionar o usuário a criação de uma horta ou jardim
 */
package src.Views;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @autor Guilherme Sbizero
 */
public class JardimHorta_View extends javax.swing.JFrame implements Interatividade_Interface {

    /**
     * Creates new form JardimHorta_View
     */
    public JardimHorta_View() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel = new javax.swing.JPanel();
        txt_titulo = new javax.swing.JLabel();
        btn_horta = new javax.swing.JLabel();
        img_horta = new javax.swing.JLabel();
        img_jardim = new javax.swing.JLabel();
        btn_jardim = new javax.swing.JLabel();
        btn_Back = new javax.swing.JLabel();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        painel.setPreferredSize(new java.awt.Dimension(1068, 470));
        painel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_titulo.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        txt_titulo.setForeground(new java.awt.Color(255, 255, 255));
        txt_titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/JardimHorta/TituloJardimHorta.png"))); // NOI18N
        txt_titulo.setToolTipText("");
        painel.add(txt_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 890, -1));

        btn_horta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/JardimHorta/btn_hortaVerde.png"))); // NOI18N
        btn_horta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_horta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_hortaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_hortaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_hortaMouseExited(evt);
            }
        });
        painel.add(btn_horta, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 70, 220, 70));

        img_horta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/JardimHorta/imgHorta.png"))); // NOI18N
        img_horta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        img_horta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        img_horta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img_hortaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                img_hortaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                img_hortaMouseExited(evt);
            }
        });
        painel.add(img_horta, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 430, 320));

        img_jardim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/JardimHorta/imgJardim.png"))); // NOI18N
        img_jardim.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        img_jardim.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        img_jardim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img_jardimMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                img_jardimMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                img_jardimMouseExited(evt);
            }
        });
        painel.add(img_jardim, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 430, 320));

        btn_jardim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/JardimHorta/btn_JardimVerde.png"))); // NOI18N
        btn_jardim.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_jardim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_jardimMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_jardimMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_jardimMouseExited(evt);
            }
        });
        painel.add(btn_jardim, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 220, 70));

        btn_Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Horta/Back.png"))); // NOI18N
        btn_Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_BackMouseClicked(evt);
            }
        });
        painel.add(btn_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/JardimHorta/madeira_1068_470.png"))); // NOI18N
        painel.add(fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_jardimMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_jardimMouseEntered
        mudarIcone("/Images/JardimHorta/btn_JardimVerdeAzul.png", 1);
    }//GEN-LAST:event_btn_jardimMouseEntered

    private void btn_jardimMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_jardimMouseExited
        mudarIcone("/Images/JardimHorta/btn_JardimVerde.png", 1);
    }//GEN-LAST:event_btn_jardimMouseExited

    private void btn_hortaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_hortaMouseEntered
        mudarIcone("/Images/JardimHorta/btn_hortaVerdeAzul.png", 2);
    }//GEN-LAST:event_btn_hortaMouseEntered

    private void btn_hortaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_hortaMouseExited
        mudarIcone("/Images/JardimHorta/btn_hortaVerde.png", 2);
    }//GEN-LAST:event_btn_hortaMouseExited

    private void img_jardimMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_jardimMouseEntered
        mudarIcone("/Images/JardimHorta/imgJardimSaturacao.png", 3);
    }//GEN-LAST:event_img_jardimMouseEntered

    private void img_jardimMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_jardimMouseExited
        mudarIcone("/Images/JardimHorta/imgJardim.png", 3);
    }//GEN-LAST:event_img_jardimMouseExited

    private void img_hortaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_hortaMouseEntered
        mudarIcone("/Images/JardimHorta/imgHortaSaturacao.png", 4);
    }//GEN-LAST:event_img_hortaMouseEntered

    private void img_hortaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_hortaMouseExited
        mudarIcone("/Images/JardimHorta/imgHorta.png", 4);
    }//GEN-LAST:event_img_hortaMouseExited

    private void btn_hortaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_hortaMouseClicked
        chamarView(2);
    }//GEN-LAST:event_btn_hortaMouseClicked

    private void img_hortaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_hortaMouseClicked
        chamarView(2);
    }//GEN-LAST:event_img_hortaMouseClicked

    private void btn_jardimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_jardimMouseClicked
        chamarView(1);
    }//GEN-LAST:event_btn_jardimMouseClicked

    private void img_jardimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_jardimMouseClicked
        chamarView(1);
    }//GEN-LAST:event_img_jardimMouseClicked

    private void btn_BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_BackMouseClicked
        chamarView(3);
    }//GEN-LAST:event_btn_BackMouseClicked

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
            java.util.logging.Logger.getLogger(JardimHorta_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JardimHorta_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JardimHorta_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JardimHorta_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JardimHorta_View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_Back;
    private javax.swing.JLabel btn_horta;
    private javax.swing.JLabel btn_jardim;
    private javax.swing.JLabel fundo;
    private javax.swing.JLabel img_horta;
    private javax.swing.JLabel img_jardim;
    private javax.swing.JPanel painel;
    private javax.swing.JLabel txt_titulo;
    // End of variables declaration//GEN-END:variables

    public void mudarIcone(String enderecoImg, int botao) {

        ImageIcon img = new ImageIcon(getClass().getResource(enderecoImg));
        Image icone = img.getImage();

        switch (botao) {

            case 1:
                btn_jardim.setIcon(new ImageIcon(icone));
                break;

            case 2:
                btn_horta.setIcon(new ImageIcon(icone));
                break;
            case 3:
                img_jardim.setIcon(new ImageIcon(icone));
                break;

            case 4:
                img_horta.setIcon(new ImageIcon(icone));
                break;

        }

    }

    public void chamarView(int view) {

        switch (view) {

            case 1:
                new Jardim_View();
                break;

            case 2:
                new Horta_View();
                break;

            case 3:

                new Principal_View();
                break;

        }

        super.dispose();
    }

    public void inicializarComponentes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
