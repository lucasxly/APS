/*
 * View principal do programa
 * View usada para se direcionar aos principais temas do programa
 */
package src.Views;

import java.awt.Image;
import javax.swing.ImageIcon;


public class Principal_View extends javax.swing.JFrame implements Interatividade_Interface {

    /*
     * Método que inicializa os componentes GUI
     * faz a view ficar visível
     * determina a localização padrão para o centro da tela
     */
    public Principal_View() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);

    }

    // Método padrão que inicializa os componentes GUI do sistema
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        Btn_meioAmbienteSuaCasa = new javax.swing.JLabel();
        lbl_meio_ambiente_sua_casa = new javax.swing.JLabel();
        lbl_plantaImage = new javax.swing.JLabel();
        btn_ajudaMeioAmbiente = new javax.swing.JLabel();
        lbl_herois_meio_ambiente = new javax.swing.JLabel();
        btn_herois = new javax.swing.JLabel();
        fundoMeioAmbiente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(72, 37, 11));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Btn_meioAmbienteSuaCasa.setFont(new java.awt.Font("Sabado", 0, 35)); // NOI18N
        Btn_meioAmbienteSuaCasa.setForeground(new java.awt.Color(255, 255, 255));
        Btn_meioAmbienteSuaCasa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/meio_ambiente_sua_casa_png.png"))); // NOI18N
        Btn_meioAmbienteSuaCasa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_meioAmbienteSuaCasa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_meioAmbienteSuaCasaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_meioAmbienteSuaCasaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_meioAmbienteSuaCasaMouseExited(evt);
            }
        });
        jPanel1.add(Btn_meioAmbienteSuaCasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 270, 70));

        lbl_meio_ambiente_sua_casa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/casa_verde_png.png"))); // NOI18N
        lbl_meio_ambiente_sua_casa.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lbl_meio_ambiente_sua_casa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_meio_ambiente_sua_casa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_meio_ambiente_sua_casaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_meio_ambiente_sua_casaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_meio_ambiente_sua_casaMouseExited(evt);
            }
        });
        jPanel1.add(lbl_meio_ambiente_sua_casa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        lbl_plantaImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/voce_meio_ambiente_253_png.png"))); // NOI18N
        lbl_plantaImage.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lbl_plantaImage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_plantaImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_plantaImageMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_plantaImageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_plantaImageMouseExited(evt);
            }
        });
        jPanel1.add(lbl_plantaImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 270, 270));

        btn_ajudaMeioAmbiente.setFont(new java.awt.Font("Sabado", 0, 35)); // NOI18N
        btn_ajudaMeioAmbiente.setForeground(new java.awt.Color(255, 255, 255));
        btn_ajudaMeioAmbiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_sua_ajuda_meio_ambiente_png.png"))); // NOI18N
        btn_ajudaMeioAmbiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_ajudaMeioAmbiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ajudaMeioAmbienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ajudaMeioAmbienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ajudaMeioAmbienteMouseExited(evt);
            }
        });
        jPanel1.add(btn_ajudaMeioAmbiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 270, 60));

        lbl_herois_meio_ambiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pessoas_salvaram_253.png"))); // NOI18N
        lbl_herois_meio_ambiente.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lbl_herois_meio_ambiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_herois_meio_ambiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_herois_meio_ambienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_herois_meio_ambienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_herois_meio_ambienteMouseExited(evt);
            }
        });
        jPanel1.add(lbl_herois_meio_ambiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 130, -1, -1));

        btn_herois.setFont(new java.awt.Font("Sabado", 0, 35)); // NOI18N
        btn_herois.setForeground(new java.awt.Color(255, 255, 255));
        btn_herois.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_herois_meio_ambiente_png_3.png"))); // NOI18N
        btn_herois.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_herois.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_heroisMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_heroisMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_heroisMouseExited(evt);
            }
        });
        jPanel1.add(btn_herois, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 60, 290, 60));

        fundoMeioAmbiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/telaPrincipalFundo.png"))); // NOI18N
        jPanel1.add(fundoMeioAmbiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_plantaImageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_plantaImageMouseEntered
        mudarIcone("/Images/voce_meio_ambiente_253_saturacao_png.png", 5);
    }//GEN-LAST:event_lbl_plantaImageMouseEntered

    private void lbl_plantaImageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_plantaImageMouseExited
        mudarIcone("/Images/voce_meio_ambiente_253_png.png", 5);
    }//GEN-LAST:event_lbl_plantaImageMouseExited

    private void lbl_herois_meio_ambienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_herois_meio_ambienteMouseEntered
        mudarIcone("/Images/pessoas_salvaram_253_saturacao.png", 6);
    }//GEN-LAST:event_lbl_herois_meio_ambienteMouseEntered

    private void lbl_herois_meio_ambienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_herois_meio_ambienteMouseExited
        mudarIcone("/Images/pessoas_salvaram_253.png", 6);
    }//GEN-LAST:event_lbl_herois_meio_ambienteMouseExited

    private void lbl_herois_meio_ambienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_herois_meio_ambienteMouseClicked

        chamarView(2);
    }//GEN-LAST:event_lbl_herois_meio_ambienteMouseClicked

    private void lbl_plantaImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_plantaImageMouseClicked
        chamarView(3);
    }//GEN-LAST:event_lbl_plantaImageMouseClicked

    private void btn_ajudaMeioAmbienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ajudaMeioAmbienteMouseEntered
        mudarIcone("/Images/btn_sua_ajuda_meio_ambiente_mouse_azul.png", 2);
    }//GEN-LAST:event_btn_ajudaMeioAmbienteMouseEntered

    private void btn_ajudaMeioAmbienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ajudaMeioAmbienteMouseExited
        mudarIcone("/Images/btn_sua_ajuda_meio_ambiente_png.png", 2);
    }//GEN-LAST:event_btn_ajudaMeioAmbienteMouseExited

    private void btn_heroisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_heroisMouseEntered
        mudarIcone("/Images/btn_herois_meio_ambiente_mouse_azul.png", 3);
    }//GEN-LAST:event_btn_heroisMouseEntered

    private void btn_heroisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_heroisMouseExited
        mudarIcone("/Images/btn_herois_meio_ambiente_png_3.png", 3);
    }//GEN-LAST:event_btn_heroisMouseExited

    private void btn_heroisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_heroisMouseClicked

        chamarView(2);

    }//GEN-LAST:event_btn_heroisMouseClicked

    private void btn_ajudaMeioAmbienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ajudaMeioAmbienteMouseClicked
        chamarView(3);
    }//GEN-LAST:event_btn_ajudaMeioAmbienteMouseClicked

    private void lbl_meio_ambiente_sua_casaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_meio_ambiente_sua_casaMouseExited
        mudarIcone("/Images/casa_verde_png.png", 4);
    }//GEN-LAST:event_lbl_meio_ambiente_sua_casaMouseExited

    private void lbl_meio_ambiente_sua_casaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_meio_ambiente_sua_casaMouseEntered
        mudarIcone("/Images/casa_verde_saturacao_png.png", 4);
    }//GEN-LAST:event_lbl_meio_ambiente_sua_casaMouseEntered

    private void lbl_meio_ambiente_sua_casaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_meio_ambiente_sua_casaMouseClicked

        chamarView(1);

    }//GEN-LAST:event_lbl_meio_ambiente_sua_casaMouseClicked

    private void Btn_meioAmbienteSuaCasaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_meioAmbienteSuaCasaMouseExited
        mudarIcone("/Images/meio_ambiente_sua_casa_png.png", 1);
    }//GEN-LAST:event_Btn_meioAmbienteSuaCasaMouseExited

    /* 
     * Eventos dos botões que chamam o método mudarIcone para criar o efeito de mudança de cor e saturação 
     */
    private void Btn_meioAmbienteSuaCasaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_meioAmbienteSuaCasaMouseEntered
        mudarIcone("/Images/meio_ambiente_sua_casa_azul_png.png", 1);
    }//GEN-LAST:event_Btn_meioAmbienteSuaCasaMouseEntered

    private void Btn_meioAmbienteSuaCasaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_meioAmbienteSuaCasaMouseClicked
        chamarView(1);
    }//GEN-LAST:event_Btn_meioAmbienteSuaCasaMouseClicked

    // Método principal da view 
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
            java.util.logging.Logger.getLogger(Principal_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal_View().setVisible(true);

            }
        });
    }

    // Método mudarIcone que recebe um endereço de imagem e um inteiro como identificador do botão
    public void mudarIcone(String enderecoImg, int botao) {

        ImageIcon img = new ImageIcon(getClass().getResource(enderecoImg));
        Image icone = img.getImage();

        switch (botao) {

            case 1:
                Btn_meioAmbienteSuaCasa.setIcon(new ImageIcon(icone));
                break;

            case 2:
                btn_ajudaMeioAmbiente.setIcon(new ImageIcon(icone));
                break;
            case 3:
                btn_herois.setIcon(new ImageIcon(icone));
                break;

            case 4:
                lbl_meio_ambiente_sua_casa.setIcon(new ImageIcon(icone));
                break;

            case 5:
                lbl_plantaImage.setIcon(new ImageIcon(icone));
                break;

            case 6:
                lbl_herois_meio_ambiente.setIcon(new ImageIcon(icone));
                break;

        }

    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel Btn_meioAmbienteSuaCasa;
    private javax.swing.JLabel btn_ajudaMeioAmbiente;
    private javax.swing.JLabel btn_herois;
    private javax.swing.JLabel fundoMeioAmbiente;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_herois_meio_ambiente;
    private javax.swing.JLabel lbl_meio_ambiente_sua_casa;
    private javax.swing.JLabel lbl_plantaImage;

    public void chamarView(int view) {

        switch (view) {

            case 1:

                new JardimHorta_View();
                break;

            case 2:

                new PessoasAjudaAmbiente();
                break;

            case 3:
                new AjudarMeioAmbiente_View();
                break;

        }

        super.dispose();
    }

    public void inicializarComponentes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
