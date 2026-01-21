/*
 * View AjudarMeioAmbiente
 * View usada para dar dicas de como ajudar o meio ambiente
 */

package src.Views;

import src.Models.Interatividade_Interface;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Guilherme Sbizero
 */
public class AjudarMeioAmbiente_View extends javax.swing.JFrame implements Interatividade_Interface {

    private int paginasAMA = 1;

    public AjudarMeioAmbiente_View() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        btn_Prev.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_Next = new javax.swing.JLabel();
        btn_Prev = new javax.swing.JLabel();
        btn_Back = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(580, 584));
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(580, 584));
        jPanel1.setMinimumSize(new java.awt.Dimension(580, 584));
        jPanel1.setPreferredSize(new java.awt.Dimension(580, 584));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Horta/next.png"))); // NOI18N
        btn_Next.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_NextMouseClicked(evt);
            }
        });
        jPanel1.add(btn_Next, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 500, 40, 50));

        btn_Prev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Horta/prev.png"))); // NOI18N
        btn_Prev.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Prev.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_PrevFocusLost(evt);
            }
        });
        btn_Prev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_PrevMouseClicked(evt);
            }
        });
        jPanel1.add(btn_Prev, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, -1));

        btn_Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Horta/Back.png"))); // NOI18N
        btn_Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_BackMouseClicked(evt);
            }
        });
        jPanel1.add(btn_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AJudarMeioAmbiente/Zero.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(580, 584));
        jLabel1.setMinimumSize(new java.awt.Dimension(580, 584));
        jLabel1.setPreferredSize(new java.awt.Dimension(580, 584));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 0, 580, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_NextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NextMouseClicked

        if (paginasAMA == 1) {

            paginasAMA = 2;
            mudarIcone("/Images/AJudarMeioAmbiente/primeiro.jpg", 3);

        } else if (paginasAMA == 2) {

            paginasAMA = 3;
            mudarIcone("/Images/AJudarMeioAmbiente/segundo.jpg", 3);

        } else if (paginasAMA == 3) {

            paginasAMA = 4;
            mudarIcone("/Images/AJudarMeioAmbiente/terceiro.jpg", 3);

        } else if (paginasAMA == 4) {

            paginasAMA = 5;
            mudarIcone("/Images/AJudarMeioAmbiente/Quarto.jpg", 3);

        } else if (paginasAMA == 5) {

            paginasAMA = 6;
            mudarIcone("/Images/AJudarMeioAmbiente/Quinto.jpg", 3);

        } else if (paginasAMA == 6) {

            paginasAMA = 7;
            mudarIcone("/Images/AJudarMeioAmbiente/sexto.jpg", 3);

        } else if (paginasAMA == 7) {

            paginasAMA = 8;
            mudarIcone("/Images/AJudarMeioAmbiente/setimo.jpg", 3);

        } else if (paginasAMA == 8) {

            paginasAMA = 9;
            mudarIcone("/Images/AJudarMeioAmbiente/oitavo.jpg", 3);

        } else if (paginasAMA == 9) {

            paginasAMA = 10;
            mudarIcone("/Images/AJudarMeioAmbiente/nono.jpg", 3);

        } else if (paginasAMA == 10) {

            paginasAMA = 11;
            mudarIcone("/Images/AJudarMeioAmbiente/decimo.jpg", 2);

        }


    }//GEN-LAST:event_btn_NextMouseClicked

    private void btn_PrevMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PrevMouseClicked

        switch (paginasAMA) {
            case 11:
                paginasAMA = 10;
                mudarIcone("/Images/AJudarMeioAmbiente/nono.jpg", 3);
                break;
            case 10:
                paginasAMA = 9;
                mudarIcone("/Images/AJudarMeioAmbiente/oitavo.jpg", 3);
                break;
            case 9:
                paginasAMA = 8;
                mudarIcone("/Images/AJudarMeioAmbiente/setimo.jpg", 3);
                break;
            case 8:
                paginasAMA = 7;
                mudarIcone("/Images/AJudarMeioAmbiente/sexto.jpg", 3);
                break;
            case 7:
                paginasAMA = 6;
                mudarIcone("/Images/AJudarMeioAmbiente/quinto.jpg", 3);
                break;
            case 6:
                paginasAMA = 5;
                mudarIcone("/Images/AJudarMeioAmbiente/quarto.jpg", 3);
                break;
            case 5:
                paginasAMA = 4;
                mudarIcone("/Images/AJudarMeioAmbiente/terceiro.jpg", 3);
                break;
            case 4:
                paginasAMA = 3;
                mudarIcone("/Images/AJudarMeioAmbiente/segundo.jpg", 3);
                break;
            case 3:
                paginasAMA = 2;
                mudarIcone("/Images/AJudarMeioAmbiente/primeiro.jpg", 3);
                break;
            case 2:
                paginasAMA = 1;
                mudarIcone("/Images/AJudarMeioAmbiente/Zero.jpg", 1);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btn_PrevMouseClicked

    private void btn_PrevFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_PrevFocusLost

    }//GEN-LAST:event_btn_PrevFocusLost

    private void btn_BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_BackMouseClicked
        chamarView(3);
    }//GEN-LAST:event_btn_BackMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjudarMeioAmbiente_View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_Back;
    private javax.swing.JLabel btn_Next;
    private javax.swing.JLabel btn_Prev;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mudarIcone(String enderecoImg, int botao) {

        ImageIcon img = new ImageIcon(getClass().getResource(enderecoImg));
        Image icone = img.getImage();

        switch (botao) {

            case 1:
                jLabel1.setIcon(new ImageIcon(icone));
                btn_Prev.setVisible(false);
                btn_Next.setVisible(true);
                break;

            case 2:
                jLabel1.setIcon(new ImageIcon(icone));
                btn_Prev.setVisible(true);
                btn_Next.setVisible(false);
                break;

            case 3:
                jLabel1.setIcon(new ImageIcon(icone));
                btn_Prev.setVisible(true);
                btn_Next.setVisible(true);
                break;

        }

    }

    @Override
    public void chamarView(int view) {

        new Principal_View();
        super.dispose();

    }

    @Override
    public void inicializarComponentes() {
        btn_Prev.setVisible(false);
        btn_Next.setVisible(true);
    }
}
